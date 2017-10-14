package action;

import bean.authorinf;
import bean.bookinf;
import lab2.DBconn;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.ServletRequest;
import javax.servlet.http.*;

import org.apache.struts2.ServletActionContext;
public class searchAction extends ActionSupport{
	private authorinf ai;
	private Vector<bookinf> bi;
	private String name;
	private String id;
	public authorinf getAi(){
		return ai;
	}
	public void setAi(authorinf ai){
		this.ai=ai;
	}
	public Vector<bookinf> getBi(){
		return bi;
	}
	public void setBi(Vector<bookinf> bi){
		this.bi=bi;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String findAuthorByISBN()
	{
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String title=(String)req.getParameter("ISBN");
		String sqlSearch="select * from book where ISBN='"+title+"'";
		ResultSet rs=null;
		rs=DBconn.executeQuery(sqlSearch);
		String id=new String();
		bookinf bookdetail=new bookinf();
		try{
			if(rs.next())
			{
				id=rs.getString("AuthorID");
				bookdetail.setAuthorID(rs.getString("AuthorID"));
				bookdetail.setISBN(rs.getString("ISBN"));
				bookdetail.setTitle(rs.getString("Title"));
				bookdetail.setPublisher(rs.getString("Publisher"));
				bookdetail.setPublishDate(rs.getString("PublishDate"));
				bookdetail.setPrice(rs.getString("Price"));
			}
			DBconn.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		session.setAttribute("bookDetail", bookdetail);
		authorinf temp=new authorinf();
		sqlSearch="select * from author where AuthorID='"+id+"'";
		rs=DBconn.executeQuery(sqlSearch);
		try{
			if(rs.next())
			{
				temp.setAge(rs.getString("Age"));
				temp.setAuthorID(rs.getString("AuthorID"));
				temp.setCountry(rs.getString("Country"));
				temp.setName(rs.getString("Name"));
			}
			DBconn.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		session.setAttribute("authorDetail", temp);
		return "success";
	}
	public String findAuthoridByName()
	{
		String sqlSearch="select * from author where Name='"+this.name+"'";
		ResultSet rs=null;
		rs=DBconn.executeQuery(sqlSearch);
		Vector<String> rt=new Vector<String>();
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		try{
			while(rs.next())
			{
				rt.add(rs.getString("AuthorID"));
			}
			DBconn.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		if (rt.size()==0)
		{
			return "noauthor";
		}
		int i;
		Vector<bookinf> temp1=new Vector<bookinf>();
		for (i=0;i<rt.size();i++)
		{
			sqlSearch="select * from book where AuthorID='"+rt.elementAt(i)+"'";
			rs=DBconn.executeQuery(sqlSearch);
			try{
				while(rs.next())
				{
					bookinf temp=new bookinf();
					temp.setAuthorID(rs.getString("AuthorID"));
					temp.setISBN(rs.getString("ISBN"));
					temp.setPrice(rs.getString("Price"));
					temp.setPublishDate(rs.getString("PublishDate"));
					temp.setPublisher(rs.getString("Publisher"));
					temp.setTitle(rs.getString("Title"));
					temp1.add(temp);
				}
				DBconn.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		this.bi=temp1;
		HttpSession session = req.getSession();
		session.setAttribute("bi", this.bi);
		if (this.bi.size()==0)
		{
			return "fail";
		}
		else
		{
			return "success";
		}
	}
	public String searchAuthor()
	{
		String sqlSearch="select * from author where AuthorID='"+this.id+"'";
		ResultSet rs=null;
		rs=DBconn.executeQuery(sqlSearch);
		Vector<String> temp=new Vector<String>();
		try{
			while(rs.next())
			{
				temp.add(rs.getString("Name"));
			}
			DBconn.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		if (temp.size()==0)
		{
			return "add";
		}
		else
		{
			return "noadd";
		}
	}
}

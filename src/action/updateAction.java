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

public class updateAction extends ActionSupport{
	private String authorID;
	private String publisher;
	private String publishdate;
	private String price;
	public String getAuthorID()
	{
		return authorID;
	}
	public void setAuthorID(String authorID)
	{
		this.authorID=authorID;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher=publisher;
	}
	public String getPublishdate()
	{
		return publishdate;
	}
	public void setPublishdate(String publishdate)
	{
		this.publishdate=publishdate;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String updateBook()
	{
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String ISBN=(String)session.getAttribute("IS");
		String sqlSearch;
		int rs1=0,rs2=0,rs3=0,rs4=0;
		if (this.getAuthorID().equalsIgnoreCase(""))
		{
			;
		}
		else
		{
			sqlSearch ="update book set AuthorID='"+this.getAuthorID()+"' where ISBN='"+ISBN+"'";
			rs1=DBconn.executeUpdate(sqlSearch);
		}
		if (this.getPublisher().equalsIgnoreCase(""))
		{
			;
		}
		else
		{
			sqlSearch ="update book set Publisher='"+this.getPublisher()+"' where ISBN='"+ISBN+"'";
			rs2=DBconn.executeUpdate(sqlSearch);
		}
		if (this.getPublishdate().equalsIgnoreCase(""))
		{
			;
		}
		else
		{
			sqlSearch ="update book set Publishdate='"+this.getPublishdate()+"' where ISBN='"+ISBN+"'";
			rs3=DBconn.executeUpdate(sqlSearch);
		}
		if (this.getPrice().equalsIgnoreCase(""))
		{
			;
		}
		else
		{
			sqlSearch ="update book set Price='"+this.getPrice()+"' where ISBN='"+ISBN+"'";
			rs4=DBconn.executeUpdate(sqlSearch);
		}
		if (rs1==0&&rs2==0&&rs3==0&&rs4==0)
		{
			return "fail";
		}
		else
		{
			return "success";
		}
	}
}

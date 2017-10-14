package action;

import bean.authorinf;
import bean.bookinf;
import lab2.DBconn;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.ServletRequest;
import javax.servlet.http.*;

import org.apache.struts2.ServletActionContext;

public class deleteAction extends ActionSupport{
	public String deleteBook()
	{
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String ISBN=(String)req.getParameter("ISBN");
		String sqlSearch="delete from book where ISBN='"+ISBN+"'";
		int rs=0;
		rs=DBconn.executeUpdate(sqlSearch);
		if (rs==0)
		{
			return "fail";
		}
		else if(rs==1)
		{
			return "success";
		}
		return "fail";
	}
}

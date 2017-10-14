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

public class addAction extends ActionSupport{
	private String AuthorID;
	private String Name;
	private String Age;
	private String Country;
	
	private String ISBN;
	private String Title;
	private String Publisher;
	private String PublishDate;
	private String Price;
	private String id;
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getAuthorID()
	{
		return AuthorID;
	}
	public void setAuthorID(String AuthorID)
	{
		this.AuthorID=AuthorID;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getAge()
	{
		return Age;
	}
	public void setAge(String Age)
	{
		this.Age=Age;
	}
	public String getCountry()
	{
		return Country;
	}
	public void setCountry(String Country)
	{
		this.Country=Country;
	}
	/*************************************/
	public String getISBN()
	{
		return ISBN;
	}
	public void setISBN(String ISBN)
	{
		this.ISBN=ISBN;
	}
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String Title)
	{
		this.Title=Title;
	}
	public String getPublisher()
	{
		return Publisher;
	}
	public void setPublisher(String Publisher)
	{
		this.Publisher=Publisher;
	}
	public String getPublishDate()
	{
		return PublishDate;
	}
	public void setPublishDate(String PublishDate)
	{
		this.PublishDate=PublishDate;
	}
	public String getPrice()
	{
		return Price;
	}
	public void setPrice(String Price)
	{
		this.Price=Price;
	}
	/**********************************************/
	public String addAuthor()
	{
		String sqlSearch="insert into author (AuthorID, Name, Age, Country) values ('"+
		this.AuthorID+"', '"+this.Name+"', '"+this.Age+"', '"+this.Country+"')";
		int rs=0;
		rs=DBconn.executeUpdate(sqlSearch);
		if (rs==0)
		{
			return "fail";
		}
		else
		{
			return "success";
		}
	}
	public String addBook()
	{
		String sqlSearch="insert into book (ISBN, Title, AuthorID, Publisher, PublishDate, Price) values ('"+
		this.ISBN+"', '"+this.Title+"', '"+this.id+"', '"+this.Publisher+"', '"+this.PublishDate+"', '"+this.Price+"')";
		int rs=0;
		rs=DBconn.executeUpdate(sqlSearch);
		if (rs==0)
		{
			return "fail";
		}
		else
		{
			return "success";
		}
	}
}

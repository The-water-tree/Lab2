<%@page import="bean.bookinf,bean.authorinf,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询结果细节</title>
<style type="text/css">  
#body {  
    background-color: #FFD2BD;  
         text-align:center;  
            
          text-align-last:  center;  
      }   
  </style>
</head>
<body id="body">
<center><h1 id="body">详细信息</h1></center>
<hr width="100%" size="4" color="#ffa500" align="center">
	<%
	request.setCharacterEncoding("utf-8");
	bookinf bookdetail=(bookinf) session.getAttribute("bookDetail");
	authorinf authordetail=(authorinf) session.getAttribute("authorDetail");
	%>
<br>
<br>
<center>
图书详细信息：
<table border="1" width="50%"  cellspacing="0" cellpadding="0">
<tr>
<td>ISBN</td>
<td>Title</td>
<td>AuthorID</td>
<td>Publisher</td>
<td>PublishDate</td>
<td>Price</td>
</tr>
	<%
		out.println("<tr><td>"+bookdetail.getISBN()+"</td>");
		out.println("<td>"+bookdetail.getTitle()+"</td>");
		out.println("<td>"+bookdetail.getAuthorID()+"</td>");
		out.println("<td>"+bookdetail.getPublisher()+"</td>");
		out.println("<td>"+bookdetail.getPublishDate()+"</td>");
		out.println("<td>"+bookdetail.getPrice()+"</td>"+"</tr>");
	%>
</table>
作者详细信息：
<table border="1" width="50%"  cellspacing="0" cellpadding="0">
<tr>
<td>AuthorID</td>
<td>Name</td>
<td>Age</td>
<td>Country</td>
</tr>
	<%
		out.println("<tr><td>"+authordetail.getAuthorID()+"</td>");
		out.println("<td>"+authordetail.getName()+"</td>");
		out.println("<td>"+authordetail.getAge()+"</td>");
		out.println("<td>"+authordetail.getCountry()+"</td>"+"</tr>");
	%>
</table>
</center>
<form action="index.jsp">
<input type="submit" value="点此返回首页" />
</form>
</body>
</html>
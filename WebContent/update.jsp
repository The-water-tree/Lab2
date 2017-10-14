<%@page import="bean.bookinf,bean.authorinf,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新页面</title>
<style type="text/css">  
#body {  
    background-color: #FFD2BD;  
         text-align:center;  
          alignment-baseline:  middle;  
          text-align-last:  center;  
      }   
  </style> 
</head>
<body id="body">
<center><h1 id="body">更新书籍</h1></center>
<hr width="100%" size="4" color="#ffa500" align="center">
	<%
	String ISBN=(String)request.getParameter("ISBN");
	session.setAttribute("IS", ISBN);
	%>
	<br>
	<br>
<form name = "update" action="update" method="post">
更新后的作者ID：&nbsp&nbsp&nbsp&nbsp<input type="text" name="AuthorID" placeholder="（请输入已有ID）" />
<br>
更新后的出版社：&nbsp&nbsp&nbsp&nbsp<input type="text" name="Publisher" placeholder="空输入则不改变" />
<br>
更新后的出版日期：<input type="text" name="Publishdate" placeholder="空输入则不改变" />
<br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp更新后的价格：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="Price" placeholder="空输入则不改变" />
<input type="submit" value="更新">
</form>
</body>
</html>
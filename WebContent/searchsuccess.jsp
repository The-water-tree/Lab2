<%@page import="bean.bookinf,bean.authorinf,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search successful</title>
<style type="text/css">  
#body {  
    background-color: #FFD2BD;  
         text-align:center;  
          alignment-baseline:  middle;  
          text-align-last:  left;  
      }   
  </style>
</head>
<body id="body">
<h1>查询成功</h1>
	<%
	request.setCharacterEncoding("utf-8");
	Vector<bookinf> showbook=(Vector<bookinf>) session.getAttribute("bi");
	%>
<center>
 <table border="1" width="50%"  cellspacing="0" cellpadding="0">    
    <tr>    
      <td>书籍名称</td>
      <td>删除操作</td> 
      <td>更新操作</td>
    </tr>   
	<%
	int i;
	for (i=0;i<showbook.size();i++)
	{
		out.println("<tr><td>"+"<a href=findauthorbyISBN?ISBN="+showbook.elementAt(i).getISBN()+">"+showbook.elementAt(i).getTitle()+"</td>");
		out.println("<td>"+"<a href=deletebookbyISBN?ISBN="+showbook.elementAt(i).getISBN()+">"+"删除"+"</td>");
		out.println("<td>"+"<a href=update.jsp?ISBN="+showbook.elementAt(i).getISBN()+">"+"更新（更新前先看看原来的信息哦^-^）"+"</td></tr>");
	}
	%>
 </table>
</center>
	<form action="index.jsp">
	<input type="submit" value="点此返回首页" style="color:blue " />
	</form>
</body>
</html>
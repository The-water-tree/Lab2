<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎页</title>
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
<center><h1 id="body">图书管理系统欢迎页</h1></center>
<hr width="100%" size="4" color="#ffa500" align="center">
<br>
<center>
<font size="3" color="#0000ff">请选择想要使用的功能↓</font>
<p>
<form action="search.jsp">
<input type="submit" value="查询图书" />
</form>
<p>
<form action="addsearch.jsp">
<input type="submit" value="添加图书" />
</form>
</center>
</body>
</html>
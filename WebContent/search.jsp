<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书查询页面</title>
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
<center><h1 id="body">图书管理系统作者查询页</h1></center>
<hr width="100%" size="4" color="#ffa500" align="center">
<br>
<center>
<form name = "query" action="query" method="post">
作者名：<input type="text" name="Name" placeholder="输入要查询的作者名" />
<input type="submit" value="查询">
</form>
</center>
</body>
</html>
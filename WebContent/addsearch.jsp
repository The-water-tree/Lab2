<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加页面</title>
<style type="text/css">  
#body {  
    background-color: #FFD2BD;  
         text-align:center;  
            
          text-align-last:  center;  
      }   
  </style>
</head>
<body id="body">
<h2>查询添加作者是否存在</h2>
<hr width="100%" size="4" color="#ffa500" align="center">
<br>
<br>
<form name = "search" action="search" method="post">
作者ID：<input type="text" name="id" placeholder="输入要添加书的作者ID" />
<input type="submit" value="查询">
</form>
</body>
</html>
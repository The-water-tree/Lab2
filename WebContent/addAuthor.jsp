<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加作者</title>
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
<h2>添加作者（作者不在数据库中）</h2>
<hr width="100%" size="4" color="#ffa500" align="center">
<form name = "addAuthor" action="addAuthor" method="post">
作者的ID：<input type="text" name="AuthorID" placeholder="输入要添加书的作者ID" style="width:200px;" />
<br>
<br>
作者姓名：<input type="text" name="Name" placeholder="输入要添加书的作者姓名" style="width:200px;">
<br>
<br>
作者年龄：<input type="text" name="Age" placeholder="输入要添加书的作者年龄" style="width:200px;">
<br>
<br>
作者国家：<input type="text" name="Country" placeholder="输入要添加书的作者国家" style="width:200px;">
<br>
<br>
<input type="submit" value="添加作者">
</form>
</body>
</html>
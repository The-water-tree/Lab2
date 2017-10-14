<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书</title>
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
<h2>添加图书（添加的作者已存在）</h2>
<hr width="100%" size="4" color="#ffa500" align="center">
<form name = "addBook" action="addBook" method="post">
ISBN：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="ISBN" placeholder="输入要添加书的ISBN" />
<br>
<br>
书名：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="Title" placeholder="输入要添加书的书名">
<br>
<br>
作者ID：&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="id" placeholder="输入要添加书的作者ID">
<br>
<br>
出版社：&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="Publisher" placeholder="输入要添加书的出版社">
<br>
<br>
出版日期：&nbsp<input type="text" name="PublishDate" placeholder="输入要添加书的出版日期">
<br>
<br>
价格：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="Price" placeholder="输入要添加书的价格">
<br>
<br>
<input type="submit" value="添加图书">
</form>
</body>
</html>
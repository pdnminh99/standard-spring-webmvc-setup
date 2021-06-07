<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: minhpdn99
  Date: 07/06/2021
  Time: 08:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Greeting</title>
</head>
<body>

<h1>Hello World</h1>

<jsp:useBean id="book" class="com.example.demo.model.Book" />

<%--<jsp:setProperty name="book" property="title" value="Harry Potter and The Sorcerer Stone" />--%>
<%--<jsp:setProperty name="book" property="author" value="JK.Rowling" />--%>

<h1>The book title is <jsp:getProperty name="book" property="title"/></h1>
<h1>The book author is <jsp:getProperty name="book" property="author"/></h1>

<h1>Book title using Spring El: ${book.title}</h1>

<%--<%!--%>
<%--    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");--%>
<%--    Date date = new Date(System.currentTimeMillis());--%>
<%--%>--%>

<%--<%--%>
<%--    out.println(formatter.format(date));--%>
<%--%>--%>

<%--<%= formatter.format(date) %>--%>

</body>
</html>

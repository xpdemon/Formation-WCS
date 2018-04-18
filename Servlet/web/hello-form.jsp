<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 16/04/18
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <link href="/SayHello.css" rel="stylesheet" type="text/css" >
    <title>hello-form.jsp</title>
</head>
<body>

<form action="SayHello" method="post">
    <p>
    <input type="text" name="name" placeholder="Name" >
    </p>
    <p>
    <input type="text" name="surname" placeholder="Surname">
    </p>
    <p>
    <input type="number" name="time" placeholder="Time 0->24" >
    </p>
    <p>
    <input type="submit" name="submit">
    </p>
</form>

</body>
</html>

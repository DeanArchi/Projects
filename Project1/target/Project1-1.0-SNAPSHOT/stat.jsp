<%--
  Created by IntelliJ IDEA.
  User: Ivan
  Date: 10.10.2022
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistics of the questions</title>
</head>
<body>
    <h1>Statistics of the questions: </h1>
    <form action="/form" method="post">
        1. Blue's lovers: ${blue}<br>
           Yellow lovers: ${yellow}<br>
           Red lovers: ${red}<br>
        2. Who is learning Java: ${yes}<br>
           Who isn't learning Java: ${no}<br>
    </form>
    <br>Click this link to <a href="/reg">go back</a>
</body>
</html>

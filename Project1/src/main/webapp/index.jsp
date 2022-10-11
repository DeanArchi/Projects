<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

    <form action="/reg" method="post">
        Input your first name: <input type="text" name="firstName"><br>
        Input your second name: <input type="text" name="secondName"><br>
        Input your age: <input type="text" name="age"><br>

        Your favourite color?
        <select name="color" id="color">
            <option value="blue">Blue</option>
            <option value="yellow">Yellow</option>
            <option value="red">Red</option>
        </select><br>

        Are you learning Java?
        <select name="quiz" id="quiz">
            <option value="yes">Yes</option>
            <option value="no">No</option>
        </select><br>
        <input type="submit" onclick="location.href = '/stat.jsp'">
    </form>
</body>
</html>
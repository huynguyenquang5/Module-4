<%--
  Created by IntelliJ IDEA.
  User: huyng
  Date: 13/12/2022
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dictionary</h2>
<form action="translate" method="post">
  <input type="text" name="word">
  <button type="submit">Submit</button>
</form>
<h3>Result: ${result}</h3>
</body>
</html>

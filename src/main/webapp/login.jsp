<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body>
${username}
<form action="Login" >
<input type="text" name="userName" placeholder="enter user name">
<input type="text" name="password" placeholder="enter password">
<input type="submit" value="submit">

</form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"; %>
<html>
<head>
    <base href="<%= basePath%>">

    <title>登录</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
</head>
<body>
<form action="/customer/login.view">
   用户名：<input type="text" name="customerName" required><br/>
   密码：<input type="password" name="customerPassword" required><br/>
   请记住我：<input type="checkbox" value="on" name="isRemember">
    <input type="submit" value="登录">
</form>
</body>
</html>
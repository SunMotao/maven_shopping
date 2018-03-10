<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"; %>
<html>
<head>
    <base href="<%= basePath%>">

    <title>$</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
</head>
<body>
    <form action="/customer/reg.do">
        用户名<input type="text" name="customerName">
        密码<input type="password" name="customerPassword">
        邮箱<input type="email" name="customerEmail">
        手机号<input type="text" name="customerPhone">
        <input type="submit" value="提交">
    </form>
</body>
</html>
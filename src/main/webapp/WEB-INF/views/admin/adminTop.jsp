<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"; %>
<head>
    <base href="<%= basePath%>">

    <title>管理页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">

        <div class="navbar-header">
            <a class="navbar-brand" href="page/admin/adminIndex.jsp">管理页面</a>
        </div>
        <div>
            <c:choose>
                <c:when test="${sessionScope.admin!=null}">
                    <a class="navbar-text navbar-left" href="page/admin/adminIndex.jsp"><c:out value="${sessionScope.admin.adminName}"></c:out></a>
                </c:when>
                <c:otherwise>
                    <a class="navbar-text navbar-left" href="page/admin/adminLogin.jsp">请登录</a>
                </c:otherwise>
            </c:choose>
        </div>

        <div>
            <a class=" navbar-text navbar-left" href="informManager.view">消息管理</a>
            <a class=" navbar-text navbar-left" href="/product/addProduct.do">商品管理</a>
            <a class=" navbar-text navbar-left" href="page/order/orderManager.jsp">订单管理</a>
            <a class=" navbar-text navbar-left" href="stockManager.do">库存管理</a>
            <a class=" navbar-text navbar-left" href="page/admin/customerManager.jsp">用户管理</a>
            <a class=" navbar-text navbar-left" href="shelfManager.do">货架管理</a>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="page/admin/userIndex.jsp" class="dropdown-toggle">
                        账户管理 <b class="caret"></b>
                    </a>

                </li>
            </ul>
        </div>
        <a class="navbar-text navbar-right" href="page/admin/adminLogin.jsp">退出</a>
    </div>
</nav>
</body>
</html>
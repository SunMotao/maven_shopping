<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"; %>
<html>
<head>
    <base href="<%= basePath%>">

    <title>首页</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
</head>
<body>

<jsp:include page="/WEB-INF/views/admin/adminTop.jsp"></jsp:include>

<div class="container">
    <div class="row">
        <form action="/product/addProduct.view" method="post" enctype="multipart/form-data">
            <table cellpadding="1" cellspacing="0">
                <tr>
                    <td>商品名称</td>
                    <td></td>
                    <td colspan="2"><input type="text" name="productName" class="table_col"><br/></td>
                </tr>
                <tr>
                    <td>商品价格</td>
                    <td></td>
                    <td colspan="2"><input type="text" name="productPrice" class="table_col"><br/></td>
                </tr>
                <tr>
                    <td>商品类型</td>
                    <td></td>
                    <td colspan="2"><input type="text" name="productType" class="table_col"><br/></td>
                </tr>
                <tr>
                    <td>商品小图片</td>
                    <td></td>
                    <td colspan="2"><input type="file" name="small_image" class="table_col"><br/></td>
                </tr>
                <tr>
                    <td>商品大图片</td>
                    <td></td>
                    <td colspan="2"><input type="file" name="big_image" class="table_col"><br/></td>
                </tr>
                <tr>
                    <td>商品说明</td>
                    <td></td>
                    <td colspan="2"><textarea name="productCaption" cols="50" rows="5" class="table_col"></textarea><br/></td>
                </tr>
                <br/>
                <tr >
                    <td colspan="3"><input type="submit" value="增加商品" class="table_col"></td>
                </tr>
            </table>
        </form>

    </div>
</div>
</body>
</html>
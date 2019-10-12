<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript">
        var URL_PREFIX="${pageContext.request.contextPath}";
        function showUser(){
            window.location.href= URL_PREFIX +"/shop/buy";

        }
        </script>
</head>
<body>
<div style="margin-left:400px">
    <table border="1" cellpadding="1" cellspacing="1" width="60%">
        <p>商品列表</p>    </table>
</div>

    <td><a href="javascript:void(0)" onClick="showUser()"/>查询用户信息</td> </tr>
<br/>
<div style="margin-left:400px">
    view-address.jsp <br>
    <c:forEach items="${userList}" var="user">
        <h5>id:${user.id}</h5>
        <h5>name:${user.name}</h5>
        <h5>age:${user.age}</h5>
    </c:forEach>
</div>
</body>
</html>

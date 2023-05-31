<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- エラーメッセージ -->
<c:if test="${errormsg != null }">${errormsg}</c:if>
<c:remove var="errormsg"/>

<!-- ログイン用フォーム -->
<form action="../loginServlet" method="post">
<p>ユーザID<input type="text" name="userid"></p>
<p>パスワード<input type="password" name="password"></p>
<p><input type="submit" value="ログイン"></p>
</form>
</body>
</html>
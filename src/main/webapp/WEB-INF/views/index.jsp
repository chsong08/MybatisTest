<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="ctx"/>
<html>
<head>
    <title>chen</title>
</head>
<body>
${desc}
</br>
${name}
<c:out value="${ctx}"/>
<form action="/mybatisTest/user/save" method="post">
    <input type="text" name="userName"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
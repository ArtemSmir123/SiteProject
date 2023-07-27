<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE HTML>
<html>
<head>
  <title>Главная</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>
<body>
<div id="section1" class="section">
  <h3>${pageContext.request.userPrincipal.name}</h3>
  <sec:authorize access="!isAuthenticated()">
    <p><form method="GET" action="/login"><button type="submit" id="ser7">Войти</button></form></p>
    <p><form method="GET" action="/registration"><button type="submit" id="ser7">Зарегистрироваться</button></form></p>
  </sec:authorize>
  <sec:authorize access="isAuthenticated()">
    <p><form method="GET" action="/logout"><button type="submit" id="ser7">Выйти</button></form></p>
    <p><form method="GET" action="/news"><button type="submit" id="ser7">Новости (только пользователь)</button></form></p>
    <sec:authorize access="hasRole('ADMIN')">
        <p><form method="GET" action="/admin" ><button type="submit" id="ser7">Пользователи (только админ)</button></form></p>
    </sec:authorize>
  </sec:authorize>
</div>
</body>
</html>
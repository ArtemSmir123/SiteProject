<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Вход в систему</title>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<sec:authorize access="isAuthenticated()">
  <% response.sendRedirect("/"); %>
</sec:authorize>
<div id="section1" class="section">
  <form method="POST" action="/login">
    <h2>Вход в систему</h2>
    <div>
      <p><input name="username" class="inputfield" type="email" placeholder="Почта" autofocus="true" required/></p>
      <p><input name="password" class="inputfield" type="password" autocomplete="current-password" placeholder="Пароль" required/></p>
      <form:errors><p></form:errors>${error}</p>
      <button type="submit" id="ser7">Войти</button>
    </div>
    <div>
    </div>
    </form>
  <form method="GET" action="/registration">
    <p><button id="ser8">Зарегистрироваться</button></p>
  </form>
</div>

</body>
</html>
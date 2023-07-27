<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Регистрация</title>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<div id="section1" class="section">
  <form:form method="POST" modelAttribute="userForm">
    <h2>Регистрация</h2>
    <p><div>
      <form:input class="inputfield" type="text" path="username" placeholder="Почта" autofocus="true"></form:input>

    </div></p>
    <p><div>
      <form:input class="inputfield" type="password" path="password" placeholder="Пароль"></form:input>
    </div></p>
    <p><div>
      <form:input class="inputfield" type="password" path="passwordConfirm"
                  placeholder="Подтвердите пароль"></form:input>

    </div></p>
    <form:errors path="password"><p></form:errors>${passwordError}</p>
    <form:errors path="username"><p></form:errors>${usernameError}</p>
    <button id="ser7" type="submit">Зарегистрироваться</button>
  </form:form>
  <form:form method="GET" action="/">
  <p><button id="ser7" type="submit">Назад на главную</button></p>
  </form:form>
</div>
</body>
</html>
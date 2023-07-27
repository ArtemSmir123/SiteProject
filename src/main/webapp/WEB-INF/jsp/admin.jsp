<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Log in with your account</title>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<div id="auth" class="section">
    <p><security:authorize access="isAuthenticated()">
          <h2>Пользователь <security:authentication property="principal.username" /></h2>
    </security:authorize> </p>
     <p><form action="/" method="get">
                <button type="submit" id="ser7">Главная</button>
     </form> </p>
     <p><form method="GET" action="/logout"><button type="submit" id="ser7">Выйти</button></form></p>
</div>
<div id="sectionadmin" class="section">
    <p><h2>Контроль пользователей</h2></p>
  <table>
    <thead>
    <th>ID</th>
    <th>UserName</th>
    <th>Password</th>
    <th>Roles</th>
    </thead>
    <c:forEach items="${allUsers}" var="user">
      <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>
          <c:forEach items="${user.roles}" var="role">${role.name}; </c:forEach>
        </td>
        <td>
          <form action="${pageContext.request.contextPath}/admin" method="post">
            <input type="hidden" name="userId" value="${user.id}"/>
            <input type="hidden" name="action" value="delete"/>
            <button type="submit" id="tableBut">Delete</button>
          </form>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>

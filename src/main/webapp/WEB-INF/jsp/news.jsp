<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Новости</title>
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
    <h2>Новости <br> Только для залогинившихся пользователей.</h2>
    <a href="/">Главная</a>
    <table>
        <thead>
        <th>Номер рейса</th>
        <th>Дата вылета</th>
        <th>Дата прилета</th>
        <th>Город вылета</th>
        <th>Город прилета</th>
        </thead>
        <c:forEach items="${allFlights}" var="flight">
          <tr>
            <td>${flight.id_flight}</td>
            <td>${flight.departure_date}</td>
            <td>${flight.arrival_date}</td>
            <td>${flight.departure_city}</td>
            <td>${flight.arrival_city}</td>
          </tr>
        </c:forEach>
      </table>
</div>
</body>
</html>
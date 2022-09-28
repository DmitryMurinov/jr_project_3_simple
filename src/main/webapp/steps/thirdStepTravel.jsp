<html>
<%@ page contentType="text/html; charset=UTF-8" %>
<body>
<h2>Вы вернулись на Землю.</h2>
<h2>Спецслужбы Земных Сил Безопасности и Добра решили что такой уникальный случай необходимо изучить вдали от сторонник глаз.</h2>
<h2>Вы провели остаток жизни подопытным в секретной лаборатории.</h2>
</br>
<a href="/index.jsp">Начать заново</a>
<%
    String iteration = (String)session.getAttribute("iteration");
    long iter = Long.parseLong(iteration);
    iter++;
    session.setAttribute("iteration", String.valueOf(iter));
%>
</body>
</html>

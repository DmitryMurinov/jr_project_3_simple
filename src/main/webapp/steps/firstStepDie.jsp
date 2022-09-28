<html>
<%@ page contentType="text/html; charset=UTF-8" %>
<body>
<h2>Вы не прошли тест на достаточный уровень развития.</h2>
<h1>Жалюзи порубили вас на куски, конец игры</h1>
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


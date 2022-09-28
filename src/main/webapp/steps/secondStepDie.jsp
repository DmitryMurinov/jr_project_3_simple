<html>
<%@ page contentType="text/html; charset=UTF-8" %>
<body>
<h2>Вы не собрали достаточно ресурсов для выживания.</h2>
<h2>Смерть на неизведанном краю галактики стала концом вашего пути.</h2>
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


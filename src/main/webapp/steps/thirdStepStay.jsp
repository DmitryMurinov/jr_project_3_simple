<html>
<%@ page contentType="text/html; charset=UTF-8" %>
<body>
<h2>Вам разрешили остаться.</h2>
<h2>Постепенно вы обжились, и незаметили как влились в коллективный разум.</h2>
<h2>Вы исчезли как личность задолго до того как на ваши движущиеся элементы потребовали первой замены суперстабильной смазки.</h2>
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

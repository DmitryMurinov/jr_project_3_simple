<html>
<%@ page contentType="text/html; charset=UTF-8" %>
<body>
<h1>Приветствуем на планете жалюзяка!</h1>
<h2>Наша планета населена разумными жалюзями, и при неуважительном отношении мы порубим вас на куски.</h2>
<h2>Пожалуйста, будьте вежливы, и тогда вы сможете рассчитывать на нашу помощь.</h2>
</br>
<form method="get" action="/first_step" enctype=text/plain>
    <input type="radio" name="choice" value="die">
        Какая планета? Какие жалюзи?!  Вааась, дай похмелится, ко мне белка пришла!
    </input>
    </br>
    <input type="radio" name="choice" value="live">
        Всепочтеннейше приветствую многоуважаемых жалюзи. Приношу глубочайшие извинения за непрошенный визит и повреждения,
    вызванные падением моего космолёта. Прошу оказать помощь в ремонте.
    </input>
    </br>
    <input type="submit" value="submit" />
</form>
</br>
</br>
</br>
<%
    String iteration = (String)session.getAttribute("iteration");
    if(iteration == null){
        iteration = "1";
        session.setAttribute("iteration", iteration);
    }

    out.print("Игра номер: " + iteration);
%>
</body>
</html>


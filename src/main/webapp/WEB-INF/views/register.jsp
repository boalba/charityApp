<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 08.07.2020
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/style.css" />
</head>
<body>
    <header>

        <jsp:include page="/WEB-INF/includes/header.jsp"/>

    </header>

    <section class="login-page">
        <h2>Załóż konto</h2>
        <form action="/register" method="post">
            <div class="form-group">
                <input type="email" name="email" placeholder="Email" />
            </div>
            <div class="form-group">
                <input type="password" name="password" placeholder="Hasło" />
            </div>
            <div class="form-group">
                <input type="password" name="password2" placeholder="Powtórz hasło" />
            </div>

            <div class="form-group form-group--buttons">
                <a href="login.html" class="btn btn--without-border">Zaloguj się</a>
                <button class="btn" type="submit">Załóż konto</button>
            </div>
        </form>
    </section>

    <jsp:include page="/WEB-INF/includes/footer.jsp"/>

</body>
</html>

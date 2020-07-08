<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 08.07.2020
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
    <header class="header--form-page">

        <jsp:include page="../includes/header.jsp"/>

        <div class="slogan container container--90">
            <h2>
                Dziękujemy za przesłanie formularza Na maila prześlemy wszelkie
                informacje o odbiorze.
            </h2>
        </div>
    </header>

    <jsp:include page="../includes/footer.jsp"/>

    <script src="js/app.js"></script>
</body>
</html>


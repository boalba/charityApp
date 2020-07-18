<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 18.07.2020
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/style.css" />
</head>
<body>
    <header class="header--main-page">

        <jsp:include page="/WEB-INF/includes/header.jsp"/>

        <div class="slogan container container--90">
            <div class="slogan--item">
                <h1>
                    Panel administracyjny
                </h1>
            </div>
        </div>

    </header>

    <section class="steps">
        <a href="/admin/institutions" class="btn btn--large">Fundacje</a>
    </section>

    <jsp:include page="/WEB-INF/includes/footer.jsp"/>

    <script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>

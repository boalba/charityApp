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
                    Fundacje
                </h1>
            </div>
        </div>

    </header>

    <section class="help">
        <h2>Lista fundacji</h2>

        <div class="help--slides active" data-id="1">

            <ul class="help--slides-items">
                <c:forEach items="${allInstitutions}" var="institution">
                    <li>
                        <div class="col">
                            <div class="title">Fundacja "${institution.name}"</div>
                        </div>
                        <div class="col">
                            <div class="title"><a href="/admin/institutions/edit/${institution.id}" class="btn btn--large">Edytuj</a></div>
                        </div>
                        <div class="col">
                            <div class="title"><a href="/admin/institutions/delete/${institution.id}" class="btn btn--large">Usuń</a></div>
                        </div>
                    </li>
                </c:forEach>
            </ul>
        </div>

    </section>

    <jsp:include page="/WEB-INF/includes/footer.jsp"/>

    <script src="<c:url value="/resources/js/app.js"/>"></script>
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: maciej
  Date: 08.07.2020
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="../css/style.css" />
</head>
<body>
    <header class="header--form-page">

        <jsp:include page="../includes/header.jsp"/>

        <div class="slogan container container--90">
            <div class="slogan--item">
                <h1>
                    Oddaj rzeczy, których już nie chcesz<br />
                    <span class="uppercase">potrzebującym</span>
                </h1>

                <div class="slogan--steps">
                    <div class="slogan--steps-title">Wystarczą 4 proste kroki:</div>
                    <ul class="slogan--steps-boxes">
                        <li>
                            <div><em>1</em><span>Wybierz rzeczy</span></div>
                        </li>
                        <li>
                            <div><em>2</em><span>Spakuj je w worki</span></div>
                        </li>
                        <li>
                            <div><em>3</em><span>Wybierz fundację</span></div>
                        </li>
                        <li>
                            <div><em>4</em><span>Zamów kuriera</span></div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </header>

    <section class="form--steps">
        <div class="form--steps-instructions">
            <div class="form--steps-container">
                <h3>Ważne!</h3>
                <p data-step="1" class="active">
                    Uzupełnij szczegóły dotyczące Twoich rzeczy. Dzięki temu będziemy
                    wiedzieć komu najlepiej je przekazać.
                </p>
                <p data-step="2">
                    Uzupełnij szczegóły dotyczące Twoich rzeczy. Dzięki temu będziemy
                    wiedzieć komu najlepiej je przekazać.
                </p>
                <p data-step="3">
                    Wybierz jedną, do
                    której trafi Twoja przesyłka.
                </p>
                <p data-step="4">Podaj adres oraz termin odbioru rzeczy.</p>
            </div>
        </div>

        <div class="form--steps-container">
            <div class="form--steps-counter">Krok <span>1</span>/4</div>

            <form:form action="/form-confirmation" method="post" modelAttribute="donation">
                <!-- STEP 1: class .active is switching steps -->
                <div data-step="1" class="active">
                    <h3>Zaznacz co chcesz oddać:</h3>

                    <div class="form-group form-group--checkbox">
                        <label>
                            <form:checkboxes
                             path="categories" items="${listOfAllCategories}" itemValue="id" itemLabel="name"/>
                        </label>
                    </div>
                    <div class="form-group form-group--buttons">
                        <button type="button" class="btn next-step">Dalej</button>
                    </div>
                </div>

                <!-- STEP 2 -->
                <div data-step="2">
                    <h3>Podaj liczbę 60l worków, w które spakowałeś/aś rzeczy:</h3>

                    <div class="form-group form-group--inline">
                        <label>
                            Liczba 60l worków:
                            <form:input type="number" path="quantity" step="1" min="1"/>
                        </label>
                    </div>

                    <div class="form-group form-group--buttons">
                        <button type="button" class="btn prev-step">Wstecz</button>
                        <button type="button" class="btn next-step">Dalej</button>
                    </div>
                </div>



                <!-- STEP 4 -->
                <div data-step="3">
                    <h3>Wybierz organizacje, 7
                        której chcesz pomóc:</h3>

                    <div class="form-group form-group--checkbox">
                        <label>
                            <form:radiobuttons path="institution" items="${listOfAllInstitutions}" itemValue="id" itemLabel="name"/>
                        </label>
                    </div>

                    <div class="form-group form-group--buttons">
                        <button type="button" class="btn prev-step">Wstecz</button>
                        <button type="button" class="btn next-step">Dalej</button>
                    </div>
                </div>

                <!-- STEP 5 -->
                <div data-step="4">
                    <h3>Podaj adres oraz termin odbioru rzecz przez kuriera:</h3>

                    <div class="form-section form-section--columns">
                        <div class="form-section--column">
                            <h4>Adres odbioru</h4>
                            <div class="form-group form-group--inline">
                                <label> Ulica <form:input path="street" /> </label>
                            </div>

                            <div class="form-group form-group--inline">
                                <label> Miasto <form:input path="city" /> </label>
                            </div>

                            <div class="form-group form-group--inline">
                                <label>
                                    Kod pocztowy <form:input path="zipCode" />
                                </label>
                            </div>

                            <div class="form-group form-group--inline">
                                <label>
                                    Numer telefonu <input type="phone" name="phone"/>
                                </label>
                            </div>
                        </div>

                        <div class="form-section--column">
                            <h4>Termin odbioru</h4>
                            <div class="form-group form-group--inline">
                                <label> Data <form:input path="pickUpDate" type="date"/> </label>
                            </div>

                            <div class="form-group form-group--inline">
                                <label> Godzina <form:input path="pickUpTime" type="time"/> </label>
                            </div>

                            <div class="form-group form-group--inline">
                                <label>
                                    Uwagi dla kuriera
                                    <form:textarea path="pickUpComment" rows="5"></form:textarea>
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group form-group--buttons">
                        <button type="button" class="btn prev-step">Wstecz</button>
                        <button type="button" class="btn next-step">Dalej</button>
                    </div>
                </div>

                <!-- STEP 6 -->
                <div data-step="5">
                    <h3>Podsumowanie Twojej darowizny</h3>

                    <div class="summary">
                        <div class="form-section">
                            <h4>Oddajesz:</h4>
                            <ul>
                                <li>
                                    <span class="icon icon-bag"></span>
                                    <span class="summary--text"
                                    >4 worki ubrań w dobrym stanie dla dzieci</span
                                    >
                                </li>

                                <li>
                                    <span class="icon icon-hand"></span>
                                    <span class="summary--text"
                                    >Dla fundacji "Mam marzenie" w Warszawie</span
                                    >
                                </li>
                            </ul>
                        </div>

                        <div class="form-section form-section--columns">
                            <div class="form-section--column">
                                <h4>Adres odbioru:</h4>
                                <ul>
                                    <li>Prosta 51</li>
                                    <li>Warszawa</li>
                                    <li>99-098</li>
                                    <li>123 456 789</li>
                                </ul>
                            </div>

                            <div class="form-section--column">
                                <h4>Termin odbioru:</h4>
                                <ul>
                                    <li>13/12/2018</li>
                                    <li>15:40</li>
                                    <li>Brak uwag</li>
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="form-group form-group--buttons">
                        <button type="button" class="btn prev-step">Wstecz</button>
                        <button type="submit" class="btn">Potwierdzam</button>
                    </div>
                </div>
            </form:form>
        </div>
    </section>

    <jsp:include page="../includes/footer.jsp"/>

    <script src="../js/app.js"></script>
</body>
</html>

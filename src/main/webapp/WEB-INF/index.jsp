<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 24.09.2018
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
  <head>

  </head>
<header>
    
</header>
  <body>

 <p>  ${msg}</p>

  <form  method = "post">
    date: <input type = "text" name = "date">

    <input type = "submit" value = "Submit" />
  </form>

<p><spring:message code="index.UserNextBithday"/> ${dayToNextBithday}</p>
<p> <spring:message code="index.UserAge"> ${age}</p>
 </body>
    <footer>
    <p> Project version is <i>1.0-SNAPSHOT</i></p>

    </footer>
</html>

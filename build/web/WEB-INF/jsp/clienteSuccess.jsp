<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1>Actinver <small>Clientes registro exitoso</small></h1>
            </div>
            <div>
                <ul>
                    <li>Nombre: <c:out value="${nombre}"/></li>
                    <li>Paterno:<c:out value="${paterno}"/></li>
                    <li>Materno:<c:out value="${materno}"/></li>
                    <li>Sexo:<c:out value="${sexo}"/></li>
                    <li>Estado:<c:out value="${estado}"/></li>
                </ul>

            </div>
        </div>
    </body>
</html>

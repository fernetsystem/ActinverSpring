<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Clientes</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1>Actinver <small>Clientes</small></h1>
            </div>
            <div class="pull-right">
                <a href="clienteRegistrar.htm">Registrar cliente</a>
            </div>
            <div>
                <table class="table table-hober">
                        <tr>
                            <th>IdCliente</th>
                            <th>Nomre</th>
                            <th>Apellido paterno</th>
                            <th>Apellido materno</th>                            
                        </tr>
                        <c:forEach items="${datos}" var="dato">
                        <tr>
                             <td><c:out value="${dato.idCliente}"/></td>
                            <td><c:out value="${dato.nombre}"/></td>
                             <td><c:out value="${dato.paterno}"/></td>
                              <td><c:out value="${dato.materno}"/></td>
                        </tr>
                        </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>

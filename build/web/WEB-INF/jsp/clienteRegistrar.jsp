
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <h1>Actinver <small>Clientes registro</small></h1>
            </div>
            <div class="">
                <form:form >
                    <p>
                        <form:label path="nombre">Nombre</form:label>
                        <form:input path="nombre"></form:input>
                    </p>
                    <p>
                        <form:label path="paterno">Paterno</form:label>
                        <form:input path="paterno"></form:input>
                    </p>
                    <p>
                        <form:label path="materno">Materno</form:label>
                        <form:input path="materno"></form:input>
                    </p>
                    <p>
                        <form:label path="sexo">Nombre</form:label>
                        <form:select path="sexo">
                            <form:option value="0">Mujer</form:option>
                            <form:option value="1">Hombre</form:option>                            
                        </form:select>
                    </p>
                    <p>
                        <form:label path="estado">Estado</form:label>
                        <form:input path="estado"></form:input>
                    </p>
                    <input type="submit" class="btn btn-success" value="Aceptar">
                </form:form>
            </div>
        </div>
    </body>
</html>

<%@ page pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="es">
<head>

<spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.css" var="bootstrapCss" />
<spring:url value="/resources/css/style-clinic.css" var="styleClinic" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${styleClinic}" rel="stylesheet" />


<title>Home</title>
</head>
<body>
	<header>
    </header>
    <br><br>
    <section>
        <div class="container-fluid">
            <div class="row">
                <div class="row">
                    <div class="col-md-offset-4 col-md-4 img-logo">
                        <img src="resources/img/logo.png" alt="" class="img-thumbnail">
                    </div>
                    <div class="col-md-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Inicio de sesión</h3>
                            </div>
                            <div class="panel-body">
                                <form method="post" action="login">
                                    <div class="form-group">
                                        <label>Usuario:</label>
                                        <input type="text" id="userName" name="userName" class="form-control" placeholder="Usuario" required="required" />
                                    </div>
                                    <div class="form-group">
                                        <label>Contraseña:</label>
                                        <input type="password" id="password" name="password" class="form-control" placeholder="Contraseña" required="required" />
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success center-block">Entrar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="homepage-title--container text-center">
                    <h2 class="homepage-title">
                    Clínica de la Universidad de la Sierra Sur
                </h2>
                    <div class="homepage-subtitle--container desktop-only">
                        <div class="homepage-subtitle">
                            clínica de la universidad de la sierra sur texto texto texto texto texto y más texto otro poco más
                        </div>
                        <div class="homepage-subtitle">
                            Clínica de la universidad de la sierra sur
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <footer></footer>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>

<spring:url
	value="/resources/bower_components/bootstrap/dist/css/bootstrap.css"
	var="bootstrapCss" />
<!-- <spring:url value="/resources/bower_components/jquery/dist/jquery.js" var="jQueryJs" /> -->

<link href="${bootstrapCss}" rel="stylesheet" />
<!-- <script src="${jQueryJs}"></script> -->

<title>Home</title>
</head>
<body style="background-color: #887">
	<header></header>
	<br>
	<br>
	<section>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-offset-8 col-md-3">
					<div class="panel panel-info">
						<div class="panel-heading">
							<h3 class="panel-title">Inicio de sesión</h3>
						</div>
						<div class="panel-body">
							<form method="post" action="login">
								<div class="form-group">
									<label>Usuario:</label> <input type="text" id="userName"
										name="userName" class="form-control" placeholder="Usuario"
										required="required" />
								</div>
								<div class="form-group">
									<label>Contraseña:</label> <input type="password" id="password"
										name="password" class="form-control" placeholder="Contraseña"
										required="required" />
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-success center-block">Entrar</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<footer> </footer>
</body>
</html>

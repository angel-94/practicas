<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.css" var="bootstrapCss"/>
			<!-- <spring:url value="/resources/bower_components/jquery/dist/jquery.js" var="jQueryJs" /> -->

			<link href="${bootstrapCss}" rel="stylesheet"/>
			<!-- <script src="${jQueryJs}"></script> -->

			<title>menu</title>
		</head>
		<body>
			<header>
				<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#"></a>
						</div>

						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="navbar">
							<ul class="nav navbar-nav">
								<li class="active">
									<a href="#">Home</a>
								</li>
								<li>
									<a href="#"></a>
								</li>

							</ul>

								<ul class="nav navbar-nav navbar-right">
									<li>
										<a href="#"></a>
									</li>
								</ul>
							</div>
							<!-- /.navbar-collapse -->
						</div>
						<!-- /.container-fluid -->
					</nav>
				</header>
				<section>
					<div class="container-fluid"></div>
				</section>
				<footer>

				</footer>
			</body>
		</html>

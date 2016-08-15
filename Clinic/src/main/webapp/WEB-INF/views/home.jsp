<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>
<html>
	<head>
		<spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.css" var="bootstrapCss" />
		<!--<spring:url value="/resources/bower_components/jquery/dist/jquery.js" var="jQueryJs" />-->
		<link href="${bootstrapCss}" rel="stylesheet" />
		<!-- <script src="${jQueryJs}"></script> -->
		<title>Home</title>
	</head>
	<body>
		<header>
			<nav class="navbar navbar-default" role="navigation">
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
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search"></div>
								<button type="submit" class="btn btn-default">Submit</button>
							</form>
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
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-offset-8 col-md-3">
							<form:form class="" action="index.html" method="post">
								
								<div class="form-group">
								  <label>Usuario o e-mail</label>
								  <input type="text" class="form-control" id="" placeholder="Usuario o e-mail" />
								</div>
								<div class="form-group">
								  <label for="">Contraseña</label>
								  <input type="password" class="form-control" id="" placeholder="Contraseña" />
								</div>
								
							</form:form>
						</div>
					</div>
				</div>
			</section>
			<footer>
				<p>
					pie de la pagina principal
				</p>
			</footer>
		</body>
	</html>

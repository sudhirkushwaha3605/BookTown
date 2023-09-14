<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>


</head>
<body>
	<!-- header section strats -->
	<div class="hero_area">
		<header class="header_section">
			<div class="container">
				<nav class="navbar navbar-expand-lg custom_nav-container pt-3 ">
					<a class="navbar-brand" href="index.html"> <img
						src="images/logo.png" alt="" /><span> Book Town </span>
					</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<div
							class="d-flex ml-auto flex-column flex-lg-row align-items-center">
							<ul class="navbar-nav  ">
								<li class="nav-item active"><a class="nav-link"
									href="index.jsp">Home <span class="sr-only">(current)</span></a>
								</li>
								<li class="nav-item"><a class="nav-link" href="includes/about.jsp">About</a>
								</li>
								<!-- <li class="nav-item"><a class="nav-link"
									href="service.html"> Services </a></li> -->
								<li class="nav-item"><a class="nav-link"
									href="contact.html">Contact us</a></li>
							</ul>
							
							
							
							
						
						<%
        					if(session.getAttribute("userobj")!= null){ %>
        				<a href="cart.jsp"><div style=" height:30px; width:20px; background:red;" ><svg xmlns="http://www.w3.org/2000/svg" width="16" height="20" fill="currentColor" class="bi bi-cart-fill" viewBox="0 0 16 16">
  <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
</svg></div></a>
        				<div style="margin-right:5px; "><a href="#"> <img src="images/person-circle.svg"></a></div>
						<div class="color:blue;"><%=session.getAttribute("userobj") %></div>
						<div
							class="quote_btn-container ml-0 ml-lg-4 d-flex justify-content-center">
							<a href="UserLogout"> Logout </a>
						</div>
						<% } 
        else{
        	 %>
						<div
							class="quote_btn-container ml-0 ml-lg-4 d-flex justify-content-center">
							<a href="loginandregister.jsp"> Login </a>
						</div>
						<% } %>


					</div>
				</nav>
			</div>
		</header>
	</div>
	<!-- end header section -->
	
	
</body>
</html>
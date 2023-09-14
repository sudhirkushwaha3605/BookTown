<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<script src="https://kit.fontawesome.com/64d58efce2.js"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/loginandregister.css" />

<title>Sign in & Sign up Form</title>
</head>
<body>
	<div class="container">
		<div class="forms-container">
			<div class="signin-signup">

				<form action="UserLoginServlet" class="sign-in-form" method="post">
					<h2 class="title">Login</h2>

					

					<c:if test="${not empty failedMessage}">
						<p class="text-center text-danger">${failedMessage}</p>
						<c:remove var="failedMessage" scope="session" />
					</c:if>


					<div class="input-field">
						<i class="fas fa-user"></i> <input type="text"
							placeholder="Username" name="username" required />
					</div>

					<div class="input-field">
						<i class="fas fa-lock"></i> <input type="password"
							placeholder="Password" name="password" required />
					</div>
					
					<input type="submit" value="login" class="btn solid" />


				</form>


				<form action="UserRegisterServlet" method="post" class="sign-up-form"
					required>
					<h2 class="title">Register</h2>


					<c:if test="${not empty successMessage}">
						<p class="text-center text-success">${successMessage}</p>
						<c:remove var="successMessage" scope="session" />
					</c:if>

					<c:if test="${not empty failMessage}">
						<p class="text-center text-success">${failMessage}</p>
						<c:remove var="failMessage" scope="session" />
					</c:if>


					<div class="input-field">
						<i class="fas fa-user"></i> <input type="text"
							placeholder="Username" name="username" required />
					</div>

					<div class="input-field">
						<i class="fas fa-user"></i> <input type="text"
							placeholder="First Name" name="firstname" required />
					</div>

					<div class="input-field">
						<i class="fas fa-user"></i> <input type="text"
							placeholder="Last Name" name="lastname" required />
					</div>

					<div class="input-field">
						<i class="fas fa-phone-volume"></i> <input type="tel"
							placeholder="Contact" name="contact" required />
					</div>

					<div class="input-field">
						<i class="fas fa-envelope"></i> <input type="email"
							placeholder="Email" name="email" required />
					</div>
					<div class="input-field">
						<i class="fas fa-lock"></i> <input type="password"
							placeholder="Password" name="password" required />
					</div>

					<div class="input-field">
						<i class="fas fa-address-card"></i> <input type="text"
							placeholder="Enter Address" name="address" required />
					</div>
					
					<input type="submit" class="btn" value="register" />



				</form>

			</div>
		</div>

		<div class="panels-container">
			<div class="panel left-panel">
				<div class="content">
					<h3>New here ?</h3>
					<p></p>
					<button class="btn transparent" id="sign-up-btn">Register
					</button>
				</div>
				<img src="img/log.svg" class="image" alt="" />
			</div>
			<div class="panel right-panel">
				<div class="content">
					<h3>Already have an account</h3>
					<p></p>
					<button class="btn transparent" id="sign-in-btn">Login</button>
				</div>
				<img src="img/register.svg" class="image" alt="" />
			</div>
		</div>
	</div>

	<script src="js/loginandregister.js"></script>
</body>
</html>
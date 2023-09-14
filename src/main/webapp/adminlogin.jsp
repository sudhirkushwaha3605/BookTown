<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<script src="https://kit.fontawesome.com/64d58efce2.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/adminlogin.css" />

<title>Sign in & Sign up Form</title>
</head>
<body>
	<div class="container">
		<div class="forms-container">
			<div class="signin-signup">

				<form action="AdminLoginServlet" class="sign-in-form" method="post">
					<h2 class="title">Sign in</h2>

					
					
					
					

					<div class="input-field">
						<i class="fas fa-user"></i> <input type="text"
							placeholder="Username" name="username" />
					</div>

					<div class="input-field">
						<i class="fas fa-lock"></i> <input type="password"
							placeholder="password" name="password" />
					</div>

					<input type="submit" value="Login" class="btn solid" />


				</form>



			</div>
		</div>

		<div class="panels-container">
			<div class="panel left-panel">
				<div class="content">

					<p></p>

				</div>
				<img src="images/log.svg" class="image" alt="" />
			</div>
			<div class="panel right-panel">
				<div class="content">
					<h3></h3>
					<p></p>
					<button class="btn transparent" id="sign-in-btn">Sign in</button>
				</div>
				<img src="images/register.svg" class="image" alt="" />
			</div>
		</div>
	</div>

	<script src="js/adminlogin.js"></script>
</body>
</html>
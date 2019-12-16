<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<title>Login</title>
	
</head>

<body>
	<div class="container">
	<div id="wrapper">
		<div id="header">
			<h2>Login form</h2>
		</div>
	</div>
	<div id="container">
		<h3>Login</h3>
		<form:form action="login" modelAttribute="login" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table class="table table-striped">
				<tbody>
					<tr>
						<td><label>Username:</label></td>
						<td><form:input path="username" /></td>
					</tr>
				
					<tr>
						<td><label>Password:</label></td>
						<td><form:input path="password" /></td>
					</tr>

					
					<tr>
						<td><label></label></td>
						<td><button type="submit" class="btn btn-info value="Save" class="save" >Save </button></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/come">Back to home</a>
		</p>
	
	</div>
</div>
</body>

</html>











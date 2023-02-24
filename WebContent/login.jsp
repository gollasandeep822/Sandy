<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    
    	<!-- Bootstrap CSS -->
    	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
   
   		<!-- Bootstrap JS Bundle with Popper -->
    
    	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

    	<!-- add external CSS -->
    	<link rel="stylesheet" type="text/css" href="css/mystyles.css">
</head>
<body>
		<div class="container">
			<div class="form-container">
					<h2 class="login">Sign In</h2>
					<div class="form-style">
						<form action="LoginController" method="POST">
							<input type="email" name="email" autocomplete="off" placeholder="email" required />
							<input type="text" name="phone" autocomplete="off" placeholder="phone" required />
							<input type="submit" class="btn btn-light p-1" value="login" required /> 
						</form>	
					</div>
			</div>
			<div class="img-container">
				<p>Precautions are better then cure!</p>
				<img src="images/doctor.png"/>	
			</div>
		</div>
</body>
</html>









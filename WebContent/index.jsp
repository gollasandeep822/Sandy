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

        <title>IHUB TALENT</title>
    </head>
    <body>
    		<div class="register-container">
    			<h2>Register</h2>
    			<form action="RegisterController">
    					<input type="email" name="email" placeholder="email" autocomplete="off" required />
    					<input type="text" name="phone" placeholder="phone" autocomplete="off" required />
    					<input type="text" name="name" placeholder="name" autocomplete="off" required />
    					<input type="text" name="address" placeholder="address" autocomplete="off" required />
    					<input type="date" name="date" required />
    					<input type="submit" class="p-1 btn-warning" value="submit"/>
    			</form>
    			
    			<a href="login.jsp">sign in</a>
    			
    		</div>	
	</body>
</html>



















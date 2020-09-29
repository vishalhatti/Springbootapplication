<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">Xworkz</a>
  
</nav>

<div class="body-class">
		<div class="row col-md-12">
		<div class="col-md-3"></div>
		<div class="col-md-6">
		<form class="col-md-12" action="postmsg" method="POST">
		<div class="form-group">
		  <label for="usr"><b>From:</b></label>
		  <input type="text" class="form-control" id="usr" name="from">
		</div>	
		<div class="form-group">
  			<label for="comment"><b>Enter a Message:</b></label>
 			 <textarea class="form-control" rows="5" id="comment" name="message"></textarea>
 		</div>
 		
 		<div class="form-group">
 			<button class="btn btn-primary btn-md" type="submit">send</button>
 		</div>
		</form>
		
		</div>
		<div class="col-md-3"></div>
		</div>
		</div>
			<div>
			<footer id="sticky-footer" class="py-4 bg-dark text-white-50">
			<div class="container text-center">
			<small style="color: white"><b>@ 2020 Copyright &copy;
				xworkz.com</b></small>
			</div>
			</footer>
		</div>

</body>
</html>
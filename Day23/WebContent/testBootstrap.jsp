<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!--  jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs.jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script 
	src="https://stackpath.bootstrapcdn.com/bootsrap/4.3.1/js/bootstrap.min.js"></script>
	
<title>Test Bootstrap</title>
</head>
<body>
	<div class="container">
	<h1>Bootstrap Demo</h1>
	<ul class="nav nav-tabs" id="myTab" role="tablist">
 		 <li class="nav-item">
   	 	<a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Home</a>
 	 	</li>
  		<li class="nav-item">
   		 <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Profile</a>
 		 </li>
  		<li class="nav-item">
 	   	<a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Contact</a>
 	 	</li>
	</ul>
		<div class="tab-content" id="myTabContent">
  		<div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">Content For Home</div>
  		<div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">Content For Profile</div>
 	 	<div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">Content For Contact</div>
		</div>
	</div>
</body>
</html>
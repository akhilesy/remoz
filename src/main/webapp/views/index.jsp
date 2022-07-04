<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">



<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>Remoz Acedemy</title>
</head>

<body>
	<!--coading ara  -->
	<!-- Image and text -->


	<!--start nav bar -->
	<%@include file="menu.jsp"%>
	<!--end nav bar -->

	<!--banner start-->
	<header class="header1">
		<div class="container h-100">
			<div class="row h-100 align-items-center">
				<div class="col-md-12 text-center">
					<h1 class="text-primary">Learning</h1>
					<p>Education is the process of facilitating learning, or the
						acquisition of knowledge, skills, values, morals, beliefs, habits,
						and personal development.[1] Education originated as transmission
						of cultural heritage from one generation to the next. Today,
						educational goals increasingly encompass new ideas such as
						liberation of learners, critical thinking about presented
						information, skills needed for the modern society, empathy and
						complex vocational skills.</p>
					<button href="" class="btn btn-primary" type="button" onclick="myFunction()">connect
						us for more details</button>
				</div>

			</div>

		</div>

	</header>
	<!--banner end-->
	
	
	<div class="card hidden" id="enquery" style="width: 18rem;">
  <div class="card-body">
 <form:form>
     
     <div class="row">
         <div class="col-4">
         <input name="firstName" />
         </div>
            <div class="col-4">
         <input name="lastname" />
         </div>
     
     </div>
     
     
  </form:form>
 
 	 </div>
 </div> 
	

	<!--message section start-->

	<section class="bgcoleor py-5">
		<div class="container text-center">
			<h1>Best Education is the Piller of Best Socity</h1>
			<p>Now  A days Education is the piller of every educated socity .
			 so Our various Branches Provided The Various Online and Offline 
			courses by Which a Normal people can start there carrier</p>
			<button class=" btn btn-primary">message</button>
		</div>

	</section>
	<hr>
	<!--message section end-->
	<!--services section start-->
	<section class="">
		<div class="container text-center bg-light py-5">
			<h1>Our Services</h1>
			<div class="row">
				<div class="col-md-4 mt-5">
					<div class="card ">

						<div class="card-body">
							<i class="fa fa-car myicon"></i>
							<h5 class="card-title">Our services</h5>
							<h6 class="card-subtitle mb-2 text-muted">Certification</h6>

							<p>We Provide various Type of Job Oriented certification Courses That help the Youth To get a desiger job </p>
						</div>
					</div>

				</div>
				<div class="col-md-4 mt-5">
					<div class="card">

						<div class="card-body">
							<i class="fa fa-car myicon"></i>
							<h5 class="card-title">Courses</h5>
							<h6 class="card-subtitle mb-2 text-muted">Multiple Courses</h6>

							<p>In thime of Job crices Our Branches Provide the Various Online and Offline Cources . to Build Carrier With us !</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 mt-5">
					<div class="card">

						<div class="card-body">
							<i class="fa fa-car myicon"></i>
							<h5 class="card-title">Carrier</h5>
							<h6 class="card-subtitle mb-2 text-muted">Job Oriented Courses</h6>

							<p>Most of the Institute are provide only Training and certification and Student left </p>
						</div>
					</div>
				</div>


			</div>
		</div>
	</section>


<hr>
	<!--services section end-->
	<!--contack section start-->
	<section class="bg-light py-5">
		<div class="container text-center">
			<h1>Get in touch with below medium</h1>
			<p>Ready to start your next projetc with us</p>
			<i class="fa fa-fax  myicon py-1 text-warning"></i> <i
				class="fa fa-facebook-official myicon text-denger"></i>
			<p>
				<i class="fa fa-phone"></i> +91 8269117483
			</p>
		</div>
	</section>

	<!--contact section end-->

	<!--links section start-->
	<section class="links">
		<div class="container  py-3">
			<div class="row">
				<div class="col-md-6 text-center">
					<p>facebook</p>
					<p>insta</p>
				</div>
				<div class="col-md-6">
					<p>facebook</p>
					<p>insta</p>
				</div>
			</div>
		</div>
	</section>
	<!--links section end-->
	<footer>
		<%@include file="footer.jsp"%>
	</footer>

	<!--footer end-->
	<!--coading ara  -->
	<!-- Optional JavaScript; choose one of the two! -->


	    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
   
	<script>
	
function myFunction() {
	console.log("under function");
	  var x = document.getElementById("#enquery");
	 x.hide();
	
  
}
</script>


</body>

</html>
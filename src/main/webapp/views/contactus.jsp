<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Login </title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
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

</head>

<body>
    
    <!--login templet-->
    <%@include file="menu.jsp" %>
        <h1 class="text-info">Fill below form !   &nbsp Our Team will call you</h1>
    <div class="container" style="width: 30%;""hight:100%">

  <div class="card jumbotron ">
  <div class="card-body">
  <h1 class="text-center text-info"></h1>
            <form class="form"  id="enqform" action="" method="POST" modelAttribute="uservo">
            <div>
                <div class="form-group">
                    
                    <label class="text-info" for="firstName ">Name</label>
                    <input type="text" class="form-control" id="firstName" name="firstName"
                        placeholder="Enter full Name">

                </div>
                
                <div class="form-group">
                    <label class="text-info" for="mobileNumber">Mobile</label>
                    <input type="text" name="mobileNumber" class="form-control" id="mobileNumber" placeholder="mobile">
                </div>
                
                  <div class="form-group">
                    
                    <label class="text-info" for="email ">email</label>
                    <input type="email" class="form-control" id="email" name="email"
                        placeholder="email">

                </div>
                
                <div class="form-group">
                    
                    <label class="text-info" for="email ">full address</label>
                    <input type="text" class="form-control" id="fullAddress" name="fullAddress"
                        placeholder="address">

                </div>
                
                 <div class="form-group">
                    
                    <label class="text-info" for="remark ">fill Your Area of Intrest!</label>
                    <input type="text" class="form-control" id="remark" name="remark"
                        placeholder="like cources">

                </div>
               
                </div>
              
              
                <button  type="submit"  value="submit" class="btn btn-primary mt-1">Submit data</button>

                 

                
            </form>
        </div>
    </div>
</div>
<br>
<hr>
  <section class=" py-5 bg-light">
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
</body>
 <%@include file="footer.jsp" %>
     <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
   
 <script>
 $(document).ready(function() {
console.log("in ajax");


     $('#enqform').submit(function(event) {
    	 event.preventDefault();
    	 var data=$(this).serialize();
    	
    	 console.log(data1);
        
});
 });
  </script>

</html>
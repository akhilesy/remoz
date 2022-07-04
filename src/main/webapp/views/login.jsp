<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Login</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<!-- <link rel="stylesheet" type="text/css"
	href="./css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/imagehover.min.css"> -->
<link rel="stylesheet" type="text/css" href="./css/style.css">
<!-- <link rel="stylesheet" type="text/css" href="./css/tkwm.css"> -->
<link rel="stylesheet" type="text/css" href="./css2/style.css">
</head>

<body>

	<!--login templet-->
	<div class="container col col-md-4" style="margin-top: 180px;">
		<div class="card ">
			<div class="card-body">
				<img src=" " alt="logo" />
				<form:form name="loginform" action="/loginauth" id= "loginform" 
				method="POST" modelAttribute="uservo">
					<div align="center">
						<table>
							<tr>
								<td>User Name</td>
								<td><input type="text"  id="username" name="username" /></td>
							</tr>
							<tr>
								<td>Password</td>
								<td><input type="password" id="password" name="password" /></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit"  value="Submit" /></td>
							</tr>
						</table>
						<div style="color: red">${error}</div>

					</div>
				</form:form>
			</div>
		</div>
	</div>

</body>
<script>
    function login_data() {
        var formData = new FormData();
        
        
        var Name = $('#username').val().trim()
        formData.append("username", Name);
        var password = $('#password').val().trim()
        formData.append("password", password);
     console.log(formData);
     console.log("under login method");
        $.ajax({
        type: "POST",
        url: "loginauth",          
        data: formData,
        processData: false,
        contentType: false,
        success: function (response) {
            }
        });
    }
    </script>
    <script>
    function login(){
    	console.log("under login ");
    	document.iframeForm.action="loginauth";
    	document.iframeForm.method="POST";
    	document.iframeForm.submit();
    	
    	
    }
</script>



</html>
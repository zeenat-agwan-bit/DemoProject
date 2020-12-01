<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">



<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />

<style type="text/css">
.form-container {
	position: absolute;
	top: 5vh;
	background: #fff;
	padding: 50px;
	border-radius: 10px;
	box-shadow: 0px 0px 10px 0px #000;
	background: #fff;
	margin-left: 40px;
	background: #fff;
}
</style>

<title>Log-in</title>
</head>
<body>

	<div class="alert alert-danger " role="alert">

		<form:errors path="student.*" />

	</div>
	<div class="col-md-6 text right">
		<br />
		<section class="container-fluid">
			<section class="row-justify-content-center">

				<form class="form-container" action="handleform" method="post">


					<div class="form-group">
						<label for="exampleInputEmail1">Your Name :</label> <input
							type="email" placeholder="Enter Name" name="name"
							class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp"><small
							class="form-text text-muted">We'll never share your email
							with anyone else.</small>
					</div>



					<div class="form-group">
						<label for="exampleInputEmail1">Your Id :</label> <input
							type="text" placeholder="Enter Id" name="id" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp">
					</div>

					<div class="form-group">
						<label for="exampleInputPassword1">Your DOB :</label> <input
							type="text" name="date" placeholder="dd/mm/yyyy"
							class="form-control" id="exampleInputPassword1">
					</div>



					<div class="form-group">
						<label for="exampleFormControlSelect1">Select Courses</label> <select
							name="course" class="form-control" id="exampleFormControlSelect1">
							<option>Java</option>
							<option>C</option>
							<option>C++</option>
							<option>Python</option>
							<option>Spring</option>
						</select>
					</div>


					<div class="form-group col-md-4">
						<label for="inputState">Time Slot</label> <select id="inputState"
							class="form-control" name="time">
							<option selected>Choose...</option>
							
							<option>10:00-10:15 AM</option>
							<option>10:15-10:30 AM</option>
							<option>10:30-10:45 AM</option>
							<option>10:45-11:00 AM</option>
							
							<option>11:00-11:15 AM</option>
							<option>11:15-11:30 AM</option>
							<option>11:30-11:45 AM</option>
							<option>11:45-12:00 PM</option>
							
							
							<option>12:00-12:15 PM</option>
							<option>12:15-12:30 PM</option>
							<option>12:30-12:45 PM</option>
							<option>12:45-01:00 PM</option>

							<option>1:00-1:15 PM</option>
							<option>1:15-1:30 PM</option>
							<option>1:30-1:45 PM</option>
							<option>1:45-2:00 PM</option>


							<option>2:00-2:15 PM</option>
							<option>2:15-2:30 PM</option>
							<option>2:30-2:45 PM</option>
							<option>2:45-3:00 PM</option>

							<option>3:00-3:15 PM</option>
							<option>3:15-3:30 PM</option>
							<option>3:30-3:45 PM</option>
							<option>3:45-4:00 PM</option>

							<option>4:00-4:15 PM</option>
							<option>4:15-4:30 PM</option>
							<option>4:30-4:45 PM</option>
							<option>4:45-5:00 PM</option>

							<option>5:00-5:15 PM</option>
							<option>5:15-5:30 PM</option>
							<option>5:30-5:45 PM</option>
							<option>5:45-6:00 PM</option>

							<option>6:00-6:15 PM</option>
							<option>6:15-6:30 PM</option>
							<option>6:30-6:45 PM</option>
							<option>6:45-7:00 PM</option>

							<option>7:00-7:15 PM</option>
							<option>7:15-7:30 PM</option>
							<option>7:30-7:45 PM</option>
							<option>7:45-8:00 PM</option>

							<option>8:00-8:15 PM</option>
							<option>8:15-8:30 PM</option>
							<option>8:30-8:45 PM</option>
							<option>8:45-9:00 PM</option>

							<option>9:00-9:15 PM</option>
							<option>9:15-9:30 PM</option>
							<option>9:30-9:45 PM</option>
							<option>9:45-10:00 PM</option>

							<option>10:00-10:15 PM</option>
							<option>10:15-10:30 PM</option>
							<option>10:30-10:45 PM</option>
							<option>10:45-11:00 PM</option>


						</select>
					</div>



					<div class="form-group">
						<span class="mr-3">Select Gender</span>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="inlineRadio1" value="male"> <label
								class="form-check-label" for="inlineRadio1">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="inlineRadio2" value="female"> <label
								class="form-check-label" for="inlineRadio2">Female</label>
						</div>

					</div>



					<div class="form-group">
						<label for="">Select Type</label> <select class="form-control"
							name="type"">
							<option value="oldstudent">Old Student</option>
							<option value="normalstudent">Normal Student</option>

						</select>
					</div>


					<br /> <br />
					<div class="container text-center">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>

				</form>

			</section>
		</section>
	</div>





	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>

	<!-- Option 2: jQuery, Popper.js, and Bootstrap JS
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    -->
</body>
</html>


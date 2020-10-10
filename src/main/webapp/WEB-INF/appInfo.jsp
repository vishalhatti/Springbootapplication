<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/custom.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>APP info details</title>
</head>
<body style="padding: 20; margin: 20; height: 2px;">
	<nav class="navbar navbar-expand-sm"
		style="background-color: rgba(164, 191, 255);">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"><strong
					style="color: rgb(254, 64, 118); font-size: 40px;">X-WORKZ</strong></a>
			</div>
		</div>
	</nav>
	<div class="row col-sm-12 justify-content-center">
					<h4>${msg}</h4>
				</div>.

	<form action="saveAppInfo" method="post" class="justify-content-center">
		<div class="container-fluid mt-5">
			<div style="height: 500px">

				<div class="form-group row">

					<label class="col-sm-2 col-form-label"><i
						class="fas fa-file"></i>&nbsp;&nbsp;&nbsp;<b><i>Project
								Name:</i></b></label>
					<div class="md-form col-sm-2">
						<input type="text" class="form-control" id="inputName"
							name="pname" placeholder="Enter Project name" required>
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label"><i
						class="fa fa-user"></i>&nbsp;&nbsp;&nbsp;<b><i>Team
								Manager:</i></b></label>
					<div class="col-sm-2">
						<input type="text" class="form-control" id="inputTeamManager"
							name="teammanager" placeholder="Enter Team Manager name">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label"><i
						class="fa fa-envelope"></i>&nbsp;&nbsp;&nbsp;<b><i>Team
								Contact Email:</i></b></label>
					<div class="col-sm-2">
						<input type="email" class="form-control" id="inputContactEmail"
							name="teammanager" placeholder="Enter Team Contact Email"
							required>
					</div>
				</div>
				<fieldset class="form-group">
					<div class="row">
						<label class="col-sm-2 col-form-label pt-1"><i
							class="fa fa-check-circle"></i>&nbsp;&nbsp;&nbsp;<b><i>De-Commissioned:</i></b></label>
						<div class="col-sm-4">
							<div class="form-check form-check-inline">
								<label class="form-check-label"> <input
									class="form-check-input" type="radio" name="agree"
									id="inlineRadio1" value="yes"> Yes
								</label>
							</div>
							<div class="form-check form-check-inline">
								<label class="form-check-label"> <input
									class="form-check-input" type="radio" name="agree"
									id="inlineRadio2" value="no"> No
								</label>
							</div>
						</div>
					</div>
				</fieldset>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label"><i
						class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp;<b><i>Developed
								Date:</i></b></label>
					<div class="col-sm-2">
						<input type="date" class="form-control" id="inputDate"
							name="developedDate">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label"><i
						class="fa fa-spinner fa-pulse fa-x fa-fw"></i>&nbsp;&nbsp;&nbsp;<b><i>Version:</i></b></label>
					<div class="col-sm-2">
						<input type="text" class="form-control" id="inputVersion"
							name="version">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label"><i
						class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp;<b><i>Last
								Release:</i></b></label>
					<div class="col-sm-2">
						<input type="date" class="form-control" id="inputLastReleaseDate"
							name="lastRelease">
					</div>
				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label"><i
						class="fa fa-calendar"></i>&nbsp;&nbsp;&nbsp;<b><i>Next
								Release:</i></b></label>
					<div class="col-sm-2">
						<input type="date" class="form-control" id="inputNextReleaseDate"
							name="nextRelease">
					</div>
				</div>

				<div>
					<button type="button" class="btn btn-primary mb-4"
						data-toggle="modal" data-target="#myModal">Add
						Environment</button>

					<div id="showEnvironment"></div>

					<div class="modal fade" id="myModal">
						<div class="modal-dialog modal-sm">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title">Environment Details:</h5>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>
								<div class="modal-body">
									<div class="form-group">
										<label for="environment">----Select Environment---</label> <select
											class="form-control" id="environment" name="environmentType">
											<option>Development</option>
											<option>UAT</option>
											<option>SIT</option>
											<option>Production</option>
											<option>Others</option>
										</select>
									</div>

									<div class="form-group">
										<label for="url">URL:</label> <input type="text"
											class="form-control" id="url" placeholder="Enter url"
											name="url">
									</div>


									<div class="form-group">
										<label>Accessible: </label> <label class="radio-inline">
											<input type="radio" name="isAccessible" value="true"
											checked="checked"> Yes
										</label> <label class="radio-inline"> <input type="radio"
											name="isAccessible" value="false"> No
										</label>
									</div>

									<div>
										<button type="button" class="btn btn-success btn-block"
											onclick="addEnvironment()">save</button>
									</div>

								</div>
							</div>
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-danger" data-dismiss="modal"
								id="closeModal">close</button>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div>
			<script src="js/custom.js"></script>
		</div>
	</form>

	<div class="footer-copyright py-3 text-center">
		<div class="footer-bottom-text" style="color: black">
			© 2020 Copyright: <a href="#"> <strong
				style="color: rgb(254, 64, 118);">X-WORKZ.com </strong></a>
		</div>
	</div>

</body>
</html>
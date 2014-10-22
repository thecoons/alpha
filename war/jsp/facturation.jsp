<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="meta.jsp" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/calendar.css">
<link rel="stylesheet" href="css/datepicker3.css">
</head>

<body>
	<jsp:include page="header.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-xs-8">
				<form class="form-inline" role="form" action="/facturation"
					method="get">
					<div class="form-group">
						<input type="text" class="form-control" name="search">
					</div>
					<div class="form-group">
						<select class="form-control" name="searchType">
							<option value="patientId">PatientId</option>
							<option value="typePrestation">Type prestation</option>
							<option value="montant">Montant</option>
							<option value="date">Date</option>
						</select>
					</div>
				</form>
				<h2>Liste recherche facture</h2>
				<table class="table table-striped">

					<c:forEach var="facture" items="${ facts }">
						<tr>
							<td>${ facture.patientId }</td>
							<td>${ facture.date }</td>
							<td>${ facture.typePrestation }</td>
							<td>${ facture.montant }</td>

						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="col-xs-4">
				<form role="form"
					action="/facturation"
					method="post">
					<div class="form-group">
						<label for="idPatient">Id Patient : </label> <input type="text"
							name="idPatient" class="form-control" id="idpatient">
					</div>
					<div class="form-group">
						<select class="form-control" name="type">
							<option value="kine">Kiné</option>
							<option value="shiatzu">Shiatzu</option>
						</select>
					</div>
					<div class="form-group">
						<label for="date">Date (
							dd/mm/yyyy ) :</label>
							<div class="col-sm-4">
							<input type="date"  name="date" class="form-control" id="date">
							</div>
					</div>
					<div class="form-group">
						<label for="montant">Montant :</label> <input type="text"
							name="montant" class="form-control" id="montant">
					</div>
					<button type="submit" class="btn btn-default">Valider</button>
				</form>
			</div>
		</div>
	</div>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script
		src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</body>

</html>
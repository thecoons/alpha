<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.util.List"%>
<%@ page import="com.google.appengine.api.blobstore.*"%>
<%@ page import="fr.patient.alpha.PatientEntity"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	BlobstoreService blobstoreService = BlobstoreServiceFactory
			.getBlobstoreService();
%>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="meta.jsp" />

</head>
<body>
	<header>

		<jsp:include page="header.jsp" />

	</header>
	<div class="container">
		<div class="row">
			<div class="col-xs-4">


				<h2>Nouveau Patient</h2>

				<form role="form"
					action="<%=blobstoreService.createUploadUrl("/patient")%>"
					method="post" enctype="multipart/form-data">
					<div class="form-group">
						<label for="nompatient">Nom Patient : </label> <input type="text"
							name="nom" class="form-control" id="nompatient">
					</div>
					<div class="form-group">
						<label for="prenompatient">Prenom Patient : </label><input
							type="text" name="prenom" class="form-control" id="prenompatient">
					</div>
					<div class="form-group">
						<label for="birthdaypatient">Date de naissance (
							dd/mm/yyyy ) :</label><input type="text" name="birthday"
							class="form-control" id="birthdaypatient">
					</div>
					<div class="form-group">
						<label>Photo : </label><input type="file" name="uploadedFile" />
					</div>

					<button type="submit" class="btn btn-default">Valider</button>
				</form>

			</div>

		</div>

		<div class="row">
			<div class="col-xs-10">
				<h2>Liste Recherche Patient</h2>
				<table class="table table-striped">

					<c:forEach var="patient" items="${ patients }">
						<tr>
							<td>${ patient.nom }</td>
							<td>${ patient.prenom }</td>
							<td>${ patient.birthday }</td>

						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

	</div>
	<script src="index_fichiers/jquery.html" type="text/javascript"></script>
	<script src="index_fichiers/bootstrap.html" type="text/javascript"></script>
</body>
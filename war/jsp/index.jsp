<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="meta.jsp" />
</head>

<body>
	<!-- /HEADER 
-------------------------------------------------------------------->
	<jsp:include page="header.jsp" />
	<!-- /HEADER 
-------------------------------------------------------------------->

	<div class="container">
		<div class="row">
			<!-- MEMO
-------------------------------------------------------------------->
			<jsp:include page="memo.jsp" />

			<!-- /MEMO
-------------------------------------------------------------------->


			<!-- INDEX
-------------------------------------------------------------------->
			<div class="col-xs-12 col-sm-12 col-lg-8 icons">

				<div class="row">

					<div class="col-6 col-sm-4 col-lg-4">
						<div class="thumbnail">
							<div class="onglet">
								<img class="img-responsive img-index"
									src="index_fichiers/image/patient1.jpg" alt="patient">
								<div class="caption post-content">
									<h3>Mes Patients</h3>
								</div>
							</div>
							<div class="caption">
								<p>
									<b>Gérer tous vos dossiers patients.</b>
								</p>
								<p>
									<button type="button" class="btn btn-default btn-lg">
										<a
											href="http://1-dot-physio-plus.appspot.com/patient/new;jsessionid=17izruj88y03f"
											role="button"> <span class="glyphicon glyphicon-plus"></span>
											Nouveau Patient
										</a>
									</button>
								</p>

								<p></p>
								<form action="/patient" method="get">
									<div class="input-group">
										<span class="input-group-addon "><span
											class="glyphicon glyphicon-user"></span></span> <input
											class="form-control" name="nomPatient" placeholder="Chercher"
											type="text">
									</div>
								</form>
								<p></p>
							</div>
						</div>
					</div>
					<!--/span-->


					<div class="col-6 col-sm-4 col-lg-4">
						<div class="thumbnail">
							<div class="onglet">
								<img class="img-responsive img-index"
									src="index_fichiers/image/agenda.jpg" alt="agenda">
								<div class="caption post-content">
									<h3>Agenda</h3>
								</div>
							</div>
							<div class="caption">
								<p>
									<b>Tous vos rendez-vous en quelques clics!</b>
								</p>
								<p>
									<button type="button" class="btn btn-default btn-lg">
										<a href="http://1-dot-physio-plus.appspot.com/Agenda/new"
											role="button"> <span class="glyphicon glyphicon-plus"></span>
											Nouveau RDV
										</a>
									</button>
								</p>
								<p>
									<a class="btn btn-default"
										href="http://1-dot-physio-plus.appspot.com/Agenda"
										role="button">Plus »</a>
								</p>
							</div>
						</div>
					</div>
					<!--/span-->

					<div class="col-6 col-sm-4 col-lg-4">
						<div class="thumbnail">
							<div class="onglet">
								<img class="img-responsive img-index"
									src="index_fichiers/image/montre.jpg" alt="montre">
								<div class="caption post-content">
									<h3>Séances</h3>
								</div>
							</div>
							<div class="caption">
								<p>
									<b>Vous avez terminé avec votre patient?</b>
								</p>
								<p>
									<button type="button" class="btn btn-default btn-lg">
										<a
											href="http://1-dot-physio-plus.appspot.com/registerTreatment.jsp"
											role="button"> <span class="glyphicon glyphicon-plus"></span>
											Enregistrer séance
										</a>
									</button>
								</p>
								<p>
									<a class="btn btn-default"
										href="http://getbootstrap.com/examples/offcanvas/#"
										role="button">Compléter un rapport»</a>
								</p>
							</div>
						</div>
					</div>
					<!--/span-->
				</div>
				<!--/row-->


				<div class="row">
					<div class="col-6 col-sm-4 col-lg-4">
						<div class="thumbnail">
							<div class="onglet">
								<img class="img-responsive img-index"
									src="index_fichiers/image/botin.jpg" alt="caducée">
								<div class="caption post-content">
									<h3>Annuaire</h3>
								</div>
							</div>
							<div class="caption">
								<p>
									<span class="glyphicon glyphicon-zoom-in"></span> <b>Je
										cherche:</b>
								</p>
								<p></p>
								<form action="/doctor" method="get">
									<div class="input-group">
										<span class="input-group-addon "><span
											class="glyphicon glyphicon-plus"></span></span> <input
											class="form-control" name="nomMedecin"
											placeholder="Un médecin" type="text">
									</div>
								</form>
								<p></p>
								<p></p>
								<form action="/insurance" method="get">
									<div class="input-group">
										<span class="input-group-addon "><span
											class="glyphicon glyphicon-globe"></span></span> <input
											class="form-control" name="nomAssurance"
											placeholder="Une assurance" type="text">
									</div>
								</form>
								<p></p>
							</div>
						</div>
					</div>
					<!--/span-->


					<div class="col-6 col-sm-4 col-lg-4">
						<div class="thumbnail">
							<div class="onglet">
								<img class="img-responsive img-index"
									src="index_fichiers/image/caisse-enregistreuse.jpg"
									alt="caisse-enregistreuse">
								<div class="caption post-content">
									<h3>Facturation</h3>
								</div>
							</div>
							<div class="caption">
								<p>
									<b>Facturer vos patients en un éclair!</b>
								</p>
								<p>
									<a class="btn btn-default"
										href="http://1-dot-physio-plus.appspot.com/facturation.jsp"
										role="button">Plus»</a>
								</p>
							</div>
						</div>
					</div>
					<!--/span-->


					<div class="col-6 col-sm-4 col-lg-4">
						<div class="thumbnail">
							<div class="onglet">
								<img class="img-responsive img-index"
									src="index_fichiers/image/comptabilite.jpg" alt="montre">
								<div class="caption post-content">
									<h3>Comptabilité</h3>
								</div>
							</div>
							<div class="caption">
								<p>
									<b>Toute la comptabilité de votre cabinet, rapide et
										simplifiée</b>
								</p>
								<p>
									<a class="btn btn-default"
										href="http://getbootstrap.com/examples/offcanvas/#"
										role="button">Plus»</a>
								</p>
							</div>
						</div>
					</div>
					<!--/span-->
				</div>
				<!-- /row -->
			</div>
			<!-- /INDEX
-------------------------------------------------------------------->
		</div>
	</div>
	<!--LIAISON AU SCRIPT
-------------------------------------------------------------------->
	<script src="index_fichiers/jquery.html" type="text/javascript"></script>
	<script src="index_fichiers/bootstrap.html" type="text/javascript"></script>
	<!--/LIAISON AU SCRIPT
-------------------------------------------------------------------->

</body>
</html>
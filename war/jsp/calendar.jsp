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
	<h3></h3>
	<div class="container">
		<div class="row">
			<div class="col-xs-8">
				<div id="calendar"></div>
			</div>
			<div class="col-xs-4">
				<div class="pull-right form-inline">
					<div class="btn-group">
						<button class="btn btn-primary" data-calendar-nav="prev"><<
							Prev</button>
						<button class="btn btn-default" data-calendar-nav="today">Today</button>
						<button class="btn btn-primary" data-calendar-nav="next">Next
							>></button>
					</div>
					
					<div class="btn-group">
						<button class="btn btn-warning" data-calendar-view="year">Year</button>
						<button class="btn btn-warning active" data-calendar-view="month">Month</button>
						<button class="btn btn-warning" data-calendar-view="week">Week</button>
						<button class="btn btn-warning" data-calendar-view="day">Day</button>
					</div>
					<input data-provide="datepicker">
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/underscore-min.js"></script>
	<script type="text/javascript" src="js/calendar.js"></script>*
	<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
	<script type="text/javascript">
	$('.datepicker').datepicker()
	</script>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="meta.jsp" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/calendar.css">
</head>

<body>

	<jsp:include page="header.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-xs-8">
				<div id="calendar"></div>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/underscore-min.js"></script>
	<script type="text/javascript" src="js/calendar.js"></script>
	<script type="text/javascript">
        var calendar = $("#calendar").calendar(
            {
                tmpl_path: "/tmpls/",
                events_source: function () { return []; }
            });         
    </script>

</body>
</html>
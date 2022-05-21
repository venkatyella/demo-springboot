<html>

<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>

<body>
<div name="container">
<h1>ADD Todo Page for ${name} </h1>

<form method="post">
<fieldset class="form-group">
	<label>Description : </label>
	<input name="desc" type="text" class="form-control" required="required"> 
</fieldset>
		<button type="submit" class="btn btn-success" >Submit</button>
</form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>	
	    
</body>

</html>
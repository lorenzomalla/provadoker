<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>	

	<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js" itegrity="sha256-0YPKAwZP7Mp3ALMRVB2i8GXeEndvCq3eSl/WsAl1Ryk=" crossorigin="anonymous"></script>
	
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/jquery.validate.min.js"></script>
	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	
	
	<script type="text/javascript" src="/Universita/resources/js/controlloRegistrazione.js"></script>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	
</head>
<form id="form-registrazione" method="POST" action="/Universita/index/login">
<div class="container">
    <h1 class="well">Registrati</h1>
	<div class="col-lg-12 well">
	<div class="row">
	<div class="col-sm-12">
		<div class="row">
			<div class="col-sm-6 form-group">
				<label>Nome</label>
				<input id="nome" type="text" placeholder="Inserisci il nome" name="nome" class="form-control">
				<span></span>
			</div>
			<div class="col-sm-6 form-group">
				<label>Cognome</label>
				<input id="cognome" type="text" placeholder="Inserisci il cognome" name="cognome" class="form-control">
				<span></span>
			</div>
		</div>
		<div class="col-sm-6 form-group">
			<label>Età</label>
			<input id="eta" type="number" placeholder="Inserisci l'età" name="eta" class="form-control">
			<span></span>
		</div>						
		<div class="col-sm-6 form-group">
			<label>Email</label>
			<input id="email" type="email" placeholder="Inserisci l'indirizzo" name="email" class="form-control">
			<span></span>
		</div>	
		<div class="row">
			<div class="col-sm-4 form-group">
				<label>Città</label>
				<input id="citta" type="text" placeholder="Inserisci la città" name="città" class="form-control">
				<span></span>
			</div>	
			<div class="col-sm-4 form-group">
				<label>Stato</label>
				<input id="stato" type="text" placeholder="Inserisci lo stato" name="stato" class="form-control">
				<span></span>
			</div>	
			<div class="col-sm-4 form-group">
				<label>Codice postale</label>
				<input id="codicePostale" type="text" placeholder="Inserisci il codice postale" name="codicePostale" class="form-control">
				<span></span>
			</div>		
		</div>
		<div class="row">
			<div class="col-sm-6 form-group">
				<label>Corso di laurea</label>
				<input id="corsoDiLaurea" type="text" placeholder="Inserisci il corso di laurea" name="corsoDiLaurea" class="form-control">
				<span></span>
			</div>		
			<div class="col-sm-6 form-group">
				<label>Numero di telefono</label>
				<input id="numeroDiTelefono" type="text" name="numeroDiTelefono" placeholder="Inserisci il numero di telefono" class="form-control">
				<span></span>
			</div>	
		</div>						
		<div class="form-group">
			<label>Username</label>
			<input id="username" type="text" placeholder="Inserisci l'username" name="username" class="form-control">
			<span></span>
		</div>		
		<div id="div-password" class="form-group">
			<label>Password</label>
			<input id="password" type="password" placeholder="Inserisci la password" name="password" class="form-control">
		</div>	
		
		<div id="div-cpassword" class="form-group">
			<label>Conferma la password</label>
			<input id="confermaPassword" type="password" placeholder="Conferma la password" name="confermaPassword" class="form-control">
		</div>
		<button id="btn-registra" type="submit" class="btn btn-lg btn-info">Registrati <span class="glyphicon glyphicon-send"></span></button>					
		</div>
</div>
	</div>
	</div>
	</form>
	</html>
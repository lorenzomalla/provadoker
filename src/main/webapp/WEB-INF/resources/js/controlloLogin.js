$(document).ready(function(){
	var user = {};
	user['username'] = $('username').val();
	user['password'] = $('password').val();
	$('#btn-login').click(function(){
		$.post({
			url : "/Universita/bacheca",
			ContentType:"application/json",
//			data: JSON.stringify(user),
			dataType:"json",
			success: function(response){
				alert("Benvenuto");
			}
	});
//		data: 
//		success: function(){
//			alert()
//		}
	});
});
$(document).ready(function(){
	$('input:password').blur(function(){
		if($('#password').val() != $('#confermaPassword').val()){
			$('#div-password').addClass('has-error');
			$('#div-cpassword').addClass('has-error');
			}else{
				$('#div-password').removeClass('has-error');
				$('#div-cpassword').removeClass('has-error');
				$('#div-cpassword').addClass("has-success has-feedback");
				$('#div-password').addClass('has-success has-feedback');
				$('#div-password').append('<span class="glyphicon glyphicon-ok form-control-feedback"></span>');
				$('#div-cpassword').append('<span class="glyphicon glyphicon-ok form-control-feedback"></span>');
			}
	});
	$.validator.addMethod("regx", function(value, element, regexpr) {          
	    return regexpr.test(value);
	});
	$('#form-registrazione').validate({
		rules:{
			nome:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				minlength:5,
				maxlength:15,
				required:true
				
			},
			cognome:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				minlength:5,
				maxlenght:15,
				required:true
			},
			eta:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				min:18,
				max:100,
				required:true
			},
			email:{
				required:true,
				email:true
			},
			città:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				required:true
			},
			stato:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				required:true
			},
			codicePostale:{
				regx: /^[0-9]{5}(?:-[0-9]{4})?$/,
				required:true
			},
			corsoDiLaurea:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				required:true
			},
			numeroDiTelefono:{
				number:true
			},
			username:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				required:true
			},
			password:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				required:true
			},
			confermaPassword:{
				regx: /^[a-zA-z] ?([a-zA-z]|[a-zA-z] )*[a-zA-z]$/,
				required:true
			}
		},
			messages:{
				nome:{
					required: "Questo campo e' obbligatorio.",
					regx: "Inserisci un nome valido.",
					minlength: "Inserisci almeno 5 caratteri",
					maxlength: "Inserisci un massimo di 15 caratteri"
				},
				cognome:{
					required: "Questo campo e' obbligatorio.",
					regx: "Inserisci un nome valido.",
					minlength: "Inserisci almeno 5 caratteri",
					maxlength: "Inserisci un massimo di 15 caratteri"
				},
				eta:{
					min: "Devi avere un minimo di 18 anni.",
					max: "Inserisci un massimo di 100 anni",
					required: "Questo campo e' obbligatorio."
				},
				email:{
					required: "Questo campo e' obbligatorio.",
					email: "Inserisci una email valida"
				},
				stato:{
					required: "Questo campo e' obbligatorio.",
					regx: "Inserisci uno stato valido."
				},
				codicePostale:{
					required: "Questo campo e' obbligatorio.",
					regx: "Inserisci un codice postale corretto.",
				},
				corsoDiLaurea:{
					required: "Questo campo e' obbligatorio.",
					regx: "Inserisci un corso di laurea valido."
				},
				username:{
					required: "Questo campo e' obbligatorio.",
					regx: "Inserisci un username valido."
				},
				password:{
					required: "Questo campo e' obbligatorio.",
					regx: "Inserisci una password valida"
				}
			}
	});
});
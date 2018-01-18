$(document).ready(function(){
	//Valorizza la dropdown con tutti i tipi di corsi di laurea
	var opt = "<option value=\"\">Corsi di laurea.</option>";
		$.ajax({
			type: "POST",
			url: "/Universita/getAllCorsiDiLaurea",
			ContentType: "application/json",
			dataType: "json",
			success: function(response){
				var select = $('#select');
				$.each(response,function(key,value){
					//Prende l'oggetto 
//					JSON.stringify(value);
					opt +="<option value="+value+">"+value.corsoDiLaureaSpecifico+"</option>";
				});
				select.html(opt);
				select.show();
				opt = "";
			},
			error : function(){
				alert("Errore nella gestione della richiesta");
			}
		});
});
$(document).ready(function(){
  $('#orarioCorsiInformatica').hide();
  $('#orarioCorsiMeccanica').hide()
     $("#orCorsi").click(function () {
         $('#orarioCorsiInformatica').fadeIn('slow/400/fast');
          $('#orarioCorsiMeccanica').fadeIn('slow/400/fast');
          });
    //Serve a rendere non editabile la textarea
    $('input[type="text"], textarea').attr('readonly','readonly');
});
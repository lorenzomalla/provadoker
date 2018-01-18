<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bacheca</title>



<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script> 

    <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js" itegrity="sha256-0YPKAwZP7Mp3ALMRVB2i8GXeEndvCq3eSl/WsAl1Ryk=" crossorigin="anonymous"></script>
    
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/jquery.validate.min.js"></script>
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    
     <link href="info.css" rel="stylesheet" type="text/css">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<script type="text/javascript" src="/Universita/resources/js/bacheca.js"></script>
	

</head>
<body>
<div class="container">

    <div><!-- Example #2 .navbar-inverse -->
    <nav class="navbar navbar-inverse navbar navbar-fixed-top navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#example-2" aria-expanded="true">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar top-bar"></span>
                    <span class="icon-bar middle-bar"></span>
                    <span class="icon-bar bottom-bar"></span>
                </button>
                <a class="navbar-brand">Benvenuto nella tua Homepage</a>
            </div>
            <!-- .navbar-collapse -->
            <div class="collapse navbar-collapse" id="infoUniversita">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown" ><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="false" aria-expanded="false">Corsi di laurea
                    <span class="caret"></span></a>
                        <ul class="dropdown-menu"   >
                            <li><a href="#">Ingegneria informatica</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Ingegneria meccanica</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Ingegneria edile</a></li>
                        </ul>
                    </li>
                    <li class="dropdown" ><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="false" aria-expanded="false">Info
                    <span class="caret"></span></a>
                        <ul class="dropdown-menu"   >
                            <li><a data-toggle="modal" data-target="#segreteria">Segreteria</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a data-toggle="modal" data-target="#prenotazionEsami">Prenotazione esami</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a id="orCorsi" data-toggle="modal" data-target="#orarioCorsi">Orario corsi</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a data-toggle="modal" data-target="#infoCorsi">Info corsi</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Info professori</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
    </div>
    <div id="orarioCorsiInformatica" style="margin-top:100px;" class="panel-group col-lg-4">
          <div class="panel panel-info">
            <div class="panel-heading">
              <h4 class="panel-info"><a data-toggle="collapse" data-parent="#accordion1" href="#collapseTwo">
               Corsi di laurea ingegneria informatica
            </a></h4>
            </div>
            <div id="collapseTwo" class="panel-collapse panel panel-info collapse">
              <div class="panel-body"><p>
              Laurea triennale in ingegneria informatica
              </p>
                <div class="panel-group" id="accordion2">
                  <div class="panel panel-danger">
                    <div class="panel-heading">
                      <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion2" href="#collapseInnerOne">
                        Primo anno
                      </a></h4>
                    </div>
                    <div id="collapseInnerOne" class="panel-collapse panel panel-danger collapse">
                      <div class="panel-body">
                        PRIMO ANNO
                      </div>
                    </div>
                  </div>
                  <div class="panel panel-danger">
                    <div class="panel-heading">
                      <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion2" href="#collapseInnerTwo">
                        Secondo Anno
                      </a></h4>
                    </div>
                    <div id="collapseInnerTwo" class="panel-collapse panel panel-danger collapse">
                      <div class="panel-body">
                       SECONDO ANNO
                      </div>
                    </div>
                    <div class="panel panel-danger">
                    <div class="panel-heading">
                      <h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion2" href="#collapseInnerTre">
                        Terzo Anno
                      </a></h4>
                    </div>
                    <div id="collapseInnerTre" class="panel-collapse panel panel-danger collapse">
                      <div class="panel-body">
                       Terzo Anno
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
    </div>

    <div id="orarioCorsiMeccanica" style="margin-top: 100px " class="panel-group col-lg-4">
          <div class="panel panel-info">
            <div class="panel-heading">
              <h4 class="panel-info"><a data-toggle="collapse" data-parent="#meccanica" href="#collapseOne">
               Corsi di laurea ingegneria meccanica
            </a></h4>
            </div>
            <div id="collapseOne" class="panel-collapse panel panel-info collapse">
              <div class="panel-body"><p>
              Laurea triennale in ingegneria meccanica
              </p>
                <div class="panel-group" id="accordion2">
                  <div class="panel panel-danger">
                    <div class="panel-heading">
                      <h4 class="panel-title"><a data-toggle="collapse" data-parent="#meccanica" href="#primoAnno">
                        Primo anno
					</a></h4>
                    </div>
                    <div id="primoAnno" class="panel-collapse panel panel-danger collapse">
                      <div class="panel-body">
                        PRIMO ANNO
                      </div>
                    </div>
                  </div>
                  <div class="panel panel-danger">
                    <div class="panel-heading">
                      <h4 class="panel-title"><a data-toggle="collapse" data-parent="#meccanica" href="#secondoAnno">
                        Secondo Anno
                      </a></h4>
                    </div>
                    <div id="secondoAnno" class="panel-collapse panel panel-danger collapse">
                      <div class="panel-body">
                       SECONDO ANNO
                      </div>
                    </div>
                    <div class="panel panel-danger">
                    <div class="panel-heading">
                      <h4 class="panel-title"><a data-toggle="collapse" data-parent="#meccanica" href="#terzoAnno">
                        Terzo Anno
                      </a></h4>
                    </div>
                    <div id="terzoAnno" class="panel-collapse panel panel-danger collapse">
                      <div class="panel-body">
                       Terzo Anno
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
    </div>


    <div class="modal fade" id="segreteria" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Info segreteria</h4>
                    </div>
                <div class="modal-body">  
                    <div class="form-group">
                        <label for="comment">Info</label>
                        <textarea class="form-control" rows="5" id="comment">DA MODIFICARE</textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-info" data-dismiss="modal">Chiudi</button>
                </div>
                </div>     
            </div> 
            </div>  
    <!-- <select id="select" class="btn btn-primary dropdown-toggle" style="color:white; background-color: #5cb85c; border-color:#4cae4c ">
        <option value="">Corsi di Laurea</option>
    </select> -->
</body>
</html>
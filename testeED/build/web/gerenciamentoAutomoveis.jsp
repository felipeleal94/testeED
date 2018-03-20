<%-- 
    Document   : gerenciamentoAutomoveis
    Created on : 19/03/2018, 21:41:41
    Author     : felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        
        <script src="jquery.min.js" type="text/javascript"></script>
        <script src="bootstrap.min.js" type="text/javascript"></script>
        <link href="bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head

    <body>
        <div style="border:solid">
            <div class="row">
                <div class="col-md-12"><h1>Dados Gerais</h1></div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>Marca:</span></div>
                <div class="col-md-4">
                    <select>
                        <option value="volvo">Volvo</option>
                        <option value="saab">Saab</option>
                        <option value="mercedes">Mercedes</option>
                        <option value="audi">Audi</option>
                    </select>
                </div>
                <div class="col-md-2"><span>Modelo:</span></div>
                <div class="col-md-4"><input type="text" name="modelo"></div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>Ano:</span></div>
                <div class="col-md-4"><input type="text" name="ano"></div>
                <div class="col-md-2"><span>Ano Modelo:</span></div>
                <div class="col-md-4"><input type="text" name="anomodelo"></div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>KM:</span></div>
                <div class="col-md-4"><input type="text" name="km"></div>
                <div class="col-md-2"><span>Combustível:</span></div>
                <div class="col-md-4">
                    <select>
                        <option value="Gasolina">Gasolina</option>
                        <option value="Diesel">Diesel</option>
                        <option value="Diesel">Alcool</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>Cor:</span></div>
                <div class="col-md-4"><input type="text" name="cor"></div>
                <div class="col-md-2"><span>Portas:</span></div>
                <div class="col-md-4"><input type="text" name="portas"></div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>Cambio:</span></div>
                <div class="col-md-4"><input type="text" name="cambio"></div>
                <div class="col-md-2"><span>Carroceiria:</span></div>
                <div class="col-md-4"><input type="text" name="carroceiria"></div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>Final Placa:</span></div>
                <div class="col-md-4"><input type="text" name="finalplaca"></div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>Descrição:</span></div>
                <div class="col-md-10"><textarea rows="4" cols="50"></textarea>
                </div>
            </div>
            <div class="row">
                <div class="col-md-2"><span>Valor:</span></div>
                <div class="col-md-4"><input type="text" name="valor"></div>
            </div>
            <br><br>
        </div>
        <div style="border:solid">
            <div class="row">
                <div class="col-md-12"><h2>Acessórios</h2>
                </div>
                <div class="container" style="margin:45px auto;">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" id="checkall"/> Selecionar Todos/Apagar Todos
                        </label>
                    </div>
                    <hr/>
                    <div class="row">
                        <div class="col-md-2">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="arCondicionado"> Ar Condicionado
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="direcaoEletrica"> Direção Elétrica
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="centralMultimidia"> Central Multimídia
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="cameraRe"> Camera de Ré
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="">
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="">
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="">
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="">
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="">
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="">
                                </label>
                            </div>
                        </div>
                        <div class="col-md-10">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="sensorEstacionamento"> Sensor de Estacionamento
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="repetidorSeta"> Repetidor de Seta
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="modoEconomico"> Modo Econômico
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name="alarme"> Alarme
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name=""> 
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name=""> 
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name=""> 
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name=""> 
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name=""> 
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" class="checkitem" name=""> 
                                </label>
                            </div>
                        </div>
                    </div>
                </div>

                <script src="jquery.min.js"></script>
                <script src="bootstrap.min.js"></script>
                <script>
                    $("#checkall").change(function () {
                        $(".checkitem").prop("checked", $(this).prop("checked"))
                    })
                    $(".checkitem").change(function () {
                        if ($(this).prop("checked") == false) {
                            $("#checkall").prop("checked", false)
                        }
                        if ($(".checkitem:checked").length == $(".checkitem").length) {
                            $("#checkall").prop("checked", true)
                        }
                    })
                </script>
            </div>
        </div>
    </div>  
</body>
</html>

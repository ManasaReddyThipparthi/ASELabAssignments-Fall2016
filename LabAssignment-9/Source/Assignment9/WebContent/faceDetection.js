'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [])


    .controller('ViewCtrl', function ($scope, $http) {
        $scope.classifyFunction = function () {
        	var url=document.getElementById("imageUrl").value;
        	if (url != null && url != "") {
                //This is the API that gives the list of venues based on the place and search query.
                var handler = $http.get("https://apius.faceplusplus.com/v2/detection/detect?url="+url+"&api_secret=XVGdcflrqvGcoL1GWUh2pM_bstHRsgXi&api_key=0621c5c25c3b4c4bd3ad8b3280cf3f97&attribute=glass,pose,gender,age,race,smiling");
                handler.success(function (response) {
                	  var image='';
                      image+="<label id='imageLabel'>Image</label><img src='"+url+"' id='classifyImage'>";
                      document.getElementById("image").innerHTML=image;
                      var table='';
                      table+="<label id='tableLabel'>Image Classification Data</label> <tr class='thead-inverse'> <tr><th>Gender</th><th>Age</th><th>Race</th><th>Smiling Value</th></tr></thead>";
                      table+="<tbody>";
                      for(var i=0;i<response.face.length;i++){
                          table+="<tr><td>"+response.face[i].attribute.gender.value+"</td>";
                          table+="<td>"+response.face[i].attribute.age.value+"</td>";
                          table+="<td>"+response.face[i].attribute.race.value+"</td>";
                          table+="<td>"+response.face[i].attribute.smiling.value+"</td></tr>";
                      }
                      table+="</tbody>";
                      document.getElementById("data").innerHTML=table;
                  
                })
                handler.error(function (data) {
                    alert("There was some error processing your request. Please try after some time.");
                });
            }
        }
    });

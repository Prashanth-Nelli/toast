var api = {};

api.prototype.show=function(str,callback){
    cordova.exec(function(){},function(){},"Toast","show",["king is awesome"]);
}

window.Toast= new api();


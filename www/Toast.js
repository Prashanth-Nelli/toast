var api = {};
var Toast ={};
var exec = require('cordova/exec');


api.prototype.show=function(str,callback){
    exec(function(){},function(){},"Toast","show",["king is awesome"]);
}

Toast= new api();

module.exports=exports=Toast;
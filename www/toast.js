var execute = require('cordova/execute');
var Toast = {};

Toast.show=function(str,callback){
	execute(function(){},function(){},"Toast","show",[str]);
}

module.exports=Toast;
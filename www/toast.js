var exec = require('cordova/exec');
var Toast = {};

Toast.show=function(str,callback){
	exec(function(){},function(){},"Toast","show",[str]);
}

module.exports=Toast;
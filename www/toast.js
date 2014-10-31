var exec = require('cordova/exec');
var Toast = {};

Toast.show=function(str,place,callback){

	switch(place){

		case "top" :
			exec(function(){},function(){},"Toast","show",[str,"top"]);
			break;	
		case "center" :
			exec(function(){},function(){},"Toast","show",[str,"center"]);	
			break;
		case "bottom" :
			exec(function(){},function(){},"Toast","show",[str,"bottom"]);	
			break;
		default:
			exec(function(){},function(){},"Toast","show",[str,"center"]);	
	}

	
}

module.exports=Toast;
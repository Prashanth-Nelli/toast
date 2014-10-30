window.Toast={

  show:function(str,callback){
    cordova.exec(function(){},function(){},"Toast","show",["king is awesome"]);
  }

};
app.controller('LoginController', ['$http', 'RequestHelpers', function($http, requestHelpers){
    
    var self = this;
    
    self.username = "";
    self.password = "";
    
    self.login = function(){
        
        var data = { username: self.username, password: self.password }
        
        var success = function(res){ console.log(res.data.message); }
        var failure = function(res){ console.log("Login failed."); }
        
        requestHelpers.sendPostRequest('/public/login', data, success, failure);
        
    }
    
    
}]);
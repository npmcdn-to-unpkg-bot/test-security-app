app.controller("CreateUserController", ['$http', function($http){
    
    var self = this;
    
    self.message = "Add a user here.";
    self.username = "";
    self.password = "";
    
    self.createUser = function(){
        
       var req = {
        
           method: 'POST',
           url: '/public/createuser',
           headers: {
            
                'Content-Type': 'application/json'
                   
           },
           data: { username: self.username, password: self.password }
           
        }
       
        $http(req).then(function successCallBack(res){
    
            console.log("Server response: " + res.data);
    
        }, function errorCallBack(res){}); 
    }
    
}]);
    

    
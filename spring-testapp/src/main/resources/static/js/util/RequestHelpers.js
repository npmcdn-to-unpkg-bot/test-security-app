app.factory('RequestHelpers', ['$http', function($http){
    
  
    return {
        
        sendPostRequest: function(url, body, success, fail){
            
            var req = {
        
                method: 'POST',
                url: url,
                headers: {
            
                    'Content-Type': 'application/json'
                   
                },
                data: body
           
            }
       
            $http(req).then(success, fail);
        
        },
        
        sendGetRequest: function(url, success, fail){
            
            var req = {
         
                method: 'GET',
                url: url,
            
            }
        
            $http(req).then(success, fail);
            
        }
    }
    
    
}]);
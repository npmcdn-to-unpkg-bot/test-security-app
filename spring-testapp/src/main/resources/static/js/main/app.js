var app = angular.module("app", ['ngRoute']);
    
app.config(function($routeProvider){
        
    $routeProvider
        
        .when('/home', {
                
            templateUrl: 'templates/home.html',
            controller: 'HomeController'
            
        })
        
        .when('/', {
            
            templateUrl: 'templates/create-user.html',
            controller: 'CreateUserController'
            
        });
        
});
    

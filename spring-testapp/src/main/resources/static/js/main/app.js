var app = angular.module("app", ['ngRoute']);

app.config(function($routeProvider){

    $routeProvider

        .when('/home', {

            templateUrl: 'templates/home.html',
                  controller: 'HomeController'

        })

        .when('/', {

            templateUrl: 'templates/login.html',
            controller: 'LoginController'

        })

        .when('/createuser', {

            templateUrl: 'templates/create-user.html',
            controller: 'CreateUserController'

        });

});

app.controller("CreateUserController", ['$http', 'RequestHelpers', function($http, requestHelpers) {

    var self = this;

    self.message = "Add a user here.";
    self.username = "";
    self.password = "";

    self.users = [];

    self.createUser = function() {

        var body = {
            username: self.username,
            password: self.password
        }
        var success = function(res) {
            self.refreshUsersList();
        }
        var fail = function(res) {
            console.log("Failed to create user.");
        }

        requestHelpers.sendPostRequest('/public/createuser', body, success, fail);

    }

    self.refreshUsersList = function() {

        var success = function(res) {
            self.users = res.data;
        }
        var fail = function(res) {
            console.log("Failed to get users.");
        }

        requestHelpers.sendGetRequest('/public/getusers', success, fail);

    }

}]);

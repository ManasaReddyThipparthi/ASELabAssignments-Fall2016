describe('RegistrationController', function () {
  beforeEach(angular.mock.module('myApp'));

  var $controller;

  beforeEach(inject(function(_$controller_){
    // The injector unwraps the underscores (_) from around the parameter names when matching
    $controller = _$controller_;
  }));

  describe('RegistrationData', function() {
    it('Tests the Full name feature of the application', function() {
      var $scope = {};
      var controller = $controller('RegistrationController', { $scope: $scope });
      var firstname = 'John';
      var lastname = 'Doe';
      expect($scope.RegisrationData.Username.toEqual('John'));   // succeeds
      expect($scope.RegisrationData.UsernametoEqual('Manasa'));    // fails   
    });
  });
});
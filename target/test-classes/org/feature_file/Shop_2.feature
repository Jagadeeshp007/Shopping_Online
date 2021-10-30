Feature: Online Shopping Demo Website part2 

@sanityTest 
Scenario: Home Page 
	When user Launch The Shopping Application 
	Then user click The Evening Dress To Navigate Dress Page 
	
@sanityTest 
Scenario: Dress Page 
	When user Select The Dress 
	And user Change The Dress Quntity 
	And user Change The Dress Size 
	And user Change The Dress Color 
	Then user Click The AddCard Button To  Order Page 
	
@sanityTest 
Scenario: Order Page 
	Then user Click The Proceed To Card Button To Navigate Login Page 
	
@smokeTest 
Scenario: Login Page 
	When user Enter The Username In Username Field 
	And user Enter The Password In Password Field 
	Then user Click The SignIn Button To Navigate Order Conform Page 
	
@sanityTest 
Scenario: Order Conform Page 
	When user Enter The Text In Textare Field 
	Then user Click The Proceed Button To Navigate Shipping Page 
	
@regressionTest 
Scenario: Shipping Page 
	When user Click The CheckBox 
	Then user Click The Proceed Button To Navigate Payment Page 
	
@smokeTest 
Scenario: Payment Page 
	Then user Click The payment Button To Navigate Conform Page 
	
@regressionTest 
Scenario: Confrom Page 
	Then user Click The Submit Button To Conform Order
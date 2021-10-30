Feature: Online Shopping Demo Website Part1

@RegrationTest
Scenario: Home page

Given user Launch The Shopping Application
Then user Click The Sign Up Button To Navigate Sign Up page

@sanityTest
Scenario: Sign Up page
When user Enter The Email In Email Field
Then user Click The Sign Up Button To Navigate Registration Page

@smokeTest
Scenario: Registration Page

When user Select The Gender 
And user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Password In Password Field
And user Select The Day
And user Select The Month
And user Select the Year
And user Enter The Company In Comapny Field
And user Enter The Address In Address Field
And user Enter The Land Mark In Land Mark Field
And user Enter The City In City Field 
And user Enter The Zipcode In Zipcode Field
And user Enter The Information In Information Field
And user Enter The Mobile Number In Mobile Number Field
Then user Click The Submit Button To Registration Successfull
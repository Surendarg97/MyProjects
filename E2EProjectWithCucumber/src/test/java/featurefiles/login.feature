Feature: Login into Application

Scenario: Positive test validating login

Given Initialize browser with chrome
And Navigate to "http://qaclickacademy.com/" site
And Click on login link on the home page to land in secure login page
When User enters "test99@gmail.com" and "12345" and logs in
Then Verify that user is successfully logged in

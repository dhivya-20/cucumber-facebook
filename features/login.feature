Feature: Facebook Login

Scenario Outline: Facebook Page default login
Given Launch the browser
And Open the page URL as "https://www.facebook.com/"
When User login into application with username as <username> and password as <password>
Then Click on the login button
And Get the title of the page
And Close the browser

Examples: 
|username   		 |password    |
|sdhivu20@gmail.com  |dhivyasiva  |


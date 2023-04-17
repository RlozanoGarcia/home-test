#App Automation Test

Must have before start
Git
Docker
Steps
Pull the docker image containing the web app docker pull automaticbytes/demo-app

Run the image docker run -p 3100:3100 automaticbytes/demo-app

Verify the app is shown in below url and set it as the base url for the tests. http://localhost:3100

Fork this repository and develop your tests following bellow guidances/requisites.

When finished open a Pull Request for Code Review.

General requisites for submission
Programming languages

Java or Javascript are preferred.
Other languages like C#, Go or Python are accepted but bear in mind we work in Java/Javascript
Drivers. Any of these are accepted

Selenium Webdriver
Playwright
Puppeteer
Browsers

Chrome (preferred)
Firefox
General test requisites
All tests should provide a setup and tear down mechanism that opens and closes the browser.
All tests should run successfully either from IDE or command line.
Instructions to build and run the code and tests submitted must be provided.
Submitted code implementing a Page Object Model will be taken in high consideration.
Tests Scenarios
Login Success
Navigate to http://localhost:3100/login
Successfully login with credentials: johndoe19/supersecret
Assert that welcome message containing username is shown.
Login Failure A

Navigate to http://localhost:3100/login
Enter wrong username/password
Assert error message is shown.
Login Failure B

Navigate to http://localhost:3100/login
Leave both username/password in blank
Assert error message is shown.
Checkout Form Order Success

Navigate to http://localhost:3100/checkout
Complete all the fields
Verify that if "Shipping address same as billing" checkbox is not checkmarked then checkmark it.
Submit the form and assert that the order confirmation number is not empty.
Checkout Form Alert

Navigate to http://localhost:3100/checkout
Complete all the fields
Verify that if "Shipping address same as billing" checkbox is checkmarked, then uncheckmark it.
Try to submit the form and validate that the alert message is shown and confirm the alert.
Assert alert is gone.
Cart Total Test

Navigate to http://localhost:3100/checkout
Assert that the cart total shown is correct for the item prices added.
Grid Item Test

Navigate to http://localhost:3100/grid
Assert that in position 7 the product shown is "Super Pepperoni"
Assert that the price shown is $10
Grid All Items Test

Navigate to http://localhost:3100/grid
Assert that all the items have a non empty title, price, image and a button.
Search Success

Navigate to http://localhost:3100/search
Search for any word (for instance automation)
Assert that "Found one result for" plus the word you searched is shown.
Search Empty
Navigate to http://localhost:3100/search
Leave search box empty and submit the search
Assert that "Please provide a search word." message is shown.
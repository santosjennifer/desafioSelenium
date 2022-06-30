# Test automation with Java, Selenium WebDriver and Cucumber using Page Objects.

The purpose of the test is to validate an insurance quote scenario on the website: http://sampleapp.tricentis.com/101/app.php

Using Eclipse IDE, project with Maven structure.

## The Test package structure is divided into:

* ***PageObjects***: page objects
* ***Runner***: to run Cucumber
* ***Steps***: steps to fill the form
* ***Utils***: date utility

## The Resources package structure is divided into:

* ***Features***: Test scenario file using Cucumber.
 
## Technology

- Java 8
- Java JDK 11
- Maven - Apache Maven 3.8.2
- Eclipse IDE - 2021-06 (4.20.0)
- Selenium - 3.141
- Cucumber - Puglin for Eclipse	v1.0.0.202107150747

**PS:** The _ChromeDriver.exe_ available in the _drivers_ folder is compatible with Version 103.0.5060.53 of the Chrome browser.

## Running the tests

Run ```mvn test``` to run all tests.



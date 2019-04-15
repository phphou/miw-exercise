# miw-exercise
MIW Selenium Test Cases

## Description
This test automation framework was built using Selenium WebDriver, Java, TestNG, Eclipse IDE, and Chrome Driver. The approach I took to build this was to implement the Page Object Model design pattern. The code is divided into tests and pages, one for Google and one for the Ritchie Bros. Auctioneers website. 

## Setup
1. Download or clone this repository onto your machine
2. Open Eclipse IDE
3. Install TestNG through Eclipse Marketplace

## Test Case Execution Instructions
To run the Google or Ritchie Bros test cases:
1. Go to Package Explorer and expand the "src/main/java" directory
2. Expand the "tests" directory within the Package Explorer
3. Right click on the respective test class Java file (GoogleTest.java or RitchieBrosTest.java)
4. Hover over <i>Run As</i>
5. Select <i>TestNG Test</i>

## QA Test Plan

#### Item Pass / Fail Criteria

<b>Google:</b>
100% of all test cases should pass. The home page should load successfully without any client or server errors (400, 500). After entering a search query, the href attribute of the link of the first result should be: www.mobileintegrationsworkgroup.com

<b>Ritchie Bros.:</b>
100% of all test cases should pass. After entering all of the search criteria in the text fields, the "Details" section of the first result should display text.

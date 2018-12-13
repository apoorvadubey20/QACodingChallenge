# WebPass Project.

## Introduction
This WebPass Project is in Java Selenium Web Driver and TestNG.
Project has 4 folders main.java having object files, test.java having test file, resources folder having web drivers and textdata folder having excel file.

The Object files in main.java folder starting from
Home page
Building layover
Check availability
Pick service
Confirm service
Schedule appointment
Personal information page
Also created a Helper class which has pieces of code which can be reused.

Created ExcelFile class which has my Apache POI code which is to interact with the Excel file.
The Excel file is in textdata folder and the name of the file is webpass

Created Driver classes for Chrome, Firefox and Edge.
The path to web driver is in resources folder

The test file is in test.java folder which is SignupTest


I have used Mac and eclipse to build the project
The path to my eclipse workspace is Users/adubey/eclipseWorkspace/webpass

To run the test
Open the project in eclipse
Go to test.java folder
Right click SignupTest.java
Select Run As
Select TestNG Test

This is a simple project and therefore I have used Thread.sleep on multiple places. But this can be avoided by using an in-house built framework which goes with the project.

For your reference I have also attached a snapshot of the results.
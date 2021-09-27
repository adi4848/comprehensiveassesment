Feature: searching for filghts in gobibo 
Scenario Outline: Checking ticket availability 
Given User enter <from> place and <to> place	
When 	User select the date for departure 	
And     User select the date for arrival
Then user click on the search button
Examples:
|from  |to    |   date|
|Delhi |Mumbai |
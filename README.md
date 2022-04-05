# Sep2021_cucumberBDD
Java, Maven

Sep2021_cucumberBDD
Maven, Java, TestNG, Git, Jenkins, CucumberBDD, JVM Report ect

Fix code in Mac
cmd+a to select all code option+cmd+L

Fix code in Windows
CMD+A CTL+I

How to execute test in CMD
mvn verify --- to run whole TC

mvn verify -Denv=qa -Dbrowser=ff -Dcucumber.filter.tags="@login"

mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@login"
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@signup"
Documents\TalentTEK\Git\Sep2021_cucumberBDD>mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@signup"
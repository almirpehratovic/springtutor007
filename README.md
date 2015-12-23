# Spring Task execution
## Preface
This is example of creating spring tasks that are scheduled to execute at certain points in time. Tutorial can be found at:

https://springtutor.wordpress.com/2015/12/23/spring-task-execution/

## Getting Started


If you wish to try this example, please download source code from repository. Extract the project somewhere on disk and turn on Spring STS. Inside Spring STS import project by choosing File - Import - Maven - Existing Maven Project and navigating to extracted folder. Spring STS will import project and download all java dependencies configured in pom.xml file.

This project is using various Java anntotations that are not compatible with older java versions so we have to change compatibility to Java 1.6. In project properties (right click on project name) in Java Compiler section choose Compiler compliance level as 1.6, and in Java Build Path section on Libraries tab remove JRE 1.5 library and add your installed Java sdk version greater than 1.5. Spring STS will rebuild the project.

Finally, to run the example, right click on the com.springtutor.Main class and choose Run as - Java application.



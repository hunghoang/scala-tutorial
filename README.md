### Scala tutorial
This are series of Scala tutorial. These tutorials are introduced using the approach of Java developer. Whoever is familiar with Java, Eclipse, 
Maven or Spring will easily learn Scala by using these as samples. With maven as a build tool (not Scala's SBT), Java developer
can see which libraries are required in each sample by taking a look at pom.xml file. 

**Tutorial 1**: How to use Junit Test with scala

**Tutorial 2**: How to run Scala project with Spring framework: Restful webservice, Autowired beans, Spring with properties file...

**Tutorial 3**: How to use ScalaTest: Spec test, Mockito, FunSuite

**Tutorial 4**: Some test to figure out how to work with Scala Self type Annotation

Every tutorial has same template which contains 5 source folders:
	src/main/java: for java classes
	src/main/scala: for scala file
	src/test/java: for Java Unit Test
	src/test/java: for Scala Unit Test
	src/main/resouces: For resource files
	


### To run sample, using maven build command:
	
	mvn clean install
	
### To import project in eclipse:
			
	mvn eclipse:eclipse		
		
		
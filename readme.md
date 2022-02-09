##Student sort

Run the below commands in the main StudentSort directory where 'pom.xml' file is.

To run the tests use 

`mvn test`

To start the application use

`mvn clean install`

`mvn exec:java -Dexec.mainClass=StudentSort -Dexec.args="input.txt BUBBLE"`

For the second argument insert one of BUBBLE / HEAP / MERGE

If needed you can change the input.txt file located in the same directory or add a 
new file, but then change the name of the argument in command line accordingly.

FileReader reads the file, separates each line to Student object and gives them to Sorter.




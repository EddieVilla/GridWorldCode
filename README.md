# setup
(for rhel-based)

one time
```
sudo yum install java-21-openjdk java-21-openjdk-devel ant # java version shouldn't matter
```
build library
```
ant build-jar
cd projects/firstProject/
```
compile your personal project files
```
javac -classpath '.:../../dist/GridWorldCode/gridworld.jar' *.java
```
run code
```
java -classpath '.:../../dist/GridWorldCode/gridworld.jar' BugRunner
```

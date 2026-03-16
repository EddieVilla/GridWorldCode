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

# How to set up in Intellij
- Open some other project
- Execute the Action: "Import Project from Existing Sources..." (hit Shift+Shift and tab over to "Actions". Then in that search bar, type "ImportProject from Existing Sources...")
- Select the "GridWorldCode" directory
- Click the radio button for "Create project form existing sources"
- Take all the defaults (including jdk being java 21 which you should have installed on your OS earlier)

# credit
Credit to Cay Horstmann

pinned upstream source: https://web.archive.org/web/20241207165401/https://horstmann.com/gridworld/

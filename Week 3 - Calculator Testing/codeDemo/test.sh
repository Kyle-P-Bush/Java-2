#Compile and run test code using shell script 

#javac -cp "../lib/junit-platform-console-standalone-1.8.0-M1.jar" "$1"
#java -jar "../lib/junit-platform-console-standalone-1.8.0-M1.jar" -cp "." --select-class "$2"

javac -cp "../lib/*" *.java
java -jar "../lib/junit-platform-console-standalone-1.8.0-M1.jar" -cp "." --select-class "$1"

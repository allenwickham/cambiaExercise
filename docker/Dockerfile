# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy jar into image
COPY cambia-exercise-0.0.1-SNAPSHOT.jar /cambia-exercise-0.0.1-SNAPSHOT.jar
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "/cambia-exercise-0.0.1-SNAPSHOT.jar", "input.csv"]

FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} carMan.jar
ENTRYPOINT ["java","-jar","/carMan.jar"]

FROM java:8
FROM maven:3.6.0-jdk-8
RUN mkdir /student-service
ADD student-service/ /student_service
WORKDIR /student_service
RUN ls -l
RUN mvn install -Dmaven.test.skip=true
RUN cp /student_service/target/student-service-0.0.1-SNAPSHOT.jar /student_service
#WORKDIR /student_service/target
RUN pwd
EXPOSE 9999
RUN which java
#RUN ls -al /student_service/target 
#FROM java:8
#ENTRYPOINT ["/usr/bin/java"]
CMD exec java -jar student-service-0.0.1-SNAPSHOT.jar
#CMD ["java" "-jar" "student-service-0.0.1-SNAPSHOT.jar"]


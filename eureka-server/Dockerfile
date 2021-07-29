FROM java:8
ARG TARGET_FILE=target/*.jar
COPY $TARGET_FILE eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]
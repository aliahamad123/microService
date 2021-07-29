From tomcat:8.5.61-jdk15-openjdk-buster
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/master.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
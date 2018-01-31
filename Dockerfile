FROM maven:3.5-jdk-8-alpine as BUILD

COPY . /usr/src/app
RUN mvn --batch-mode -f /usr/src/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
ENV PORT 4567
EXPOSE 4567
COPY --from=BUILD /usr/src/app/target/draft-spring-boot-app-*.jar /opt/draft-spring-boot-app.jar
WORKDIR /opt
CMD ["java", "-jar", "draft-spring-boot-app.jar"]

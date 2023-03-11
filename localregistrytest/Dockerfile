#package
FROM maven:3.6.3-jdk-8 as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN mvn clean package

#build and create image and doesn't create container
FROM openjdk:8-jdk-alpine
COPY --from=build /usr/app/target/localregistrytest-0.0.1-SNAPSHOT.jar /app/localregistrytest-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","/app/localregistrytest-0.0.1-SNAPSHOT.jar"]


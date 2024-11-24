FROM eclipse-temurin:17
RUN mkdir /myapp
COPY ./target/cicd-0.0.1-SNAPSHOT.jar  /myapp
WORKDIR /myapp
CMD ["java","-jar","cicd-0.0.1-SNAPSHOT.jar"]
FROM maven:latest

LABEL authors="Petra"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "-jar", "target/timeCalculator.jar"]
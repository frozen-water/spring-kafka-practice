# 1. Build stage
FROM gradle:8.7-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# 2. Run stage
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY /build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]
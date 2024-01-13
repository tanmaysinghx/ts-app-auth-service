# Use an official OpenJDK runtime as a base image
FROM eclipse-temurin:11-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/ts-app-auth-service-0.0.1-SNAPSHOT /app/ts-app-auth-service-0.0.1-SNAPSHOT.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run your application
CMD ["java", "-jar", "ts-app-auth-service-0.0.1-SNAPSHOT.jar"]
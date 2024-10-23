# Use the official Maven image with OpenJDK 21
FROM maven:3.9-sapmachine-21 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and any other necessary files
COPY pom.xml ./
# Copy the source code
COPY src ./src

# Run Maven to package the application
RUN mvn clean package -DskipTests

# Use a smaller JDK image for the final stage
FROM openjdk:21-jdk-slim

# Copy the jar file from the build stage
COPY --from=build app/target/demo-0.0.1-SNAPSHOT.jar /app.jar

# Expose the port the application runs on (change this if necessary)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "/app.jar"]

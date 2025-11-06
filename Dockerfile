# -------- Stage 1: Build --------
FROM maven:3.9.8-eclipse-temurin-17 AS builder
WORKDIR /app

# Nur pom.xml zuerst, um Dependencies zu cachen
COPY pom.xml .
RUN mvn dependency:go-offline

# Jetzt Quellcode hinzufügen und bauen
COPY src ./src
RUN mvn clean package -DskipTests

# -------- Stage 2: Runtime --------
FROM eclipse-temurin:17-jre
WORKDIR /app

# Nur das fertige JAR vom Builder übernehmen
COPY --from=builder /app/target/ci-cd-uebung-1.0.0.jar app.jar

# Container-Startbefehl
ENTRYPOINT ["java", "-jar", "app.jar"]
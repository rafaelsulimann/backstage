FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:17-slim
WORKDIR /app
ENV POSTGRES_HOST=localhost
ENV POSTGRES_PORT=5432
ENV POSTGRES_DATABASE=test
ENV APP_PROFILE=test
ENV CORS_ORIGINS="https://${{ values.orgName }}.com.br,http://localhost:3000,http://localhost:5173,"
COPY --from=builder /app/target/${{ values.name }}-0.0.1-SNAPSHOT.jar ./${{ values.name }}.jar
EXPOSE ${{ values.applicationPort }}
ENTRYPOINT ["java", "-jar", "/app/${{ values.name }}.jar"]

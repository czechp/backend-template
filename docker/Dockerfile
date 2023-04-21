FROM openjdk:17-alpine
RUN apk update
RUN apk add tzdata
ENV TZ="Europe/Warsaw"
WORKDIR /TemplateBackend
COPY backend-template.jar .
EXPOSE 8080:8080
ENTRYPOINT ["java", "-jar", "/TemplateBackend/orders-backend.jar"]

# Usa una imagen base con JDK para ejecutar tu aplicación
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo WAR a la imagen Docker
COPY target/demo-0.0.1-SNAPSHOT.war /app/demo-0.0.1-SNAPSHOT.war

# Expon el puerto donde la aplicación Spring Boot escuchará
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/demo-0.0.1-SNAPSHOT.war"]

# Usamos una imagen base de Tomcat
FROM tomcat:9.0-jdk11

# Elimina la aplicación web predeterminada de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copia el archivo WAR generado a la carpeta de aplicaciones de Tomcat
COPY ./target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Exponer el puerto en el que Tomcat escucha (por defecto 8080)
EXPOSE 8080

# Inicia Tomcat cuando se ejecute el contenedor
CMD ["catalina.sh", "run"]

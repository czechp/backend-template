FROM openjdk:11
RUN apt-get update -y
RUN apt-get install git -y
RUN apt-get install maven -y
RUN mkdir JavaProject
RUN mkdir StartScript
COPY init.sh /StartScript
RUN chmod 777 /StartScript/init.sh
EXPOSE 8080:8080
ENTRYPOINT ["/StartScript/init.sh"]

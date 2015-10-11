FROM library/java:latest
RUN mkdir /dozy
WORKDIR /dozy
ADD build/libs/dozy-all.jar /dozy/dozy-all.jar

EXPOSE 5050
CMD ["java", "-jar","dozy-all.jar"]

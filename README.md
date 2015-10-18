Introduction
============

Dozy-service is a simple webservice that will pause for a random amount of time before returning a response.  It was put together as a simple end-point for playing around with performance monitoring tools.

Dozy-service is implented in [Ratpack](http://ratpack.io).

Usage
-----
Dozy-service can be used by running an executable JAR or via a Docker container.

### Standalone ###
To use the JAR simply download it (substituting the version as appropriate):
`curl -L -o dozy-service.jar https://bintray.com/artifact/download/whamondg/maven/whamondg/dozy-service-0.0.4-all.jar`

Then run it: 
`java -jar dozy-service.jar`

Dozy-service listens on port 5050 so hitting [http://localhost:5050/](http://localhost:5050/) will give a pause and then return the length of time the service rested for.

### Docker ###
To use the Docker container pull it (substituting the version as appropriate):
`docker pull whamondg-docker-registry.bintray.io/dozy-service:0.0.4`

Then run it:

Docker: ```docker run -p 5050:5050 whamondg-docker-registry.bintray.io/dozy-service:0.0.4```

When running Docker On Linux you can now request [http://localhost:5050/](http://localhost:5050/).  However, if you are using Docker on Windows or Mac the Docker host will be running via a Linux VM; you will need to know the IP address of the Docker Host to access the service.  This can be found by using [Kitematic](https://kitematic.com/): simply click the running container in the Kitematic GUI and then open the 'IP and Ports' settings to find the host IP.

Introduction
============

Dozy-service is a simple webservice that will pause for a random amount of time before returning a response.  It was put together as a simple end-point for playing around with performance monitoring tools.

Dozy-service is implented in RatPack and listens on port 5050.

Usage
-----
Standalone: ```java -jar dozy-service.jar```

Docker: ```docker run -p 5050:5050 whamondg/dozy-service```

When running stadalone or using Docker On Linux you can now request http://localhost:5050/ but if you are using Docker on Windows or Mac via a Linux VM you will need to know the IP of the Docker Host.  This can be found by using Kitematic: simply click the running container and then open the 'IP and Ports' settings window.

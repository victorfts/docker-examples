## Debian Jessie Hello World
This is a simple webserver that runs apache on a Debian Jessie operating system.

## how to run
+ Install docker in your machine
+ build the container running the command `docker build -t webserver:1.0 .` inside the **hello-world-apache-debian** folder.
+ Run the container with the command `docker run -d -p 80:80 webserver:1.0`

Everything should run as expected, open your browser and access http://localhost or execute `curl localhost`
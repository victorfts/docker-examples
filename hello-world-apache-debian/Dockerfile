FROM debian:jessie
LABEL Description="apache-webserver"

#installing apache
RUN apt-get update && apt-get install -y apache2 && apt-get clean 

#apache variables
ENV APACHE_LOC_DIR="/var/lock"
ENV APACHE_PID_FILE="/var/run/apache2.pid"
ENV APACHE_RUN_USER="www-data"
ENV APACHE_RUN_GROUP="www-data"
ENV APACHE_LOG_DIR="/var/log/apache"

COPY index.html var/www/html/index.html

ENTRYPOINT ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]

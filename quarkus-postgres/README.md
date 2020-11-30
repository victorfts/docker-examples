# Quarkus + PostgreSQL example project

This project uses [Quarkus, the Supersonic Subatomic Java Framework](https://quarkus.io/) and the [Postgresql Database](https://www.postgresql.org/) with model creation provided by [Flyway](https://flywaydb.org/).

## How to run the app
+ You must have [docker compose](https://docs.docker.com/compose/install/) installed.
+ You must have a [java JDK 11 installed](https://adoptopenjdk.net/) installed.
+ Inside the the *quarkus-postgres* folder run `./mvnw package` to generate the project jar executable.
+ Run the app with docker compose `docker-compose up`.

Everything should be working !!! You can open the browser on http://localhost:8080 to use the application.







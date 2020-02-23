# demo-quarkus
Demo quarkus for classes and Presentations.

The project prupose help  Students and  entusiatics to improve your know  about Quarkus with Spring data and Swagger documentation
[![CircleCI](https://circleci.com/gh/rodrigofujioka/demo-quarkus.svg?style=svg)](https://circleci.com/gh/rodrigofujioka/demo-quarkus)

[![License](https://img.shields.io/github/license/rodrigofujioka/demo-quarkus.svg)](https://opensource.org/licenses/MIT)
<img src="https://img.shields.io/github/followers/rodrigofujioka?label=Follow&style=plastic">
<img src="https://img.shields.io/github/forks/rodrigofujioka/demo-quarkus?color=SSSS&label=Fork&style=plastic">
<a href="https://github.com/rodrigofujioka/demo-quarkus/graphs/contributors" alt="Contributors">
   <img src="https://img.shields.io/github/contributors/rodrigofujioka/demo-quarkus" /></a>
<a href="https://github.com/rodrigofujioka/demo-quarkus/pulse" alt="Activity">
    <img src="https://img.shields.io/github/commit-activity/m/rodrigofujioka/demo-quarkus" /></a>  
  

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=rodrigofujioka_demo-quarkus&metric=bugs)](https://sonarcloud.io/dashboard?id=rodrigofujioka_demo-quarkus) 
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=rodrigofujioka_demo-quarkus&metric=code_smells)](https://sonarcloud.io/dashboard?id=rodrigofujioka_demo-quarkus) 
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=rodrigofujioka_demo-quarkus&metric=alert_status)](https://sonarcloud.io/dashboard?id=rodrigofujioka_demo-quarkus) 
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=rodrigofujioka_demo-quarkus&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=rodrigofujioka_demo-quarkus) 
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=rodrigofujioka_demo-quarkus&metric=ncloc)](https://sonarcloud.io/dashboard?id=rodrigofujioka_demo-quarkus) 
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=rodrigofujioka_demo-quarkus&metric=vulnerabilities)

   
#Refs:

[Quarkus DataSources](https://quarkus.io/guides/datasource)

[Quarkus V 1.0.0.CR1](https://github.com/quarkusio/quarkus/releases/tag/1.2.1.Final)


# code-with-quarkus project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `code-with-quarkus-1.0.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/code-with-quarkus-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or you can use Docker to build the native executable using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your binary: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide .
 
 





# Demo Spring Boot Elastic Search
![Maven Central](https://img.shields.io/maven-central/v/org.apache.maven/apache-maven/3.6.1)

A small application that shows the different ways to connect Spring and Elastic Search.

## Requirements

For building and running the application you need:

- [JDK 11](https://www.oracle.com/fr/java/technologies/javase-jdk11-downloads.html) or [OpenJDK 11](https://openjdk.java.net/projects/jdk/11/)
- [Maven 3](https://maven.apache.org)
- For Elastic Search [Docker](https://www.docker.com/)

## Running locally

### Elastic Search

You will first need to have a local Elastic Search running before anythng else. I recommend using Docker for that :
```
docker pull docker.elastic.co/elasticsearch/elasticsearch:7.12.0
docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.12.0
```

### Compilation

Clean compile the project with maven :
```
mvn clean compile
```

### Start the app
Launch Spring Boot on this file :
```
com.demo.eslasticsearch.demoElasticSearch.DemoElasticSearchApplication
```

## Contributing
This is a demo project, so no more work will be done here. Still pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change / or what you don't unterstand.

## License
[MIT](https://choosealicense.com/licenses/mit/)

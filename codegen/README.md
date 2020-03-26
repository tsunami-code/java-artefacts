# Codegen

The main purpose of the Code Generator is to process the programmatic definition contained in the [api-model](https://github.com/ConsumerDataStandardsAustralia/java-artefacts/api-model) and output code based on a series of templates.


## Usage

#### Requirements
If you wish to simply run the CDS Code Generator you only require Docker.

If you wish to build the CDS Model Holder from source, this requires:

+ Java 1.8+
+ Maven/Gradle

#### Maven Build and Run

To build:
```
mvn clean install
```

To run:
```
java -jar target/codegen-1.2.0-SNAPSHOT.jar [options]
```

Show help/usages:
```
java -jar target/codegen-1.2.0-SNAPSHOT.jar --help
```

Show help/usages for CodeGenerator:
```
java -jar target/codegen-1.2.0-SNAPSHOT.jar -g CodeGenerator --help
```

Swagger Generation, e.g:
```
java -jar target/codegen-1.2.0-SNAPSHOT.jar > ~/Downloads/swagger.json
```

Code Generation for api-model, e.g:
```
java -jar target/codegen-1.2.0-SNAPSHOT.jar -g CodeGenerator -cgt api-model -o ~/Downloads/api-model
```

Code Generation for java-client-cli, e.g:
```
java -jar target/codegen-1.2.0-SNAPSHOT.jar -g CodeGenerator -cgt java-client-cli -o ~/Downloads/java-client-cli
```

#### Docker

To run:
```
docker run -it consumerdatastandardsaustralia/codegen:1.2.0-SNAPSHOT [options]
```


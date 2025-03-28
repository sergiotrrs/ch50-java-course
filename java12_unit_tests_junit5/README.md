# Maven configuration.

Maven Quickstart Archetype

## Usage
To generate a new project from this archetype, type:

```bash
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5
```

Archetype provide additional parameters:

| Name                | Default |
|---------------------|---------|
| javaCompilerVersion | 17      |
| junitVersion        | 5.11.0  |


The above command might not work on Windows or certain operating systems as-is. You can quote the parameters like this:

```bash
mvn archetype:generate "-DarchetypeGroupId=org.apache.maven.archetypes" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.5"
```
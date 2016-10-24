# mvn publish usage

> Following: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

Test using a maven package on GitHub.
- Test external package: https://github.com/grant/mvn-publish-test

Inspired by Stripe's release process: https://github.com/stripe/stripe-java/releases

---

## Generate a Maven project
```
mvn archetype:generate -DgroupId=cm.grant -DartifactId=mvn-publish-usage -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add dependency
- Create META-INF folder (mkdir `META-INF`)
- Put the jar dependencies in it. (`mvn-publish-test-0.0.1-SNAPSHOT.jar`)
- Run this command for each jar (alter as necessary):

```
mvn install:install-file \
-Dfile=META-INF/mvn-publish-test-0.0.1-SNAPSHOT.jar \
-DgroupId=cm.grant \
-DartifactId=mvn-publish-test \
-Dversion=0.0.1-SNAPSHOT \
-Dpackaging=jar
```

- IntelliJ may prompt you to add classes. Do this in order to get the dependency to resolve.
- Verify: Under "External Libraries" in IntelliJ you should see your jar
  - `mvn-publish-test-0.0.1-SNAPSHOT.jar`.

---

# Debugging I did before things didn't work. I did the following:

- `java -cp target/mvn-publish-test-0.0.1-SNAPSHOT.jar cm.grant.App`
- `rm -rf target`
- Copy jar into `META-INF`
- Make sure the pom.xml looks correct (you should be able to cmd+click
- `mvn package`
- Run the main method of the jar just to be sure it works
  - `java -cp target/mvn-publish-test-0.0.1-SNAPSHOT.jar cm.grant.App`
- Run the main method of this package
 
# History

Currently doesn't look like the jar is being built properly. The jar doesn't seem to have any classes.
Proceedure taken:
- Try to use jar
  - ```xml
<dependency>
  <groupId>cm.grant</groupId>
  <artifactId>mvn-publish-test</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
  ```
  - Added jar to META-INF/mvn-publish-test-0.0.1-SNAPSHOT.jar
  - Get static property from file.
  - IntelliJ doesn't recognize file/properties.
- Analyise jar using:
  - http://classfileanalyzer.javaseiten.de/
  - `java -jar classfileanalyzer.jar ~/Documents/github/mvn-publish-usage/META-INF/mvn-publish-test-0.0.1-SNAPSHOT.jar`

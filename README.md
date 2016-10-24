# mvn publish usage

| Following: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

Test using a maven package on GitHub.
External package: https://github.com/grant/mvn-publish-test

Inspired by Stripe's release process: https://github.com/stripe/stripe-java/releases

---

Built using:
```
mvn archetype:generate -DgroupId=cm.grant -DartifactId=mvn-publish-usage -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Add dependency:
- Create META-INF folder (mkdir META-INF)
- Put jar in it. (mvn-publish-test-0.0.1-SNAPSHOT.jar)
- Run this command:

```
mvn install:install-file \
-Dfile=META-INF/mvn-publish-test-0.0.1-SNAPSHOT.jar \
-DgroupId=cm.grant \
-DartifactId=mvn-publish-test \
-Dversion=0.0.1-SNAPSHOT \
-Dpackaging=jar
```

`mvn package`
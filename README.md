# maven-build-scan
A sample repository to experience the Build Scan™ service of Gradle Enterprise with Maven builds.

## Create a Build Scan™

Create and publish a Build Scan™ on `scans.gradle.com`:

1. Run `mvn install`
```text
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< edu.ajay:maven-build-scan >----------------------
[INFO] Building maven-build-scan 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ maven-build-scan ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ maven-build-scan ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ maven-build-scan ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ maven-build-scan ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ maven-build-scan ---
[INFO] Loaded from the build cache, saving 3.031s
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ maven-build-scan ---
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ maven-build-scan ---
[INFO] Installing /Users/ajay/Workspace/maven-build-scan/target/maven-build-scan-1.0-SNAPSHOT.jar to /Users/ajay/.m2/repository/edu/ajay/maven-build-scan/1.0-SNAPSHOT/maven-build-scan-1.0-SNAPSHOT.jar
[INFO] Installing /Users/ajay/Workspace/maven-build-scan/pom.xml to /Users/ajay/.m2/repository/edu/ajay/maven-build-scan/1.0-SNAPSHOT/maven-build-scan-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.422 s
[INFO] Finished at: 2023-01-31T21:28:59-06:00
[INFO] ------------------------------------------------------------------------
[INFO] 7 goals, 6 executed, 1 from cache, saving at least 3s
Publishing a build scan to scans.gradle.com requires accepting the Gradle Terms of Service defined at https://gradle.com/terms-of-service. Do you accept these terms? (yes/no): yes
[INFO] Gradle Terms of Service accepted.
[INFO] 
[INFO] Publishing build scan...
[INFO] https://gradle.com/s/3t7oc2s4smany
[INFO] 

Process finished with exit code 0
```
![build-scan-summary.png](images%2Fbuild-scan-summary.png)

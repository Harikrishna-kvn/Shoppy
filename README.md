# Shoppy
Shoppy


mvn archetype:generate -DgroupId=com.example -DartifactId=shopping-application -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false




<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.yourcompany</groupId>
    <artifactId>your-simple-project</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
</project>



test



package com.yourcompany;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        App app = new App();
        assertEquals("Hello, Maven!", app.getMessage());
    }
}




app.js



package com.yourcompany;

public class App {
    public String getMessage() {
        return "Hello, Maven!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}

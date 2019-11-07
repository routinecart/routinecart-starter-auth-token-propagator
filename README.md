# auth-token-propagator
**Auth Token Propagator** propagates the **Authorization** token among microservices. Not need to write single line of code, just add the dependency and rest will be taken care by **auth-token-propagator**.

## Enabling the auth-token-propagator
The simplest way to enable the features is to add a dependency to the `auth-token-propagator-starter` ‘Starter’. To add the actuator to a Maven-based project, add the following ‘Starter’ dependency:

```xml
<dependency>       
  <groupId>com.routinecart</groupId>
  <artifactId>auth-token-propagator-starter</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```
For Gradle, use the following declaration:

```
dependencies {
	compile("com.routinecart:auth-token-propagator-starter")
}
```

## Features
- Propagates **Authorization** token among microservices

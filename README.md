gRPC and mySQL in MissionEats
==============================================

The code require `grpc-java` to already be built. Also already have MySQL downloaded and create a database. Source create.sql to implement a roster of students that will be used later.

First started with [Quick Start](https://grpc.io/docs/languages/java/quickstart)
and tried the examples to understand how grpc works.

Steps
1. **[Install gRPC Java library SNAPSHOT locally, including code generation plugin](../COMPILING.md) (Only need this step for non-released versions, e.g. master HEAD).**

2. From grpc-java/examples directory:
```
$ ./gradlew installDist
```

This creates the scripts `data-server`, `data-client`. Each
example requires the server to be running before starting the client.

For example, to try the data first run:

```
$ ./build/install/examples/bin/data-server
```

And in a different terminal window run:

```
$ ./build/install/examples/bin/data-client
```

You should see a list of students' first names who use MissionEats
That's it!

For more information, refer to gRPC Java's [README](../README.md) and
[tutorial](https://grpc.io/docs/languages/java/basics).

# MissionEats

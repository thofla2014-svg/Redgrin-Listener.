NEXT DEVELOPMENT STEP

This update begins the Java 1.21.5 source migration. It modernizes Identifier creation, removes a server-freezing sleep from the blacksmith scare sequence, and adds an optional cloud build workflow.

It is not a finished mod and is not a playable JAR. The next development pass must compile the remaining entity, item, model and renderer code against Minecraft 1.21.5, then implement the Ashen Wastes biome and test the resulting mod in-game.

The build workflow is in .github/workflows/build.yml. Once this project is pushed to a GitHub repository, the Actions tab can run the build and publish its JAR output as an artifact if compilation succeeds.

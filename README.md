# Redgrin Listener — Java Fabric source (1.21.5 port in progress)

**Target configuration:** Minecraft Java 1.21.5, Fabric Loader 0.16.10, Fabric API 0.119.5+1.21.5, Java 21.

This archive is an updated development source package, **not a finished or tested mod JAR**. The Gradle dependency settings and Fabric metadata have been updated for the intended target. The original Java classes were written for Minecraft 1.20.1 and still need API migration and compilation fixes before they will build on 1.21.5.

## Included source and assets
- Redgrin Listener entity/model source
- Bloodshot Eyeball entity source
- Stake and Stun Trap item source and recipe JSON
- Blacksmith event source (needs porting/testing)
- Existing horror sound assets, including `domain_warning.ogg`

## Still to do
1. Port all Java code from 1.20.1 APIs to 1.21.5 APIs and resolve compiler errors.
2. Verify entity registration, attributes, renderers, items, recipes and event logic in a real Gradle build.
3. Implement the Ashen Wastes as a naturally generating Overworld biome, with volcanic terrain, lava features and ash atmosphere.
4. Trigger the spoken warning audio on entry to the Ashen Wastes.
5. Keep and finish the separate blacksmith event.
6. Add/verify required textures, spawn rules and gameplay balancing.
7. Build and test the resulting JAR in Minecraft 1.21.5 with Fabric.

## Build environment
Use JDK 21 and Gradle 8.12 or a compatible Gradle version supported by Fabric Loom 1.10.5. From this project folder run `gradle build`. A successful build should create the JAR under `build/libs/`. **Do not distribute this source archive as a playable mod.**

## Important honesty note
The version numbers in the build configuration do not automatically port the Java source. This package has not yet passed compilation or an in-game test.

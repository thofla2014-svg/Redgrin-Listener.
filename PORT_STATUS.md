# Redgrin Listener — 1.21.5 port status

## Step 2 changes
- Replaced the legacy `EntityAttributes.GENERIC_*` identifiers with the modern Yarn attribute identifiers (`MAX_HEALTH`, `MOVEMENT_SPEED`, `ATTACK_DAMAGE`, `FOLLOW_RANGE`, `KNOCKBACK_RESISTANCE`, and `ARMOR`) in the two entity classes.
- Preserved the existing blacksmith event, items, sounds, and entity code.
- Kept the GitHub Actions Java 21 / Gradle build workflow.

## Important: not yet a finished mod
This is a source compatibility pass, not a verified compile. Several Minecraft 1.21.5 APIs may still need porting, including entity damage callbacks, item tooltip signatures, client model/renderer APIs, and entity registration. The project has not been compiled or tested in Minecraft.

## Remaining work
1. Complete the 1.21.5 API port and run the Gradle build.
2. Implement real trap placement/capture behaviour and test the blacksmith sequence.
3. Add the naturally generating Ashen Wastes biome and volcanic terrain features.
4. Connect the biome-entry voice warning.
5. Add/verify textures, entity renderer and client assets.
6. Test in a clean Fabric 1.21.5 instance before sharing the JAR.

## Step 4 changes
- The stun item now calls a timed stun method on Redgrin Listener.
- The Listener's AI is restored after 100 ticks (5 seconds), avoiding the previous permanent AI-disable bug.
- The item description now accurately says it is an instant-use stun pulse, not a persistent pressure-plate trap.

## Build status
- Java 21 is available in the current workspace, but Gradle and a Gradle wrapper are not.
- A real Gradle compile has therefore not been run. The project still needs a build verification and further 1.21.5 API fixes.

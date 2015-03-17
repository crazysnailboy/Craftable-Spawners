# Craftable Spawners Mod for Minecraft

Craftable Spawners allows you to craft all types of mob spawner using items obtainable in survival vanilla Minecraft.

![Screenshot of Craftable Spawners](http://www.minecraftmods.com/wp-content/uploads/2013/07/craftablespawners1-1024x561.jpg)


## Download

[CraftableSpawners-3.0-pre1.jar](https://github.com/crazysnailboy/Craftable-Spawners/raw/master/builds/1.8/CraftableSpawners-3.0-pre1.jar)

*Requires Minecraft Forge 11.14.1.1336*


## Build Instructions

1. Execute `gradlew setupDecompWorkspace`. This sets up Forge and downloads the necessary libraries to build the mod. This might take some time, be patient.
    * You will generally only have to do this once until the Forge version in `build.properties` changes.
2. Execute `gradlew build`. If you did everything right, `BUILD SUCCESSFUL` will be displayed after it finishes. This should be relatively quick.
    * If you see `BUILD FAILED`, check the error output (it should be right around `BUILD FAILED`), fix everything (if possible), and try again.
3. Go to '~\CraftableSpawners\build\libs'.
    * You should see a `.jar` file named 'CraftableSpawners-<version>.jar`.
4. Copy the jar into your Minecraft mods folder, and you are done!




# Craftable Spawners

Craftable Spawners does what the name suggests and allows you to craft all types of mob spawner from items obtainable in vanilla minecraft.

![Screenshot of Craftable Spawners](http://www.minecraftmods.com/wp-content/uploads/2013/07/craftablespawners1-1024x561.jpg)


## Download

[modarch.jar](https://github.com/crazysnailboy/modarch/blob/master/bin/modarch.jar) for MC 1.8


## Build Instructions

1. Execute `gradlew setupDecompWorkspace`. This sets up Forge and downloads the necessary libraries to build Treecapitator. This might take some time, be patient.
    * You will generally only have to do this once until the Forge version in `build.properties` changes.
2. Execute `gradlew build`. If you did everything right, `BUILD SUCCESSFUL` will be displayed after it finishes. This should be relatively quick.
    * If you see `BUILD FAILED`, check the error output (it should be right around `BUILD FAILED`), fix everything (if possible), and try again.
3. Go to '~\CraftableSpawners\build\libs'.
    * You should see a `.jar` file named 'CraftableSpawners-<version>.jar`.
4. Copy the jar into your Minecraft mods folder, and you are done!




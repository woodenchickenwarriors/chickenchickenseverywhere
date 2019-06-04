# Build Minecraft Mod using JAVA

This mod uses mineforge and java to create a 1.11.2 minecraft mod.

## Compile

Run: "build.bat" and follow instructions.

## Lessons

https://www.udemy.com/minecraft-modding-java/learn/lecture/10603704#overview

https://skmedix.github.io/ForgeJavaDocs/javadoc/forge/1.11.2-13.20.0.2228/

https://github.com/Hetal728/MinecraftServer
https://github.com/TorchPowered/mc-dev/blob/1f81d9e8abb58c3a0d8454eb93c3c4f013a4d1bc/net/minecraft/

https://mcforge.readthedocs.io/en/latest/blocks/interaction/

## Gradle Tasks

```gradle
$ gradlew.bat tasks
To honour the JVM settings for this build a new JVM will be forked. Please consider using the daemon: https://docs.gradle.org/2.14/userguide/gradle_daemon.html.
This mapping 'snapshot_20161220' was designed for MC 1.11! Use at your own peril.
#################################################
         ForgeGradle 2.2-SNAPSHOT-3966cea
  https://github.com/MinecraftForge/ForgeGradle
#################################################
               Powered by MCP unknown
             http://modcoderpack.com
         by: Searge, ProfMobius, Fesh0r,
         R4wk, ZeuX, IngisKahn, bspkrs
#################################################
:tasks

------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Build tasks
-----------
apiClasses - Assembles api classes.
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build. [incubating]
wrapper - Generates Gradle wrapper files. [incubating]

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

ForgeGradle tasks
-----------------
cleanCache - Cleares the ForgeGradle cache. DONT RUN THIS unless you want a fresh start, or the dev tells you to.
genIntellijRuns - Generates the ForgeGradle run configurations for intellij Idea
runClient - Runs the Minecraft client
runServer - Runs the Minecraft Server
setupCiWorkspace - Sets up the bare minimum to build a minecraft mod. Ideally for CI servers
setupDecompWorkspace - DevWorkspace + the deobfuscated Minecraft source linked as a source jar.
setupDevWorkspace - CIWorkspace + natives and assets to run and test Minecraft

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'occmod'.
components - Displays the components produced by root project 'occmod'. [incubating]
dependencies - Displays all dependencies declared in root project 'occmod'.
dependencyInsight - Displays the insight into a specific dependency in root project 'occmod'.
help - Displays a help message.
model - Displays the configuration model of root project 'occmod'. [incubating]
projects - Displays the sub-projects of root project 'occmod'.
properties - Displays the properties of root project 'occmod'.
tasks - Displays the tasks runnable from root project 'occmod'.

IDE tasks
---------
cleanEclipse - Cleans all Eclipse files.
cleanIdea - Cleans IDEA project files (IML, IPR)
eclipse - Generates all Eclipse files.
idea - Generates IDEA project files (IML, IPR, IWS)

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.

Other tasks
-----------
cleanIdeaWorkspace
retromapApi
retromapMain
retromapReplacedApi
retromapReplacedTest
retromapTest

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

To see all tasks and more detail, run gradlew tasks --all

To see more detail about a task, run gradlew help --task <task>

```

## Coding notes:

Feather Falling on Block
https://github.com/geekman9097/Logisticraft-1.07.10/blob/b5a4427364dc51414d8b0e0874e95f7283ea6264/src/java/com/sinesection/logisticraft/block/BlockRubber.java

https://www.minecraftforge.net/forum/topic/16663-172-make-player-quotbouncequot-when-they-touch-block/

Flammable

https://github.com/ueyudiud/FLE/blob/1.10.2/src/main/java/fle/core/blocks/building/BlockWindow1.java

Dropping alternates (needs silktouch)

https://github.com/YoungGT/EasyCraft/blob/1417cfe1942d7a09fd7b66a7d8c11e417e29cffe/src/main/java/com/github/YoungGT/EasyCraft/block/BlockSlimeBlock.java
https://github.com/wuppy29/WuppyMods/blob/6c9a81662c1ce6b52994689766e458ea6bd36c5b/Slime%20Dungeon/sd_common/com/wuppy/slimedungeons/blocks/BlockSlimeBlock.java

## Other Setups

forge-1.11.2-13.20.1.2588-installer.jar

https://github.com/ethanpil/sheret/releases/download/1.0/sheret.zip

https://minecraft.gamepedia.com/Tutorials/Setting_up_a_Minecraft_Forge_server

## References

http://www.kegel.com/minecraft/
https://web.archive.org/web/20160810090356/http://www.minecraftforge.net/wiki/Basic_Modding


### Other Mods 

https://github.com/M4thG33k/Gemulation/blob/master/src/main/java/com/m4thg33k/gemulation/Gemulation.java  
https://github.com/Atraxi/PandemiCraft/tree/0cc18b1b9187693dc0d51fa7fe9f9763c52e6c4d/src/main/java/eviltalkingpie/pandemicraft  
https://github.com/LemADEC/AliensVsPredator-1/blob/e4b691efb5f5111348df8a0bd7c9bd8d5dd1eb89/src/main/java/org/avp/BlockHandler.java  
https://github.com/search?p=2&q=super%28Material.ROCK%29%3B+setResistance+slime&type=Code  

### 1.12

Got-Wood 1.12  
* https://github.com/MinecraftModDevelopmentMods/Got-Wood

### Mr. Crayfish 

Another older 1.7 walkthrough: (cheesemod)

* https://www.youtube.com/playlist?list=PLy11IosblXIExa6zzhjhYNXeBW9o6FhPU
* Cheese Mod - Compiling - https://www.google.com/search?q=compile+minecraft+mod&oq=compile+minecraft+mod&aqs=chrome..69i57j0.7978j1j1&sourceid=chrome&ie=UTF-8#kpvalbx=1

Another older 1.8 walkthrough:

* https://www.youtube.com/playlist?list=PLy11IosblXIFDFAT3wz_5Nve05wIVKFSJ

Other Mr. Crayfish stuff (current as 2019)

* https://www.youtube.com/watch?v=9OFz4yZtQzU
* https://www.planetminecraft.com/member/mr_crayfish/
* https://github.com/MrCrayfish?tab=repositories

## More Modern Stuff

### Modern Tutorials

minecraft mod tutorial 1.13.2

* https://www.youtube.com/playlist?list=PLiDUvCGH5WEUcxyUKxHpQpDuinaiNp3it

### Interesting mods

* https://github.com/SilentChaos512/Silent-Gear

## Fabric Loader/ Cross Version Modloader

Fabric Modloader 1.14.2/1.14.1 (Play Your Favorite Mods in the Newest Version)

* http://www.mc-mod.net/fabric-modloader/

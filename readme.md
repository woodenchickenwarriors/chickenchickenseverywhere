# Build Minecraft Mod using JAVA

This mod uses mineforge and java to create a 1.11.2 minecraft mod.

## Compile

Run: "build.bat" and follow instructions.

## Lessons

https://www.udemy.com/minecraft-modding-java/learn/lecture/10603704#overview

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

## Other Setups

forge-1.11.2-13.20.1.2588-installer.jar

https://github.com/ethanpil/sheret/releases/download/1.0/sheret.zip

https://minecraft.gamepedia.com/Tutorials/Setting_up_a_Minecraft_Forge_server

## References


https://web.archive.org/web/20160810090356/http://www.minecraftforge.net/wiki/Basic_Modding

Cheese Mod - Compiling

https://www.google.com/search?q=compile+minecraft+mod&oq=compile+minecraft+mod&aqs=chrome..69i57j0.7978j1j1&sourceid=chrome&ie=UTF-8#kpvalbx=1

https://github.com/M4thG33k/Gemulation/blob/master/src/main/java/com/m4thg33k/gemulation/Gemulation.java

@echo off
rem call gradlew build
rem move build\libs\modid-1.0.jar build\libs\occ-mod_v1.0_mc1.11.2.jar
echo "Download new Minecraft Mod 'occ-mod_v1.0_mc1.11.2.jar' from http://10.0.3.12:8100"
cd logs
..\sheret\sheret.exe -d ..\build\libs\ -f -p 8100
cd ..
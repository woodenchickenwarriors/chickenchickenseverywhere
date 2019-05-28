@echo off
call gradlew build
move build\libs\modid-1.0.jar build\libs\occ-mod_v1.0_mc1.11.2.jar
echo "Download new Minecraft Mod 'occ-mod_v1.0_mc1.11.2.jar' from http://10.0.3.12:8100"
sheret\sheret.exe -d build\libs\ -f sheret\host.log -p 8100
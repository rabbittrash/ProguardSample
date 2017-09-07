# Proguard Sample

鉴于这个bug不是没个项目上都能轻易复现，或者大型的项目上复现，但是这个bug看起来还是很头疼，为此为大家提供了一个可以复现的Sample，这个项目可能运行直接挂掉，这不是重点，重点是知道为什么这个bug怎么出现，怎么修复。

项目下载了可以直接运行./gradlew assembleDebug产生一个mapping文件，然后把mapping复制到app目录下，到Proguard rule打开-applymapping选项再次编译就会出现我们说的`Warning: ... is not being kept as ..., but remapped to ...`问题，即使不修改代码。

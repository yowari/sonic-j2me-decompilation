# Description

This project is a decompilation of the 2005 *Sonic The Hedgehog: Part One* which is the J2ME partial port of Sonic The Hedgehog.

# Prerequisites

To run and compile the game, you should install the following:

- [Java Development Kit 8 (JDK 8)](https://www.oracle.com/fr/java/technologies/downloads/#java8)
- [Java Wireless Toolkit or Java ME SDK (WTK)](https://www.oracle.com/java/technologies/javame-sdk-downloads.html)

Also, you need to add an environment variable **`WTK_HOME`** pointing to the wtk folder (example: `<WTK installation folder>\JavaME_SDK_CLDC\WTK2`).

# Developpement

Visual Studio Code is the recommanded editor to develop on this project.

> Since using **Language Support for Java** extension need Java 17, you need to install [**JDK 17**](https://www.oracle.com/fr/java/technologies/downloads/#java17). Once installed, update your environment variable `JAVA_HOME` to use *JDK 17* and add `JAVA_HOME_8` to use *JDK 8*. This is used by `build.bat` script to use the correct Java version to compile your app.

## Build and Run

- Run `.\build.bat`
- You should have `sonic.jar` at the workspace root folder. Update the `sonic.jad` with your text editor and update the `MIDlet-Jar-Size` to the jar size (on Windows: right click on `sonic.jar` -> properties -> there you have *size*).
- Launch the game with `.\run.bat`

## Debug

- Run `.\build.bat`
- Launch the emulator using `.\debug.bat`
- On vscode, in the `Run and Debug` launch the debug to attach the debugger (you can also press <kbd>F5</kbd>)

# Credit

- Iso Kilo works https://github.com/Iso-Kilo/Sonic-1-J2ME-Decompilation

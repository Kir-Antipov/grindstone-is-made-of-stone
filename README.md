![Logo](media/logo.png)

# Grindstone Is Made Of Stone

[![GitHub Build Status](https://img.shields.io/github/actions/workflow/status/Kir-Antipov/grindstone-is-made-of-stone/build-artifacts.yml?style=flat&logo=github&cacheSeconds=3600)](https://github.com/Kir-Antipov/grindstone-is-made-of-stone/actions/workflows/build-artifacts.yml)
[![Version](https://img.shields.io/github/v/release/Kir-Antipov/grindstone-is-made-of-stone?sort=date&style=flat&label=version&cacheSeconds=3600)](https://github.com/Kir-Antipov/grindstone-is-made-of-stone/releases/latest)
[![Modrinth](https://img.shields.io/badge/dynamic/json?color=00AF5C&label=Modrinth&query=title&url=https://api.modrinth.com/v2/project/grindstone-is-made-of-stone&style=flat&cacheSeconds=3600&logo=modrinth)](https://modrinth.com/mod/sync-fabric)
[![CurseForge](https://img.shields.io/badge/dynamic/json?color=%23f16436&label=CurseForge&query=title&url=https%3A%2F%2Fapi.cfwidget.com%2F494179&cacheSeconds=3600&logo=curseforge)](https://www.curseforge.com/minecraft/mc-mods/sync-fabric)
[![License](https://img.shields.io/github/license/Kir-Antipov/grindstone-is-made-of-stone?style=flat&cacheSeconds=36000)](https://github.com/Kir-Antipov/grindstone-is-made-of-stone/blob/HEAD/LICENSE.md)

If you ask anybody what a grindstone is, they will usually tell you that it's a sharpening **stone** used for grinding tools. A more meticulous person might even add that they are usually made of sandstone[¹](https://en.wikipedia.org/wiki/Grindstone#History_and_description), not just any stone.

However, Mojang, also known as The Biggest Consistency™ Fan out there, decided to set the grindstone's material to the same one they use for the anvil. While this might not seem like a big deal at first glance, it actually is when you remember that anvils cannot be pushed by pistons. Thus, [it's impossible to move a grindstone via a piston](https://bugs.mojang.com/browse/MC-140498) too, unlike any other workstation. Yet another win for consistency! Hip hip hooray!

This small mod fixes this inconsistency by changing the grindstone's material to `stone`.

![Hmm, yes, the floor here is made out of floor](media/floor.png)

----

## Installation

Requirements:
- Minecraft `1.19.x`
- Fabric Loader `>=0.14.0`

You can download the mod from:

- [GitHub Releases](https://github.com/Kir-Antipov/grindstone-is-made-of-stone/releases/latest) <sup><sub>(recommended)</sub></sup>
- [Modrinth](https://modrinth.com/mod/grindstone-is-made-of-stone)
- [CurseForge](https://www.curseforge.com/minecraft/mc-mods/grindstone-is-made-of-stone)
- [GitHub Actions](https://github.com/Kir-Antipov/grindstone-is-made-of-stone/actions/workflows/build-artifacts.yml) *(these builds may be unstable, but they represent the actual state of the development)*

## Building from sources

Requirements:
- JDK `17`

### Linux/MacOS

```cmd
git clone https://github.com/Kir-Antipov/grindstone-is-made-of-stone.git
cd grindstone-is-made-of-stone

chmod +x ./gradlew
./gradlew build
cd build/libs
```
### Windows

```cmd
git clone https://github.com/Kir-Antipov/grindstone-is-made-of-stone.git
cd grindstone-is-made-of-stone

gradlew build
cd build/libs
```
# Translatable Lore Mixin _(LocLore)_

[![CurseForge Downloads](https://cf.way2muchnoise.eu/loc-lore.svg)](https://legacy.curseforge.com/minecraft/mc-mods/loc-lore)
[![CurseForge Versions](https://cf.way2muchnoise.eu/versions/loc-lore.svg)](https://legacy.curseforge.com/minecraft/mc-mods/loc-lore)  
[![Support me on Patreon](https://img.shields.io/endpoint.svg?url=https%3A%2F%2Fshieldsio-patreon.vercel.app%2Fapi%3Fusername%3DKameiB%26type%3Dpatrons&style=flat)](https://patreon.com/KameiB)

This is a Mixin that adds support for the much needed `LocLore` NBT tag.  

Minecraft **1.12.2** supports the `LocName` tag, which allows users to replace an item's name with a custom, translatable one.  
But Vanilla doesn't have that support for the `Lore` tag. That's where the `LocLore` tag comes in handy!  

You can test with this command:  
`/give @p stone 1 0 {display:{LocName:"tile.stone.andesiteSmooth.name",LocLore:["tile.shulkerBoxGray.name"]}}`  

You'll need to add the [Mixin Bootstrap](https://www.curseforge.com/minecraft/mc-mods/mixinbootstrap) into your mods folder so any Mixin can load up!  

Remember to add your custom lang file and lang keys inside your resources folder or a Resource Pack!  
Example: `§cThis is a red text`  
About text formatting, check this [article](https://minecraft.fandom.com/wiki/Formatting_codes#Color_codes).  


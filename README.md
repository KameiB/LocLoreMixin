# Translatable Lore Mixin _(LocLore)_

This is a Mixin that adds support for the much needed `LocLore` NBT tag.  

Minecraft **1.12.2** supports the `LocName` tag, which allows users to replace an item's name with a custom, translatable one.  
But Vanilla doesn't have that support for the `Lore` tag. That's when the `LocLore` tag comes in handy!  

You can test with this command:  
`/give @p stone 1 0 {display:{LocName:"tile.stone.andesiteSmooth.name",LocLore:["tile.shulkerBoxGray.name"]}}`  

You'll need to add the [Mixin Bootstrap](https://www.curseforge.com/minecraft/mc-mods/mixinbootstrap) into your mods folder so any Mixin can load up!  

Remember to add your custom lang file and lang keys!  
About text formatting, check this [article](https://minecraft.fandom.com/wiki/Formatting_codes#Color_codes).  
Example: `§cThis is a red text`  

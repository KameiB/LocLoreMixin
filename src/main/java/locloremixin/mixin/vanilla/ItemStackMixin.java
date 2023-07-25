package locloremixin.mixin.vanilla;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin
        implements net.minecraftforge.common.capabilities.ICapabilitySerializable<NBTTagCompound>{
    /**
     * @author KameiB
     * @reason Adds "LocLore" NBT tag functionality.
     * The existing "LocName" tag allows users to replace an item's name with a custom, translatable one.
     * But Vanilla doesn't have that support for the Lore. That's where my "LocLore" tag comes in handy!
     */
    @Inject( method = "getTooltip", at = @At("RETURN") )
    public void locloremixin_vanillaItemStack_getTooltip(EntityPlayer playerIn, ITooltipFlag advanced, CallbackInfoReturnable<List<String>> cir) {
        List<String> list = cir.getReturnValue();
        ItemStack me = (ItemStack)((Object)this);

        // Checks if the item has the LocLore tag (inside "display") and adds the translated lang keys to the tooltip.
        if (me.hasTagCompound()){
            NBTTagCompound myTagCompound = me.getTagCompound();
            if (myTagCompound.hasKey("display", 10)){
                NBTTagCompound nbttagcompound1 = myTagCompound.getCompoundTag("display");
                if (nbttagcompound1.getTagId("LocLore") == 9){
                    NBTTagList nbttaglist4 = nbttagcompound1.getTagList("LocLore", 8);
                    if (!nbttaglist4.isEmpty()){
                        for (int l2 = 0; l2 < nbttaglist4.tagCount(); ++l2){
                            // Add the localized Lore at the beginning of the tooltip (just below the name), similar to addInformation
                            // I decided to format the Lore white in case the user didn't add formatting inside the lang file.
                            list.add(l2+1, TextFormatting.WHITE + I18n.translateToLocal(nbttaglist4.getStringTagAt(l2)));
                        }
                    }
                }
            }
        }
    }
}
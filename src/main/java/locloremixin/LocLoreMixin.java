package locloremixin;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = LocLoreMixin.MODID, version = LocLoreMixin.VERSION, name = LocLoreMixin.NAME)
public class LocLoreMixin {
    public static final String MODID = "locloremixin";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "LocLore Mixin";
    public static final Logger LOGGER = LogManager.getLogger();
}

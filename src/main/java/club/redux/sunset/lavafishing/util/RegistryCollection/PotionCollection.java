package club.redux.sunset.lavafishing.util.RegistryCollection;

import club.asynclab.web.BuildConstants;
import club.redux.sunset.lavafishing.potion.PotionLavaWalker;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PotionCollection {
    public static final DeferredRegister<Potion> POTION_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.POTIONS, BuildConstants.MOD_ID);
    public static final RegistryObject<PotionLavaWalker> POTION_LAVA_WALKER = POTION_DEFERRED_REGISTER.register("lava_walker", PotionLavaWalker::new);


}
package club.redux.sunset.lavafishing.util.RegistryCollection;

import club.asynclab.web.BuildConstants;
import club.redux.sunset.lavafishing.block.BlockPrometheusBounty;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockCollection {
    public static final DeferredRegister<Block> BLOCK_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildConstants.MOD_ID);

    public static final RegistryObject<Block> BLOCK_PROMETHEUS_BOUNTY = BLOCK_DEFERRED_REGISTER.register("prometheus_bounty", BlockPrometheusBounty::new);
}

package club.redux.sunset.lavafishing.item.fishes;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class ItemArowanaFish extends Item {
    public ItemArowanaFish() {
        super(new Properties()
                .food(
                        new FoodProperties.Builder()
                                .nutrition(3)
                                .saturationMod(0.6F)
                                .build()
                )
                .fireResistant()
        );
    }


}

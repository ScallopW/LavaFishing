package club.redux.sunset.lavafishing.effect

import net.minecraft.world.effect.MobEffect
import net.minecraft.world.effect.MobEffectCategory
import net.minecraft.world.entity.LivingEntity

class EffectBlessed : MobEffect(MobEffectCategory.NEUTRAL, 0xCC3300) {

    override fun applyEffectTick(pLivingEntity: LivingEntity, pAmplifier: Int) {
        pLivingEntity.apply {
            remainingFireTicks = 20
            heal(0.4f)
            setSharedFlagOnFire(true)
            if (isInWaterOrRain) {
                hurt(damageSources().onFire(), 0.2f)
            }
            hurt(damageSources().onFire(), 0.1f)
        }

        super.applyEffectTick(pLivingEntity, pAmplifier)
    }

    override fun isDurationEffectTick(pDuration: Int, pAmplifier: Int): Boolean {
        return true
    }
}
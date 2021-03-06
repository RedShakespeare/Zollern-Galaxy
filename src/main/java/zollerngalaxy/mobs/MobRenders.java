package zollerngalaxy.mobs;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import zollerngalaxy.mobs.entities.EntityFrostGiant;
import zollerngalaxy.mobs.entities.EntityGrayAlien;
import zollerngalaxy.mobs.entities.EntityMagmos;
import zollerngalaxy.mobs.entities.EntityMoolus;
import zollerngalaxy.mobs.entities.EntityOinkus;
import zollerngalaxy.mobs.entities.EntitySquidlus;
import zollerngalaxy.mobs.renders.RenderFrostGiant;
import zollerngalaxy.mobs.renders.RenderGrayAlien;
import zollerngalaxy.mobs.renders.RenderMagmos;
import zollerngalaxy.mobs.renders.RenderMoolus;
import zollerngalaxy.mobs.renders.RenderOinkus;
import zollerngalaxy.mobs.renders.RenderSquidlus;

public class MobRenders {
	
	public static void init() {
		RenderMob(EntityMoolus.class, RenderMoolus::new);
		RenderMob(EntityOinkus.class, RenderOinkus::new);
		RenderMob(EntitySquidlus.class, RenderSquidlus::new);
		RenderMob(EntityFrostGiant.class, RenderFrostGiant::new);
		RenderMob(EntityMagmos.class, RenderMagmos::new);
		RenderMob(EntityGrayAlien.class, RenderGrayAlien::new);
	}
	
	private static <T extends Entity> void RenderMob(Class<T> entityClass, IRenderFactory<? super T> renderFactory) {
		RenderingRegistry.registerEntityRenderingHandler(entityClass, renderFactory);
	}
	
}
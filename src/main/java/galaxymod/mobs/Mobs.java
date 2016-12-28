/*******************************************************************************
 * Copyright 2016 Zollern Wolf
 * - Zollern Galaxy
 * Galacticraft Add-On Mod
 * You CAN:
 * - Learn from it
 * - Use it to get ideas and concepts
 * You CAN'T:
 * - Redistribute it
 * - Claim it as your own
 * Steve Kung's "More Planets" mod was a big help.
 *******************************************************************************/

package galaxymod.mobs;

import galaxymod.mobs.entities.EntityGalaxyKnight;
import galaxymod.mobs.entities.EntityGrayAlien;
import galaxymod.mobs.entities.boss.EntityCrawlerBoss;
import galaxymod.mobs.entities.eden.EntityAlienSquid;
import galaxymod.mobs.entities.eden.EntityMoolus;
import galaxymod.mobs.entities.eden.EntityOinkus;
import galaxymod.mobs.entities.kriffon.EntityMagmos;
import galaxymod.mobs.entities.xathius.slimes.EntitySlimeRaspberry;
import galaxymod.mobs.entities.zollus.EntityFrostGiant;
import galaxymod.utils.ModInfo;
import galaxymod.utils.ZGHelper;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.common.registry.EntityRegistry;

public class Mobs {
	
	public static int startEntityId = 300;
	static int totalMobs = 0;
	
	public static void init() {
		
		// Gray Alien
		registerEntity(EntityGrayAlien.class, "grayalien", 0xeeeeee, 0x000000);
		
		// Moolus
		registerEntity(EntityMoolus.class, "moolus", 0x008b00, 0xeeeeee);
		
		// Oinkus
		registerEntity(EntityOinkus.class, "oinkus", 0x009f00, 0xeeffee);
		
		// Alien Squid
		registerEntity(EntityAlienSquid.class, "aliensquid", 0x0099ff, 0xeeeeee);
		
		// Galaxy Knight
		registerEntity(EntityGalaxyKnight.class, "galaxyknight", 0x444444,
				0x8b008b);
		
		// Crawler
		registerEntity(EntityCrawlerBoss.class, "crawler", 0xdddddd, 0x444444);
		
		// Frost Giant
		registerEntity(EntityFrostGiant.class, "frostgiant", 0x0099ff, 0x3399ff);
		
		// Magmos
		registerEntity(EntityMagmos.class, "magmos", 0x8b0000, 0xff0000);
		
		// Galaxy Slimes
		
		// (Raspberry)
		registerEntity(EntitySlimeRaspberry.class, "slime.raspberry", 0x000000,
				0x0099ff);
		
		ZGHelper.echo("Loaded a total of " + totalMobs + " new mobs.");
	}
	
	public static void registerEntity(Class<? extends EntityLiving> entity,
			String entityName, int entityPrimaryColor, int entitySecondaryColor) {
		int uniqueEntityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entity, ModInfo.MODID + "_"
				+ entityName, uniqueEntityId);
		registerEntityEgg(entity, entityPrimaryColor, entitySecondaryColor);
		totalMobs++;
	}
	
	public static void registerEntityEgg(Class<? extends EntityLiving> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
				secondaryColor));
	}
	
	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		} while (EntityList.getStringFromID(startEntityId) != null);
		return startEntityId;
	}
	
}
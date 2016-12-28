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

package galaxymod.core.galaxies;

public class GalaxyList {
	
	public static CoreGalaxy milkyWay = new CoreGalaxy("milkyWay");
	public static CoreGalaxy zollern = new CoreGalaxy("zollern");
	
	public static String getGalaxy(CoreGalaxy g) {
		return g.getUnlocalizedGalaxyName();
	}
}
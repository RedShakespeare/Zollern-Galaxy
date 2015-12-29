/*******************************************************************************
 * Copyright 2015 Zollern Wolf
 * - Project Nova / Nova Galactic Final Frontier
 * Galacticraft Add-On Mod
 * You CAN:
 * - Learn from it
 * - Use it to get ideas and concepts
 * You CAN'T:
 * - Redistribute it
 * - Claim it as your own
 *******************************************************************************/

package galaxymod.worldgen.eden.village;

import galaxymod.blocks.BlockList;
import galaxymod.worldgen.NGWorldGenStructureCore;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class VillageHouseOne extends NGWorldGenStructureCore {
	
	public VillageHouseOne() {
	}
	
	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {
		super.generate(world, rand, i, j, k);
		// NovaHelper.echo("Attempting to spawn village house one..");
		
		if (!LocationIsValidSpawn(world, i, j, k)) {
			// NovaHelper.echo("Failed");
			return false;
		}
		
		j = j - 2;
		
		BiomeGenBase currentBiome = world.getBiomeGenForCoords(i, k);
		world.setBlock(i + 0, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 8, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 9, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 10, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 11, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 12, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 13, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 14, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 15, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 16, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 0, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 8, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 9, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 10, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 11, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 12, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 13, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 14, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 15, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 16, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 1, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 8, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 9, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 10, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 11, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 12, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 13, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 14, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 15, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 16, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 2, j + 0, k + 24, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 8, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 9, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 10, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 11, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 12, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 13, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 14, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 15, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 16, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 3, j + 0, k + 24, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 8, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 9, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 10, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 11, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 12, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 13, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 14, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 15, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 16, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 4, j + 0, k + 24, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 5, j + 0, k + 24, currentBiome.topBlock);
		
		world.setBlock(i + 5, j + 1, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 1, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 2, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 3, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 3, k + 9, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 3, k + 10, BlockList.edenGlass);
		world.setBlock(i + 5, j + 3, k + 11, BlockList.edenGlass);
		world.setBlock(i + 5, j + 3, k + 12, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 3, k + 13, BlockList.edenGlass);
		world.setBlock(i + 5, j + 3, k + 14, BlockList.edenGlass);
		world.setBlock(i + 5, j + 3, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 3, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 4, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 4, k + 9, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 4, k + 10, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 4, k + 11, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 4, k + 12, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 4, k + 13, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 4, k + 14, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 4, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 4, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 5, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 5, k + 9, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 5, k + 10, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 5, k + 11, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 5, k + 12, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 5, k + 13, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 5, k + 14, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 5, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 5, j + 5, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 5, j + 6, k + 16, BlockList.edenCobbleRock);
		
		world.setBlock(i + 6, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 6, j + 0, k + 24, currentBiome.topBlock);
		
		world.setBlock(i + 6, j + 1, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 1, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 2, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 2, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 2, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 3, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 3, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 4, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 4, k + 9, Blocks.bookshelf);
		world.setBlock(i + 6, j + 4, k + 10, Blocks.bookshelf);
		world.setBlock(i + 6, j + 4, k + 11, Blocks.bookshelf);
		world.setBlock(i + 6, j + 4, k + 12, Blocks.bookshelf);
		world.setBlock(i + 6, j + 4, k + 13, Blocks.bookshelf);
		world.setBlock(i + 6, j + 4, k + 14, Blocks.bookshelf);
		world.setBlock(i + 6, j + 4, k + 15, Blocks.bookshelf);
		world.setBlock(i + 6, j + 4, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 9, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 10, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 11, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 12, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 13, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 14, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 5, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 6, j + 6, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 6, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 6, j + 7, k + 16, BlockList.edenCobbleRock);
		
		world.setBlock(i + 7, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 7, j + 0, k + 24, currentBiome.topBlock);
		
		world.setBlock(i + 7, j + 1, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 1, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 2, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 2, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 3, k + 8, BlockList.edenGlass);
		world.setBlock(i + 7, j + 3, k + 16, BlockList.edenGlass);
		world.setBlock(i + 7, j + 4, k + 8, BlockList.edenGlass);
		world.setBlock(i + 7, j + 4, k + 16, BlockList.edenGlass);
		world.setBlock(i + 7, j + 5, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 7, j + 5, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 7, j + 6, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 6, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 7, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 7, j + 8, k + 16, currentBiome.topBlock);
		
		world.setBlock(i + 8, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 8, j + 0, k + 24, currentBiome.topBlock);
		
		world.setBlock(i + 8, j + 1, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 1, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 2, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 2, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 3, k + 8, BlockList.edenGlass);
		world.setBlock(i + 8, j + 3, k + 16, BlockList.edenGlass);
		world.setBlock(i + 8, j + 4, k + 8, BlockList.edenGlass);
		world.setBlock(i + 8, j + 4, k + 16, BlockList.edenGlass);
		world.setBlock(i + 8, j + 5, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 8, j + 5, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 8, j + 6, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 6, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 7, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 8, j + 8, k + 16, currentBiome.topBlock);
		
		world.setBlock(i + 9, j + 0, k + 0, currentBiome.topBlock);
		NGEdenVillageHelper.spawnAlien(world, i + 9, j + 1, k + 0, 1);
		world.setBlock(i + 9, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 9, j + 0, k + 24, currentBiome.topBlock);
		
		world.setBlock(i + 9, j + 1, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 1, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 2, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 2, k + 15, Blocks.crafting_table);
		world.setBlock(i + 9, j + 2, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 3, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 3, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 4, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 4, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 8, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 9, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 10, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 11, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 12, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 13, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 14, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 5, k + 16, BlockList.edenWoodPlanks);
		world.setBlock(i + 9, j + 6, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 6, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 9, j + 7, k + 16, BlockList.edenCobbleRock);
		
		world.setBlock(i + 10, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 10, j + 0, k + 24, currentBiome.topBlock);
		
		world.setBlock(i + 10, j + 1, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 1, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 2, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 3, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 3, k + 10, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 3, k + 11, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 3, k + 12, BlockList.edenGlass);
		world.setBlock(i + 10, j + 3, k + 13, BlockList.edenGlass);
		world.setBlock(i + 10, j + 3, k + 14, BlockList.edenGlass);
		world.setBlock(i + 10, j + 3, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 3, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 4, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 4, k + 9, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 4, k + 10, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 4, k + 11, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 4, k + 12, BlockList.edenGlass);
		world.setBlock(i + 10, j + 4, k + 13, BlockList.edenGlass);
		world.setBlock(i + 10, j + 4, k + 14, BlockList.edenGlass);
		world.setBlock(i + 10, j + 4, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 4, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 5, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 5, k + 9, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 5, k + 10, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 5, k + 11, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 5, k + 12, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 5, k + 13, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 5, k + 14, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 5, k + 15, BlockList.edenWoodPlanks);
		world.setBlock(i + 10, j + 5, k + 16, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 8, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 9, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 10, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 11, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 12, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 13, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 14, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 15, BlockList.edenCobbleRock);
		world.setBlock(i + 10, j + 6, k + 16, BlockList.edenCobbleRock);
		
		world.setBlock(i + 11, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 11, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 11, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 11, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 11, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 11, j + 0, k + 24, currentBiome.topBlock);
		world.setBlock(i + 12, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 12, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 12, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 12, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 12, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 12, j + 0, k + 24, currentBiome.topBlock);
		world.setBlock(i + 13, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 13, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 13, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 13, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 13, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 13, j + 0, k + 24, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 4, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 10, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 11, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 13, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 14, j + 0, k + 24, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 0, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 1, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 2, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 3, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 5, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 6, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 7, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 8, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 9, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 10, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 11, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 12, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 13, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 14, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 15, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 17, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 18, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 19, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 20, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 21, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 22, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 23, currentBiome.topBlock);
		world.setBlock(i + 15, j + 0, k + 24, currentBiome.topBlock);
		// NovaHelper.echo("Success! At: " + i + " " + j + " " + k);
		// NovaHelper.echo("Preparing to spawn next house...");
		(new VillageHouseTwo()).generate(world, rand, i, j, k);
		return true;
	}
}
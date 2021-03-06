package zollerngalaxy.core.enums;

public enum EnumHarvestLevelZG {
	
	WOOD(0), STONE(1), IRON(2), DIAMOND(3), COBALT(4), EVENIUM(5), VIRINIUM(6), AMARANTH(7), AZURITE(8), ZOLLERNIUM(9), OMNI(
			10);
	
	protected int harvestLevel = 2;
	
	private EnumHarvestLevelZG(int par1HarvestLevel) {
		this.harvestLevel = par1HarvestLevel;
	}
	
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	
}
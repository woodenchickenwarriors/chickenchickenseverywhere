package occmod.init.blocks;

import occmod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

//MAKING YOUR BLOCK ACT LIKE A BLOCK

public class CustomOre extends Block {

    public CustomOre(String name, float hardness, float resistance, int harvestLevel) {

    	super(Material.ROCK);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);

        setHarvestLevel("pickaxe", harvestLevel);
    }

}
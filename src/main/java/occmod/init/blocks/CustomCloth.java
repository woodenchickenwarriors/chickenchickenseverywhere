package occmod.init.blocks;

import occmod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

//MAKING YOUR BLOCK ACT LIKE A BLOCK

public class CustomCloth extends Block {

    public CustomCloth(String name, float hardness, float resistance, int harvestLevel) {

    	super(Material.CLOTH);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);

        setHarvestLevel("pickaxe", harvestLevel);
    }

    @Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
    	//fall(float distance, float damageMultiplier) 
    	if (fallDistance != 0.0f) {
    		fallDistance = fallDistance / 3.0f;
    	}
		super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
	}
    
    
    /**
     * Called when an Entity lands on this Block. This method *must* update motionY because the entity will not do that
     * on its own
     */
    @Override
    public void onLanded(World worldIn, Entity entityIn)
    {
        if (entityIn.isSneaking())
        {
            super.onLanded(worldIn, entityIn);
        }
        else if (entityIn.motionY < 0.0D)
        {
            entityIn.motionY = -entityIn.motionY;

            if (!(entityIn instanceof EntityLivingBase))
            {
                entityIn.motionY *= 0.8D;
            }
        }
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block)
     */
    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        if (Math.abs(entityIn.motionY) < 0.1D && !entityIn.isSneaking())
        {
            double d0 = 0.4D + Math.abs(entityIn.motionY) * 0.2D;
            entityIn.motionX *= d0;
            entityIn.motionZ *= d0;
        }

        super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
    }
    

}
package occmod.init;

import occmod.Main;
import occmod.Reference;
import occmod.init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

//initialize block

public class BlockInit {

/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    //GIVING YOUR BLOCK A CRAFTING RECIPE
    
        public static void Recipitate() {
            GameRegistry.addRecipe(new ItemStack(chicken_block, 1), new Object[]
                    {
                            "YYY",
                            "XXX",
                            "YYY",
                        'Y', ItemInit.chicken_ingot,
                        'X', Blocks.SAND,
                    }); 
        }
        
    // -----------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
        
    //TELLING MINECRAFT ABOUT YOUR BLOCK    
        
        public static Block chicken_block;
    
        public static void init() {
            //chicken_block = new CustomOre("chicken_block", hardness, resistance, harvestLevel);
        	chicken_block = new CustomOre("chicken_block", 3.0F, 4.0F, 2);
        }
        
    // -----------------------------------
        
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // PUT YOUR BLOCK IN MINECRAFT WITH ICONS AND REGISTERING IT
        
    public static void register() {

        registerBlock(chicken_block);
        
    }
    
    public static void registerBlock(Block block) {
        GameRegistry.register(block);
        block.setCreativeTab(CreativeTabs.DECORATIONS);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
        
        }
    
    public static void registerRenders() {
        registerRender(chicken_block);
    }
    
    public static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + 
        block.getUnlocalizedName().substring(5)));
        
        
    }
    
    //------------------------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
}
       
   
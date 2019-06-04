package occmod.init;

import occmod.Main;
import occmod.Reference;
import occmod.init.blocks.CustomCloth;
import occmod.init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
            GameRegistry.addRecipe(new ItemStack(pillow_block, 1), new Object[]
                    {
                            "YY",
                            "YY",
                        'Y', Items.FEATHER,
                    });
            ItemStack inkSack = new ItemStack(Items.DYE, 1, 0);
            ItemStack redDye = new ItemStack(Items.DYE, 1, 1);
            ItemStack cactusGreen = new ItemStack(Items.DYE, 1, 2);
            ItemStack cocoaBeans = new ItemStack(Items.DYE, 1, 3);
            ItemStack lapisLazula = new ItemStack(Items.DYE, 1, 4);
            ItemStack purpleDye = new ItemStack(Items.DYE, 1, 5);
            ItemStack cyanDye = new ItemStack(Items.DYE, 1, 6);
            ItemStack lightGrayDye = new ItemStack(Items.DYE, 1, 7);
            ItemStack grayDye = new ItemStack(Items.DYE, 1, 8);
            ItemStack pinkDye = new ItemStack(Items.DYE, 1, 9);
            ItemStack limeDye = new ItemStack(Items.DYE, 1, 10);
            ItemStack dandelionYellow = new ItemStack(Items.DYE, 1, 11);
            ItemStack lightBlueDye = new ItemStack(Items.DYE, 1, 12);
            ItemStack magentaDye = new ItemStack(Items.DYE, 1, 13);
            ItemStack orangeDye = new ItemStack(Items.DYE, 1, 14);
            ItemStack boneMeal = new ItemStack(Items.DYE, 1, 15); 
            
            
            
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_black, 1), new Object[] {inkSack, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_red, 1), new Object[] { redDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_green, 1), new Object[] {cactusGreen, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_brown, 1), new Object[] {cocoaBeans, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_blue, 1), new Object[] {lapisLazula, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_purple, 1), new Object[] {purpleDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_cyan, 1), new Object[] {cyanDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_silver, 1), new Object[] {lightGrayDye,  BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_gray, 1), new Object[] {grayDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_pink, 1), new Object[] {pinkDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_lime, 1), new Object[] {limeDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_yellow, 1), new Object[] {dandelionYellow, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_light_blue, 1), new Object[] {lightBlueDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_magenta, 1), new Object[] {magentaDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_orange, 1), new Object[] {orangeDye, BlockInit.pillow_block,});
            GameRegistry.addShapelessRecipe(new ItemStack(pillow_block_white, 1), new Object[] {boneMeal, BlockInit.pillow_block,});
            
            
        }

    // -----------------------------------

/** ------------------------------------------------------------------------------------------------------------------------------- **/

    //TELLING MINECRAFT ABOUT YOUR BLOCK
        public static Block chicken_block;
        public static Block pillow_block;
        public static Block pillow_block_black;
        public static Block pillow_block_blue;
        public static Block pillow_block_brown;
        public static Block pillow_block_cyan;
        public static Block pillow_block_gray;
        public static Block pillow_block_green;
        public static Block pillow_block_light_blue;
        public static Block pillow_block_lime;
        public static Block pillow_block_magenta;
        public static Block pillow_block_orange;
        public static Block pillow_block_pink;
        public static Block pillow_block_purple;
        public static Block pillow_block_red;
        public static Block pillow_block_silver;
        public static Block pillow_block_white;
        public static Block pillow_block_yellow;

        public static void init() {
            //chicken_block = new CustomOre("chicken_block", hardness, resistance, harvestLevel);
            chicken_block = new CustomOre("chicken_block", 3.0F, 4.0F, 2);
            pillow_block = new CustomCloth("pillow_block", 1.0F, 4.0F, 1);
            pillow_block_black = new CustomCloth("pillow_block_black", 1.0F, 4.0F, 1);
            pillow_block_blue = new CustomCloth("pillow_block_blue", 1.0F, 4.0F, 1);
            pillow_block_brown = new CustomCloth("pillow_block_brown", 1.0F, 4.0F, 1);
            pillow_block_cyan = new CustomCloth("pillow_block_cyan", 1.0F, 4.0F, 1);
            pillow_block_gray = new CustomCloth("pillow_block_gray", 1.0F, 4.0F, 1);
            pillow_block_green = new CustomCloth("pillow_block_green", 1.0F, 4.0F, 1);
            pillow_block_light_blue = new CustomCloth("pillow_block_light_blue", 1.0F, 4.0F, 1);
            pillow_block_lime = new CustomCloth("pillow_block_lime", 1.0F, 4.0F, 1);
            pillow_block_magenta = new CustomCloth("pillow_block_magenta", 1.0F, 4.0F, 1);
            pillow_block_orange = new CustomCloth("pillow_block_orange", 1.0F, 4.0F, 1); 
            pillow_block_pink = new CustomCloth("pillow_block_pink", 1.0F, 4.0F, 1);
            pillow_block_purple = new CustomCloth("pillow_block_purple", 1.0F, 4.0F, 1);
            pillow_block_red = new CustomCloth("pillow_block_red", 1.0F, 4.0F, 1);
            pillow_block_silver = new CustomCloth("pillow_block_silver", 1.0F, 4.0F, 1);
            pillow_block_white = new CustomCloth("pillow_block_white", 1.0F, 4.0F, 1);
            pillow_block_yellow = new CustomCloth("pillow_block_yellow", 1.0F, 4.0F, 1);
        }

    // -----------------------------------

/** ------------------------------------------------------------------------------------------------------------------------------- **/

    // PUT YOUR BLOCK IN MINECRAFT WITH ICONS AND REGISTERING IT

    public static void register() {

        registerBlock(chicken_block);
        registerBlock(pillow_block);
        registerBlock(pillow_block_black);
        registerBlock(pillow_block_blue);
        registerBlock(pillow_block_brown);
        registerBlock(pillow_block_cyan);
        registerBlock(pillow_block_gray);
        registerBlock(pillow_block_green);
        registerBlock(pillow_block_light_blue);
        registerBlock(pillow_block_lime);
        registerBlock(pillow_block_magenta);
        registerBlock(pillow_block_orange);
        registerBlock(pillow_block_pink);
        registerBlock(pillow_block_purple);
        registerBlock(pillow_block_red);
        registerBlock(pillow_block_silver);
        registerBlock(pillow_block_white);
        registerBlock(pillow_block_yellow);
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
        registerRender(pillow_block);
        registerRender(pillow_block_black);
		registerRender(pillow_block_blue);
		registerRender(pillow_block_brown);
		registerRender(pillow_block_cyan);
		registerRender(pillow_block_gray);
		registerRender(pillow_block_green);
		registerRender(pillow_block_light_blue);
		registerRender(pillow_block_lime);
		registerRender(pillow_block_magenta);
		registerRender(pillow_block_orange);
		registerRender(pillow_block_pink);
		registerRender(pillow_block_purple);
		registerRender(pillow_block_red);
		registerRender(pillow_block_silver);
		registerRender(pillow_block_white);
		registerRender(pillow_block_yellow);

    }
    public static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + 
        block.getUnlocalizedName().substring(5)));
    }

    //------------------------------------------------

/** ------------------------------------------------------------------------------------------------------------------------------- **/

}
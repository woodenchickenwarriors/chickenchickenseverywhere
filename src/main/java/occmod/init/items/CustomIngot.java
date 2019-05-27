package occmod.init.items;

import occmod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//MAKING YOUR ITEM EXTEND MINECRAFT'S ITEM CLASS

public class CustomIngot extends Item {
    
    public CustomIngot(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }
    
//***
    
    
}

package occmod.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import occmod.init.ItemInit;

public class RegistryHandler {
    
    public static void Client() {
    	ItemInit.register();
    }
    
    public static void Common() {
    	ItemInit.init();
    	ItemInit.Recipitate();
    	
    }
    
}

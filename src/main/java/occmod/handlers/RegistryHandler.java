package occmod.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import occmod.init.BlockInit;
import occmod.init.ItemInit;
import occmod.init.ToolInit;

public class RegistryHandler {
    
    public static void Client() {
    	ItemInit.register();
    	BlockInit.registerRenders();
    	ToolInit.register();
    }
    
    public static void Common() {
    	ItemInit.init();
    	BlockInit.init();
    	ToolInit.init();
    	
    	BlockInit.register();
    	
    	ItemInit.Recipitate();
    	BlockInit.Recipitate();
    	ToolInit.Recipitate();
    	
    }
    
}

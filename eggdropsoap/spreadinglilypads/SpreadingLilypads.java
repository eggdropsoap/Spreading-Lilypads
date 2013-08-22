package eggdropsoap.spreadinglilypads;

import java.lang.reflect.*;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="SpreadingLilypads", name="Spreading Lilypads", version="0.1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class SpreadingLilypads {

	public Block spreadingLilyPad = (new BlockSpreadingLilyPad(500)) // FIXME: config for temp ID
			.setHardness(0.0F).setStepSound(Block.soundGrassFootstep)
			.setUnlocalizedName("waterlily")
			.func_111022_d("waterlily")
			.setCreativeTab(CreativeTabs.tabDecorations);
	
    // The instance of your mod that Forge uses.
    @Instance("SpreadingLilypads")
    public static SpreadingLilypads instance;
   
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="eggdropsoap.spreadinglilypads.client.ClientProxy", serverSide="eggdropsoap.spreadinglilypads.CommonProxy")
    public static CommonProxy proxy;
   
    
    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }
   
    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
                      
            Block.blocksList[Block.waterlily.blockID] = spreadingLilyPad;
            

    }
   
    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}

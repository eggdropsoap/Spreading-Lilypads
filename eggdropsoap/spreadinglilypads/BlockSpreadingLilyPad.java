package eggdropsoap.spreadinglilypads;

import java.util.Random;

import net.minecraft.block.BlockLilyPad;
import net.minecraft.world.World;

public class BlockSpreadingLilyPad extends BlockLilyPad
{

	protected BlockSpreadingLilyPad(int id)
	{
		super(id);
	}
	
	// based on reading the code in net.minecraft.block.BlockMushroom
    public void updateTick(World world, int blockX, int blockY, int blockZ, Random rng)
    {
    	System.out.printf("Received update tick at %d %d %d\n", blockX, blockY, blockZ);
    	if (true)//rng.nextInt(25) == 0)
    	{
//    		System.out.println("Entering spreading attempt");
    		int checkDistance = 1;
    		int lilyCap = 5;
    		int i;
    		int j;
    		
    		// First count the number of Lily Pads in range and return if too many
    		for (i = blockX - checkDistance; i <= blockX + checkDistance; ++i)
    		{
        		for (j = blockZ - checkDistance; j <= blockZ + checkDistance; ++j)
        		{
        			if (world.getBlockId(i, blockY, j) == this.blockID)
        			{
        				--lilyCap;
        				if (lilyCap <= 0)
        				{
        					System.out.println("Too many lilies in range");
        					return;
        				}
        			}
        		}
    			
    		}
    		
    		int newX; 
    		int newZ;
    		
//    		System.out.printf("Trying to spread to %d %d %d\n", newX, blockY, newZ);
    		
    		for (int attempts = 0; attempts < 4; ++attempts)	// try four times to spread
    		{
        		newX = blockX + rng.nextInt(3) - 1;	// pick one of [-1, 0, 1] 
        		newZ = blockZ + rng.nextInt(3) - 1;	// ditto

        		if (world.isAirBlock(newX, blockY, newZ) && this.canBlockStay(world, newX, blockY, newZ))
    			{
//    				System.out.println("This location is a valid target");

    				blockX = newX;
    				blockZ = newZ;
    				
    				System.out.println("Spreading!");
    				
    				// set the block location to a new Lily Pad with no metadata and a client update
        			world.setBlock(blockX, blockY, blockZ, this.blockID, 0, 2);

        			break;
    			}    			
    		}    			
    	}
    }
	
	

}

package ec3.common.world;

import java.util.Random;

import ec3.common.block.BlocksCore;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDreadCacti extends WorldGenerator
{

    public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_)
    {
        for (int l = 0; l < 10; ++l)
        {
            int i1 = p_76484_3_ + p_76484_2_.nextInt(8) - p_76484_2_.nextInt(8);
            int j1 = p_76484_4_ + p_76484_2_.nextInt(4) - p_76484_2_.nextInt(4);
            int k1 = p_76484_5_ + p_76484_2_.nextInt(8) - p_76484_2_.nextInt(8);

            if (p_76484_1_.isAirBlock(i1, j1, k1))
            {
                int l1 = 1 + p_76484_2_.nextInt(p_76484_2_.nextInt(3) + 1);

                for (int i2 = 0; i2 < l1; ++i2)
                {
                    if (Blocks.cactus.canBlockStay(p_76484_1_, i1, j1 + i2, k1))
                    {
                        p_76484_1_.setBlock(i1, j1 + i2, k1, BlocksCore.cacti, 0, 2);
                    }
                }
            }
        }

        return true;
    }
}
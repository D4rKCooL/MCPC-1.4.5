package cpw.mods.fml.common.modloader;

import java.util.Random;

import net.minecraft.server.ChunkProviderGenerate;
import net.minecraft.server.ChunkProviderHell;
import net.minecraft.server.IChunkProvider;
import net.minecraft.server.World;
import cpw.mods.fml.common.IWorldGenerator;

public class ModLoaderWorldGenerator implements IWorldGenerator
{
    private BaseModProxy mod;

    public ModLoaderWorldGenerator(BaseModProxy mod)
    {
        this.mod = mod;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if (chunkGenerator instanceof ChunkProviderGenerate)
        {
            mod.generateSurface(world, random, chunkX << 4, chunkZ << 4);
        }
        else if (chunkGenerator instanceof ChunkProviderHell)
        {
            mod.generateNether(world, random, chunkX << 4, chunkZ << 4);
        }
    }
}

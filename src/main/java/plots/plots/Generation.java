package plots.plots;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class Generation extends ChunkGenerator {
    public static ChunkData generateChunk(int chunkX, int chunkZ, World world, int height, Material blocksUnderHeight, Material blocksOnHeight, int plotSize, Material plotBorder, int pathSize, Material path) {
        ChunkData chunk = gene

        int x = chunkX * 16;
        int z = chunkZ * 16;
        if(x >= 0) { x -= 1; } else { x += 1; }
        if(z >= 0) { z -= 1; } else { z += 1; }
        for(int allX = 0; allX < 16; allX++) {
            for(int allY = 0; allY < height; allY++) {
                for(int allZ = 0; allZ < 16; allZ++) {

                }
            }
        }
    }
}

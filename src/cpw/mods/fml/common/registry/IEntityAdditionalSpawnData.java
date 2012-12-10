package cpw.mods.fml.common.registry;

import mcpc.com.google.common.io.ByteArrayDataInput;
import mcpc.com.google.common.io.ByteArrayDataOutput;

/**
 * A interface for Entities that need extra information to be communicated
 * between the server and client when they are spawned.
 */
public interface IEntityAdditionalSpawnData
{
    /**
     * Called by the server when constructing the spawn packet.
     * Data should be added to the provided stream.
     *
     * @param data The packet data stream
     */
    public void writeSpawnData(ByteArrayDataOutput data);

    /**
     * Called by the client when it receives a Entity spawn packet.
     * Data should be read out of the stream in the same way as it was written.
     *
     * @param data The packet data stream
     */
    public void readSpawnData(ByteArrayDataInput data);
}

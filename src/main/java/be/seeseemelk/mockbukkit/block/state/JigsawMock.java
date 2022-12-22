package be.seeseemelk.mockbukkit.block.state;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Jigsaw;
import org.jetbrains.annotations.NotNull;

/**
 * Mock implementation of a {@link Jigsaw}.
 *
 * @see TileStateMock
 */
public class JigsawMock extends TileStateMock implements Jigsaw
{

	/**
	 * Constructs a new {@link JigsawMock} for the provided {@link Material}.
	 * Only supports {@link Material#JIGSAW}
	 *
	 * @param material The material this state is for.
	 */
	public JigsawMock(@NotNull Material material)
	{
		super(material);
		checkType(material, Material.JIGSAW);
	}

	/**
	 * Constructs a new {@link JigsawMock} for the provided {@link Block}.
	 * Only supports {@link Material#JIGSAW}
	 *
	 * @param block The block this state is for.
	 */
	protected JigsawMock(@NotNull Block block)
	{
		super(block);
		checkType(block, Material.JIGSAW);
	}

	/**
	 * Constructs a new {@link JigsawMock} by cloning the data from an existing one.
	 *
	 * @param state The state to clone.
	 */
	protected JigsawMock(@NotNull JigsawMock state)
	{
		super(state);
	}

	@Override
	public @NotNull BlockState getSnapshot()
	{
		return new JigsawMock(this);
	}

}

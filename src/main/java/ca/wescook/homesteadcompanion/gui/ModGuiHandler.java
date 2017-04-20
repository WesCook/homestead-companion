package ca.wescook.homesteadcompanion.gui;

import ca.wescook.homesteadcompanion.nutrition.NutritionGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler {
	// GUI IDs
	public static final int NUTRITION_GUI = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == NUTRITION_GUI)
			return new NutritionGui();
		return null;
	}
}
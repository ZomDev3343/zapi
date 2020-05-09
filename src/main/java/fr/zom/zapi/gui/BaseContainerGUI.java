package fr.zom.zapi.gui;

import fr.zom.zapi.containers.BaseContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;

public abstract class BaseContainerGUI extends ContainerScreen<BaseContainer>
{
	public BaseContainerGUI(BaseContainer screenContainer, PlayerInventory inv, ITextComponent titleIn)
	{
		super(screenContainer, inv, titleIn);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{

	}
}

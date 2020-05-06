package fr.zom.zapi.gui;

import fr.zom.zapi.container.BaseContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.text.ITextComponent;

public class BaseContainerGui extends ContainerScreen<BaseContainer>
{

	private final PlayerInventory inv;
	private final IInventory inventory;

	public BaseContainerGui(BaseContainer screenContainer, PlayerInventory inv, IInventory inventory, ITextComponent titleIn)
	{
		super(screenContainer, inv, titleIn);

		this.inv = inv;
		this.inventory = inventory;

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{

	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{

	}
}

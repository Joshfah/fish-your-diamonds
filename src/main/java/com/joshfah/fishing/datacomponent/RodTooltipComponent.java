package com.joshfah.fishing.datacomponent;

import com.joshfah.fishing.FishYourDiamonds;
import com.joshfah.fishing.ScreenUtils;
import com.joshfah.fishing.item.custom.WeirdRodItem;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.tooltip.TooltipComponent;

import java.lang.reflect.Field;

public class RodTooltipComponent implements ClientTooltipComponent {

    public static final ScreenUtils.Image TEXTURE = new ScreenUtils.Image(Identifier.fromNamespaceAndPath(FishYourDiamonds.MODID, "textures/gui/rod_overview.png"), 64, 64);

    @Override
    public int getHeight(Font font) {
        return 128;
    }

    @Override
    public int getWidth(Font font) {
        return 64;
    }

    @Override
    public void extractImage(Font font, int x, int y, int w, int h, GuiGraphicsExtractor graphics) {
        TEXTURE.render(graphics, x+64, y);
    }
}

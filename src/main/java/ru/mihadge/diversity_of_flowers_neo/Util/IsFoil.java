package ru.mihadge.diversity_of_flowers_neo.Util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class IsFoil extends Item {

    public IsFoil(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("item.diversity_of_flowers_neo.moon_star.desc1")
                .withStyle(style -> style.withColor(0x7FB2C9).withItalic(false)));

        tooltip.add(Component.translatable("item.diversity_of_flowers_neo.moon_star.desc2")
                .withStyle(style -> style.withColor(0x7FB2C9).withItalic(false)));
    }

    @Override
    public Component getName(ItemStack stack) {
        return super.getName(stack).copy().withStyle(ChatFormatting.YELLOW);
    }
}
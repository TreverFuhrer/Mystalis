package toki.mystalis.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import toki.mystalis.Mystalis;
import toki.mystalis.block.custom.ScribingTableBlock;

public class ModBlocks {
    
    // Scribing Table Block
    public static final Block SCRIBINGTABLE = registerBlock("scribingtable",
            new ScribingTableBlock(AbstractBlock.Settings.create()
                .mapColor(MapColor.OAK_TAN)
                .instrument(NoteBlockInstrument.BASS)
                .strength(2.5F)
                .sounds(BlockSoundGroup.WOOD)
                .burnable()
            ));


    // Registration helper methods
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Mystalis.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Mystalis.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void register() {
        Mystalis.LOGGER.info("Registering Mod Blocks for " + Mystalis.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(Mystalis.);
        });
    }
}

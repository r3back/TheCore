package com.qualityplus.trades.base.config;

import com.cryptomorin.xseries.XMaterial;
import com.qualityplus.assistant.util.faster.FasterMap;
import com.qualityplus.assistant.util.itemstack.ItemBuilder;
import com.qualityplus.trades.base.trades.PluginTrade;
import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.Header;
import eu.okaeri.configs.annotation.NameModifier;
import eu.okaeri.configs.annotation.NameStrategy;
import eu.okaeri.configs.annotation.Names;
import eu.okaeri.platform.core.annotation.Configuration;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@Configuration(path = "trades.yml")
@Header("================================")
@Header("       Trades      ")
@Header("================================")
@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public final class TradesFile extends OkaeriConfig {
    public List<PluginTrade> pluginTrades = Arrays.asList(
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.OAK_WOOD, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fCoal")
                    .permission("thetrades.coal")
                    .itemStack(ItemBuilder.of(XMaterial.COAL, 2).build())
                    .price(0)
                    .id("theTradesCoal")
                    .slot(10)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.DIRT, 4)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fGrass")
                    .permission("thetrades.grass")
                    .itemStack(ItemBuilder.of(XMaterial.GRASS_BLOCK, 4).build())
                    .price(0)
                    .id("theTradesGrass")
                    .slot(11)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.WHEAT_SEEDS, 8)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fDirt")
                    .permission("thetrades.dirt")
                    .itemStack(ItemBuilder.of(XMaterial.DIRT, 2).build())
                    .price(0)
                    .id("theTradesDirt")
                    .slot(12)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.WHEAT_SEEDS, 12)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fClay")
                    .permission("thetrades.clay")
                    .itemStack(ItemBuilder.of(XMaterial.CLAY_BALL, 1).build())
                    .price(0)
                    .id("theTradesClay")
                    .slot(13)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.OAK_SAPLING, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fOak Leaves")
                    .permission("thetrades.oak.leaves")
                    .itemStack(ItemBuilder.of(XMaterial.OAK_LEAVES, 1).build())
                    .price(0)
                    .id("theTradesOakLeaves")
                    .slot(14)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.SPRUCE_SAPLING, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fSpruce Leaves")
                    .permission("thetrades.sprice.leaves")
                    .itemStack(ItemBuilder.of(XMaterial.SPRUCE_LEAVES, 1).build())
                    .price(0)
                    .id("theTradesSpruceLeaves")
                    .slot(15)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.BIRCH_SAPLING, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fBirch Leaves")
                    .permission("thetrades.birch.leaves")
                    .itemStack(ItemBuilder.of(XMaterial.BIRCH_LEAVES, 1).build())
                    .price(0)
                    .id("theTradesBirchLeaves")
                    .slot(16)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.JUNGLE_SAPLING, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fJungle Leaves")
                    .permission("thetrades.jungle.leaves")
                    .itemStack(ItemBuilder.of(XMaterial.JUNGLE_LEAVES, 1).build())
                    .price(0)
                    .id("theTradesJungleLeaves")
                    .slot(19)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.JUNGLE_LEAVES, 5)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fVines")
                    .permission("thetrades.vines")
                    .itemStack(ItemBuilder.of(XMaterial.VINE, 1).build())
                    .price(0)
                    .id("theTradesVines")
                    .slot(20)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.ACACIA_SAPLING, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fAcacia Leaves")
                    .permission("thetrades.acacia.leaves")
                    .itemStack(ItemBuilder.of(XMaterial.ACACIA_LEAVES, 1).build())
                    .price(0)
                    .id("theTradesAcaciaLeaves")
                    .slot(21)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.DARK_OAK_SAPLING, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fDark Oak Leaves")
                    .permission("thetrades.dark.oak.leaves")
                    .itemStack(ItemBuilder.of(XMaterial.DARK_OAK_LEAVES, 1).build())
                    .price(0)
                    .id("theTradesDarkOakLeaves")
                    .slot(22)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.DIRT, 8)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fLong Grass")
                    .permission("thetrades.long.grass")
                    .itemStack(ItemBuilder.of(XMaterial.TALL_GRASS, 1).build())
                    .price(0)
                    .id("theTradesLongGrass")
                    .slot(23)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.DIRT, 8)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fFern")
                    .permission("thetrades.fern")
                    .itemStack(ItemBuilder.of(XMaterial.FERN, 1).build())
                    .price(0)
                    .id("theTradesFern")
                    .slot(24)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.DIRT, 8)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fFern")
                    .permission("thetrades.dead.bush")
                    .itemStack(ItemBuilder.of(XMaterial.DEAD_BUSH, 1).build())
                    .price(0)
                    .id("theTradesDeadBush")
                    .slot(25)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.DIRT, 8)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fDouble Tall Grass")
                    .permission("thetrades.double.tallgrass")
                    .itemStack(ItemBuilder.of(XMaterial.LARGE_FERN, 1).build())
                    .price(0)
                    .id("theTradesTallGrass")
                    .slot(28)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fWater Bucket")
                    .permission("thetrades.water.bucket")
                    .itemStack(ItemBuilder.of(XMaterial.WATER_BUCKET, 1).build())
                    .price(12)
                    .id("theTradesWaterBucket")
                    .slot(29)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fLava Bucket")
                    .permission("thetrades.lava.bucket")
                    .itemStack(ItemBuilder.of(XMaterial.LAVA_BUCKET, 1).build())
                    .price(20)
                    .id("theTradesLavaBucket")
                    .slot(30)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fMilk Bucket")
                    .permission("thetrades.milk.bucket")
                    .itemStack(ItemBuilder.of(XMaterial.MILK_BUCKET, 1).build())
                    .price(20)
                    .id("theTradesMilkBucket")
                    .slot(31)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.SAND, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fRed Sand")
                    .permission("thetrades.red.sand")
                    .itemStack(ItemBuilder.of(XMaterial.RED_SAND, 1).build())
                    .price(0)
                    .id("theTradesRedSand")
                    .slot(32)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.SAND, 2)
                            .put(XMaterial.FERMENTED_SPIDER_EYE, 1)
                            .build())
                    .description(Arrays.asList("&f&lCOMMON", "", "&7Cost"))
                    .displayName("&fSoul Sand")
                    .permission("thetrades.soul.sand")
                    .itemStack(ItemBuilder.of(XMaterial.SOUL_SAND, 1).build())
                    .price(0)
                    .id("theTradesSoulSand")
                    .slot(33)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.DIRT, 1)
                            .put(XMaterial.RED_MUSHROOM, 1)
                            .put(XMaterial.BROWN_MUSHROOM, 1)
                            .build())
                    .description(Arrays.asList("&f&lCOMMON", "", "&7Cost"))
                    .displayName("&fMycelium")
                    .permission("thetrades.mycelium")
                    .itemStack(ItemBuilder.of(XMaterial.MYCELIUM, 1).build())
                    .price(0)
                    .id("theTradesMycelium")
                    .slot(34)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.NETHERRACK, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fNether Brick")
                    .permission("thetrades.nether.brick")
                    .itemStack(ItemBuilder.of(XMaterial.NETHER_BRICK, 1).build())
                    .price(0)
                    .id("theTradesNetherBrick")
                    .slot(37)
                    .page(1)
                    .build(),
            PluginTrade.builder()
                    .itemCost(FasterMap.builder(XMaterial.class, Integer.class)
                            .put(XMaterial.WET_SPONGE, 1)
                            .build())
                    .description(Collections.singletonList("&f&lCOMMON"))
                    .displayName("&fSponge")
                    .permission("thetrades.sponge")
                    .itemStack(ItemBuilder.of(XMaterial.SPONGE, 1).build())
                    .price(0)
                    .id("theTradesSponge")
                    .slot(38)
                    .page(1)
                    .build()
    );
}

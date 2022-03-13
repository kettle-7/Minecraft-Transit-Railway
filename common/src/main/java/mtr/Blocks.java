package mtr;

import mtr.block.*;
import mtr.data.TransportMode;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;


public interface Blocks {

	Block APG_DOOR = new BlockAPGDoor();
	Block APG_GLASS = new BlockAPGGlass();
	Block APG_GLASS_END = new BlockAPGGlassEnd();
	Block ARRIVAL_PROJECTOR_1_SMALL = new BlockArrivalProjector1Small();
	Block ARRIVAL_PROJECTOR_1_MEDIUM = new BlockArrivalProjector1Medium();
	Block ARRIVAL_PROJECTOR_1_LARGE = new BlockArrivalProjector1Large();
	Block CEILING = new BlockCeilingAuto(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2).lightLevel(state -> 15));
	Block CEILING_LIGHT = new BlockCeiling(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2).lightLevel(state -> 15));
	Block CEILING_NO_LIGHT = new BlockCeiling(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2));
	Block CLOCK = new BlockClock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2).lightLevel(state -> 5));
	Block CLOCK_POLE = new BlockClockPole(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1));
	Block ESCALATOR_SIDE = new BlockEscalatorSide();
	Block ESCALATOR_STEP = new BlockEscalatorStep();
	Block GLASS_FENCE_CIO = new BlockGlassFence();
	Block GLASS_FENCE_CKT = new BlockGlassFence();
	Block GLASS_FENCE_HEO = new BlockGlassFence();
	Block GLASS_FENCE_MOS = new BlockGlassFence();
	Block GLASS_FENCE_PLAIN = new BlockGlassFence();
	Block GLASS_FENCE_SHM = new BlockGlassFence();
	Block GLASS_FENCE_STAINED = new BlockGlassFence();
	Block GLASS_FENCE_STW = new BlockGlassFence();
	Block GLASS_FENCE_TSH = new BlockGlassFence();
	Block GLASS_FENCE_WKS = new BlockGlassFence();
	Block LOGO = new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2).lightLevel(state -> 10));
	Block MARBLE_BLUE = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_LIGHT_BLUE).requiresCorrectToolForDrops().strength(1));
	Block MARBLE_BLUE_SLAB = new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_LIGHT_BLUE).requiresCorrectToolForDrops().strength(1));
	// TODO Marble Blue Stairs
	Block MARBLE_SANDY = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).requiresCorrectToolForDrops().strength(1));
	Block MARBLE_SANDY_SLAB = new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).requiresCorrectToolForDrops().strength(1));
	// TODO Marble Sandy Stairs
	Block PIDS_1 = new BlockPIDS1();
	Block PIDS_2 = new BlockPIDS2();
	Block PIDS_3 = new BlockPIDS3();
	Block PIDS_POLE = new BlockPIDSPole(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1));
	Block PLATFORM = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2), false);
	Block PLATFORM_INDENTED = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2).noOcclusion(), true);
	Block PLATFORM_NA_1 = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2), false);
	Block PLATFORM_NA_1_INDENTED = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2).noOcclusion(), true);
	Block PLATFORM_NA_2 = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2), false);
	Block PLATFORM_NA_2_INDENTED = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2).noOcclusion(), true);
	Block PLATFORM_UK_1 = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2), false);
	Block PLATFORM_UK_1_INDENTED = new BlockPlatform(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2).noOcclusion(), true);
	Block PSD_DOOR_1 = new BlockPSDDoor(0);
	Block PSD_GLASS_1 = new BlockPSDGlass(0);
	Block PSD_GLASS_END_1 = new BlockPSDGlassEnd(0);
	Block PSD_DOOR_2 = new BlockPSDDoor(1);
	Block PSD_GLASS_2 = new BlockPSDGlass(1);
	Block PSD_GLASS_END_2 = new BlockPSDGlassEnd(1);
	Block PSD_TOP = new BlockPSDTop();
	Block RAIL_NODE = new BlockNode(TransportMode.TRAIN);
	Block BOAT_NODE = new BlockNode.BlockBoatNode();
	Block RAILWAY_SIGN_2_EVEN = new BlockRailwaySign(2, false);
	Block RAILWAY_SIGN_2_ODD = new BlockRailwaySign(2, true);
	Block RAILWAY_SIGN_3_EVEN = new BlockRailwaySign(3, false);
	Block RAILWAY_SIGN_3_ODD = new BlockRailwaySign(3, true);
	Block RAILWAY_SIGN_4_EVEN = new BlockRailwaySign(4, false);
	Block RAILWAY_SIGN_4_ODD = new BlockRailwaySign(4, true);
	Block RAILWAY_SIGN_5_EVEN = new BlockRailwaySign(5, false);
	Block RAILWAY_SIGN_5_ODD = new BlockRailwaySign(5, true);
	Block RAILWAY_SIGN_6_EVEN = new BlockRailwaySign(6, false);
	Block RAILWAY_SIGN_6_ODD = new BlockRailwaySign(6, true);
	Block RAILWAY_SIGN_7_EVEN = new BlockRailwaySign(7, false);
	Block RAILWAY_SIGN_7_ODD = new BlockRailwaySign(7, true);
	Block RAILWAY_SIGN_MIDDLE = new BlockRailwaySign(0, false);
	Block RAILWAY_SIGN_POLE = new BlockRailwaySignPole(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1).noOcclusion());
	Block ROUTE_SIGN_STANDING_LIGHT = new BlockRouteSignStandingLight();
	Block ROUTE_SIGN_STANDING_METAL = new BlockRouteSignStandingMetal();
	Block ROUTE_SIGN_WALL_LIGHT = new BlockRouteSignWallLight();
	Block ROUTE_SIGN_WALL_METAL = new BlockRouteSignWallMetal();
	Block RUBBISH_BIN_1 = new BlockRubbishBin(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(4));
	Block SIGNAL_LIGHT_1 = new BlockSignalLight1(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4));
	Block SIGNAL_LIGHT_2 = new BlockSignalLight2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4));
	Block SIGNAL_LIGHT_3 = new BlockSignalLight3(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4));
	Block SIGNAL_LIGHT_4 = new BlockSignalLight4(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4));
	Block SIGNAL_SEMAPHORE_1 = new BlockSignalSemaphore1(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4));
	Block SIGNAL_SEMAPHORE_2 = new BlockSignalSemaphore2(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4));
	Block SIGNAL_POLE = new BlockStationColorPole(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2).noOcclusion(), false);
	Block STATION_COLOR_ANDESITE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.ANDESITE));
	Block STATION_COLOR_BEDROCK = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.STONE));
	Block STATION_COLOR_BIRCH_WOOD = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.BIRCH_WOOD));
	Block STATION_COLOR_BONE_BLOCK = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.BONE_BLOCK));
	Block STATION_COLOR_CHISELED_QUARTZ_BLOCK = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CHISELED_QUARTZ_BLOCK));
	Block STATION_COLOR_CHISELED_STONE_BRICKS = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CHISELED_STONE_BRICKS));
	Block STATION_COLOR_CLAY = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CLAY));
	Block STATION_COLOR_COAL_ORE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.COAL_ORE));
	Block STATION_COLOR_COBBLESTONE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.COBBLESTONE));
	Block STATION_COLOR_CONCRETE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHITE_CONCRETE));
	Block STATION_COLOR_CONCRETE_POWDER = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHITE_CONCRETE_POWDER));
	Block STATION_COLOR_CRACKED_STONE_BRICKS = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRACKED_STONE_BRICKS));
	Block STATION_COLOR_DARK_PRISMARINE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.DARK_PRISMARINE));
	Block STATION_COLOR_DIORITE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.DIORITE));
	Block STATION_COLOR_GRAVEL = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.GRAVEL));
	Block STATION_COLOR_IRON_BLOCK = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK));
	Block STATION_COLOR_METAL = new BlockStationColor(BlockBehaviour.Properties.copy(LOGO));
	Block STATION_COLOR_PLANKS = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.OAK_PLANKS));
	Block STATION_COLOR_POLE = new BlockStationColorPole(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(2).noOcclusion(), true);
	Block STATION_COLOR_POLISHED_ANDESITE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POLISHED_ANDESITE));
	Block STATION_COLOR_POLISHED_DIORITE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.POLISHED_DIORITE));
	Block STATION_COLOR_PURPUR_BLOCK = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.PURPUR_BLOCK));
	Block STATION_COLOR_PURPUR_PILLAR = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.PURPUR_PILLAR));
	Block STATION_COLOR_QUARTZ_BLOCK = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.QUARTZ_BLOCK));
	Block STATION_COLOR_QUARTZ_BRICKS = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.QUARTZ_BRICKS));
	Block STATION_COLOR_QUARTZ_PILLAR = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.QUARTZ_PILLAR));
	Block STATION_COLOR_SMOOTH_QUARTZ = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.SMOOTH_QUARTZ));
	Block STATION_COLOR_SMOOTH_STONE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.SMOOTH_STONE));
	Block STATION_COLOR_SNOW_BLOCK = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHITE_WOOL));
	Block STATION_COLOR_STAINED_GLASS = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHITE_STAINED_GLASS));
	Block STATION_COLOR_STONE = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.STONE));
	Block STATION_COLOR_STONE_BRICKS = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.STONE_BRICKS));
	Block STATION_COLOR_WOOL = new BlockStationColor(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHITE_WOOL));
	Block STATION_NAME_ENTRANCE = new BlockStationNameEntrance(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2).noOcclusion());
	Block STATION_NAME_TALL_BLOCK = new BlockStationNameTallBlock();
	Block STATION_NAME_TALL_WALL = new BlockStationNameTallWall();
	Block STATION_NAME_WALL = new BlockStationNameWall(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2).noOcclusion());
	Block TACTILE_MAP = new BlockTactileMap(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2).noOcclusion());
	Block TICKET_BARRIER_ENTRANCE_1 = new BlockTicketBarrier(true);
	Block TICKET_BARRIER_EXIT_1 = new BlockTicketBarrier(false);
	Block TICKET_MACHINE = new BlockTicketMachine(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(2).lightLevel(state -> 5).noOcclusion());
	Block TICKET_PROCESSOR = new BlockTicketProcessor(true, true, true);
	Block TICKET_PROCESSOR_ENTRANCE = new BlockTicketProcessor(true, true, false);
	Block TICKET_PROCESSOR_EXIT = new BlockTicketProcessor(true, false, true);
	Block TICKET_PROCESSOR_ENQUIRY = new BlockTicketProcessorEnquiry();
	Block TRAIN_ANNOUNCER = new BlockTrainAnnouncer();
	Block TRAIN_CARGO_LOADER = new BlockTrainCargoLoader();
	Block TRAIN_CARGO_UNLOADER = new BlockTrainCargoUnloader();
	Block TRAIN_REDSTONE_SENSOR = new BlockTrainRedstoneSensor();
	Block TRAIN_SCHEDULE_SENSOR = new BlockTrainScheduleSensor();
}

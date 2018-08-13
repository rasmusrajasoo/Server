package com.server2.world.objects;

import com.server2.model.entity.player.PlayerConstants;

/**
 * 
 * @author killamess
 * @author Lukasio
 * @author Renual.
 */
public interface ObjectConstants {

	public static int objectArraySize = 6;

	public static final int OBJECT_ID = 0, OBJECT_SIZE = 1, OBJECT_X = 2,
			OBJECT_Y = 3, OBJECT_TASK = 4, ACTION_DELAY = 5;

	public static final int SHOP = 1, TALK = 2, BANK = 3, DOOR = 999,
			cowGate = 1551, cowGate1 = 1553, abyssrock = 7153,
			TREE = PlayerConstants.WOODCUTTING, FISH = PlayerConstants.FISHING,
			MINE = PlayerConstants.MINING,
			GEM_CRAFT = PlayerConstants.CRAFTING,
			ORE_SMELTING = PlayerConstants.SMITHING, DUMMY = 823,
			MOULD_CRATE = 9535, JAD_ENTER = 9356, JAD_EXIT = 9357, JUG = 1935,
			DEPOSIT_BOX = 9398, TELE_KINETIC = 10778, TELE_GRAVEYARD = 10781,
			TELE_ENCHANTERS = 10779, TELE_VARROCK = 13622, CHAOS_ALTAR = 61,
			wyvernentre = 10596, wyvernexit = 10595, ALTAR = 409,
			ANCIENT_ALTAR = 6552, pcBank = 14367, TELE_JAD = 10780,
			revs_portal = 6282, taverlyTravel = 2623, MAGIC_DOOR = 10721,
			MAGIC_STAIR_CASE_1_DOWN = 10773, MAGIC_STAIR_CASE_1_UP = 10771,
			MAGIC_STAIR_CASE_2_DOWN = 10776, MAGIC_STAIR_CASE_2_UP = 10775,
			FIGHT_PIT_WAITING_ROOM = 9369, FIGHT_PIT_WAITING_ROOM2 = 9368,
			essenceportal = 2492, mind = 2479, taverleyentre = 1759,
			taverleyexit = 1755, VIEWING_ORB = 9391, water = 2480,
			earth = 2481, spiceStall = 2564, fire = 2482, body = 2483,
			chaos = 2487, nature = 2486, law = 2485, death = 2488,
			cosmic = 2484, FIRST_DUNGEON_EXIT = 6450,
			FIRST_DUNGEON_ENTRY = 10321, TEA_STALL = 635, ARMA_PRAY = 26288,
			BANDOS_PRAY = 26289, SARADOMIN_PRAY = 26287, ZAMORAK_PRAY = 26286,
			STR_DOOR = 1531, HAY_STACK = 299, CHICKEN_DOOR1 = 2051,
			CHICKEN_DOOR2 = 2050, JAIL_EXIT = 6836, KARAMJA_ROPE_DOWN = 492,
			KARAMJA_ROPE_UP = 1764, TZ_HAAR_ENTRY = 9358, abyssrock1 = 7143,
			TZ_HAAR_EXIT = 9359, dwarfmine_up = 1734, rev_exit = 4389,
			dwarfmine_down = 1733, OBELISK0 = 14831, OBELISK1 = 14830,
			OBELISK2 = 14829, OBELISK3 = 14828, OBELISK4 = 14826,
			EastDoor = 11707, slayerdoor22 = 10529, slayerdoor21 = 10527,
			FLAX = 2646, brimhavenentre = 5083, brimhavenexit = 5084,
			lighthousedoor = 4577, COOKING_FURNACE = 11112, LOG_FIRE = 11113,
			RUNE_CRAFT = 511192, NO_ORE = 450, GNOME1 = 2295, GNOME2 = 2285,
			GNOME3 = 2313, GNOME4 = 2312, GNOME5 = 2314, GNOME6 = 4059,
			GNOME7 = 2315, GNOME8 = 2286, GNOME9 = 4058, GNOME10 = 154,
			BANANA = 2073, enterPC = 14315, exitPC = 14314, chaosAltar = 411,
			flaxSpinning = 2644, freminnikslayerdungeon_goin = 4499,
			freminnikslayerdungeon_goout = 4500, LUNAR = 17010,
			WarriorsGuildUp = 1738, WarriorsGuildDown = 15638,
			SUMMONINGOBELISK = 14000, WARRIORSGUILDDOOR = 15644,
			WARRIORSGUILDDOOR2 = 15641, BARROWSCHEST = 10284, abysstree = 7152,
			abysstree1 = 7144, natureportal = 2473, cosmicportal = 2471,
			fireportal = 2469, earthportal = 2468, bodyportal = 2470,
			mindportal = 2466, airportal = 2465, waterportal = 2467,
			deathportal = 2475, lawportal = 2472, chaosportal = 2474,
			air = 2478, seedStall = 7053, essencePure = 2491,
			smithingDung = 6514, foodDung = 6516, rcDung = 6515,
			winestall = 14011, scimitarstall = 4878, runestall = 4877,
			runesDung = 6517, doorDung = 6555, gemstall = 2562,
			coinstall1 = 2561, coinstall2 = 2560, coinstall3 = 2563,
			coinstall4 = 2565, doorDung2 = 6553, gateWay = 6512,
			gateWay2 = 6513, dungPortal = 2156, farmingTree1 = 7841,
			farmingTree2 = 8487, farmingTree3 = 8443, farmingTree4 = 8513,
			farmingTree5 = 8396 + 12, farmingTree6 = 8466, farmingTree7 = 7999,
			farmingTree8 = 8057, farmingTree9 = 8027, herbs = 8143,
			farmingTree10 = 7937, farmingTree11 = 8112, farmingTree12 = 8085,
			flower1 = 7871, flower2 = 7899 + 4, flower3 = 7887, flower4 = 7855,
			flower5 = 7923, allotments1 = 8562, allotments2 = 8584,
			allotments3 = 8539, allotments4 = 8645, allotments5 = 8622,
			allotments6 = 8601, allotments7 = 8663, gate1 = 1597, gate2 = 1596,
			dungFinish = 6501, floor2BossPortal = 7272, bookCase = 380,
			floor2bs = 9948, dharoksSpawn = 6771, kahrilSpawn = 1,
			veracsSpawn = 6823, guthansSpawn = 6773, toragsSpawn = 6772,
			leaveBarrows = 6821, karilsSpawn = 6822, stairBarrow1 = 6707,
			stairBarrow2 = 6703, stairBarrow3 = 6704, stairBarrow4 = 6705,
			stairBarrow5 = 6706, stairBarrow6 = 6702, slayerdoor = 4487,
			slayerdoor1 = 4490, slayerstair1 = 4493, slayerstairdown1 = 4494,
			slayerstair2 = 4495, slayerstair2down = 4496,
			dwarfmineguild = 2113, dwarfminedoor = 2112, taverlypipe = 9293,
			rfdPortal = 12356, railing = 14, brokenRailing6 = 15,
			brokenRailing5 = 16, brokenRailing4 = 17, brokenRailing3 = 18,
			brokenRailing2 = 19, brokenRailing1 = 20, gnomestairup = 1742,
			gnomestairdown = 1744, vine = 5103, vine1 = 5104, vine2 = 5106,
			vine4 = 5105, vine3 = 5107, step = 5110, step1 = 5111,
			brimlog = 5088, brimlog1 = 5090, farmingAllotment = 8552,
			brimhavenstair = 5097, brimhavenstair1 = 5094,
			brimhavendown1 = 5096, pcDoor1 = 14233, pcDoor2 = 14235,
			pcDoor3 = 14236, slayerdoor3 = 5126, brimhavenstairdown = 5098,
			bandosdoor1 = 26384, bandosdoor = 26425, armadoor1 = 26303,
			armadoor = 26426, saradoor = 26427, zamadoor = 26428,
			lighthouseladder = 4383, lighthouseladder1 = 4412,
			lighthousegate = 4543, lighthousegate1 = 4544,
			lighthousegate2 = 4545, lighthousegate3 = 4546, daggsladder = 4485,
			daggsladder1 = 4413, rfdChest = 2403, frostDragonEntrance = 2,
			mageBankEnterLever = 5960, mageBankLeaveLever = 5959,
			capeEntrance = 2878, capeLeave = 2879, zamorakCape = 2874,
			guthixCape = 2875, saradominCape = 2873, smithingAltar = 2781,
			dzone1 = 4705, dzone2 = 4706, slayerChain = 9319,
			slayerChain2 = 9320, obelisk1 = 14831, obelisk2 = 14830,
			obelisk3 = 14829, obelisk4 = 14828, obelisk5 = 14827,
			obelisk6 = 14826, hunterBox = 19187, hunterChin1 = 19191,
			hunterChin2 = 19189, hunterSnare = 19175, crimsonSnare = 19180,
			birdSnare = 19182, birdSnare2 = 19184, birdSnare3 = 19178,
			birdSnare4 = 19186, lightUp = 4568, generalstall = 4876,
			neitiznotBank = 21301, floor3Contortionbar = 7251,
			homeThieving2 = 4874, homeThieving3 = 4875, lightTowerDown = 4569,
			pestControlUp = 14296, castleWarsShit = 4912,
			castleWarsLadder = 1757, castleWarsBank = 4483,
			apeAtollGuardPrayerAltar = 4859, apeAtollGuardStairs = 4756,
			apeAtollGuardDown = 4755, greenMonkeyEntrance = 4879,
			cwDoor = 4465, greenMonkeyUp = 4881, floor3Door1 = 7255,
			floor3Chest = 2079, gnomeD = 8788, gnomeD1 = 8787, gnome = 8794,
			gnomeChest = 8797, gnomeBox = 2568, gnomeBox1 = 2573,
			gnomeDesk = 8799, box1 = 10687, box2 = 10691, box3 = 10695,
			box4 = 10693, box5 = 10689, box6 = 10697, box7 = 10696,
			box8 = 10692, box9 = 10686, box10 = 10694, box11 = 10690,
			mausoleum = 12731, grave1 = 12716, grave2 = 12717, grave3 = 12718,
			grave4 = 12719, grave5 = 12720, floor3travel1 = 7239,
			floor3Travel2 = 7219, keldaSmelt = 6189, keldaStairs5 = 6086,
			keldaStairs4 = 6085, keldaStairs3 = 6090, keldaStairs = 6087,
			keldaStairs1 = 6088, keldaStairs2 = 6089, sophEnt = 6615,
			keldaDoor8 = 6100, keldaDoor7 = 6104, keldaDoor6 = 6110,
			keldaDoor5 = 6108, keldaDoor4 = 6106, keldaDoor3 = 6975,
			keldaBank = 6084, keldaDoor = 6114, keldaDoor1 = 6977,
			keldaDoor2 = 6102, dungDoor = 2971, dungExit = 8956,
			sophEntrance = 5082, sophDoor1 = 6625, sophDoor2 = 6624,
			dungeonEntrance = 6614, dungeonDoor = 6643, dungeonPit = 6632,
			dungeonLadder = 6645, brimstairup1 = 5094, ratTrap = 10290,
			ratWall = 10335, ratWall1 = 10336, riotEnter = 7273,
			riotLeave = 6551, brimstairdown1 = 5096, dwarfLadder = 1747,
			dwarfLadder1 = 1746, dwarfGate = 1557, dwarfGate2 = 1558,
			spicestall1 = 6527, gertrudesCarBarrier = 2618, fishGuild = 2025,
			dwarfRemains = 15596, gertrudesBox = 2620, ardyLever = 1814,
			kbdLever1 = 1817, kbdLever2 = 1816, kbdLadderUp = 1766,
			kbdLadderDown = 1765, portal1 = 13616, portal2 = 13615,
			portal3 = 13619, bhId1 = 28121, bhId2 = 28120, bhId3 = 28119,
			bhId4 = 28122, ardyLever2 = 1815, stall1 = 6162, stall2 = 6163,
			stall3 = 6164, stall4 = 6165, stall5 = 6166, SCOREBOARD = 3192;

	public static final int REMOVE = 0;

	public static int[][] objectCommander = {
			{ 3192, SCOREBOARD, 3, 150 },
			{ 28121, bhId1, 3, 150 },
			{ 28120, bhId2, 3, 150 },
			{ 28119, bhId3, 3, 150 },
			{ 28122, bhId4, 3, 150 },
			{ 1551, cowGate, 2, 150 },
			{ 1553, cowGate1, 2, 150 },
			{ 6162, stall1, 3, 500 },
			{ 6163, stall2, 3, 500 },
			{ 6164, stall3, 3, 500 },
			{ 6165, stall4, 3, 500 },
			{ 6166, stall5, 2, 500 },
			{ 1765, kbdLadderDown, 2, 150 },
			{ 1766, kbdLadderUp, 2, 150 },
			{ 1816, kbdLever2, 2, 150 },
			{ 1817, kbdLever1, 2, 150 },
			{ 13616, portal1, 2, 150 },
			{ 13615, portal2, 2, 150 },
			{ 13619, portal3, 2, 150 },
			{ 4465, cwDoor, 1, 150 },
			{ 6615, sophEnt, 2, 150 },
			{ 8956, dungExit, 2, 150 },
			{ 6645, dungeonLadder, 2, 150 },
			{ 6632, dungeonPit, 2, 150 },
			{ 6643, dungeonDoor, 2, 150 },
			{ 2971, dungDoor, 2, 150 },
			{ 2492, essenceportal, 2, 500 },
			{ 6625, sophDoor1, 2, 150 },
			{ 6624, sophDoor2, 2, 150 },
			{ 6614, dungeonEntrance, 2, 150 },
			{ 5082, sophEntrance, 3, 500 },
			{ 6087, keldaStairs, 2, 150 },
			{ 6088, keldaStairs1, 2, 150 },
			{ 6089, keldaStairs2, 2, 150 },
			{ 6090, keldaStairs3, 2, 150 },
			{ 6085, keldaStairs4, 1, 150 },
			{ 6086, keldaStairs5, 1, 500 },
			{ 6189, keldaSmelt, 2, 500 },
			{ 6975, keldaDoor3, 2, 500 },
			{ 6106, keldaDoor4, 2, 500 },
			{ 6108, keldaDoor5, 2, 500 },
			{ 6110, keldaDoor6, 2, 500 },
			{ 6104, keldaDoor7, 2, 500 },
			{ 6100, keldaDoor8, 2, 500 },
			{ 6084, keldaBank, 2, 150 },
			{ 6114, keldaDoor, 2, 150 },
			{ 6977, keldaDoor1, 2, 150 },
			{ 6102, keldaDoor2, 2, 150 },
			{ 8799, gnomeDesk, 2, 150 },
			{ 8797, gnomeChest, 2, 150 },
			{ 2573, gnomeBox1, 2, 150 },
			{ 2568, gnomeBox, 2, 150 },
			{ 8794, gnome, 3, 150 },
			{ 8787, gnomeD1, 2, 150 },
			{ 8788, gnomeD, 2, 150 },
			{ 10687, box1, 2, 150 },
			{ 10691, box2, 2, 150 },
			{ 10695, box3, 2, 150 },
			{ 10693, box4, 2, 150 },
			{ 10689, box5, 2, 150 },
			{ 10697, box6, 2, 150 },
			{ 10696, box7, 2, 150 },
			{ 10692, box8, 2, 150 },
			{ 10686, box9, 2, 150 },
			{ 10694, box10, 2, 150 },
			{ 10690, box11, 2, 150 },
			{ 12731, mausoleum, 2, 150 },
			{ 10335, ratWall, 1, 150 },
			{ 10336, ratWall1, 1, 150 },
			{ 10290, ratTrap, 2, 150 },
			{ 1815, ardyLever2, 2, 150 },
			{ 1814, ardyLever, 2, 150 },
			{ 1746, dwarfLadder1, 1, 150 },
			{ 2025, fishGuild, 2, 150 },
			{ 1747, dwarfLadder, 1, 150 },
			{ 15596, dwarfRemains, 1, 150 },
			{ 5094, brimstairup1, 4, 500 },
			{ 5096, brimstairdown1, 4, 500 },
			{ 1557, dwarfGate, 2, 500 },
			{ 1558, dwarfGate2, 2, 500 },
			{ 2620, gertrudesBox, 2, 500 },
			{ 2618, gertrudesCarBarrier, 2, 500 },
			{ 7239, floor3travel1, 2, 500 },
			{ 7219, floor3Travel2, 2, 500 },
			{ 2079, floor3Chest, 3, 500 },
			{ 7255, floor3Door1, 2, 500 },
			{ 4881, greenMonkeyUp, 2, 500 },
			{ 4879, greenMonkeyEntrance, 2, 500 },
			{ 4755, apeAtollGuardDown, 2, 500 },
			{ 4756, apeAtollGuardStairs, 2, 500 },
			{ 4859, apeAtollGuardPrayerAltar, 2, 500 },
			{ 8552, farmingAllotment, 1, 500 },
			{ 4483, castleWarsBank, 2, 500 },
			{ 1757, castleWarsLadder, 2, 500 },
			{ 4912, castleWarsShit, 2, 500 },
			{ 14367, pcBank, 2, 500 },
			{ 14296, pestControlUp, 2, 500 },
			{ pcDoor3, 14236, 2, 500 },
			{ lightTowerDown, 4569, 2, 500 },
			{ homeThieving2, 4874, 2, 500 },
			{ homeThieving3, 4875, 2, 500 },
			{ hunterChin1, 19191, 2, 150 },
			{ hunterChin2, 19189, 2, 150 },
			{ floor3Contortionbar, 7251, 2, 150 },
			{ hunterBox, 19187, 2, 500 },
			{ neitiznotBank, 21301, 2, 500 },
			{ 4568, lightUp, 2, 500 },
			{ 2564, spiceStall, 4, 500 },
			{ 6527, spicestall1, 4, 500 },
			{ 1597, gate1, 2, 500 },
			{ 1596, gate2, 2, 500 },
			{ 1596, gate2, 2, 500 },
			{ 4876, generalstall, 2, 500 },
			{ 4485, daggsladder, 2, 500 },
			{ 4413, daggsladder1, 2, 500 },
			{ 19182, birdSnare, 2, 500 },
			{ 19184, birdSnare2, 2, 500 },
			{ 19186, birdSnare4, 2, 500 },
			{ 19178, birdSnare3, 2, 500 },
			{ 19180, crimsonSnare, 2, 500 },
			{ 4577, lighthousedoor, 2, 500 },
			{ 4383, lighthouseladder, 2, 500 },
			{ 4412, lighthouseladder1, 2, 500 },
			{ 4543, lighthousegate, 2, 500 },
			{ 4544, lighthousegate1, 2, 500 },
			{ 4545, lighthousegate2, 2, 500 },
			{ 4546, lighthousegate3, 2, 500 },
			{ 6282, revs_portal, 3, 500 },
			{ 19175, hunterSnare, 2, 500 },
			{ 14831, obelisk1, 2, 500 },
			{ 9320, slayerChain, 2, 500 },
			{ 4389, rev_exit, 3, 500 },
			{ 9319, slayerChain, 2, 500 },
			{ 4705, dzone1, 5, 500 },
			{ 4706, dzone2, 5, 500 },
			{ 2781, smithingAltar, 5, 500 },
			{ 2874, zamorakCape, 2, 500 },
			{ 2875, guthixCape, 2, 500 },
			{ 2873, saradominCape, 2, 500 },
			{ 10527, slayerdoor21, 2, 500 },
			{ 10529, slayerdoor22, 2, 500 },
			{ 5126, slayerdoor3, 2, 500 },
			{ 2878, capeEntrance, 2, 500 },
			{ 2879, capeLeave, 3, 500 },
			{ 5959, mageBankLeaveLever, 2, 500 },
			{ 5960, mageBankEnterLever, 3, 500 },
			{ 2623, taverlyTravel, 2, 500 },
			{ 2, frostDragonEntrance, 2, 500 },
			{ 26288, ARMA_PRAY, 10, 500 },
			{ 26299, BANDOS_PRAY, 10, 500 },
			{ 26286, ZAMORAK_PRAY, 10, 500 },
			{ 26287, SARADOMIN_PRAY, 10, 500 },
			{ 26428, zamadoor, 3, 500 },
			{ 2403, rfdChest, 1, 150 },
			{ 26303, armadoor1, 10, 500 },
			{ 26427, saradoor, 3, 500 },
			{ 26426, armadoor, 3, 500 },
			{ 26384, bandosdoor1, 3, 500 },
			{ 26425, bandosdoor, 3, 500 },
			{ 12356, rfdPortal, 1, 150 },
			{ 14, railing, 1, 500 },
			{ 20, brokenRailing1, 2, 150 },
			{ 19, brokenRailing2, 2, 150 },
			{ 18, brokenRailing3, 2, 150 },
			{ 17, brokenRailing4, 2, 150 },
			{ 16, brokenRailing5, 2, 150 },
			{ 15, brokenRailing6, 2, 150 },
			{ 1744, gnomestairdown, 2, 500 },
			{ 5088, brimlog, 3, 500 },
			{ 5090, brimlog1, 3, 500 },
			{ 14233, pcDoor1, 3, 500 },
			{ 14235, pcDoor2, 3, 500 },
			{ 5103, vine, 1, 500 },
			{ 5104, vine1, 1, 500 },
			{ 5105, vine4, 1, 500 },
			{ 5106, vine2, 1, 500 },
			{ 5107, vine3, 1, 500 },
			{ 5110, step, 2, 500 },
			{ 5111, step1, 2, 500 },
			{ 5097, brimhavenstair, 4, 500 },
			{ 5098, brimhavenstairdown, 4, 500 },
			{ 1742, gnomestairup, 2, 500 },
			{ 6702, stairBarrow6, 4, 150 },
			{ 4493, slayerstair1, 5, 500 },
			{ 9293, taverlypipe, 3, 500 },
			{ 4494, slayerstairdown1, 2, 500 },
			{ 6706, stairBarrow5, 4, 150 },
			{ 6705, stairBarrow4, 4, 150 },
			{ 2113, dwarfmineguild, 2, 500 },
			{ 6704, stairBarrow3, 4, 150 },
			{ 4495, slayerstair2, 5, 500 },
			{ 4496, slayerstair2down, 2, 500 },
			{ 6703, stairBarrow2, 4, 150 },
			{ 6707, stairBarrow1, 4, 150 },
			{ 6822, karilsSpawn, 2, 150 },
			{ 6772, toragsSpawn, 2, 150 },
			{ 6821, leaveBarrows, 2, 150 },
			{ 6773, guthansSpawn, 2, 150 },
			{ 6823, veracsSpawn, 2, 150 },
			{ 4487, slayerdoor, 2, 500 },
			{ 4490, slayerdoor1, 2, 500 },
			{ 6771, dharoksSpawn, 2, 150 },
			{ 380, bookCase, 2, 150 },
			{ 7871, flower1, 2, 500 },
			{ 7899 + 4, flower2, 2, 500 },
			{ 7887, flower3, 2, 500 },
			{ 7855, flower4, 2, 500 },
			{ 7923, flower5, 2, 500 },
			{ 7272, floor2BossPortal, 1, 150 },
			{ 7273, riotEnter, 2, 150 },
			{ 6551, riotLeave, 2, 150 },
			{ 6501, dungFinish, 2, 150 },
			{ 2156, dungPortal, 2, 150 },
			{ 6512, gateWay, 1, 150 },
			{ 6513, gateWay2, 1, 150 },
			{ 6553, doorDung2, 5, 150 },// i kno maar kijk
			{ 6555, doorDung, 5, 150 },
			{ 6517, runesDung, 5, 500 },
			{ 2561, coinstall1, 2, 500 },
			{ 2560, coinstall2, 2, 500 },
			{ 8143, herbs, 3, 500 },
			{ 8562, allotments1, 5, 500 },
			{ 8584, allotments2, 5, 500 },
			{ 8539, allotments3, 5, 500 },
			{ 8645, allotments4, 5, 500 },
			{ 8622, allotments5, 5, 500 },
			{ 8601, allotments6, 5, 500 },
			{ 8663, allotments7, 5, 500 },
			{ 7841, farmingTree1, 4, 500 },
			{ 8487, farmingTree2, 4, 500 },
			{ 8443, farmingTree3, 4, 500 },
			{ 8513, farmingTree4, 4, 500 },
			{ 8396 + 12, farmingTree5, 4, 500 },
			{ 8466, farmingTree6, 4, 500 },
			{ 7999, farmingTree7, 4, 500 },
			{ 8057, farmingTree8, 4, 500 },
			{ 8027, farmingTree9, 4, 500 },
			{ 7937, farmingTree10, 4, 500 },
			{ 8112, farmingTree11, 4, 500 },
			{ 8085, farmingTree12, 4, 500 },
			{ 7874, flower1, 3, 500 },
			{ 7899 + 4, flower2, 3, 500 },
			{ 7887, flower3, 3, 500 },
			{ 7855, flower4, 3, 500 },
			{ 7923, flower5, 3, 500 },
			{ 2563, coinstall3, 2, 500 },
			{ 2565, coinstall4, 2, 500 },
			{ 6515, rcDung, 5, 500 },
			{ 2562, gemstall, 2, 500 },
			{ 4878, scimitarstall, 1, 500 },
			{ 4877, runestall, 1, 500 },
			{ 6516, foodDung, 5, 500 },
			{ 14011, winestall, 2, 500 },
			{ 6514, smithingDung, 5, 500 },
			{ 2491, essencePure, 5, 500 },
			{ 2473, natureportal, 1, 500 },
			{ 2471, cosmicportal, 1, 500 },
			{ 2469, fireportal, 2, 500 },
			{ 2468, earthportal, 1, 500 },
			{ 2470, bodyportal, 1, 500 },
			{ 2466, mindportal, 1, 500 },
			{ 2465, airportal, 1, 500 },
			{ 2467, waterportal, 2, 500 },
			{ 10284, BARROWSCHEST, 2, 500 },
			{ 2475, deathportal, 1, 500 },
			{ 7053, seedStall, 2, 500 },
			{ 2472, lawportal, 1, 500 },
			{ 2474, chaosportal, 1, 500 },
			{ 15641, WARRIORSGUILDDOOR2, 2, 500 },
			{ 15638, WarriorsGuildDown, 2, 500 },
			{ 1738, WarriorsGuildUp, 2, 500 },
			{ 14000, SUMMONINGOBELISK, 2, 500 },
			{ 2644, flaxSpinning, 1, 500 },
			{ 411, chaosAltar, 2, 500 },
			{ 2073, BANANA, 2, 500 },
			{ 14314, exitPC, 2, 500 },
			{ 14315, enterPC, 2, 500 },
			{ 9356, JAD_ENTER, 2, 500 },
			{ 9357, JAD_EXIT, 3, 500 },
			{ 4058, GNOME9, 1, 500 },
			{ 154, GNOME10, 1, 500 },
			{ 2286, GNOME8, 3, 500 },
			{ 2315, GNOME7, 1, 500 },
			{ 2112, dwarfminedoor, 2, 500 },
			{ 2295, GNOME1, 1, 500 },
			{ 2285, GNOME2, 3, 500 },
			{ 2313, GNOME3, 1, 500 },
			{ 2312, GNOME4, 1, 500 },
			{ 2314, GNOME5, 1, 500 },
			{ 1759, taverleyentre, 1, 500 },
			{ 1755, taverleyexit, 1, 500 },
			{ 4059, GNOME6, 1, 500 },
			{ 1530, DOOR, 1, 500 }, // door
			{ 1533, DOOR, 1, 500 },// door
			{ 1516, DOOR, 1, 500 },// door
			{ 1519, DOOR, 1, 500 },// door
			{ 11707, EastDoor, 1, 500 },
			{ 1316, TREE, 3, 500 }, // evergreen big
			{ 1315, TREE, 2, 500 }, // evergreen
			{ 1276, TREE, 2, 500 }, // normal tree.
			{ 1278, TREE, 2, 500 }, // normal tree.
			{ 1281, TREE, 3, 500 }, // oak tree.
			{ 1308, TREE, 2, 500 }, // willow tree.
			{ 5553, TREE, 2, 500 }, // willow tree
			{ 5551, TREE, 2, 500 }, // willow tree
			{ 1307, TREE, 2, 500 }, // maple tree.
			{ 1309, TREE, 3, 500 }, // yew tree.
			{ 1306, TREE, 2, 500 }, // magic tree.
			{ 1383, TREE, 1, 500 }, // dead tree.
			{ 1286, TREE, 1, 500 }, // dead tree.
			{ 1282, TREE, 2, 500 }, // dead tree.

			{ 7152, abysstree, 3, 500 }, // tendrils
			{ 7144, abysstree1, 3, 500 }, // tendrils
			{ 7153, abyssrock, 3, 500 }, // abyssrock
			{ 7143, abyssrock1, 3, 500 }, // abyssrock
			{ 2213, BANK, 1, 500 }, // bank booth
			{ 3193, BANK, 1, 500 }, // bank booth
			{ 11758, BANK, 1, 500 }, // bank booth
			{ 2090, MINE, 1, 500 }, // copper ore
			{ 2091, MINE, 1, 500 }, // copper ore
			{ 2092, MINE, 1, 500 }, // iron ore
			{ 2093, MINE, 1, 500 }, // iron ore
			{ 2094, MINE, 1, 500 }, // tin ore
			{ 2095, MINE, 1, 500 }, // tin ore
			{ 2096, MINE, 1, 500 }, // coal
			{ 2097, MINE, 1, 500 }, // coal
			{ 2101, MINE, 1, 500 }, // sliver ore
			{ 2102, MINE, 1, 500 }, // mithril ore
			{ 2103, MINE, 1, 500 }, // mithril ore
			{ 2103, MINE, 1, 500 }, // mithril ore
			{ 2104, MINE, 1, 500 }, // mithril ore
			{ 2105, MINE, 1, 500 }, // mithril ore
			{ 2107, MINE, 1, 500 }, // mithril ore
			{ 2106, MINE, 1, 500 }, // clay
			{ 2109, MINE, 1, 500 }, // clay
			{ 11932, MINE, 1, 500 }, // coal
			{ 11931, MINE, 1, 500 }, // coal
			{ 11930, MINE, 1, 500 }, // coal
			{ 11933, MINE, 1, 500 }, // tin
			{ 11934, MINE, 1, 500 }, // tin
			{ 11935, MINE, 1, 500 }, // tin
			{ 11189, MINE, 1, 500 }, // clay
			{ 11190, MINE, 1, 500 }, // clay
			{ 11191, MINE, 1, 500 }, // clay
			{ 11186, MINE, 1, 500 }, // sliver ore
			{ 11187, MINE, 1, 500 }, // sliver ore
			{ 11188, MINE, 1, 500 }, // sliver ore
			{ 2100, MINE, 1, 500 }, // sliver ore
			{ 11183, MINE, 1, 500 }, // gold ore
			{ 11184, MINE, 1, 500 }, // gold ore
			{ 11185, MINE, 1, 500 }, // gold ore
			{ 2099, MINE, 1, 500 }, // gold ore
			{ 2098, MINE, 1, 500 }, // gold ore
			{ 14859, MINE, 1, 500 }, // runite ore
			{ 14860, MINE, 1, 500 }, // runite ore
			{ 11666, GEM_CRAFT, 2, 500 }, { 2478, air, 5, 500 },
			{ 2480, water, 5, 500 }, { 2481, earth, 5, 500 },
			{ 2482, fire, 5, 500 }, { 2483, body, 5, 500 },
			{ 2487, chaos, 5, 500 }, { 2486, nature, 5, 500 },
			{ 2485, law, 5, 500 }, { 2488, death, 5, 500 },
			{ 2479, mind, 5, 500 }, { 2484, cosmic, 5, 500 },
			{ 11666, ORE_SMELTING, 2, 500 }, { 2643, ORE_SMELTING, 2, 500 },
			{ 9534, MOULD_CRATE, 1, 500 }, { 873, JUG, 2, 500 },
			{ 874, JUG, 2, 500 },
			{ 879, JUG, 2, 500 },
			{ 880, JUG, 2, 500 },
			{ 4063, JUG, 2, 500 },
			{ 6151, JUG, 2, 500 },
			{ 8699, JUG, 2, 500 },
			{ 9143, JUG, 2, 500 },
			{ 9684, JUG, 2, 500 },
			{ 10175, JUG, 2, 500 },
			{ 13564, JUG, 2, 500 },
			{ 13563, JUG, 2, 500 },
			{ 12974, JUG, 2, 500 },
			{ 12279, JUG, 2, 500 },
			{ 9398, DEPOSIT_BOX, 1, 500 },
			{ 10778, TELE_KINETIC, 1, 500 },
			{ 10781, TELE_GRAVEYARD, 1, 500 },
			{ 10779, TELE_ENCHANTERS, 1, 500 },
			{ 13622, TELE_VARROCK, 2, 500 },
			{ 823, DUMMY, 1, 500 },
			{ 1531, STR_DOOR, 1, 500 },
			{ 299, HAY_STACK, 2, 500 },
			{ 61, CHAOS_ALTAR, 2, 500 },
			{ 409, ALTAR, 2, 500 },
			{ 6552, ANCIENT_ALTAR, 3, 500 },
			{ 10780, TELE_JAD, 1, 500 },
			{ 10721, MAGIC_DOOR, 1, 500 },
			{ 10773, MAGIC_STAIR_CASE_1_DOWN, 2, 500 },
			{ 10771, MAGIC_STAIR_CASE_1_UP, 2, 500 },
			{ 10776, MAGIC_STAIR_CASE_2_DOWN, 2, 500 },
			{ 10775, MAGIC_STAIR_CASE_2_UP, 4, 500 },
			{ 9369, FIGHT_PIT_WAITING_ROOM, 1, 500 },
			{ 9368, FIGHT_PIT_WAITING_ROOM2, 1, 500 },
			{ 1734, dwarfmine_up, 3, 500 },
			{ 1733, dwarfmine_down, 3, 500 },
			{ 9391, VIEWING_ORB, 1, 500 },
			{ 6450, FIRST_DUNGEON_EXIT, 1, 500 },
			{ FIRST_DUNGEON_ENTRY, FIRST_DUNGEON_ENTRY, 1, 500 },
			{ 635, TEA_STALL, 2, 500 },
			{ 2051, CHICKEN_DOOR1, 1, 500 },
			{ 2050, CHICKEN_DOOR2, 1, 500 },
			{ 6836, JAIL_EXIT, 1, 500 },
			{ 492, KARAMJA_ROPE_DOWN, 2, 500 },
			{ 1764, KARAMJA_ROPE_UP, 1, 500 },
			{ 4499, freminnikslayerdungeon_goin, 2, 500 },
			{ 4500, freminnikslayerdungeon_goout, 3, 500 },
			{ 5083, brimhavenentre, 2, 500 },
			{ 5084, brimhavenexit, 1, 500 },
			{ TZ_HAAR_ENTRY, TZ_HAAR_ENTRY, 2, 500 },
			{ TZ_HAAR_EXIT, TZ_HAAR_EXIT, 2, 500 },
			{ OBELISK0, OBELISK0, 1, 500 },
			{ OBELISK1, OBELISK1, 1, 500 },
			{ OBELISK2, OBELISK2, 1, 500 },
			{ OBELISK3, OBELISK3, 1, 500 },
			{ OBELISK4, OBELISK4, 1, 500 },
			{ FLAX, FLAX, 1, 500 },
			{ 12102, COOKING_FURNACE, 1, 500 },
			{ 12269, COOKING_FURNACE, 1, 500 },
			{ 8712, COOKING_FURNACE, 2, 500 },
			{ 9085, COOKING_FURNACE, 2, 500 },
			{ 9086, COOKING_FURNACE, 2, 500 },
			{ 9087, COOKING_FURNACE, 2, 500 },
			{ 2728, COOKING_FURNACE, 2, 500 },
			{ 2729, COOKING_FURNACE, 2, 500 },
			{ 2730, COOKING_FURNACE, 2, 500 },
			{ 2731, COOKING_FURNACE, 2, 500 },
			{ 2859, COOKING_FURNACE, 2, 500 },
			{ 3039, COOKING_FURNACE, 2, 500 },
			{ 5275, COOKING_FURNACE, 2, 500 },
			{ 114, COOKING_FURNACE, 2, 500 },
			{ 8750, COOKING_FURNACE, 2, 500 },
			{ 10595, wyvernexit, 2, 500 },
			{ 10596, wyvernentre, 2, 500 },
			{ 2732, LOG_FIRE, 1, 500 },
			{ 3038, LOG_FIRE, 1, 500 },
			{ 3769, LOG_FIRE, 1, 500 },
			{ 3775, LOG_FIRE, 1, 500 },
			{ 4265, LOG_FIRE, 1, 500 },
			{ 4266, LOG_FIRE, 1, 500 },
			{ 5499, LOG_FIRE, 1, 500 },
			{ 5249, LOG_FIRE, 1, 500 },
			{ 5631, LOG_FIRE, 1, 500 },
			{ 5632, LOG_FIRE, 1, 500 },
			{ 5981, LOG_FIRE, 1, 500 },
			{ 1530, DOOR, 1, 500 },
			{ 7139, RUNE_CRAFT, 2, 500 },// air
			{ 7137, RUNE_CRAFT, 2, 500 },// water
			{ 7130, RUNE_CRAFT, 2, 500 },// earth
			{ 7129, RUNE_CRAFT, 2, 500 },// fire
			{ 7140, RUNE_CRAFT, 2, 500 },// mind
			{ 7134, RUNE_CRAFT, 2, 500 },// chaos
			{ 7133, RUNE_CRAFT, 2, 500 },// nature
			{ 7135, RUNE_CRAFT, 2, 500 },// law
			{ 7136, RUNE_CRAFT, 2, 500 },// death
			{ 7141, RUNE_CRAFT, 2, 500 },// blood
			{ 7138, RUNE_CRAFT, 2, 500 },// soul
			{ 7131, RUNE_CRAFT, 2, 500 },// body
			{ 7132, RUNE_CRAFT, 2, 500 },// cosmic
			{ 450, NO_ORE, 1, 500 }, { 451, NO_ORE, 1, 500 },
			{ 452, NO_ORE, 1, 500 }, { 453, NO_ORE, 1, 500 },
			{ 17010, LUNAR, 4, 500 }, { 15644, WARRIORSGUILDDOOR, 3, 500 },
			{ 9948, floor2bs, 2, 500 }, };
}

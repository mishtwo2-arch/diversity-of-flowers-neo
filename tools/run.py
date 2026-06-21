from generators.item_model import generate_item_model
from generators.potted_item_model import generate_potted_item_model
from generators.block_model import generate_block_model
from generators.potted_block_model import generate_potted_block_model
from generators.blockstates import generate_blockstates
from generators.potted_blockstates import generate_potted_blockstates
from generators.tall_blockstates import generate_tall_blockstates
from generators.tall_block_model_top import generate_tall_block_model_top
from generators.tall_block_model_bottom import generate_tall_block_model_bottom
from generators.tall_item_model import generate_tall_item_model
from generators.loot_table import generate_loot_table
from generators.tall_loot_table import generate_tall_loot_table
from generators.biome_modifier import generate_biome_modifier
from generators.configured_feature import generate_configured_feature
from generators.placed_feature import generate_placed_feature


MODID = "diversity_of_flowers_neo"

flowers = [
    "blue_kiz"
]

DO_ITEM_MODEL = True
DO_POTTED_ITEM_MODEL = True
DO_BLOCK_MODEL = True
DO_POTTED_BLOCK_MODEL = True
DO_BLOCKSTATES = True
DO_POTTED_BLOCKSTATES = True

DO_TALL_BLOCK_MODEL_TOP = False
DO_TALL_BLOCK_MODEL_BOTTOM = False
DO_TALL_ITEM_MODEL = False
DO_TALL_BLOCKSTATES = False

DO_LOOT_TABLE = True
DO_TALL_LOOT_TABLE = False

DO_BIOME_MODIFIER = True
DO_CONFIGURED_FEATURE = True
DO_PLACED_FEATURE = True





for flower in flowers:

    if DO_ITEM_MODEL:
        generate_item_model(flower, MODID)

    if DO_POTTED_ITEM_MODEL:
            generate_potted_item_model(flower, MODID)

    if DO_BLOCK_MODEL:
            generate_block_model(flower, MODID)

    if DO_POTTED_BLOCK_MODEL:
        generate_potted_block_model(flower, MODID)

    if DO_BLOCKSTATES:
        generate_blockstates(flower, MODID)

    if DO_POTTED_BLOCKSTATES:
            generate_potted_blockstates(flower, MODID)

    if DO_TALL_BLOCK_MODEL_TOP:
            generate_tall_block_model_top(flower, MODID)

    if DO_TALL_BLOCK_MODEL_BOTTOM:
        generate_tall_block_model_bottom(flower, MODID)

    if DO_TALL_ITEM_MODEL:
            generate_tall_item_model(flower, MODID)

    if DO_LOOT_TABLE:
        generate_loot_table(flower, MODID)

    if DO_TALL_LOOT_TABLE:
        generate_tall_loot_table(flower, MODID)

    if DO_TALL_BLOCKSTATES:
        generate_tall_blockstates(flower, MODID)

    if DO_BIOME_MODIFIER:
            generate_biome_modifier(flower, MODID)

    if DO_CONFIGURED_FEATURE:
        generate_configured_feature(flower, MODID)

    if DO_PLACED_FEATURE:
        generate_placed_feature(flower, MODID)

print("DONE")
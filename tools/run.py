from generators.item_model import generate_item_model
from generators.block_model import generate_block_model
from generators.blockstates import generate_blockstates
from generators.tall_block_model_top import generate_tall_block_model_top
from generators.tall_block_model_bottom import generate_tall_block_model_bottom
from generators.tall_item_model import generate_tall_item_model
from generators.loot_table import generate_loot_table

MODID = "diversity_of_flowers_neo"

flowers = [
    "ttt"
]

DO_ITEM_MODEL = True
DO_BLOCK_MODEL = True
DO_BLOCKSTATES = True

DO_TALL_BLOCK_MODEL_TOP = False
DO_TALL_BLOCK_MODEL_BOTTOM = False
DO_TALL_ITEM_MODEL = False

DO_LOOT_TABLE = True


for flower in flowers:

    if DO_ITEM_MODEL:
        generate_item_model(flower, MODID)

    if DO_BLOCK_MODEL:
            generate_block_model(flower, MODID)

    if DO_BLOCKSTATES:
        generate_blockstates(flower, MODID)

    if DO_TALL_BLOCK_MODEL_TOP:
            generate_tall_block_model_top(flower, MODID)

    if DO_TALL_BLOCK_MODEL_BOTTOM:
        generate_tall_block_model_bottom(flower, MODID)

    if DO_TALL_ITEM_MODEL:
            generate_tall_item_model(flower, MODID)

    if DO_LOOT_TABLE:
        generate_loot_table(flower, MODID)

print("DONE")
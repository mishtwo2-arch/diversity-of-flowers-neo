import json
from pathlib import Path


def generate_tall_block_model_top(name, modid):
    file_path = Path(f"../../../src/main/resources/assets/{modid}/models/block/{name}_top.json")

    data =  {
        "parent": "minecraft:block/cross",
        "textures": {
            "cross": f"{modid}:block/{name}_top"
        },
        "render_type": "cutout"
    }


    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
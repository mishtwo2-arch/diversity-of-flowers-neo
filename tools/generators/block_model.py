import json
from pathlib import Path


def generate_block_model(name, modid):
    file_path = Path(f"../src/main/resources/assets/{modid}/models/block/{name}.json")

    data = {
        "parent": "block/cross",
        "textures": {
            "cross": f"{modid}:block/{name}",
            "particle": f"{modid}:block/{name}"
        },
        "render_type": "cutout"
    }


    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
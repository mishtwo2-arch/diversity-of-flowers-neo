import json
from pathlib import Path


def generate_placed_feature(name, modid):
    file_path = Path(f"../../../src/main/resources/data/{modid}/worldgen/placed_feature/{name}.json")

    data = {
        "feature": f"{modid}:{name}",
        "placement": [
            {
                "type": "minecraft:rarity_filter",
                "chance": 1
            },
            {
                "type": "minecraft:in_square"
            },
            {
                "type": "minecraft:heightmap",
                "heightmap": "WORLD_SURFACE_WG"
            },
            {
                "type": "minecraft:biome"
            }
        ]
    }


    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
import json
from pathlib import Path


def generate_biome_modifier(name, modid):
    file_path = Path(f"../src/main/resources/data/{modid}/neoforge/biome_modifier/{name}.json")

    data = {
        "type": "neoforge:add_features",
        "biomes":[
            "minecraft:plains"
        ],
        "features": [
            f"{modid}:{name}"
        ],
        "step": "vegetal_decoration"
    }


    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
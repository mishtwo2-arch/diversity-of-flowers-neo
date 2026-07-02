import json
from pathlib import Path


def generate_item_model_1214(name, modid):
    file_path = Path(f"../src/main/resources/assets/{modid}/items/{name}.json")

    data = {
        "model": {
            "type": "minecraft:model",
            "model": f"{modid}:item/{name}"
        }
    }

    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL 1214] {file_path}")
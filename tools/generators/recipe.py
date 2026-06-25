import json
from pathlib import Path


def generate_recipe(name, modid):
    file_path = Path(f"../src/main/resources/data/{modid}/recipe/{name}.json")

    data = {
        "type": "minecraft:crafting_shapeless",
        "ingredients": [
            {
                "item": f"{modid}:{name}"
            }
        ],
        "result": {
            "id": "minecraft:ttt",
            "count": 1
        }
    }


    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
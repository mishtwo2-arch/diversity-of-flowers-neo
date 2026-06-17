import json
from pathlib import Path


def generate_blockstates(name, modid):
    file_path = Path(f"../src/main/resources/assets/{modid}/blockstates/{name}.json")

    data = {
        "variants": {
            "": {
                "model": f"{modid}:{name}"
            }
        }
    }


    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
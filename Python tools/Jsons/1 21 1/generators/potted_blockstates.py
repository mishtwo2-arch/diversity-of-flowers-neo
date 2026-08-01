import json
from pathlib import Path


def generate_potted_blockstates(name, modid):
    file_path = Path(f"../../../src/main/resources/assets/{modid}/blockstates/potted_{name}.json")

    data = {
        "variants": {
            "": { "model": f"{modid}:block/potted_{name}" }
        }
    }


    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
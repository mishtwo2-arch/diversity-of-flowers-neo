import json
from pathlib import Path


def generate_configured_feature(name, modid):
    file_path = Path(f"../../../src/main/resources/data/{modid}/worldgen/configured_feature/{name}.json")

    data = {
        "type": "minecraft:random_patch",
        "config": {
            "tries": 64,
            "xz_spread": 6,
            "y_spread": 3,
            "feature": {
                "feature": {
                    "type": "minecraft:simple_block",
                    "config": {
                        "to_place": {
                            "type": "minecraft:simple_state_provider",
                            "state": {
                                "Name": f"{modid}:{name}"
                            }
                        }
                    }
                },
                "placement": [
                    {
                        "type": "minecraft:block_predicate_filter",
                        "predicate": {
                            "type": "minecraft:all_of",
                            "predicates": [
                                {
                                    "type": "minecraft:would_survive",
                                    "state": {
                                        "Name": f"{modid}:{name}"
                                    }
                                },
                                {
                                    "type": "minecraft:matching_blocks",
                                    "blocks": "minecraft:air"
                                }
                            ]
                        }
                    }
                ]
            }
        }
    }

    with open(file_path, "w", encoding="utf-8") as file:
        json.dump(data, file, indent=2)

    print(f"[ITEM MODEL] {file_path}")
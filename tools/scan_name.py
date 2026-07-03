import os

folder = r"M:\diversity-of-flowers-neo-1-21-2\src\main\resources\assets\diversity_of_flowers_neo\items"
output = "names.txt"

names = []

for filename in os.listdir(folder):
    full_path = os.path.join(folder, filename)
    if os.path.isfile(full_path):
        name = os.path.splitext(filename)[0]
        names.append(f'"{name}"')

with open(output, "w", encoding="utf-8") as f:
    f.write(",\n".join(names))
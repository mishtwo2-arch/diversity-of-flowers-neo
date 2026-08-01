with open("flowers.txt", "r", encoding="utf-8") as file:
    flowers = file.read().splitlines()

with open("template.txt", "r", encoding="utf-8") as file:
    template = file.read()

result = ""

for flower in flowers:
    code = template.replace("{NAME}", flower)
    code = code.replace("{NAME_UPPER}", flower.upper())

    result += code + "\n"

with open("result.txt", "w", encoding="utf-8") as file:
    file.write(result)

print("Готово!")
import random

nombres = ["Rodolfo", "Frosty", "Santa", "Elfo", "Grinch"]

print("--------------------- ¿Quien es el impostor? ---------------------")

# for i in range(5):
#     nombres[1].upper()
#     print(nombres[i])

impostor = random.choice(nombres)
print("PARTICIPANTES -> ", nombres)

bool = True
contador = 1

while True:
    respuesta = input("Ingresa un nombre: ")

    if respuesta == impostor:
        print("¡Correcto! El impostor era ", impostor)
        print("Lo has adivinado en el", contador, "intento")
        break
    else:
        print("No es ese... sigue intentando")
        contador += 1

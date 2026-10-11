# Hex2RGB

## Index / Indice

* [English](#English)
* [Español](#Español)

## English

A simple interactive Java console application that converts a **6-character Hexadecimal color code** into its **RGB (Red, Green, Blue)** numeric equivalents. 

### Features
* **Bilingual Support**: Interface available in both English and Spanish.
* **Character Validation**: Automatically sanitizes inputs, converting lowercase hex characters (a-f) to uppercase (A-F).
* **Robust Error Handling**: Terminates safely with an error message if an invalid hexadecimal character is entered.

### Code Structure
The program consists of two main components:
1. `HexToRGB`: Handles the user interface, language selection, input collection for each of the 6 color characters, and general exception handling.
2. `calculator`: A helper class that processes individual hex characters into integers and calculates the final RGB values using standard base-16 math.

### Usage Example
Trying with ```#325339```
```text
1. English / 2. Español
1

Give me the first character of the color
3

Now, gimme the second
2

Third one right away
5

following with the fourth one
3

Damn, that's a lot of numbers. Just give me the 5th one already.
3

Finally...
gimme the last number to just end up with this

9
Red: 50
Green: 83
Blue: 57

```

### Requirements
* **Java Development Kit (JDK)** 8 or higher.

---

## Español

Una aplicación de consola interactiva simple en Java que convierte un **código de color hexadecimal de 6 caracteres** en sus valores numéricos equivalentes **RGB (Rojo, Verde, Azul)**. 

## Características
* **Soporte Bilingüe**: Interfaz disponible tanto en inglés como en español.
* **Validación de Caracteres**: Limpia automáticamente las entradas, convirtiendo caracteres hexadecimales en minúsculas (a-f) a mayúsculas (A-F).
* **Manejo de Errores**: Finaliza el programa de forma segura con un mensaje de error si se introduce un carácter hexadecimal no válido.

## Estructura del Código
El programa consta de dos componentes principales:
1. `HexToRGB`: Maneja la interfaz de usuario, la selección de idioma, la captura de datos para cada uno de los 6 caracteres del color y el control general de excepciones.
2. `calculator`: Una clase auxiliar que procesa caracteres hexadecimales individuales en enteros y calcula los valores RGB finales utilizando operaciones matemáticas estándar en base 16.

## Ejemplo de Uso
Probando con ```#325339```
```text
1. English / 2. Español
2

Dame el primer numero del color
3

Ahora el segundo
2

El tercero de inmediato
5

Prosiguiendo con el cuarto
3

Dios, demasiados numeros. Dame el quinto de una vez
3

Finalmente...
Dame el ultimo numero para acabar ya con esto de una vez por todas

9
Rojo: 50
Verde: 83
Azul: 57

```

## Requisitos
* **Java Development Kit (JDK)** 8 o superior.

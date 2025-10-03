# 📚 Práctica 2 Evaluable – Ejercicio 2  

Este repositorio contiene tres programas en Java diseñados para trabajar con **texto**, **filtros de líneas** y **conteo de palabras**.  

## 🚀 Proyectos incluidos
1. 📖 **LectorTexto**  
   - Lee un archivo de texto (`entrada.txt`) y envía su contenido a la salida estándar línea por línea.  
   - Si el archivo no existe, muestra un mensaje de error y termina.  

2. ✂️ **FiltraLineas**  
   - Recibe texto desde la entrada estándar y muestra solo aquellas líneas que contengan **más de 20 caracteres**.  

3. 🔢 **ContadorPalabras**  
   - Lee líneas desde la entrada estándar y devuelve el **número total de palabras**.  
   - Una palabra se considera cualquier secuencia separada por espacios.  

---

## ⚙️ Ejecución de los programas  

### ▶️ LectorTexto
```bash
java LectorTexto entrada.txt
```

### ▶️ FiltraLineas
```bash
java FiltraLineas
```
*(recibe texto por entrada estándar, escribe líneas filtradas por salida estándar)*

### ▶️ ContadorPalabras
```bash
java ContadorPalabras
```
*(recibe texto por entrada estándar, muestra número total de palabras)*

---

## 🔗 Encadenando programas con tuberías (`|`)

Gracias a las tuberías de la terminal, puedes combinar los tres programas para trabajar en cadena:  

```bash
java LectorTexto entrada.txt | java FiltraLineas | java ContadorPalabras
```

📌 Este comando:
1. Lee el archivo `entrada.txt`  
2. Filtra las líneas con más de 20 caracteres  
3. Cuenta cuántas palabras tiene el resultado final  

---

## 🧪 Manual de pruebas

1. **Ejecución independiente**  
   - Ejecuta cada programa con datos de ejemplo.  
   - Verifica que `LectorTexto` muestre el contenido de `entrada.txt`.  
   - Asegúrate de que `FiltraLineas` filtre correctamente las frases cortas.  
   - Comprueba que `ContadorPalabras` cuente bien las palabras.  

2. **Ejecución combinada (con tuberías)**  
   - Usa `|` para encadenar los tres programas.  
   - Ejemplo:  
     ```bash
     java LectorTexto entrada.txt | java FiltraLineas | java ContadorPalabras
     ```  

---

## 📝 Estructura del repositorio
```
📂 Practica2
 ├── 📄 README.md
 ├── 📂 LectorTexto
 │   └── LectorTexto.java
 ├── 📂 FiltraLineas
 │   └── FiltraLineas.java
 ├── 📂 ContadorPalabras
 │   └── ContadorPalabras.java
 └── entrada.txt
```

---

## ✨ Autor: Alberto Alcalde Montero
👨‍💻 Proyecto desarrollado para la asignatura de **Programación en Java**  
📅 Curso 2025  

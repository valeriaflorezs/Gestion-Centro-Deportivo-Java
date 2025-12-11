# 📂 Sistema de Gestión para Centro Deportivo

Este proyecto es una aplicación de escritorio desarrollada en **Java** (utilizando Swing para la GUI) que funciona como un **Sistema de Gestión de Datos** para un centro deportivo. Su principal foco técnico es la implementación de **funciones de Persistencia de Datos** a través de archivos de texto (`.txt`).

El sistema permite la administración completa del ciclo de vida de los datos de deportistas y sesiones de entrenamiento.

---

## ✨ Funcionalidades y Enfoque Técnico

El valor del proyecto reside en la implementación de la capa de acceso a datos (`ManejoArchivo.java`), que gestiona la información sin depender de una base de datos relacional tradicional.

### 1. Gestión de Archivos y Persistencia (CRUD)

* **Creación y Escritura:** Funciones para crear archivos de texto y escribir nuevos registros de deportistas y sesiones.
* **Lectura y Carga:** Métodos para leer archivos de texto y cargar datos en tiempo real en la interfaz gráfica (`DefaultTableModel`).
* **Modificación y Eliminación:** Lógica implementada para buscar registros por campos clave (ej., cédula) y actualizar o eliminar líneas específicas dentro de los archivos de texto.
* **Reiniciar Datos:** Capacidad para eliminar y regenerar archivos de datos, restaurando el sistema a un estado inicial.

### 2. Módulos de la Aplicación

| Módulo | Descripción | Persistencia de Datos |
| :--- | :--- | :--- |
| **Registro de Sesiones** | Permite agendar nuevas sesiones de entrenamiento con detalles (fecha, hora, entrenador, especialidad). | Escritura de datos en `sesiones.txt`. |
| **Deportistas** | Modificación, alta y baja de deportistas. Almacena la cédula, nombre, celular y deporte/lesión. | Escritura/modificación en `deportistas.txt`. |
| **Visualización** | Muestra el listado de deportistas, entrenadores y sesiones programadas en tablas interactivas. | Lectura de archivos y carga en `JTable`. |

## 💻 Tecnologías

* **Lenguaje de Programación:** Java
* **Entorno de Desarrollo (IDE):** Apache NetBeans IDE
* **Interfaz Gráfica:** Java Swing (Múltiples `JFrame` para la navegación)
* **Persistencia:** `java.io` (Manejo de `BufferedReader`, `PrintWriter`, `File`)

## 🚀 Cómo Ejecutar el Proyecto

1.  **Obtener el Código Fuente:** Clonar este repositorio.
2.  **Abrir en NetBeans:** Abre el proyecto en Apache NetBeans IDE (el archivo principal es `CentroDeportivo.java`).
3.  **Ejecutar:** Compila y lanza la interfaz gráfica directamente desde el IDE.

---

## 👥 Autoras

* **Valeria Florez Sarmiento**
* María Fernanda Viloria Zapata
* Katherin Barrera Lopez

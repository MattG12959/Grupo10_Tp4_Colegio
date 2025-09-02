# Grupo10_Tp4_Colegio

## 1) Gianfranco Antonacci Matias — Setup del repo + Clase Colegio (main)

### 📌 Tareas
- Crear el repo en GitHub, añadir a todos como colaboradores.  
- Inicializar proyecto Java (Maven o Gradle o estructura simple `src/`), `.gitignore`, `README.md` con enunciado y lista de integrantes (apellido, nombre).  
- Crear `src/.../Colegio.java` (clase main) que:
  - Instancia las 3 materias (**Web2, Matemáticas, Laboratorio 1**) y 2 alumnos (**López Martin legajo 1001; Mar􀆡nez Brenda legajo 1002**) como pide el enunciado.
  - Inscribe a López en 3 materias; a Martínez en 3 materias y vuelve a inscribirlo en **Laboratorio 1** (ver comportamiento frente a duplicados).
  - Crea los `static HashSet<Alumno>` y `HashSet<Materia>` que serán compartidos con los **JInternalFrames**.

### 📂 Archivos
- `README.md`  
- `pom.xml` / `build.gradle`  
- `src/.../Colegio.java`  

## 2) Altamirano Karina — Modelos: Alumno y Materia + equals/hashCode + tests

### 📌 Tareas
- Implementar `class Materia { int idMateria; String nombre; int anio; getters/setters; constructor }`.
- Implementar `class Alumno { int legajo; String apellido; String nombre; HashSet<Materia> materias; }`.
- `Alumno.agregarMateria(Materia m)` que use **HashSet** para evitar duplicados (retorna boolean o lanza excepción personalizada si ya está inscrito).
- `Alumno.cantidadMaterias()` que devuelve el tamaño del set.
- Implementar `equals()` y `hashCode()` en **Materia** (y en Alumno si es necesario) para que HashSet funcione correctamente (por ejemplo `idMateria` como key).
- Añadir **tests unitarios básicos (JUnit)** para agregar materia y verificar no duplicados.

### 📂 Archivos
- `src/.../Materia.java`  
- `src/.../Alumno.java`  
- `src/test/.../AlumnoTest.java`  

## 3) Bequis Marcos Ezequiel — Vista: Alta de Materias (JInternalFrame)

### 📌 Tareas
- Crear `VistaMaterias extends JInternalFrame` con formulario: id, nombre, año y botón **"Crear"**.
- Validaciones de entrada: id numérico, año válido, nombre no vacío.
- Al crear, añadir `Materia` al `HashSet<Materia>` estático compartido (pasado por constructor), y mostrar confirmación.
- Si el `idMateria` ya existe (equals/hashCode), mostrar diálogo informativo.

### 📂 Archivos
- `src/.../views/VistaMaterias.java`

## 4) Dave Natalia — Vista: Alta de Alumnos (JInternalFrame)

### 📌 Tareas
- Crear `VistaAlumnos extends JInternalFrame` con formulario: **legajo, apellido, nombre** y botón **"Crear"**.
- Validaciones:
  - Legajo numérico y único (según `equals/hashCode` si implementado).  
  - Campos obligatorios.
- Añadir `Alumno` al `HashSet<Alumno>` estático compartido.
- (Opcional) Mostrar lista/tabla simple de alumnos creados en el mismo frame.

### 📂 Archivos
- `src/.../views/VistaAlumnos.java`

## 5) Quiroga Dorzan Alejo — Vista: Formulario de Inscripción (JInternalFrame)

### 📌 Tareas
- Crear `VistaInscripcion extends JInternalFrame` que reciba los `HashSet<Alumno>` y `HashSet<Materia>`.
- UI: combo box / lista para seleccionar **Alumno** y **Materia**, botón **"Inscribir"**.
- Llamar a `Alumno.agregarMateria(materia)` (⚠️ no duplicar lógica en la UI).
- Mostrar mensajes: éxito, ya inscrito o error si faltan datos.
- Al inscribir, actualizar visualización de `Alumno.cantidadMaterias()` en pantalla.

### 📂 Archivos
- `src/.../views/VistaInscripcion.java`

## 6) Franzinni Tatiana — Integración UI / Desktop / Menú / Empaque final

### 📌 Tareas
- Implementar el `JFrame` principal (ej. `MainFrame` o `AppFrame`) con `JDesktopPane` llamado **escritorio**.
- Crear `JMenuBar` con 4 `JMenuItems`: **Alta Materias, Alta Alumnos, Inscripción, Salir**.  
  Cada ítem abre su correspondiente `JInternalFrame`.
- Asegurar que los `HashSet` estáticos se pasen al constructor de los `JInternalFrame`.
- Manejar cierre, layout y empaquetado `.jar` (o instrucciones de ejecución).
- Preparar **screenshots** y un **mini manual en `README.md`** sobre cómo ejecutar y probar la app.

### 📂 Archivos
- `src/.../MainFrame.java` (o `App.java`)  
- updates en `README.md`

\# Parcial 1 – Proyecto Java Maven



Este proyecto en \*\*Java\*\* utilizando \*\*Maven\*\* implementa un sistema con la siguiente estructura:



\- \*\*Entities\*\* → clases de dominio (incluye una clase abstracta `PersonaEntity`).

\- \*\*Interfaces\*\* → contratos de comportamiento (`PersonaInterface`, `RegistrarInterface`, `ConsultarInterface`).

\- \*\*Repositories\*\* → almacenamiento en memoria de clientes y empleados.

\- \*\*Services\*\* → lógica de negocio para gestionar clientes y empleados.

\- \*\*Main\*\* → punto de entrada para ejecutar el programa.



\## 📌 Objetivo

Desarrollar un sistema académico que permita registrar y consultar clientes y empleados, aplicando buenas prácticas de programación en Java y utilizando Maven para la gestión del proyecto.



\## 🧱 Tecnologías

\- Java 11+

\- Maven



\## 📂 Estructura del proyecto


src/main/java/com/erickalcon/parcial1

├── Entities

│ ├── ClienteEntity.java

│ ├── EmpleadoEntity.java

│ └── PersonaEntity.java # abstracta

│

├── Entities/Interfaces

│ ├── PersonaInterface.java

│ ├── RegistrarInterface.java

│ └── ConsultarInterface.java

│

├── Repositories

│ ├── ClienteRepository.java

│ └── EmpleadoRepository.java

│

├── Services

│ ├── ClienteService.java

│ └── EmpleadoService.java

│

└── Main.java



\## ▶️ Cómo ejecutar

\*\*En NetBeans:\*\*  

Seleccionar `Main.java` → \*\*Run\*\*.



\*\*En consola:\*\*

```bash

mvn clean compile exec:java -Dexec.mainClass=com.erickalcon.parcial1.Main

Ramas del proyecto

main → contiene solo README.md y LICENSE.



dev → rama de desarrollo principal con todo el código.



feature → para nuevas funciones o cambios específicos.

📝 Licencia

Este proyecto está bajo la licencia MIT.

Consulta el archivo LICENSE para más detalles.





---



Cuando lo pegues en tu archivo `README.md`, lo guardes y hagas commit, tu repositorio en GitHub se verá con la descripción completa y profesional.  



¿Quieres que después de esto te guíe para dejar \*\*main\*\* solo con README y LICENSE y que \*\*dev\*\* y \*\*feature\*\* tengan el código?






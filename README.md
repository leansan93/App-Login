


##  Descripción general

Este proyecto es una aplicación Java que **simula un sistema de registro y gestión de usuarios**, diferenciando roles entre **Usuario** y **Administrador**.
El objetivo principal es demostrar el uso de **CRUD**, **JPA** y **conexión a base de datos MySQL**, aplicando buenas prácticas de programación orientada a objetos.

La aplicación permite realizar operaciones básicas sobre usuarios registrados, con permisos distintos según el tipo de rol.

---

##  Roles y funcionalidades

###  Usuario

El rol **Usuario** tiene permisos limitados y puede:

* Ver la **cantidad de usuarios registrados** en la aplicación
* **Recargar la vista** para obtener la información más actualizada desde la base de datos

 No puede modificar información.

---

###  Administrador

El rol **Administrador** tiene control total sobre los usuarios y puede:

* **Crear** nuevos usuarios
* **Editar** usuarios existentes
* **Eliminar** usuarios
* **Recargar la tabla** para reflejar cambios luego de una edición o eliminación

Todas estas acciones se realizan mediante operaciones **CRUD** conectadas a la base de datos.

---

##  Tecnologías utilizadas

* Java
* JPA (Java Persistence API)
* MySQL
* Maven
* NetBeans
* Git / GitHub

---

##  Base de datos

La aplicación se conecta a una base de datos **MySQL**, donde se almacenan los usuarios registrados.
Las operaciones de alta, baja, modificación y consulta se realizan directamente sobre la base mediante JPA.

---

## Ejecución del proyecto

Para probar la aplicación:

1. Configurar la conexión a MySQL
2. Crear la base de datos correspondiente
3. Ejecutar la aplicación desde la clase principal:


Login

----------
## Objetivo del proyecto

Este proyecto fue desarrollado con fines **educativos y demostrativos**, pensado como un **mini sistema realista** para mostrar conocimientos en:

* Persistencia de datos
* CRUD
* Manejo de roles
* Conexión a base de datos
* Estructura de proyectos Java




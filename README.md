### API CRUD Java Spring Boot

Proyecto CRUD desarrollado con Java 17, Spring Boot para el backend, PostgreSQL como base de datos, y Angular para el frontend!

### Contenido del Proyecto

El proyecto se centra en un CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar tarjetas de crédito. A continuación, se detallan las principales funcionalidades implementadas:

- 1. Listado de Tarjetas
Descripción: Visualización de las tarjetas existentes con detalles como nombre, número, tipo y código secreto.
Endpoint API: /api/card
Método: GET
- 2. Registro de Nueva Tarjeta
Descripción: Permite agregar una nueva tarjeta con su correspondiente código secreto.
Endpoint API: /api/tarjetas
Método: POST
- 3. Actualización de Tarjeta
Descripción: Funcionalidad para actualizar la información de una tarjeta existente.
Endpoint API: /api/card/{id}
Método: PUT
- 4. Eliminación de Tarjeta
Descripción: Posibilidad de eliminar una tarjeta de la base de datos.
Endpoint API: /api/card/{id}
Método: DELETE

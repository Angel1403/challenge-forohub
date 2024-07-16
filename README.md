# 🌐 Challenge ForoHub API Rest

## 📖 Descripción del Proyecto
Este proyecto consiste en una API Rest desarrollada en Java Spring Boot para el Challenge ForoHub. La API permite a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) relacionadas con los "Tópicos" y sus datos correspondientes. Utiliza MySQL para almacenar los tópicos registrados mediante la API, JPA para el mapeo de entidades, y Spring Web para la exposición de endpoints RESTful.

La aplicación también integra características como seguridad con Spring Security y JWT (Json Web Token) para permitir únicamente solicitudes de usuarios autenticados, utilizando BCrypt para el hash de contraseñas. Se utiliza Flyway Migration para gestionar las migraciones de base de datos y mantener un control versionado. Además, se documenta la API utilizando [Spring Doc OpenAPI Swagger](https://springdoc.org/) para una fácil comprensión y prueba de los endpoints.

## 🛠️ Tecnologías Utilizadas
Este proyecto ha sido desarrollado utilizando las siguientes tecnologías y herramientas:
- **Java Spring Boot**: Framework para el desarrollo de aplicaciones web y API RESTful.
- **MySQL**: Sistema de gestión de bases de datos relacional utilizado para almacenar los topicos registrados.
- **JPA (Java Persistence API)**: Especificación de Java para el mapeo objeto-relacional.
- **Lombok**: Biblioteca que ayuda a reducir el código boilerplate en Java.
- **Spring Web**: Parte de Spring Framework para construir aplicaciones web, incluyendo APIs RESTful.
- **Spring Boot DevTools**: Herramientas para el desarrollo que permiten la recarga automática de la aplicación Spring Boot.
- **Flyway Migration**: Librería para gestionar las migraciones de base de datos.
- **MySQL Driver**: Controlador JDBC para MySQL.
- **Validation**: API de validación de datos en Spring.
- **Spring Security / JWT (Json Web Token)**: Para la autenticación de usuarios y la protección de los endpoints.
- **BCrypt**: Función de hash utilizada para almacenar contraseñas de forma segura.
- [**Spring Doc OpenAPI Swagger**](https://springdoc.org/): Herramienta para documentar automáticamente APIs RESTful.

---

¡Gracias por tu interés en el Challenge ForoHub! 😊

# ForoHub - Alura Challenge

Una API RESTful para un foro interactivo, desarrollada como parte del Alura Challenge. Permite a los usuarios crear, leer, actualizar y eliminar temas de discusión, además de gestionar la autenticación mediante JWT.

## Características <img src="https://img.shields.io/badge/Features-informational" alt="Features">

*   Creación, lectura, actualización y eliminación de temas (CRUD).
*   Autenticación basada en JWT (JSON Web Tokens).
*   Endpoints RESTful bien definidos.
*   [Otras características relevantes de tu API]

## Instalación <img src="https://img.shields.io/badge/Installation-informational" alt="Installation">

Para ejecutar este proyecto localmente, sigue estos pasos:

1.  Clona el repositorio usando Git: <img src="https://img.shields.io/badge/git clone-blue" alt="git clone">
    ```bash
    git clone https://github.com/tu_usuario/foro-hub.git
    ```

2.  Navega al directorio del proyecto: <img src="https://img.shields.io/badge/cd-lightgrey" alt="cd">
    ```bash
    cd tu-repositorio
    ```

3.  Construye el proyecto con Maven (o tu sistema de construcción): <img src="https://img.shields.io/badge/mvn clean install-green" alt="mvn clean install">
    ```bash
    mvn clean install
    ```

4.  Ejecuta la aplicación: <img src="https://img.shields.io/badge/mvn spring--boot:run-brightgreen" alt="mvn spring-boot:run">
    ```bash
    mvn spring-boot:run
    ```

## 🚀 Uso 

Puedes utilizar herramientas como [Insomnia](https://insomnia.rest/) o [Postman](https://www.postman.com/) para probar la API. La autenticación es requerida para la mayoría de las rutas que modifican datos.

### Endpoints <img src="https://img.shields.io/badge/Endpoints-informational" alt="Endpoints">

#### Crear un Tópico <img src="https://img.shields.io/badge/POST-green" alt="POST"> `/topics` 

Cuerpo de la solicitud (JSON):
    
    {
      "titulo": "Pregunta sobre Spring Boot",
      "mensaje": "¿Cómo configurar un filtro de seguridad?",
      "autor": "nombre del autor", 
        "curso": "nombre del curso" 
    }



#### Obtener Todos los Tópicos <img src="https://img.shields.io/badge/GET-blue" alt="GET"> /topics


#### Obtener un Tópico por ID <img src="https://img.shields.io/badge/GET-blue" alt="GET"> /topics/{id}



#### Actualizar un Tópico <img src="https://img.shields.io/badge/PUT-yellow" alt="PUT"> /topics/{id} 
Cuerpo de la solicitud (JSON):

    {
    "titulo": "Pregunta sobre Spring Boot (actualizada)",
    "mensaje": "¿Cómo configurar correctamente un filtro de seguridad?",
    "autor": "nombre del autor", 
    "curso": "nombre del curso" 
    }


#### Eliminar un Tópico <img src="https://img.shields.io/badge/DELETE-red" alt="DELETE"> /topics/{id}


## 🔐Autenticación JWT
Para obtener un token JWT, realiza una solicitud POST a /login:

Cuerpo de la solicitud (JSON):


    {
    "email": "usuario@example.com",
    "contrasena": "password123"
    }

#### Respuesta con el TOKEN:

    {
    "token": "el_token_jwt"
    }

Usa el token recibido en la cabecera Authorization:

    Authorization: Bearer <token>


## Desarrollado por Ian Rodriguez

<div style="display: flex; justify-content: flex-start;">
<a href="https://www.linkedin.com/in/ian-rodriguez-8351a1221" target="_blank">
<img src="./img/linkedIn_icon.png" alt=linkedin style="margin-bottom: 5px;width:45px;" />
</a>
<a href="https://github.com/ianrodriguezy" target="_blank">
<img src="./img/github.svg" alt=github style="margin-bottom: 5px;width:46px;" />
</a>
</div>

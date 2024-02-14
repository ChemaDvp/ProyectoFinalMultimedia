# Proyecto Final / 2º Trimestre / DAM

#### Asignatura: Multimedia
#### Profesores: José Carlos / Jorge Juan
---

## Índice

- [Aplicación Android](#aplicación-android)
- [Requisitos](#requisitos)
  - [Temática de la Aplicación](#temática-de-la-aplicación)
  - [Componentes Obligatorios](#componentes-obligatorios)
    - [Activities](#activities)
    - [Fragments](#fragments)
    - [Botones](#botones)
    - [Campos de Texto](#campos-de-texto)
    - [Listas](#listas)
    - [Barra de Navegación Inferior](#barra-de-navegación-inferior)
    - [Toasts](#toasts)
    - [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Funcionalidades Adicionales](#funcionalidades-adicionales)
    - [OPCIÓN ELEGIDA](#opción-elegida)

---

## Aplicación Android

Este proyecto tiene como objetivo la creación de una aplicación en Android Studio que cumpla con los requisitos mínimos establecidos para su aprobación. A continuación, se detallan las directrices y componentes obligatorios que deben implementarse:

## Requisitos
#### Temática de la Aplicación
Cada estudiante deberá seleccionar un tema único para su aplicación, evitando la repetición entre compañeros. En caso de no utilizar la API de Twitter proporcionada para el acceso, se deberá elegir una temática original.

#### TEMÁTICA ELEGIDA: Jugadores de Futbol

## Componentes Obligatorios
### Activities
La aplicación debe contar con al menos dos actividades:

1. Actividad de Login.

![login](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/c9eaf341-7cf3-4d43-b224-db5383e36744)

   
2. Actividad principal, a la cual se redirigirá al usuario tras un inicio de sesión exitoso.

![actividadPrincipal](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/e3d03d59-301b-46cc-af7b-78bf6caa26e0)


### Fragments
La actividad principal debe incluir varios fragments:

![fragments](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/2a14a588-bcfb-412d-8b07-4030a8cf4682)

1. **Fragment "Home"**: Realiza automáticamente una consulta para obtener todos los elementos y mostrarlos en una lista.

![actividadPrincipal](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/95f3409e-917f-4f37-854a-deb80ee80690)

   
2. **Fragment para crear un nuevo elemento**.

![fragmentAñadir](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/295079db-e3d4-4895-8857-3c353758e267)

   
3. **Fragment para modificar un elemento existente**.

![fragmentActualizar](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/4dc1fd94-07ca-4c15-b013-f65597bfecff)

   
4. **Fragment para eliminar un elemento**.

![fragmentBorrar](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/b99c7588-32a2-419a-b19a-a4cf34430ba9)

   

### Botones
Integrar botones en las distintas pantallas para facilitar la interacción del usuario.

- Botones Login:

![botones1](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/3b6e284e-16cd-4935-b025-6fe71903a5c2)

- Boton ejemplo Añadir:

![botones2](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/0215c4bb-38f2-4ff0-b1d8-848e87e0bf5e)

- Boton ejemplo Actualizar:

![botones3](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/6d47df27-b4a0-42c8-bb7a-73a043313526)


### Campos de Texto
Incluir campos de texto para introducir información en los fragments correspondientes.

- Ejemplo Campos de Texto:

![camposTexto1](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/bf778a8f-3b4e-4643-88a5-50afe54f364c)


### Listas
Mostrar los elementos en listas, donde cada elemento deberá incluir al menos el nombre y una breve descripción debajo de él. Debe haber una cantidad suficiente de elementos para permitir el desplazamiento en la lista.

https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/bf006aec-05ef-434e-bf43-89aefa3cc4cd

### Barra de Navegación Inferior
Implementar una barra de navegación inferior para facilitar la transición entre los fragments. Debe incluir un botón que cierre la sesión y lleve al usuario de vuelta a la actividad de login.

![menuDesplazamiento](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/b44c317c-9b89-4f87-8819-748c37d435aa)


### Toasts
Notificar mediante Toast la creación, modificación o eliminación de elementos. También, notificar mediante Toast si el inicio de sesión es correcto o incorrecto.

- Toast de Añadir, Modificar y Borrar:
  
![toast3](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/2dbf8ae6-3007-4bc5-9b81-b667dc059c3d)

![toast2](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/b6275ce1-e488-41b4-a21a-1e7aa2bddf8c)

![toast1](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/f2930792-7dc2-4c3f-8a63-5be81718c9d8)


- Toast Inicio o Fallo de Sesión:

![toast1](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/f1539365-c5d8-4a64-90c9-47ca5a694cb1)

![toast2](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/ecaabee7-7169-475f-b9b6-b4600ea353c8)

- Toast campos rellenos:

![toast3](https://github.com/ChemaDvp/ProyectoFinalMultimedia/assets/115820368/d37a5175-f242-4384-b71b-dcfc6ac62e90)


### Tecnologías Utilizadas
- **SQLite**: Se utilizará para la gestión de la base de datos.
- **JavaDoc**: El código deberá estar debidamente comentado con JavaDoc.

## Funcionalidades Adicionales:
### OPCIÓN ELEGIDA: 
#### Opción 1: Consumir un API Público y Loguearse mediante Google

- Consumir una API pública diferente por cada estudiante (sin repeticiones).
  - API pública (PROPIA CREACIÓN): https://github.com/ChemaDvp/ApiBasica.git
- Implementar el inicio de sesión utilizando las credenciales de Google.

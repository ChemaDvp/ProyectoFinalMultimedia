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
2. Actividad principal, a la cual se redirigirá al usuario tras un inicio de sesión exitoso.

### Fragments
La actividad principal debe incluir varios fragments:

1. **Fragment "Home"**: Realiza automáticamente una consulta para obtener todos los elementos y mostrarlos en una lista.
2. **Fragment para crear un nuevo elemento**.
3. **Fragment para modificar un elemento existente**.
4. **Fragment para eliminar un elemento**.

### Botones
Integrar botones en las distintas pantallas para facilitar la interacción del usuario.

### Campos de Texto
Incluir campos de texto para introducir información en los fragments correspondientes.

### Listas
Mostrar los elementos en listas, donde cada elemento deberá incluir al menos el nombre y una breve descripción debajo de él. Debe haber una cantidad suficiente de elementos para permitir el desplazamiento en la lista.

### Barra de Navegación Inferior
Implementar una barra de navegación inferior para facilitar la transición entre los fragments. Debe incluir un botón que cierre la sesión y lleve al usuario de vuelta a la actividad de login.

### Toasts
Notificar mediante Toast la creación, modificación o eliminación de elementos. También, notificar mediante Toast si el inicio de sesión es correcto o incorrecto.

### Tecnologías Utilizadas
- **SQLite**: Se utilizará para la gestión de la base de datos.
- **JavaDoc**: El código deberá estar debidamente comentado con JavaDoc.

## Funcionalidades Adicionales:
### OPCIÓN ELEGIDA: 
#### Opción 1: Consumir un API Público y Loguearse mediante Google

- Consumir un API público diferente por cada estudiante (sin repeticiones).
  - API pública (PROPIA CREACIÓN): https://github.com/ChemaDvp/ApiBasica.git
- Implementar el inicio de sesión utilizando las credenciales de Google.

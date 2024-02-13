# Proyecto Final / 2º Trimestre / DAM

#### Asignatura: Multimedia
#### Profesores: José Carlos / Jorge Juan
---

## Aplicación Android


Este proyecto tiene como objetivo la creación de una aplicación en Android Studio que cumpla con los requisitos mínimos establecidos para su aprobación. A continuación, se detallan las directrices y componentes obligatorios que deben implementarse:

## Requisitos

### Temática de la Aplicación

Cada estudiante deberá seleccionar un tema único para su aplicación, evitando la repetición entre compañeros. En caso de no utilizar la API de Twitter proporcionada para el acceso, se deberá elegir una temática original.
#### TEMÁTICA ELEGIDA: Jugadores de Futbol

### Componentes Obligatorios

#### Activities

La aplicación debe contar con al menos dos actividades:

1. Actividad de Login.
2. Actividad principal, a la cual se redirigirá al usuario tras un inicio de sesión exitoso.

#### Fragments

La actividad principal debe incluir varios fragments:

1. **Fragment "Home"**: Realiza automáticamente una consulta para obtener todos los elementos y mostrarlos en una lista.
2. **Fragment para crear un nuevo elemento**.
3. **Fragment para modificar un elemento existente**.
4. **Fragment para eliminar un elemento**.

#### Botones

Integrar botones en las distintas pantallas para facilitar la interacción del usuario.

#### Campos de Texto

Incluir campos de texto para introducir información en los fragments correspondientes.

#### Listas

Mostrar los elementos en listas, donde cada elemento deberá incluir al menos el nombre y una breve descripción debajo de él. Debe haber una cantidad suficiente de elementos para permitir el desplazamiento en la lista.

#### Barra de Navegación Inferior

Implementar una barra de navegación inferior para facilitar la transición entre los fragments. Debe incluir un botón que cierre la sesión y lleve al usuario de vuelta a la actividad de login.

#### Toasts

Notificar mediante Toast la creación, modificación o eliminación de elementos. También, notificar mediante Toast si el inicio de sesión es correcto o incorrecto.

### Tecnologías Utilizadas

- **SQLite**: Se utilizará para la gestión de la base de datos.
- **JavaDoc**: El código deberá estar debidamente comentado con JavaDoc.

### README

Incluir un README completo que contenga:

- Pantallazos de cada pantalla de la aplicación con una explicación detallada.
- Información sobre las versiones utilizadas, dependencias, y cualquier otra información relevante para la reproducción y comprensión del proyecto.

**Nota**: Asegúrese de seguir las mejores prácticas de desarrollo de Android y de proporcionar un código limpio y bien estructurado.

# Funcionalidades Adicionales (Opción de Obtener Puntuación de 10)

### Opción 1: Consumir un API Público y Loguearse mediante Google

- Consumir un API público diferente por cada estudiante (sin repeticiones).
- Implementar el inicio de sesión utilizando las credenciales de Google.

#### Puntuación:

- Consumir API público: 3.5 puntos.
- Loguearse con Google: 1.5 puntos.



# UT2. TAREA 4: RICK AND MORTY

Tarea 4 del tema 2 de la asignatura ADT (Acceso a Datos)


## Autores

- [Daniel Guttman](https://github.com/DGuttmanDev)
## Como ejecutar

Para ejecutar este proyecto se debe de ejecutar la clase Main.


## Documentación

La clase Main, al ejecutarla genera un JFrame el cual se puede manejar para poder obtener múltiples datos acerca de personajes del mundo de Rick & Morty.

Al ejecutar podremos observar la siguiente interfaz:

![Screenshot](https://i.ibb.co/XkGZy30/home.png)

Este JFrame contiene 2 botones los cuales si el usuario hace click se genera un jDialog.

### Boton aliens vivos

Si el usuario hace click sobre este botón, se mostrará un jDialog que indicará la cantidad de aliens vivos
y una lista con los nombres de todos los aliens.

![Screenshot](https://i.ibb.co/PDVRGL5/alien.png)

### Boton personaje femenino con más episodios

Mustra todos los datos acerca de este personaje. Los datos mostrados son:

    - Id
    - Nombre
    - Estado 
    - Especie 
    - Cantidad de episodios
    - Lista con las url de los episodios en los que aparece

![Screenshot](https://i.ibb.co/2ZQCXBt/female.png)
## Errores conocidos

El único error conocido es que en ambos jDialog (ver alienígenas vivos y mostrar personaje femenino), al cerrar la ventana la primera vez esta no cierra. Se debe de volver a cerrar la ventana para que esta finalmente se cierre.
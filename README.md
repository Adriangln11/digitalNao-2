# Aplicacion CRUD Java.

- Realiza peticiones `GET` a la API de <a href="https://serpapi.com/google-scholar-api">Google Scholar API</a>.
- Obtiene datos de autores mediante un id o  nombre.
- Realiza consultas a una DB Mysql(INSERT, SELECT, UPDATE, DELETE).
## Instalacion.

### GitHub:
```bash
    #clona el repositorio de Github
    $git clone https://github.com/Adriangln11/digitalNao-2.git
    cd digitalNao-2 
````
### Manualmente:
- Descarga el .zip.
- Descomprimelo en tu directorio

## Configuracion del entorno.
- En ambos casos es necesario descargar las dependencias necesarias:
```Java
import org.json.JSONArray;
import org.json.JSONObject;
```
- Cambiar el valor del atributo `password` de la clase `DBModel` que esta dentro de la carpeta `Model`, por la contrasenia de tu base de datos local.

- Compilar y correr el archivo `main`.

#Conversor de Moneda
Este proyecto en Java implementa un conversor de moneda que utiliza el API de tasas de cambio para realizar conversiones entre diferentes monedas. La aplicación permite al usuario ingresar un monto en una moneda específica y convertirlo a otra moneda seleccionada.

Características
Obtención de Tasas de Cambio: Utiliza el API de tasas de cambio para obtener las tasas actuales entre diferentes monedas.
v6.exchangerate-api.com

Interfaz de Usuario Interactiva: Permite al usuario seleccionar las monedas de origen y destino, además de ingresar el monto a convertir.

Manejo de Errores: Implementa manejo de errores para gestionar situaciones donde no se pueden obtener las tasas de cambio correctamente desde el API.

Requisitos
Java JDK 11 o superior
Biblioteca Gson 2.10.1 o superior
Postman para pruebas (opcional)
IDE (por ejemplo, IntelliJ IDEA) para desarrollo
Instalación y Uso
Clona este repositorio en tu máquina local.

bash
Copiar código
git clone <URL-del-repositorio>
Abre el proyecto en tu IDE preferido (por ejemplo, IntelliJ IDEA).

Configura las dependencias y el entorno de desarrollo según se indica en la sección de requisitos.

Ejecuta la aplicación desde tu IDE.

Sigue las instrucciones en la consola para ingresar las monedas y montos a convertir.

Ejemplo de Uso
yaml
Copiar código
Ingrese el código de la moneda principal:
USD
Ingrese la cantidad en Dólar estadounidense:
100
Ingrese el código de la moneda a la que desea convertir:
EUR
Resultado: 100 USD = 93.10 EUR (tasas de cambio actuales)



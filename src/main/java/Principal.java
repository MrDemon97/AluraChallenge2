import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args){
        // Verificar la configuración inicial imprimiendo un mensaje en JSON usando Gson
        Gson gson = new Gson();
        String message = gson.toJson("Hola, mundo!");
        System.out.println(message);

        // Aquí puedes empezar a implementar la lógica de tu conversor de monedas
        // Por ejemplo, podrías comenzar llamando a una API de conversión de monedas
        // y procesando los datos recibidos.
    }
}

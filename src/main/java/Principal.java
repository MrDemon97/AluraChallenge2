import com.alura.challenge.ClienteApi;
import com.alura.challenge.ConversorDeMoneda;
import com.alura.challenge.Moneda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    private static final Map<String, String> codigosNombresMonedas = new HashMap<>();

    static {
        codigosNombresMonedas.put("USD", "Dólar estadounidense");
        codigosNombresMonedas.put("AED", "Dirham de los Emiratos Árabes Unidos");
        codigosNombresMonedas.put("AFN", "Afgani afgano");
        codigosNombresMonedas.put("ALL", "Lek albanés");
        codigosNombresMonedas.put("AMD", "Dram armenio");
        codigosNombresMonedas.put("ANG", "Florín de las Antillas Neerlandesas");
        codigosNombresMonedas.put("AOA", "Kwanza angoleño");
        codigosNombresMonedas.put("ARS", "Peso argentino");
        codigosNombresMonedas.put("AUD", "Dólar australiano");
        codigosNombresMonedas.put("AWG", "Florín arubeño");
        codigosNombresMonedas.put("AZN", "Manat azerbaiyano");
        codigosNombresMonedas.put("BAM", "Marco convertible de Bosnia-Herzegovina");
        codigosNombresMonedas.put("BBD", "Dólar de Barbados");
        codigosNombresMonedas.put("BDT", "Taka de Bangladesh");
        codigosNombresMonedas.put("BGN", "Lev búlgaro");
        codigosNombresMonedas.put("BHD", "Dinar bahreiní");
        codigosNombresMonedas.put("BIF", "Franco burundés");
        codigosNombresMonedas.put("BMD", "Dólar bermudeño");
        codigosNombresMonedas.put("BND", "Dólar de Brunéi");
        codigosNombresMonedas.put("BOB", "Boliviano");
        codigosNombresMonedas.put("BRL", "Real brasileño");
        codigosNombresMonedas.put("BSD", "Dólar bahameño");
        codigosNombresMonedas.put("BTN", "Ngultrum butanés");
        codigosNombresMonedas.put("BWP", "Pula botsuana");
        codigosNombresMonedas.put("BYN", "Rublo bielorruso");
        codigosNombresMonedas.put("BZD", "Dólar beliceño");
        codigosNombresMonedas.put("CAD", "Dólar canadiense");
        codigosNombresMonedas.put("CDF", "Franco congoleño");
        codigosNombresMonedas.put("CHF", "Franco suizo");
        codigosNombresMonedas.put("CLP", "Peso chileno");
        codigosNombresMonedas.put("CNY", "Yuan chino");
        codigosNombresMonedas.put("COP", "Peso colombiano");
        codigosNombresMonedas.put("CRC", "Colón costarricense");
        codigosNombresMonedas.put("CUP", "Peso cubano");
        codigosNombresMonedas.put("CVE", "Escudo caboverdiano");
        codigosNombresMonedas.put("CZK", "Corona checa");
        codigosNombresMonedas.put("DJF", "Franco yibutiano");
        codigosNombresMonedas.put("DKK", "Corona danesa");
        codigosNombresMonedas.put("DOP", "Peso dominicano");
        codigosNombresMonedas.put("DZD", "Dinar argelino");
        codigosNombresMonedas.put("EGP", "Libra egipcia");
        codigosNombresMonedas.put("ERN", "Nakfa eritreo");
        codigosNombresMonedas.put("ETB", "Birr etíope");
        codigosNombresMonedas.put("EUR", "Euro");
        codigosNombresMonedas.put("FJD", "Dólar fiyiano");
        codigosNombresMonedas.put("FKP", "Libra malvinense");
        codigosNombresMonedas.put("FOK", "Corona faroesa");
        codigosNombresMonedas.put("GBP", "Libra esterlina");
        codigosNombresMonedas.put("GEL", "Lari georgiano");
        codigosNombresMonedas.put("GGP", "Libra de Guernsey");
        codigosNombresMonedas.put("GHS", "Cedi ghanés");
        codigosNombresMonedas.put("GIP", "Libra de Gibraltar");
        codigosNombresMonedas.put("GMD", "Dalasi gambiano");
        codigosNombresMonedas.put("GNF", "Franco guineano");
        codigosNombresMonedas.put("GTQ", "Quetzal guatemalteco");
        codigosNombresMonedas.put("GYD", "Dólar guyanés");
        codigosNombresMonedas.put("HKD", "Dólar de Hong Kong");
        codigosNombresMonedas.put("HNL", "Lempira hondureño");
        codigosNombresMonedas.put("HRK", "Kuna croata");
        codigosNombresMonedas.put("HTG", "Gourde haitiano");
        codigosNombresMonedas.put("HUF", "Forinto húngaro");
        codigosNombresMonedas.put("IDR", "Rupia indonesia");
        codigosNombresMonedas.put("ILS", "Nuevo séquel israelí");
        codigosNombresMonedas.put("IMP", "Libra esterlina de la Isla de Man");
        codigosNombresMonedas.put("INR", "Rupia india");
        codigosNombresMonedas.put("IQD", "Dinar iraquí");
        codigosNombresMonedas.put("IRR", "Rial iraní");
        codigosNombresMonedas.put("ISK", "Corona islandesa");
        codigosNombresMonedas.put("JEP", "Libra esterlina de Jersey");
        codigosNombresMonedas.put("JMD", "Dólar jamaicano");
        codigosNombresMonedas.put("JOD", "Dinar jordano");
        codigosNombresMonedas.put("JPY", "Yen japonés");
        codigosNombresMonedas.put("KES", "Chelín keniano");
        codigosNombresMonedas.put("KGS", "Som kirguís");
        codigosNombresMonedas.put("KHR", "Riel camboyano");
        codigosNombresMonedas.put("KID", "Dólar de Kiribati");
        codigosNombresMonedas.put("KMF", "Franco comorense");
        codigosNombresMonedas.put("KRW", "Won surcoreano");
        codigosNombresMonedas.put("KWD", "Dinar kuwaití");
        codigosNombresMonedas.put("KYD", "Dólar de las Islas Caimán");
        codigosNombresMonedas.put("KZT", "Tenge kazajo");
        codigosNombresMonedas.put("LAK", "Kip laosiano");
        codigosNombresMonedas.put("LBP", "Libra libanesa");
        codigosNombresMonedas.put("LKR", "Rupia de Sri Lanka");
        codigosNombresMonedas.put("LRD", "Dólar liberiano");
        codigosNombresMonedas.put("LSL", "Loti de Lesoto");
        codigosNombresMonedas.put("LYD", "Dinar libio");
        codigosNombresMonedas.put("MAD", "Dirham marroquí");
        codigosNombresMonedas.put("MDL", "Leu moldavo");
        codigosNombresMonedas.put("MGA", "Ariary malgache");
        codigosNombresMonedas.put("MKD", "Dinar macedonio");
        codigosNombresMonedas.put("MMK", "Kyat birmano");
        codigosNombresMonedas.put("MNT", "Tugrik mongol");
        codigosNombresMonedas.put("MOP", "Pataca de Macao");
        codigosNombresMonedas.put("MRU", "Uguiya mauritano");
        codigosNombresMonedas.put("MUR", "Rupia mauriciana");
        codigosNombresMonedas.put("MVR", "Rupia de Maldivas");
        codigosNombresMonedas.put("MWK", "Kwacha malauí");
        codigosNombresMonedas.put("MXN", "Peso mexicano");
        codigosNombresMonedas.put("MYR", "Ringgit malayo");
        codigosNombresMonedas.put("MZN", "Metical mozambiqueño");
        codigosNombresMonedas.put("NAD", "Dólar namibio");
        codigosNombresMonedas.put("NGN", "Naira nigeriana");
        codigosNombresMonedas.put("NIO", "Córdoba nicaragüense");
        codigosNombresMonedas.put("NOK", "Corona noruega");
        codigosNombresMonedas.put("NPR", "Rupia nepalesa");
        codigosNombresMonedas.put("NZD", "Dólar neozelandés");
        codigosNombresMonedas.put("OMR", "Rial omaní");
        codigosNombresMonedas.put("PAB", "Balboa panameño");
        codigosNombresMonedas.put("PEN", "Sol peruano");
        codigosNombresMonedas.put("PGK", "Kina papú");
        codigosNombresMonedas.put("PHP", "Peso filipino");
        codigosNombresMonedas.put("PKR", "Rupia pakistaní");
        codigosNombresMonedas.put("PLN", "Zloty polaco");
        codigosNombresMonedas.put("PYG", "Guaraní paraguayo");
        codigosNombresMonedas.put("QAR", "Riyal qatarí");
        codigosNombresMonedas.put("RON", "Leu rumano");
        codigosNombresMonedas.put("RSD", "Dinar serbio");
        codigosNombresMonedas.put("RUB", "Rublo ruso");
        codigosNombresMonedas.put("RWF", "Franco ruandés");
        codigosNombresMonedas.put("SAR", "Riyal saudí");
        codigosNombresMonedas.put("SBD", "Dólar de las Islas Salomón");
        codigosNombresMonedas.put("SCR", "Rupia seychelense");
        codigosNombresMonedas.put("SDG", "Libra sudanesa");
        codigosNombresMonedas.put("SEK", "Corona sueca");
        codigosNombresMonedas.put("SGD", "Dólar de Singapur");
        codigosNombresMonedas.put("SHP", "Libra de Santa Elena");
        codigosNombresMonedas.put("SLE", "Leone de Sierra Leona");
        codigosNombresMonedas.put("SLL", "Leone de Sierra Leona");
        codigosNombresMonedas.put("SOS", "Chelín somalí");
        codigosNombresMonedas.put("SRD", "Dólar surinamés");
        codigosNombresMonedas.put("SSP", "Libra sursudanesa");
        codigosNombresMonedas.put("STN", "Dobra de Santo Tomé y Príncipe");
        codigosNombresMonedas.put("SYP", "Libra siria");
        codigosNombresMonedas.put("SZL", "Lilangeni de Suazilandia");
        codigosNombresMonedas.put("THB", "Baht tailandés");
        codigosNombresMonedas.put("TJS", "Somoni tayiko");
        codigosNombresMonedas.put("TMT", "Manat turcomano");
        codigosNombresMonedas.put("TND", "Dinar tunecino");
        codigosNombresMonedas.put("TOP", "Pa'anga tongano");
        codigosNombresMonedas.put("TRY", "Lira turca");
        codigosNombresMonedas.put("TTD", "Dólar de Trinidad y Tobago");
        codigosNombresMonedas.put("TVD", "Dólar de Tuvalu");
        codigosNombresMonedas.put("TWD", "Nuevo dólar taiwanés");
        codigosNombresMonedas.put("TZS", "Chelín tanzano");
        codigosNombresMonedas.put("UAH", "Grivna ucraniana");
        codigosNombresMonedas.put("UGX", "Chelín ugandés");
        codigosNombresMonedas.put("UYU", "Peso uruguayo");
        codigosNombresMonedas.put("UZS", "Som uzbeko");
        codigosNombresMonedas.put("VES", "Bolívar venezolano");
        codigosNombresMonedas.put("VND", "Dong vietnamita");
        codigosNombresMonedas.put("VUV", "Vatu vanuatuense");
        codigosNombresMonedas.put("WST", "Tala samoano");
        codigosNombresMonedas.put("XAF", "Franco CFA de África Central");
        codigosNombresMonedas.put("XCD", "Dólar del Caribe Oriental");
        codigosNombresMonedas.put("XDR", "Derechos especiales de giro");
        codigosNombresMonedas.put("XOF", "Franco CFA de África Occidental");
        codigosNombresMonedas.put("XPF", "Franco CFP");
        codigosNombresMonedas.put("YER", "Rial yemení");
        codigosNombresMonedas.put("ZAR", "Rand sudafricano");
        codigosNombresMonedas.put("ZMW", "Kwacha zambiano");
        codigosNombresMonedas.put("ZWL", "Dólar zimbabuense");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mostramos las monedas disponibles para conversion al usuario
        System.out.println("Monedas disponibles para conversiin: ");
        for (Map.Entry<String, String> entry: codigosNombresMonedas.entrySet()) {
            System.out.println(entry.getKey() + " [" + entry.getValue() + "]");
        }

        //Solicitamos moneda de origen al usuario
        System.out.println("Ingrese el codigo de la moneda de principal: ");
        String monedaOrigen = scanner.nextLine().toUpperCase();
        while (!codigosNombresMonedas.containsKey(monedaOrigen)) {
            System.out.println("Codigo de moneda no valido, ingrese nuevamente: ");
            monedaOrigen = scanner.nextLine().toUpperCase();
        }

        //Solicitamos la cantidad de la moneda de origen
        System.out.println("Ingrese la cantidad en " + codigosNombresMonedas.get(monedaOrigen) + ": ");
        double cantidadOrigen = Double.parseDouble(scanner.nextLine());

        //Solicitamos la moneda a la que deseamos hacer la converison

        System.out.println("Ingrese el codigo de la moneda a la que desea convertir: ");
        String monedaDestino = scanner.nextLine().toUpperCase();
        while (!codigosNombresMonedas.containsKey(monedaDestino)){
            System.out.println("Codigo de moneda no valido. Ingrese nuevamente: ");
            monedaDestino = scanner.nextLine().toUpperCase();
        }

        //Realizamos la converison usando conversor de moenda
        ConversorDeMoneda conversor = new ConversorDeMoneda();
        double resultado = conversor.convertirMoneda(cantidadOrigen, monedaOrigen, monedaDestino);

        //Mostramos el resultado al usuario

        if (resultado != -1) {
            System.out.println(cantidadOrigen + " " + codigosNombresMonedas.get(monedaOrigen) + " equivale a " + resultado + " "
                    + codigosNombresMonedas.get(monedaDestino));
        }else{
            System.out.println("No se pudo realizar la conversion.");
        }

        scanner.close();







    }
}

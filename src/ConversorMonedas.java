import javax.swing.JOptionPane;
import java.util.Objects;

public class ConversorMonedas {
    public static void main(String[] args) {

        String[] conversiones = {
                "Conversión de moneda",
                "Conversión de temperatura",
                "Conversión de kilometraje"
        };
        String[] monedas = {
                "De Dólar a Dólar",
                "De Dólar a Euros",
                "De Dólar a Libras",
                "De Dólar a Yen Japonés",
                "De Dólar a Won sul-coreano",
                "De Dólar a Pesos",
                "De Euro a Dólar",
                "De Libras a Dólar",
                "De Yen a Dólar",
                "De Won a Dólar",
                "De Pesos a Dólar"
        };
        String[] temperatura = {
                "De Celsius a Fahrenheit",
                "De Celsius a Kelvin",
                "De Fahrenheit a Celsius",
                "De Fahrenheit a Kelvin",
                "De Kelvin a Celsius",
                "De Kelvin a Fahrenheit"
        };
        String[] kilometraje = {
                "Kilometros a Metros",
                "Kilometros a Millas",
                "Kilometros a Centimetros",
                "Kilometros a Milimetros",
                "Kilometros a Pies"
        };
        String tipo_conversion, seleccion;
        double cantidad_dinero, cantidad_temperatura, cantidad_kilometraje;
        int confirmacion = 0;
        JOptionPane.showMessageDialog(null, "La moneda local del país donde se programó este Sprint, es el dólar estadounidense.");
        do {
            try {
                tipo_conversion = (String) JOptionPane.showInputDialog(null, "Seleccione una conversión", "Menú de conversiones",
                        JOptionPane.PLAIN_MESSAGE, null, conversiones, conversiones[0]);
                if (Objects.equals(tipo_conversion, conversiones[0])) {
                    cantidad_dinero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de dinero a convertir", "Cantidad a convertir",
                            JOptionPane.INFORMATION_MESSAGE));
                    seleccion = (String) JOptionPane.showInputDialog(null, "Elija la conversion que guste", "Conversiones de moneda disponibles",
                            JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);
                    switch (seleccion) {
                        case "De Dólar a Dólar" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Dólares(USD) es: $" + cantidad_dinero + " dólares");
                        case "De Dólar a Euros" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Euros(EUR) es: " + Math.round((cantidad_dinero * 0.95)*100d)/100d + "€ euros");
                        case "De Dólar a Libras" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Libras(GBP) es: £" + Math.round((cantidad_dinero * 0.81)*100d)/100d + " libras");
                        case "De Dólar a Yen Japonés" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Yen Japonés(JPY) es: ¥" + Math.round((cantidad_dinero * 134.38)*100d)/100d + " yenes");
                        case "De Dólar a Won sul-coreano" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Won SurCoreano(KRW) es: ₩" + Math.round((cantidad_dinero * 1292.76)*100d)/100d + " wones");
                        case "De Dólar a Pesos" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Pesos Mexicanos(MXN) es: $" + Math.round((cantidad_dinero * 0.45)*100d)/100d + " pesos");
                        case "De Euro a Dólar" ->
                                JOptionPane.showMessageDialog(null, "La conversión de Euro a Dólar(USD) es: $" + Math.round((cantidad_dinero * 1.06)*100d)/100d + " dólares");
                        case "De Libras a Dólar" ->
                                JOptionPane.showMessageDialog(null, "La conversión de Libras a Dólar(USD) es: $" + Math.round((cantidad_dinero * 1.23)*100d)/100d + " dólares");
                        case "De Yen a Dólar" ->
                                JOptionPane.showMessageDialog(null, "La conversión de Yen a Dólar(USD) es: $" + Math.round((cantidad_dinero * 0.0074)*100d)/100d + " dólares");
                        case "De Won a Dólar" ->
                                JOptionPane.showMessageDialog(null, "La conversión de Won a Dólar(USD) es: $" + Math.round((cantidad_dinero * 0.00077)*100d)/100d + " dólares");
                        case "De Pesos a Dólar" ->
                                JOptionPane.showMessageDialog(null, "La conversión de Pesos a Dólar(USD) es: $" + Math.round((cantidad_dinero * 0.052)*100d)/100d + " dólares");
                    }
                } else if(Objects.equals(tipo_conversion, conversiones[1])) {
                    cantidad_temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de temperatura a convertir", "Cantidad a convertir",
                            JOptionPane.INFORMATION_MESSAGE));
                    seleccion = (String) JOptionPane.showInputDialog(null, "Elija la conversion que guste", "Conversiones de temperatura disponibles",
                            JOptionPane.PLAIN_MESSAGE, null, temperatura, temperatura[0]);
                    switch (seleccion) {
                        case "De Celsius a Fahrenheit" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Fahrenheit(°F) es: " + Math.round((((cantidad_temperatura * 9 / 5) + 32))*100d)/100d + " °F");
                        case "De Celsius a Kelvin" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Kelvin(K) es: " + Math.round(((cantidad_temperatura + 273.15))*100d)/100d + " K");
                        case "De Fahrenheit a Celsius" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Celsius(°C) es: " + Math.round((((cantidad_temperatura - 32) * 5 / 9))*100d)/100d + " °C");
                        case "De Fahrenheit a Kelvin" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Kelvin(K) es: " + Math.round((((cantidad_temperatura - 32) * 5 / 9 + 273.15))*100d)/100d + " K");
                        case "De Kelvin a Celsius" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Celsius(°C) es: " + Math.round(((cantidad_temperatura - 273.15))*100d)/100d + " °C");
                        case "De Kelvin a Fahrenheit" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Fahrenheit(°F) es: " + Math.round((((cantidad_temperatura - 273.15) * 9 / 5 + 32))*100d)/100d + " °F");
                    }
                }
                else if(Objects.equals(tipo_conversion, conversiones[2])){
                    cantidad_kilometraje = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de kilómetros a convertir", "Cantidad a convertir",
                            JOptionPane.INFORMATION_MESSAGE));
                    seleccion = (String) JOptionPane.showInputDialog(null, "Elija la conversion que guste", "Conversiones de kilometraje disponibles",
                            JOptionPane.PLAIN_MESSAGE, null, kilometraje, kilometraje[0]);
                    switch (seleccion){
                        case "Kilometros a Metros" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Metros es: " + Math.round((cantidad_kilometraje * 1000)*100d)/100d + " mt.");
                        case "Kilometros a Millas" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Millas es: " + Math.round((cantidad_kilometraje / 1.609)*100d)/100d + " millas.");
                        case "Kilometros a Centimetros" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Centimetros es: " + Math.round((cantidad_kilometraje * 100000)*100d)/100d + " cm.");
                        case "Kilometros a Milimetros" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Milimetros es: " + Math.round((cantidad_kilometraje * 1000000)*100d)/100d + " mm.");
                        case "Kilometros a Pies" ->
                                JOptionPane.showMessageDialog(null, "La conversión a Pies es: " + Math.round((cantidad_kilometraje * 3280.8)*100d)/100d + " ft.");
                    }
                }
                confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Alerta!", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirmacion != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor no válido, solo se admiten cantidades enteras o decimales");
            }
        } while (confirmacion == JOptionPane.YES_OPTION);
    }
}

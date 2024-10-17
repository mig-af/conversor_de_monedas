
import java.util.Scanner;
import com.alura.conversormonedas.conversiones.Conversion;
import com.alura.conversormonedas.conversiones.Conversor;
import com.alura.conversormonedas.modulos.MenuOpciones;

public class App {
    public static void main(String[] args) throws Exception {


        Conversor convertir = new Conversor();
        Scanner teclado = new Scanner(System.in);
        var menu = new MenuOpciones();
        Conversion respuesta;
        String ultimaConversion = "";
        int monto;


        int num = 0;
        while (num != 7) {
            System.out.print(menu);
            System.out.println(ultimaConversion);
            System.out.print("Opcion: ");
            
            switch (teclado.nextInt()) {
                case 1:
                    System.out.println("Escribe el monto en dolares: ");
                    monto = teclado.nextInt();
                    respuesta = convertir.convertirMoneda("dolar", "peso argentino", monto);
                    
                    ultimaConversion = monto + respuesta.base_code() + " >> " + respuesta.conversion_result() + " " + respuesta.target_code(); 
            
                    break;
                case 2:
                    System.out.println("Escribe el monto en pesos argentinos: ");
                    monto = teclado.nextInt();
                    respuesta = convertir.convertirMoneda("peso argentino", "dolar", monto);
                    ultimaConversion = monto + respuesta.base_code() + " >> " + respuesta.conversion_result() + " " + respuesta.target_code(); 
            
                    
                    
                    break;
                case 3:
                    System.out.println("Escribe el monto en dolares: ");
                    monto = teclado.nextInt();
                    respuesta = convertir.convertirMoneda("dolar", "real brasilero", monto);
                    ultimaConversion = monto + respuesta.base_code() + " >> " + respuesta.conversion_result() + " " + respuesta.target_code(); 
            
                    
                    
                    break;
                case 4:
                    System.out.println("Escribe el monto en real brasileno: ");
                    monto = teclado.nextInt();
                    respuesta = convertir.convertirMoneda("real brasilero", "dolar", monto);
                    ultimaConversion = monto + respuesta.base_code() + " >> " + respuesta.conversion_result() + " " + respuesta.target_code(); 
            
                    break;
                case 5:
                    System.out.println("Escribe el monto en dolares: ");
                    monto = teclado.nextInt();
                    respuesta = convertir.convertirMoneda("dolar", "peso colombiano", monto);
                    ultimaConversion = monto + respuesta.base_code() + " >> " + respuesta.conversion_result() + " " + respuesta.target_code(); 
            
                    break;
                case 6:
                    System.out.println("Escribe el monto en pesos colombianos : ");
                    monto = teclado.nextInt();
                    respuesta = convertir.convertirMoneda("peso colombiano", "dolar", monto);
                    ultimaConversion = monto + respuesta.base_code() + " >> " + respuesta.conversion_result() + " " + respuesta.target_code(); 
            
                    break;
                case 7:
                    num = 7;
                    
                    break;
                default:
                    break;
            }
            
        }
        teclado.close();
        System.out.println("Programa finalizado");
    }
}

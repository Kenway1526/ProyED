package main;
import java.io.*;
import java.util.*;
/**
 *
 * @author Jonathan Flores
 */
public class Main
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException
    {
        boolean salida = false;
        short op;
        do
        {
            try
            {
                System.out.println("Menu");
                System.out.println("1. Agregar factura");
                System.out.println("2. Recibir pago");
                System.out.println("3. Desplegar listado de facturas");
                System.out.println("4. Desplegar listado de ventas");
                System.out.println("5. Cambiar precio y cantidad de una factura");
                System.out.println("6. Salir");
                System.out.print("Ingresa una opcion: ");
                op = Short.parseShort(br.readLine());
                
                switch (op)
                {
                    case 1:
                        System.out.println("\nAgregar factura");
                        break;
                        
                    case 2:
                        System.out.println("\nPago de factura");
                        break;
                        
                    case 3:
                        System.out.println("\n Lista de facturas");
                        break;
                        
                    case 4:
                        System.out.println("\nLista de ventas");
                        break;
                        
                    case 5:
                        System.out.println("\nCambio de datos en factura");
                        break;
                    
                    case 6:
                        System.out.println("Gracias por ejecutar");
                        salida = true;
                        break;
                        
                    default:
                        System.out.println("Ingresa una opcion valida");
                        break;
                }
            } catch (NumberFormatException eNFE)
            {
                System.out.println("Opcion no valida " + eNFE.getMessage());
            } catch (NullPointerException eNPE)
            {
                System.out.println("Referencia a un objeto nulo " + eNPE.getMessage());
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        } while (!salida);
    }
}

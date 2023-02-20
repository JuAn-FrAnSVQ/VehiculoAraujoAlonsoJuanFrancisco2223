
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoAraujoAlonsoJuanFrancisco2223 miVehiculoAraujoAlonsoJuanFrancisco2223;
        int stockActual;
        
        miVehiculoAraujoAlonsoJuanFrancisco2223 = new VehiculoAraujoAlonsoJuanFrancisco2223("Seat",18000,100);
        operativaVehiculosAraujoAlonsoJuanFrancisco2223(miVehiculoAraujoAlonsoJuanFrancisco2223, 50);
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoAraujoAlonsoJuanFrancisco2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoAraujoAlonsoJuanFrancisco2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosAraujoAlonsoJuanFrancisco2223(VehiculoAraujoAlonsoJuanFrancisco2223 miVehiculoAraujoAlonsoJuanFrancisco2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoAraujoAlonsoJuanFrancisco2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    

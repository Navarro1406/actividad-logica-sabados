import java.util.Scanner;

public class SistemaDePuntoPorCompra {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int PuntosAcumulados = 0;
        int opcion;
        
        System.out.println("Sistema de Puntos de Fidelidad");

        do{
            System.out.println("1. Realiza compra");
            System.out.println("2.Consultar puntos acumulados");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el monto de la compra:");
                    double montoCompra = scanner.nextDouble();
                    if (montoCompra > 0) {
                        if (montoCompra > 10000) {
                            int puntosGanados = (int) (montoCompra / 10000);
                            PuntosAcumulados += puntosGanados;
                            System.out.println("Has ganado " + puntosGanados + " puntos por tu compra de " + montoCompra);
                        } else {
                            System.out.println("No has ganado puntos por tu compra de " + montoCompra + ". Debes gastar más de 10,000 para ganar puntos");
                            
                        } 
                    } else {
                        System.out.println("El monto de la compra debe ser mayor a 0");
                    }
                    break;
                case 2:
                    if (PuntosAcumulados > 0) {
                        System.out.println("Tienes " + PuntosAcumulados + " puntos acumulados.");
                    } else {
                        System.out.println("No tienes puntos acumulados.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del sistema de puntos de fidelidad.");
                    break;
            
                default:
                System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
                
            }
                
        }while (opcion != 3);
        
        scanner.close();
        
    }

}
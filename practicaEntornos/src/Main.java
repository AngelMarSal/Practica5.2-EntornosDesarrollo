import java.util.Scanner;

/**
 * Función principal que te permite crear un cuadrado que podrá mosrá modificarse posteriormente y es capaz de calcular su área y perímetro
 * @author Angel Martin 1DAW
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        Punto p1 = new Punto(0,0);
        do{
            System.out.println("INTRODUCE LA LONGITUD DEL RECTÁNGULO: ");
            x = sc.nextInt();
            if (!coordenadaPositiva(x)){
                System.out.println("LONGITUD INTRODUCIDA NO VÁLIDA.");
            }
        }while (!coordenadaPositiva(x));
        do{
            System.out.println("INTRODUCE LA ALTURA DEL RECTÁNGULO: ");
            y = sc.nextInt();
            if (!coordenadaPositiva(y)){
                System.out.println("ALTURA INTRODUCIDA NO VÁLIDA.");
            }
        } while (!coordenadaPositiva(y));
        Punto p2 = new Punto(x, y);
        Rectangulo r1 = new Rectangulo(p1, p2);
        r1.imprimirRectangulo();
        int eleccion=0;
        int nuevaX;
        int nuevaY;
        while (eleccion != 4){
            System.out.println("SELECCIONA UNA OPCION:");
            pintaMenu();
            eleccion = sc.nextInt();
            sc.nextLine();
            switch (eleccion){
                case 1:
                    System.out.println("INTRODUCE LA NUEVA LONGITUD DEL RECTÁNGULO:");
                    nuevaX = sc.nextInt();
                    sc.nextLine();
                    if (coordenadaPositiva(nuevaX)){
                        r1.p2.setX(nuevaX);
                        System.out.println("LONGITUD ACTUALIZADA CON ÉXITO.");
                    }else {
                        System.out.println("CAMBIO NO DISPONIBLE.");
                    }
                    break;
                case 2:
                    System.out.println("INTRODUCE LA NUEVA ALTURA PARA EL RECTÁNGULO:");
                    nuevaY = sc.nextInt();
                    sc.nextLine();
                    if (coordenadaPositiva(nuevaY)){
                        r1.p2.setY(nuevaY);
                        System.out.println("ALTURA ACTUALIZADA CON ÉXITO.");
                    }else {
                        System.out.println("CAMBIO NO DISPONIBLE.");
                    }
                    break;
                case 3:
                    r1.imprimirRectangulo();
                    break;
                case 4:
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    break;
                default:
                    System.out.println("ELECCION ERRONEA.");
            }
        }
    }
    public static void pintaMenu(){
        System.out.println("1.MODIFICAR LONGITUD DEL RECTÁNGULO.");
        System.out.println("2.MODIFICAR ALTURA DEL RECTÁNGULO.");
        System.out.println("3.CALCULAR ÁREA Y PERÍMETRO DEL RECTÁNGULO.");
        System.out.println("4.FINALIZAR PROGRAMA.");
    }

    /**
     * Comprueba que la coordenada introducida sea positiva
     * @param coor coordenada introducida
     * @return true si la coordenada es positiva
     */
    static boolean coordenadaPositiva(int coor){
        return coor > 0;
    }
}

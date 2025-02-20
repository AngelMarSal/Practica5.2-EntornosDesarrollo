/**
 * Esta clase representa un rectángulo formado a partir de dos puntos
 * @author Angel Martin 1DAW
 * @version 1.0.0
 */
public class Rectangulo {
    Punto p1;
    Punto p2;

    /**
     * Crea un rectángulo partiendo de la coordenada (0, 0), la coordenada introducida por el ususuario corresponderá con el lado y la altura del rectángulo.
     * @param p1 coordenada (0, 0)
     * @param p2 coordenada del usuario
     */
    public Rectangulo(Punto p1, Punto p2){
        if (validarCoordenadas(p1, p2)){
            this.p1 = p1;
            this.p2 = p2;
        }else {
            System.out.println("LAS COORDENADAS NO CUMPLEN LOS REQUISITOS SOLICITADOS");
        }
    }
    public boolean validarCoordenadas(Punto p1, Punto p2){
        if (p2.getX() <= p1.getX() || p2.getY() <= p1.getY()){
            return false;
        }
        return true;
    }

    /**
     * calcula el períimetro sumando todos sus lados
     * @return
     */
    public int perimetros() {
        int base = Math.abs(p2.getX() - p1.getX());
        int altura = Math.abs(p2.getY() - p1.getY());
        System.out.println("La altura es: " + altura + ", y la base es: " + base);
        //System.out.println(2 * (base + altura));
        return (2 * (base + altura));
    }

    /**
     * calcula el área del rectángulo multiplicando el lado por la altura
     * @return área
     */
    public int areas(){
        int base = Math.abs(p2.getX() - p1.getX());
        int altura = Math.abs(p2.getY() - p1.getY());
        return (base * altura);
    }

    /**
     * Pinta en pantalla la información del rectángulo (lado, altura, perímetro y área)
     */
    public void imprimirRectangulo() {
        System.out.println("Las coordenadas del rectangulo son: " + p1.mostrarPunto() + " y " + p2.mostrarPunto());
        System.out.println("El perimetro es: " + perimetros());
        System.out.println("El área es: " + areas());
    }
}

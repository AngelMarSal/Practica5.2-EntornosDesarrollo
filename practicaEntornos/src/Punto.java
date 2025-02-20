/**
 * Esta clase representa un punto bidimensional (x, y)
 * @author Angel Martin 1DAW
 * @version 1.0.0
 */
public class Punto {
    /**
     *
     */
    private int x;
    private int y;
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Muestra las coordenadas del punto
     * @return coordenadas
     */
    public String mostrarPunto(){
        return "(" + (this.getX() + ", " + this.getY() + ") ");
    }
}

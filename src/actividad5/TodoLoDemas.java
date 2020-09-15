package actividad5;
/**
 *
 * @author marcn
 */
public class TodoLoDemas {
    private double primero;
    private double segundo;
    private double respuesta;
    
    public TodoLoDemas()
    {
        primero = 0;
        segundo = 0;
        respuesta = 0;
    }
    public void suma(double primero, double segundo)
    {
        this.primero = primero;
        this.segundo = segundo;
        respuesta = primero + segundo;
        System.out.println("Suma: " + respuesta);
    }
    public void resta(double primero, double segundo)
    {
        this.primero = primero;
        this.segundo = segundo;
        respuesta = primero - segundo;
        System.out.println("Resta: " + respuesta);
    }
    public void multi(double primero, double segundo)
    {
        this.primero = primero;
        this.segundo = segundo;
        respuesta = primero * segundo;
        System.out.println("Multiplicación: " + respuesta);
    }
    public void div(double primero, double segundo)
    {
        this.primero = primero;
        this.segundo = segundo;
        respuesta = primero / segundo;
        System.out.println("Division: " + respuesta);
    }    
    
}

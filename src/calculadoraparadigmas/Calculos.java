
package calculadoraparadigmas;

public class Calculos {
    
    //Declaramos las variables
    private double num1, num2, num3;
    
    //Constructores
    public Calculos(){
        
    }
    
    public Calculos(double num1, double num2, double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    
    //Metodos
    public void Imprimir(){
        System.out.println("\n\n La suma es: " + suma()
                        + "\n La resta es: " + resta()
                        + "\n La multiplicacion es: " + multiplicacion()
                        +"\n La division es: " + division()
                        +"\n El modulo es: " + modulo());
    }
    
    public double suma(){
        double suma = num1 + num2 + num3;
        return suma;
    }
    
    public double resta(){
        double resta = num1 - num2 - num3;
        return resta;
    }
    
    public double multiplicacion(){
        num3 = 1;
        double multiplicacion = num1 * num2 * num3;
        return multiplicacion;
    }
    
    public double division(){
        double division = num1 / num2;
        return division;
    }
    
    public double modulo(){
        double modulo = num1%num2;
        return modulo;
    }
    
    //Setter    
    public void setNumeros(double x, double y, double z){
        this.num1 = x;
        this.num2 = y;
        this.num3 = z;
    }
    
}

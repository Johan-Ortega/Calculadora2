
package calculadoraparadigmas;

import java.util.Scanner;

public class CalculadoraParadigmas {

    public static void main(String[] args) {
        
        Calculos calculos = new Calculos();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<<<<<<<<<<  ¿Deseas empezar?  >>>>>>>>>>\n\n1.SI\n2.NO\n");
        int p = sc.nextInt();
        
        //boolean q;
        
        /*if(p == "si"){
            q = true;
        } else{
            q = false;
        }*/
        
        while(p == 1){
            System.out.println("\n\n---------------CALCULADORA---------------");

            System.out.println("Ingresa un primer numero: ");
            double x = sc.nextDouble();

            System.out.println("Ingresa un segundo numero: ");
            double y = sc.nextDouble();
            
            System.out.println("\n\n____________¿Deseas agregar otro numero?____________\n\n1.SI\n2.NO\n");
            p = sc.nextInt();
          

            if(p == 1){
            System.out.println("Ingresa un numero mas: ");;
            double z = sc.nextDouble();
            calculos.setNumeros(x, y, z);
            }else{
                double z = 0;
                calculos.setNumeros(x, y, z);
            }
            
            calculos.Imprimir();
            System.out.println("\n<<<<<<<<<<¿Quieres volver a empezar?>>>>>>>>>>\n\n1.SI\n2.NO\n");
            p = sc.nextInt();
        }
    }
}

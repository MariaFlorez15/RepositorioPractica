
package reto1;
import java.util.Scanner;
import java.text.DecimalFormat;

class Reto1 {

    private final Scanner scanner = new Scanner(System.in);

    public String read(){
        return this.scanner.nextLine();
    }

    public void run(){
       String[] input= read().split(" ");
       double masa= Double.parseDouble(input[0]);
       double altura= Double.parseDouble(input[1]);
       double edad = Double.parseDouble (input[2]);
       
       int m= 0;
       if ( masa<150 && masa>0 ){
           m++;
       }
       if (altura<2.5 && altura> 0.1){
           m++;
       }
       if (edad <110 && edad > 0 ){
           m++;
       }
       else{
           m=0;
       }
       
       
       if ( m==3){
           double imc = masa/(altura*altura);
           DecimalFormat redondeo= new DecimalFormat("#.0");
        if (imc<22 && edad< 45){
           System.out.println(redondeo.format(imc)+" Bajo");
       }
       if (imc>=22 && edad<45){
           System.out.println(redondeo.format(imc)+" Medio");
       }
       if (imc< 22 && edad>=45){
           System.out.println(redondeo.format(imc)+" Medio");
       }
       if (imc>= 22 && edad>=45){
           System.out.println(redondeo.format(imc)+" Alto");
       }
       }
       else{
       System.out.println("ERROR");
       }
    
    }

    public static void main(String[] args) {}
    
}

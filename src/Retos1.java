import java.util.Scanner;
public class Retos1 {
 public static void main(String[] args) {
Double Cen,Kel;
int gramos=13;
double Kg1=1000;
Double Kg;
int Personas=0;
Scanner teclado = new Scanner(System.in);

System.out.println("Ingrese los grados Centigrados");
Cen=teclado.nextDouble();


System.out.println("Ingrese el numero de personas");
Personas= teclado.nextInt();

gramos= (gramos*Personas);
Kg=(gramos/Kg1);
Kel= Cen + 273.15;

System.out.println(+Kg);
System.out.println(+Kel);

teclado.close();
  
        
    }
}
import java.util.Scanner;
public class Retos2 {
    public static void main(String[] args) {
        String doctor;
        String madre;
        String bebe;
        int pesobebe;
        int mesNa;
        int mesAc;
        int meses;
        int resultado_1;
        int resultado_2;
        double dosisvac;
        int resultado=0;
        Scanner usuario = new Scanner(System.in);

       System.out.print("porfavor ingrese el nombre del doctor");
       doctor=usuario.nextLine();
       
       System.out.print("porfavor ingrese el nombre de la madre");
       madre = usuario.nextLine();

       System.out.print("porfavor ingrese el nombre del bebe");
       bebe= usuario.nextLine();

       System.out.print("porfavor ingrese el peso del bebe");
       pesobebe= usuario.nextInt();

       System.out.print("porfavor ingrese el mes actual del bebe");
       mesAc = usuario.nextInt();

       System.out.print("porfavor ingrese el mes de nacimiento");
       mesNa = usuario.nextInt();

       
       resultado = mesAc - mesNa;
       resultado_1=(resultado+ 10);
       resultado_2 = pesobebe +15;
      dosisvac = pesobebe+ resultado*8;

      System.out.println("Doctor: "+doctor);
      System.out.println("Madre: "+madre);
      System.out.println("El bebe: "+bebe);
      System.out.println("los meses del bebe: "+resultado);
      System.out.println("Dosis= "+dosisvac);
      usuario.close();
    }
   }
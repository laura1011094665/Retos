import java.util.Scanner;
public class Reto7{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        Double Apuesta;
        int V=3;
        System.out.println("Juego Piedra-Papel-tijera");
        System.out.println("Cuanto Desea Apostar: ");
        Apuesta=teclado.nextDouble();
        int SeleccionComp=(int)(Math.random() * 3) + 1;
        System.out.println("La computadora ya jugo");
        System.out.print("¿Que elegiras? [1=Piedra, 2=Papel, 3=Tijera]: ");
        int seleccionP1=teclado.nextInt();
        System.out.print("La computadora saco: ");
        for (V=3;V>0;V--){
        switch ( SeleccionComp )
        {
            case 1:
                System.out.println("Piedra");
                switch (seleccionP1)
                {
                   case 1: System.out.println("Empate!");
                   System.out.println("Valor:" +Apuesta);
                   break;
                   case 2: System.out.println("Ganaste!"); 
                   Apuesta=Apuesta+Apuesta;
                   System.out.println("Tu Valor aumento a:" +Apuesta);
                   break;
                   case 3: System.out.println("La computadora Gana!"); 
                   Apuesta=Apuesta-Apuesta;
                   System.out.println("Perdiste:" +Apuesta);
                   break;
                }
                break;
            case 2:
                System.out.println("Papel");
                switch (seleccionP1)
                {
                   case 1: System.out.println("La computadora Gana!"); 
                   Apuesta=Apuesta-Apuesta;
                   System.out.println("Perdiste:" +Apuesta);
                   break;
                   case 2: System.out.println("Empate!"); 
                   System.out.println("Valor:" +Apuesta);
                   break;
                   case 3: System.out.println("Ganaste!"); 
                   Apuesta=Apuesta+Apuesta;
                   System.out.println("Tu Valor aumento a:" +Apuesta);
                   break;
                }
                break;
            case 3:
                System.out.println("Tijera");
                switch (seleccionP1)
                {
                   case 1: System.out.println("Ganaste!"); 
                   Apuesta=Apuesta+Apuesta;
                   System.out.println("Tu Valor aumento a:" +Apuesta);
                   break;
                   case 2: System.out.println("La computadora Gana!"); 
                   Apuesta=Apuesta-Apuesta;
                   System.out.println("Perdiste:" +Apuesta);
                   System.out.println("FIN DEL JUEGO");
                   break;
                   case 3: System.out.println("Empate!"); 
                   System.out.println("Valor:" +Apuesta);
                   break;
                }
                break;   
            }
        teclado.close();
        }
    }
}

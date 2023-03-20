import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
		Double Apuusu;
		System.out.println("------------------------");
		System.out.println("Juego Cara o Sello ");
		System.out.println("------------------------");
		System.out.println("Cuanto desea Apostar: ");
		Apuusu=lectura.nextDouble();
        System.out.println("Escoge Cara o Sello: ");
		int Seleccion=(int)(Math.random() * 2) + 1;
		System.out.print("1.cara - 2.sello ");
		int jugador1=lectura.nextInt();
		System.out.print("El resultado es: ");
		switch (Seleccion) {
			case 1:
				System.out.println("Cara");
				break;
			case 2:
			    System.out.println("Sello");
				break;
		}
		switch (jugador1) {
			case 1:
				System.out.println("Cara");
				break;
			case 2:
			    System.out.println("Sello");
				break;
		}
		if (jugador1==Seleccion){
			System.out.println("FELICIDADES");
			Apuusu=Apuusu+Apuusu;
			System.out.println("Su Premio es:" +Apuusu);
		} else {
			System.out.println("SUERTE PARA LA PROXIMA");
			Apuusu=Apuusu-Apuusu;
			System.out.println("Has Perdido: " +Apuusu	);
		}
        lectura.close();   
    } 	
    }

import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
		Double Apuesta;
        int Reintento=3;
		System.out.println("------------------------");
		System.out.println("JUEGO CARA O SELLO");
		System.out.println("------------------------");
		System.out.println("Cuanto desea Apostar: ");
		Apuesta=teclado.nextDouble();
        System.out.println("Escoge Cara o Sello: ");
		int Seleccion=(int)(Math.random() * 2) + 1;
		System.out.print("1.cara - 2.sello ");
		int Jugador1=teclado.nextInt();
		System.out.print("El resultado es: ");
        for (Reintento=3;Reintento>0;Reintento--){
		switch (Seleccion) {
			case 1:
				System.out.println("Cara");
				break;
			case 2:
			    System.out.println("Sello");
				break;
		}
		switch (Jugador1) {
			case 1:
				System.out.println("Cara");
				break;
			case 2:
			    System.out.println("Sello");
				break;
		}
		if (Jugador1==Seleccion){
			System.out.println("FELICIDADES");
			Apuesta=Apuesta+Apuesta;
			System.out.println("Su Premio es:" +Apuesta);
		} else {
			System.out.println("SUERTE PARA LA PROXIMA");
			Apuesta=Apuesta-Apuesta;
			System.out.println("Has Perdido: " +Apuesta	);
		}
        teclado.close();   
	} 		
}
}

import java.util.Scanner;
public class Reto8{
    public static void main(String[] args) {
        String nombre, apellido, tipoDoc,correoUsu;
        int edad,numDoc, estrato, cantidad, telUsu;
        Scanner lectura=new Scanner(System.in);
        System.out.println("por favor digite cuantos usuarios se van ha registrar");
        cantidad=lectura.nextInt();
        for (int i=0;i<cantidad;i++){
            System.out.println("por favor digite su tipo de documento (ti: targeta de identidad, cc: cedula de ciudadania, ct: cedula extrangera)");
        tipoDoc=lectura.next();
        System.out.println("por favor digite su numero de documento");
        numDoc=lectura.nextInt();
        System.out.println("por favor digite su nombre");
        nombre=lectura.next();
        System.out.println("por favor digite su apellido");
        apellido=lectura.next();
        System.out.println("por favor digite su edad");
        edad=lectura.nextInt();
        System.out.println("por favor digite su correo");
        correoUsu=lectura.next();
        System.out.println("por favor digite su numero de telefono");
        telUsu=lectura.nextInt();
        System.out.println("por favor digite su estrato (1 a 6)");
        estrato=lectura.nextInt();
        if(estrato==1 ){
            System.out.println("entonces el tipo de documento del aprendiz es: "+tipoDoc);
            System.out.println("el numero de documento del aprendiz es: "+numDoc);
            System.out.println("el nombre del aprendiz es: "+nombre);
            System.out.println("la edad del aprendiz es: "+edad);
            System.out.println("usted fue aceptado en la solicitud, lo estaremos contactando al correo "+correoUsu+" o al telefono "+telUsu);        
        }else if(estrato==2 ){
            System.out.println("entonces el tipo de documento del aprendiz es: "+tipoDoc);
            System.out.println("el numero de documento del aprendiz es: "+numDoc);
            System.out.println("el nombre del aprendiz es: "+nombre);
            System.out.println("la edad del aprendiz es: "+edad);
            System.out.println("usted fue aceptado en la solicitud, lo estaremos contactando al correo "+correoUsu+" o al telefono "+telUsu);
            }else if(estrato==3 ){
                System.out.println("usted "+nombre+" "+apellido+" no ha sido aceptado en la solicitud de el auxilio");
            }else if(estrato==4 ){
                System.out.println("usted "+nombre+" "+apellido+" no ha sido aceptado en la solicitud de el auxilio");
            }else if(estrato==5 ){
                System.out.println("usted "+nombre+" "+apellido+" no ha sido aceptado en la solicitud de el auxilio");
            }else if(estrato==6){
                System.out.println("usted "+nombre+" "+apellido+" no ha sido aceptado en la solicitud de el auxilio");
            }
        }lectura.close();
        }
}
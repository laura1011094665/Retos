import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int cantidad,cantidad2,  identificacion,  factura, total=0, precioPro;
        String nom,fecNa, apell, nomPro;
        System.out.println("Por favor digite la cantidad de empleados que quiere ingresar");
        cantidad2=lectura.nextInt();
        for(int j=0;j<cantidad2;j++){
            System.out.println("Por favor digite el nombre del empleado");
        nom=lectura.next();
        System.out.println("Por favor digite el apellido del empleado");
        apell=lectura.next();
        System.out.println("Por favor digite la fecha de nacimiento del empleado");
        fecNa=lectura.next();
        System.out.println("Por favor digite su numero de identificacion del empleado");
        identificacion=lectura.nextInt();

        System.out.println("el nombre del empleado es: "+nom);
        System.out.println("el apellido del empleado: "+apell);
        System.out.println("la fecha de nacimiento del empleado es: "+fecNa);
        System.out.println("el numero de documeto es: "+identificacion);
        System.out.println(" ");

        }

        System.out.println("Por favor digite la cantidad de productos que quiere ingresar");
        cantidad=lectura.nextInt();

        for(int i=0;i<cantidad;i++){
            System.out.println("Por favor digite el nombre del producto");
            nomPro=lectura.next();
            System.out.println("Por favor digite el precio del producto");
            precioPro=lectura.nextInt();
            total=precioPro;
            System.out.println("¿Quiere factura? (1. si, 2. no)");
        factura=lectura.nextInt();
        if(factura==1){
            System.out.println("Nombre del Producto: "+nomPro);
            System.out.println("Precio del Producto: "+total);
            
        }else if(factura==2){
            System.out.println("Gracias Por Su Compra");
        }
        
        }
        
        
        lectura.close();
        
    }
}

package actividadUno;
import java.util.Scanner;

public class actividadUno {
	
	public static void main(String[] args) {

        int opcion = 1;
        Scanner scanner = new Scanner(System.in);
        while(opcion==1) {

            System.out.println("Indica el n�mero de opci�n deseada para convertir su palabra: \n"
                        + "1- Cambiar vocales con @ \n" + "2- Cambiar letras por n�meros \n");

            try{
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e){System.out.println("Error en el dato introducido"); opcion = 1; continue;}

            switch (opcion) {
                case 1:
                    {
                        System.out.println("Ingresar el texto a convertir: \n");
                        String entradaUno = scanner.nextLine();
                        traductor textotrad= new traductor();
                        System.out.println(textotrad.traduceA(entradaUno));
                        break;
                    }
                case 2:
                    {
                        System.out.println("Ingresar el texto a convertir: \n");
                        String entradaDos = scanner.nextLine();
                        traductor textotrad= new traductor();
                        System.out.println(textotrad.TraduceNum(entradaDos));
                        break;
                    }
                default:
                    System.out.println("Acci�n Incorrecta." );
                    break;
            }

            System.out.println("Desea realizar alguna otra acci�n? Indique el n�mero de acci�n: \n" + "0- No \n"  + "1- Si \n" );
            try{
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Error en el dato introducido"); opcion = 1; continue;}
        }
        System.out.println("Gracias por usar nuestro sistema" );
        scanner.close();
    }
}

	

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int opcion,i, longitud;
        String palabra=" ";
        char letra;


        System.out.println("1. Elimina espacios en blanco");
        System.out.println("2. Invierte Cadena");
        System.out.println("3. Concatena dos cadenas");
        System.out.println("4. Busca una subcadena");
        System.out.println("5. Mayusculas");
        System.out.println("6. Minusculas");
        System.out.println("7. Salir");



        do {
            opcion=sc.nextInt();
            System.out.println("Introduce una palabra o frase");
            palabra=sc.nextLine();
            palabra=sc.nextLine();
            longitud=palabra.length()-1;
            switch (opcion) {
                case 1:
                    for(i=0;i<=longitud;i++) {

                    }
                    System.out.println(palabra.replace(" ", ""));
                    break;

            }


        }
        while (opcion!=7);
        System.out.println("Fin del programa");
    }

}


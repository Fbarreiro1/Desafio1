import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fechaCorrecta = false;

        System.out.print("Por favor, ingrese el día en que nació: ");
        int dd = Integer.parseInt(scanner.nextLine());

        if (dd >= 1 && dd <= 31) {
            System.out.print("Por favor, ingrese el mes en que nació: ");
            int mm = Integer.parseInt(scanner.nextLine());

            if (mm >= 1 && mm <= 12) {
                boolean meses31Dias = mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12;
                boolean meses30Dias = mm == 4 || mm == 6 || mm == 9 || mm == 11;
                if ((meses31Dias && dd <= 31) || (meses30Dias && dd <= 30) || mm == 2) {
                System.out.print("Por favor, ingrese el año en que nació: ");
                int yyyy = Integer.parseInt(scanner.nextLine());

                if (yyyy >= 1900 && yyyy <= 2099) {
                    boolean bisiesto = (yyyy % 4 == 0 && (yyyy % 100 != 0 || yyyy % 400 == 0));


                    if ( (mm == 2 && ((bisiesto && dd <= 29) || (!bisiesto && dd <= 28)))) {
                        System.out.print("La fecha: " + dd + "/" + mm + "/" + yyyy + " es correcta");
                        fechaCorrecta = true;
                    }
                }}
            }
        }

        if (!fechaCorrecta) {
            System.out.print("La fecha es incorrecta");
        }

    }
}

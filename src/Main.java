import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean end = true;
        while (end) {
        System.out.println("Podaj liczbę:");
        double A = scanner.nextDouble();
        System.out.println("Podaj kolejną liczbe:");
        double B = scanner.nextDouble();
        System.out.println("Wybierz działanie");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Zakończ");
        int choice = scanner.nextInt();



            switch (choice) {
                case 1:
                    double C = A + B;
                    System.out.println("Wynik: " + C);
                    break;
                case 2:
                    double D = A - B;
                    System.out.println("Wynik: " + D);
                    break;
                case 3:
                    double E = A * B;
                    System.out.println("Wynik: " + E);
                    break;
                case 4:
                    if (B==0){
                        System.out.println("Nie psuj zabawy nie dziel przez 0");
                        break;
                    }else {
                    double F = A / B;
                    System.out.println("Wynik: " + F);
                    break;}
                case 5:
                    end = false;
                    break;
            }


        }

    }
}

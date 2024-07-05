import java.util.Scanner;

public class GeelismisHesapMakinesi {

    static void sum(double num1, double num2) {
        System.out.print("Toplam: " + (num1 + num2));
    }

    static void minus(double num1, double num2) {
        System.out.println("Fark: " + (num1 - num2));
        ;
    }

    static void times(double num1, double num2) {
        System.out.println("Çarpım: " + (num1 * num2));
    }

    static void divided(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Bölen 0 olamaz");
        } else {
            System.out.println("Bölüm: " + (num1 / num2));
        }
    }

    static void power(int num1, int num2) {
        int base = 1;
        for (int i = 1; i <= num2; i++) {
            base *= num1;
        }
        System.out.println("Üst: " + base);
    }

    static void mod(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Bölen 0 olamaz");
        } else {
            System.out.println("Kalan: " + (num1 % num2));
        }
    }

    static int factorial(int num) {
        int factor = 1;
        if (num != 0 && num != 1) {
            factor = num*factorial(num - 1);
        }
        return factor;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {

            System.out.print(
                    "Toplama(1)\t" +
                            "Çıkarma(2)\n" +
                            "Çarpma(3)\t" +
                            "Bölme(4)\n" +
                            "Üst alma(5)\t" +
                            "Mod alma(6)\n" +
                            "Faktöriyel(7)\t" +
                            "Çıkış(0)\n" +
                            "Hangi işlem: ");
            int select = input.nextInt();
            if (select == 0) {
                break;
            }
            switch (select) {
                case 1: {
                    System.out.print("Sayı 1: ");
                    double num1 = input.nextDouble();
                    System.out.print("Sayı 2: ");
                    double num2 = input.nextDouble();
                    sum(num1, num2);
                    break;
                }
                case 2: {
                    System.out.print("Sayı 1: ");
                    double num1 = input.nextDouble();
                    System.out.print("Sayı 2: ");
                    double num2 = input.nextDouble();
                    minus(num1, num2);
                    break;
                }
                case 3: {
                    System.out.print("Sayı 1: ");
                    double num1 = input.nextDouble();
                    System.out.print("Sayı 2: ");
                    double num2 = input.nextDouble();
                    times(num1, num2);
                    break;
                }
                case 4: {
                    System.out.print("Sayı 1: ");
                    double num1 = input.nextDouble();
                    System.out.print("Sayı 2: ");
                    double num2 = input.nextDouble();
                    divided(num1, num2);
                    break;
                }
                case 5: {
                    System.out.print("Sayı 1: ");
                    int num1 = input.nextInt();
                    System.out.print("Sayı 2: ");
                    int num2 = input.nextInt();
                    power(num1, num2);
                    break;
                }
                case 6: {
                    System.out.print("Sayı 1: ");
                    double num1 = input.nextDouble();
                    System.out.print("Sayı 2: ");
                    double num2 = input.nextDouble();
                    minus(num1, num2);
                    mod(num1, num2);
                    break;
                }
                case 7:
                    System.out.print("Sayı : ");
                    int num = input.nextInt();
                    if (num < 0) {
                        System.out.println("Negatif sayıların faktöriyeli olamz");
                    } else {
                        System.out.println("Faktöriyel: "+factorial(num));
                    }
                    break;
            }
        } while (true);
    }
}

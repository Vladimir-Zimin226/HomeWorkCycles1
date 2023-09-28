public class Main {
    public static void main(String[] args) {
        //Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Task 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //Task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }

        //Task 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //Task 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //Task 8
        int accumulations = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + accumulations;
            System.out.println("Месяц " + i + ", сумма накоплений составляет " + total + " рублей");
        }
        System.out.println("Итого, сумма накоплений составила " + total + " рублей");

        //Task 9
        int contributions = 29000;
        int totalContributions = 0;
        for (int i = 1; i <= 12; i++) {
            totalContributions = totalContributions + totalContributions / 100;
            totalContributions = totalContributions + contributions;
            System.out.println("Месяц " + i + ", сумма накоплений составляет " + totalContributions + " рублей");
        }
        System.out.println("Итого, сумма накоплений составила " + totalContributions + " рублей");

        //Task 10
        int x = 2;
        int totalAmount = 0;
        for (int i = 1; i <= 10; i++) {
            totalAmount = x * i;
            System.out.println(x + " * " + i + " = " + totalAmount);
        }
    }
}
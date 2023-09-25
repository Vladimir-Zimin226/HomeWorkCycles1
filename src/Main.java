public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " итого " + total);
        }
        System.out.println(total);
    }
}
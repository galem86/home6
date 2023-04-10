public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 1; i < 10; i= i +1){
            System.out.println(" итерация цикла" + i);
        }
        System.out.println("задача 2");
        for (int a = 10; a > 1; a = a - 1 ){
            System.out.println(" итерация цикла " + a);
        }
        System.out.println("Задача 3");
        for (int s = 0; s < 17; s = s + 2){
            System.out.println(" четные числа " + s);
        }
        System.out.println(" задача 4");
        for (int r = 10; r > -10; r = r -1){
            System.out.println(" интеграция " + r);
        }
        System.out.println(" задача5");
        for (int year = 1904; year < 2096; year = year + 4){
            System.out.println("Високостный" + year);
        }
        System.out.println("задача6");
            for (int t = 0; t < 84; t = t + 7){
                System.out.println("Числа" + t);
            }
            System.out.println("Задача7");
            for (int p = 1; p < 512; p = p * 2){
                System.out.println(" Последовательность чисел" + p);
            }
            System.out.println("задача 8");
            int salali = 29000;
            int total = 0;
            for (int i = 0; i < 12; i ++){
                total =total + total/100;
                total = total + salali;
                System.out.println(" месяц " + i + " сумма накоплений " + total + " рублей ");
            }System.out.println(total);
            System.out.println(" задача10");
            int a = 2;
            int b = 0;
            for (int i = 1; i <= 10;i++ ){
                b = b + 2;
                System.out.println(a + " * " + i + " = " + b);
            }


    }
}
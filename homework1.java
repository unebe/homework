package work;

public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    public static void checkSumSign() {
        int a = -12;
        int b = 5;
        if (a + b <= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
            int value = 101;
            if (value <= 0) {
                System.out.println("Красный");
            }
            if (value>0 && value<=100) {
                System.out.println("Желтый");
            }
            if (value>100) {
                System.out.println("Зеленый");
            }
        }
    public static void compareNumbers() {
        int a = 9;
        int b = 8;
        if (a>=b) {
            System.out.println("a>=b");
        } else { System.out.println("a<b");
        }
    }
    }


package pl.testuj.ex3_while_loop;

public class WhileLoopExample {
    public static void main(String[] args) {
        int[] tab = {20, 40, 3, 12, 456};
        int i = 0;
        String firstname = "wojtek";

        while (i < tab.length) {
            System.out.println("Liczba: " + tab[i]);
            System.out.printf("Liczba: %d a teskt to %s \n", tab[i], firstname);
            i++;
        }

        i = 0;

        do {
            System.out.println(tab[i]);
            i++;
        } while(i < tab.length);

        System.out.println("--------------------");

        shouldDisplayEvenNumbers(10, 30);
    }

    // chcemy wyświetlić liczby parzyste z zakresu <x; y>
    // ale nie chce wyświetlać liczb podzielnych przez 4
    // <10; 30> 10, 12, 14 ... 30
    public static void shouldDisplayEvenNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 4 == 0) {
                // przerywamy aktualną iterację pętli
                continue;
            }

            if (i % 2 == 0) {
                System.out.println(i);
            }

            if (i % 19 == 0) {
                break;
            }
//            if (i % 2 == 0 && i % 4 != 0) {
//                System.out.println(i);
//            }
        }
    }
}

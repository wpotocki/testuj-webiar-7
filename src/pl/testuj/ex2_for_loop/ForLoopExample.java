package pl.testuj.ex2_for_loop;

public class ForLoopExample {
    public static void main(String[] args) {
        int[] tab = {20, 40, 3, 12, 456};

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);
        System.out.println(tab[4]);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for (int element : tab) {
            System.out.println(element);
        }
    }
}

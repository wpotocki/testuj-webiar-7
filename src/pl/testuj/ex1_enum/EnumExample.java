package pl.testuj.ex1_enum;

public class EnumExample {
    public static void main(String[] args) {
        Priority lowPriority = Priority.LOW;
        Priority highPriority = Priority.HIGH;

        System.out.println(lowPriority);

        // wyświetlenie numeru porządkowego
        System.out.println(lowPriority.ordinal());

        // konwersja (zamiana) string na enum
        String x = "MID";
        Priority midPriority = Priority.valueOf(x);

        // konwersja enum na string
        String priority = Priority.HIGH.name();

        // wszystkie wartości priority jako tablica
        Priority[] priorities = Priority.values();

        Country country = Country.UK;
        System.out.println(country.getEnglishName());
        System.out.println(country.getPolishName());
    }
}

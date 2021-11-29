package pl.testuj.ex1_enum;

public enum Country {
    PL("Poland", "Polska"),
    DE("Germany", "Niemcy"),
    UK("United Kingdom", "Wielka Brytania");

    private String englishName;
    private String polishName;

    // jeśli wartości w enum mają parametry - musimy stworzyć konstruktor
    Country(String englishName, String polishName) {
        this.englishName = englishName;
        this.polishName = polishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }
}

public class Main {
    public static void main(String[] args) {

        Chessman[] figures = {
                new Chessman("Пешка", "Белый"),
                new Chessman("Конь", "Черный"),
                new Chessman("Пешка", "Черный"),
                new Chessman("Конь", "Белый"),
                new Chessman("Слон", "Белый")
        };

        int whiteCount = 0;
        int blackCount = 0;
        int pawnsCount = 0;
        int knightCount = 0;

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].color.equals("Белый")) {
                whiteCount++;
            }

            if (figures[i].color.equals("Черный")) {
                blackCount++;
            }

            if (figures[i].name.equals("Пешка")) {
                pawnsCount++;
            }

            if (figures[i].name.equals("Конь")) {
                knightCount++;
            }
        }

        int total = figures.length;

        System.out.println("Белых: " + whiteCount);
        System.out.println("Черных: " + blackCount);
        System.out.println("Процент белых: " + (whiteCount * 100.0 / total) + "%");
        System.out.println("Процент черных: " + (blackCount * 100.0 / total) + "%");
        System.out.println("Пешек: " + pawnsCount);
        System.out.println("Коней: " + knightCount);
    }
}
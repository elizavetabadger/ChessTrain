public class Main {
    public static void main(String[] args) {
        Chessman[] figures = {
                new Chessman("Пешка", "Белый"),
                new Chessman("Конь", "Черный"),
                new Chessman("Пешка", "Черный"),
                new Chessman("Конь", "Белый"),
                new Chessman("Слон", "Белый")
        };

        int white = 0;
        int black = 0;
        int pawns = 0;
        int horse = 0;

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].color.equals("Белый")) {
                white++;
            }

            if (figures[i].color.equals("Черный")) {
                black++;
            }

            if (figures[i].name.equals("Пешка")) {
                pawns++;
            }

            if (figures[i].name.equals("Конь")) {
                horse++;
            }
        }

        int total = figures.length;

        System.out.println("Белых: " + white);
        System.out.println("Черных: " + black);
        System.out.println("Процент белых: " + (white * 100.0 / total) + "%");
        System.out.println("Процент черных: " + (black * 100.0 / total) + "%");
        System.out.println("Пешек: " + pawns);
        System.out.println("Коней: " + horse);
}

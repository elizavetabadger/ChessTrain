public class Chessman {

    String name;
    String color;

    public Chessman(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Фигура: " + name);
        System.out.println("Цвет: " + color);
    }
}

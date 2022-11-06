package ZuoYe.demo02;

public class Shop {
    private int number;
    private String name;

    public Shop() {
    }

    public Shop(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

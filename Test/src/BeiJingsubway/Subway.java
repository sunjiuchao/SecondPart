package BeiJingsubway;

/**
 * 地铁站（地铁站编号，地铁站名称，所属路线）
 */
public class Subway {
    private String number;
    private String name;
    private String way;

    @Override
    public String toString() {
        return "Subway{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", way='" + way + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Subway(String number, String name, String way) {
        this.number = number;
        this.name = name;
        this.way = way;
    }

    public Subway() {
    }
}

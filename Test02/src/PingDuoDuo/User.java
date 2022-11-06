package PingDuoDuo;

public class User {
    private int id;
    private String name;
    private boolean isCut;
    private double money;
    private double cutmoney;

    public User(int id, String name, boolean isCut, double money, double cutmoney) {
        this.id = id;
        this.name = name;
        this.isCut = isCut;
        this.money = money;
        this.cutmoney = cutmoney;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCut() {
        return isCut;
    }

    public void setCut(boolean cut) {
        isCut = cut;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getCutmoney() {
        return cutmoney;
    }

    public void setCutmoney(double cutmoney) {
        this.cutmoney = cutmoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isCut=" + isCut +
                ", money=" + money +
                ", cutmoney=" + cutmoney +
                '}';
    }
}

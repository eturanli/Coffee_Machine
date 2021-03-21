
public class CoffeeMachine {

    private int water;
    private int milk;
    private int beans;
    private int money;
    private int cup;

    public CoffeeMachine(int water, int milk, int beans, int money, int cup) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.money = money;
        this.cup = cup;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public void printStatus() {
        System.out.println("The coffee machine has: \n" +
                this.water + " of water\n" +
                this.milk + " of milk\n" +
                this.beans + " of coffee beans\n" +
                this.cup + " of disposable cups\n" +
                this.money + " of money\n");
    }
}

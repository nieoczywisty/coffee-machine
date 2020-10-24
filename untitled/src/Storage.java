public class Storage {

    //declaring variables
    private int milkAmount = 1000,
                waterAmount = 1000,
                beansAmount = 1000,
                cupsAmount = 1000,
                greenLeaves = 1000,
                blackLeaves = 1000,
                money = 1000;

    //getters
    public int getMilkAmount() {
        return milkAmount;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public int getBeansAmount() {
        return beansAmount;
    }

    public int getCupsAmount() {
        return cupsAmount;
    }


    public int getGreenLeaves() {
        return greenLeaves;
    }

    public int getBlackLeaves() {
        return blackLeaves;
    }

    public int getMoney() {
        return money;
    }

    //setters to add ingredients
    public void addMilkAmount(int milkAmount) {
        this.milkAmount = this.milkAmount + milkAmount;
    }

    public void addWaterAmount(int waterAmount) {
        this.waterAmount = this.waterAmount + waterAmount;
    }

    public void addBeansAmount(int beansAmount) {
        this.beansAmount = this.beansAmount + beansAmount;
    }

    public void addCupsAmount(int cupsAmount) {
        this.cupsAmount = this.cupsAmount + cupsAmount;
    }

    public void addGreenLeaves(int greenLeaves) {
        this.greenLeaves = this.greenLeaves + greenLeaves;
    }

    public void addBlackLeaves(int blackLeaves) {
        this.blackLeaves = this.blackLeaves + blackLeaves;
    }

    public void addMoney(int money) {
        this.money = this.money + money;
    }

    //setters to remove ingredients
    public void removeMilkAmount(int milkAmount) {
        this.milkAmount = this.milkAmount - milkAmount;
    }

    public void removeWaterAmount(int waterAmount) {
        this.waterAmount = this.waterAmount - waterAmount;
    }

    public void removeBeansAmount(int beansAmount) {
        this.beansAmount = this.beansAmount - beansAmount;
    }

    public void removeCupsAmount(int cupsAmount) {
        this.cupsAmount = this.cupsAmount - cupsAmount;
    }

    public void removeGreenLeaves(int greenLeaves) {
        this.greenLeaves = this.greenLeaves - greenLeaves;
    }

    public void removeBlackLeaves(int blackLeaves) {
        this.blackLeaves = this.blackLeaves - blackLeaves;
    }
    public int removeMoney() {
        int tempMoney = this.money;
        this.money = 0;
        return tempMoney;
    }


    //methods for displaying ingredients amount
    public void showMilkAmount() {
        System.out.println("I've got: " + getMilkAmount() + " ml of milk");
    }

    public void showWaterAmount() {
        System.out.println("I've got: " + getWaterAmount() + " ml of water");
    }

    public void showBeansAmount() {
        System.out.println("I've got: " + getBeansAmount() + " g of coffee beans");
    }

    public void showCupsAmount() {
        if (getCupsAmount() == 1) {
            System.out.println("I've got: " + getCupsAmount() + " pc of cup");
        } else {
            System.out.println("I've got: " + getCupsAmount() + " pcs of cups");
        }
    }
    public void showGreenTeaLeaves() {
        if (getGreenLeaves() == 1) {
            System.out.println("I've got: " + getGreenLeaves() + " Leaf");
        } else {
            System.out.println("I've got: " + getGreenLeaves() + " pcs of Leaves");
        }
    }
    public void showBlackTeaLeaves() {
        if (getBlackLeaves() == 1) {
            System.out.println("I've got: " + getBlackLeaves() + " Leaf");
        } else {
            System.out.println("I've got: " + getBlackLeaves() + " pcs of Leaves");
        }
    }
    public void showMoney() {
        System.out.println("I've got: " + getMoney() + " $");
    }

}



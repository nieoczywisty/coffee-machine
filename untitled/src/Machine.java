public abstract class Machine implements Refill , ShowRemainings {

    protected Storage storage = new Storage();

    public Storage getStorage() {
        return storage;
    }
    //refill

    @Override
    public void refillWater(int water) {
        storage.addWaterAmount(water);
    }

    @Override
    public void refillBeans(int beans) {
        storage.addBeansAmount(beans);
    }

    @Override
    public void refillBlackLeaves(int blackLeaves) {
        storage.addBlackLeaves(blackLeaves);
    }

    @Override
    public void refillGreenLeaves(int greenLeaves) {
        storage.addGreenLeaves(greenLeaves);
    }

    @Override
    public void refillCups(int cups) {
        storage.addCupsAmount(cups);
    }

    @Override
    public void refillMilk(int milk) {
        storage.addMilkAmount(milk);
    }

    @Override
    public void refillMoney(int money) {
        storage.addMoney(money);
    }

    //show remaining
    @Override
    public void showWater() {
        storage.showWaterAmount();
    }

    @Override
    public void showMilk() {
        storage.showMilkAmount();
    }

    @Override
    public void showBeans() {
        storage.showBeansAmount();
    }

    @Override
    public void showGreenTea() {
        storage.showGreenTeaLeaves();
    }

    @Override
    public void showBlackTea() {
        storage.showBlackTeaLeaves();
    }

    @Override
    public void showCups() {
        storage.showCupsAmount();
    }

    @Override
    public void showMoneyAmount() {
        storage.showMoney();
    }
}

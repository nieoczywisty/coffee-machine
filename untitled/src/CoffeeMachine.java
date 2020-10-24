public class CoffeeMachine extends Machine{

    //coffee
    public boolean canIMakeLatte(){
        return (storage.getWaterAmount() >= Recipes.LATTE.waterAmount &&
                storage.getBeansAmount() >= Recipes.LATTE.beansAmount) &&
                (storage.getCupsAmount() >= Recipes.LATTE.cupsAmount &&
                        storage.getMilkAmount() >= Recipes.LATTE.milkAmount);
    }
    public boolean canIMakeCappucino(){
        return (storage.getWaterAmount() >= Recipes.CAPPUCCINO.waterAmount &&
                storage.getBeansAmount() >= Recipes.CAPPUCCINO.beansAmount) &&
                (storage.getCupsAmount() >= Recipes.CAPPUCCINO.cupsAmount &&
                        storage.getMilkAmount() >= Recipes.CAPPUCCINO.milkAmount);
    }
    public boolean canIMakeEspresso(){
        return (storage.getWaterAmount() >= Recipes.ESPRESSO.waterAmount &&
                storage.getBeansAmount() >= Recipes.ESPRESSO.beansAmount) &&
                (storage.getCupsAmount() >= Recipes.ESPRESSO.cupsAmount &&
                        storage.getMilkAmount() >= Recipes.ESPRESSO.milkAmount);
    }

    public void makeLatte(){

        storage.removeBeansAmount(Recipes.LATTE.beansAmount);
        storage.removeCupsAmount(Recipes.LATTE.cupsAmount);
        storage.removeMilkAmount(Recipes.LATTE.milkAmount);
        storage.removeWaterAmount(Recipes.LATTE.waterAmount);
        storage.addMoney(Recipes.LATTE.cost);
    }
    public void makeCappucino(){
        storage.removeBeansAmount(Recipes.CAPPUCCINO.beansAmount);
        storage.removeCupsAmount(Recipes.CAPPUCCINO.cupsAmount);
        storage.removeMilkAmount(Recipes.CAPPUCCINO.milkAmount);
        storage.removeWaterAmount(Recipes.CAPPUCCINO.waterAmount);
        storage.addMoney(Recipes.CAPPUCCINO.cost);
    }
    public void makeEspresso(){
        storage.removeBeansAmount(Recipes.ESPRESSO.beansAmount);
        storage.removeCupsAmount(Recipes.ESPRESSO.cupsAmount);
        storage.removeMilkAmount(Recipes.ESPRESSO.milkAmount);
        storage.removeWaterAmount(Recipes.ESPRESSO.waterAmount);
        storage.addMoney(Recipes.ESPRESSO.cost);
    }
}

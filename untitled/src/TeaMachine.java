public class TeaMachine extends Machine {
    //tea

    public boolean canIMakeGreenTea(){
        return (storage.getWaterAmount() >= Recipes.GREEN_TEA.waterAmount &&
                storage.getBeansAmount() >= Recipes.GREEN_TEA.beansAmount) &&
                (storage.getCupsAmount() >= Recipes.GREEN_TEA.cupsAmount &&
                        storage.getMilkAmount() >= Recipes.GREEN_TEA.milkAmount);
    }
    public boolean canIMakeBlackTea(){
        return (storage.getWaterAmount() >= Recipes.BLACK_TEA.waterAmount &&
                storage.getBeansAmount() >= Recipes.BLACK_TEA.beansAmount) &&
                (storage.getCupsAmount() >= Recipes.BLACK_TEA.cupsAmount &&
                        storage.getMilkAmount() >= Recipes.BLACK_TEA.milkAmount);
    }
    public boolean canIMakeBavarianTea(){
        return (storage.getWaterAmount() >= Recipes.BAVARIAN_TEA.waterAmount &&
                storage.getBeansAmount() >= Recipes.BAVARIAN_TEA.beansAmount) &&
                (storage.getCupsAmount() >= Recipes.BAVARIAN_TEA.cupsAmount &&
                        storage.getMilkAmount() >= Recipes.BAVARIAN_TEA.milkAmount);
    }
    public void makeGreenTea(){
        storage.removeGreenLeaves(Recipes.GREEN_TEA.greenLeaves);
        storage.removeCupsAmount(Recipes.GREEN_TEA.cupsAmount);
        storage.removeMilkAmount(Recipes.GREEN_TEA.milkAmount);
        storage.removeWaterAmount(Recipes.GREEN_TEA.waterAmount);
        storage.addMoney(Recipes.GREEN_TEA.cost);
    }
    public void makeBlackTea(){
        storage.removeBlackLeaves(Recipes.BLACK_TEA.blackLeaves);
        storage.removeCupsAmount(Recipes.BLACK_TEA.cupsAmount);
        storage.removeMilkAmount(Recipes.BLACK_TEA.milkAmount);
        storage.removeWaterAmount(Recipes.BLACK_TEA.waterAmount);
        storage.addMoney(Recipes.BLACK_TEA.cost);
    }
    public void makeBavarianTea(){
        storage.removeBlackLeaves(Recipes.BAVARIAN_TEA.blackLeaves);
        storage.removeCupsAmount(Recipes.BAVARIAN_TEA.cupsAmount);
        storage.removeMilkAmount(Recipes.BAVARIAN_TEA.milkAmount);
        storage.removeWaterAmount(Recipes.BAVARIAN_TEA.waterAmount);
        storage.addMoney(Recipes.BAVARIAN_TEA.cost);
    }
}

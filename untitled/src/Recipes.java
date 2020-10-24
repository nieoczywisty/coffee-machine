public enum Recipes {

    //coffee
    ESPRESSO(250,0,16,1,4,0,0),
    LATTE(350,75,20,1,4,0,0),
    CAPPUCCINO(250,16,10,1,7,0,0),
    //tea
    BLACK_TEA(250,0,0,1,3,0,1),
    GREEN_TEA(250,0,0,1,4,1,0),
    BAVARIAN_TEA(200, 50, 0, 7,0,1,0);


    int waterAmount , milkAmount , beansAmount , cupsAmount , cost , greenLeaves , blackLeaves;

    Recipes(int waterAmount, int milkAmount, int beansAmount, int cupsAmount, int cost, int greenLeaves, int blackLeaves) {
        this.waterAmount = waterAmount;
        this.milkAmount = milkAmount;
        this.beansAmount = beansAmount;
        this.cupsAmount = cupsAmount;
        this.cost = cost;
        this.greenLeaves = greenLeaves;
        this.blackLeaves = blackLeaves;

    }


}




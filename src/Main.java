public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        DishWasher dishWasher = new DishWasher();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartKitchen smartKitchen = new SmartKitchen(refrigerator, dishWasher, coffeeMaker);
        smartKitchen.addWater();
        smartKitchen.loadDishwasher();
        smartKitchen.pourMilk();
        smartKitchen.doKitchenWork();
    }
}

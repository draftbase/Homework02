public class TestDrink {
    public static void main(String[] args) {
        Drink islandBreeze = new Drink();
        islandBreeze.name = "ISLAND BREEZE";
        islandBreeze.rating = 7;
        islandBreeze.alcohol = true;
        islandBreeze.ingredient1 = new Ingredient();
        islandBreeze.ingredient1.name = "Malibu";
        islandBreeze.ingredient1.number = 60;
        islandBreeze.ingredient2 = new Ingredient();
        islandBreeze.ingredient2.name = "soku żurawinowego";
        islandBreeze.ingredient2.number = 80;
        islandBreeze.ingredient3 = new Ingredient();
        islandBreeze.ingredient3.name = "soku grejpfrutowego";
        islandBreeze.ingredient3.number = 60;
        int volume = islandBreeze.ingredient1.number + islandBreeze.ingredient2.number + islandBreeze.ingredient3.number;

        System.out.println("PRZEPIS NA DRINK:");
        System.out.printf("Nazwa: %s\n", islandBreeze.name);
        System.out.printf("Ocena: %s / 10\n", islandBreeze.rating);
        System.out.printf("Czy jest alkohol: %s\n", islandBreeze.alcohol);
        System.out.println("Składniki:");
        System.out.printf("Nazwa pierwszego: %s\n", islandBreeze.ingredient1.name);
        System.out.printf("Ilość: %sml\n", islandBreeze.ingredient1.number);
        System.out.printf("Nazwa drugiego: %s\n", islandBreeze.ingredient2.name);
        System.out.printf("Ilość: %sml\n", islandBreeze.ingredient2.number);
        System.out.printf("Nazwa trzeciego: %s\n", islandBreeze.ingredient3.name);
        System.out.printf("Ilość: %sml\n", islandBreeze.ingredient3.number);
        System.out.printf("Obientość całkowita: %sml\n", volume);
    }
}

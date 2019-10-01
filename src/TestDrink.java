public class TestDrink {
    public static void main(String[] args) {
        Drink islandBreeze = new Drink();
        islandBreeze.name = "ISLAND BREEZE";
        islandBreeze.price = 17;
        islandBreeze.alcohol = true;
        islandBreeze.ingredient1 = new Ingredient();
        islandBreeze.ingredient1.name = "Malibu";
        islandBreeze.ingredient1.quantity = 60;
        islandBreeze.ingredient2 = new Ingredient();
        islandBreeze.ingredient2.name = "soku żurawinowego";
        islandBreeze.ingredient2.quantity = 80;
        islandBreeze.ingredient3 = new Ingredient();
        islandBreeze.ingredient3.name = "soku grejpfrutowego";
        islandBreeze.ingredient3.quantity = 60;
        int volume = islandBreeze.ingredient1.quantity + islandBreeze.ingredient2.quantity + islandBreeze.ingredient3.quantity;

        System.out.println("PRZEPIS NA DRINK:");
        System.out.printf("Nazwa: %s\n", islandBreeze.name);
        System.out.printf("Cena: %2.2f \n", islandBreeze.price);
        //System.out.printf("Ocena: %2.0f/10%n", movie.rating);
        System.out.printf("Czy jest alkohol: %s\n", islandBreeze.alcohol);
        System.out.println("Składniki:");
        System.out.printf("Nazwa pierwszego: %s\n", islandBreeze.ingredient1.name);
        System.out.printf("Ilość: %sml\n", islandBreeze.ingredient1.quantity);
        System.out.printf("Nazwa drugiego: %s\n", islandBreeze.ingredient2.name);
        System.out.printf("Ilość: %sml\n", islandBreeze.ingredient2.quantity);
        System.out.printf("Nazwa trzeciego: %s\n", islandBreeze.ingredient3.name);
        System.out.printf("Ilość: %sml\n", islandBreeze.ingredient3.quantity);
        System.out.printf("Obientość całkowita: %sml\n", volume);
    }
}

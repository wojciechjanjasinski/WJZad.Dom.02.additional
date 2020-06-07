class DrinksCollection {
    public static void main(String[] args) {
        IngredientCharacteristic ingredientCharacteristic = new IngredientCharacteristic();
        IngredientCharacteristic ingredientCharacteristic1 = new IngredientCharacteristic();
        ingredientCharacteristic1.name = "czysta wódka";
        ingredientCharacteristic1.quantity = 60;
        ingredientCharacteristic.volume = "ml";


        IngredientCharacteristic ingredientCharacteristic2 = new IngredientCharacteristic();
        ingredientCharacteristic2.name = "sok z cytryny";
        ingredientCharacteristic2.quantity = 20;

        IngredientCharacteristic ingredientCharacteristic3 = new IngredientCharacteristic();
        ingredientCharacteristic3.name = "syrop cukrowy";
        ingredientCharacteristic3.quantity = 20;

        Drink drink = new Drink();
        drink.name = "Wódka Sour";
        drink.price = 15.99;
        drink.currency = "zł";
        drink.alko = true;
        drink.descriptionInfo = "Opis drinku: ";
        drink.description = "\u201ECzy to w klubie, czy w domowych warunkach, czy w plenerze \u2026 Koktajl Wódka Sour sprawdzi się idealnie w każdych okolicznościach. Drink jest smaczny, jego skład jest prosty, a przygotowanie zajmuje tylko chwilę. Koktajl Wódka Sour zazwyczaj dekorowany jest ćwiartką pomarańczy oraz wisienką koktajlową.  Ciężko znaleźć coś bardziej klasycznego niż Wódka Sour, prawda? Zajrzyjcie do naszego przepisu i przekonajcie się sami jak idealnie wpasuje się na każdą okazję! \u201D";
        drink.ingredient1 = ingredientCharacteristic1;
        drink.ingredient2 = ingredientCharacteristic2;
        drink.ingredient3 = ingredientCharacteristic3;

        System.out.println(drink.name + "\t" + drink.price + drink.currency);
        System.out.println(drink.ingredient1.name + " " + drink.ingredient1.quantity + ingredientCharacteristic.volume);
        System.out.println(drink.ingredient2.name + " " + drink.ingredient2.quantity + ingredientCharacteristic.volume);
        System.out.println(drink.ingredient3.name + " " + drink.ingredient3.quantity + ingredientCharacteristic.volume);
        System.out.println(drink.ingredient1.quantity + drink.ingredient3.quantity + drink.ingredient3.quantity + " " + ingredientCharacteristic.volume);
        System.out.println("Czy drink zawiera alkohol?" + " " + drink.alko);
        System.out.println(" ");
        System.out.println(drink.descriptionInfo);
        System.out.println(drink.description);
    }
}
// Na podstawie: https://www.mojbar.pl/wodka-sour-przepis-na-drink/
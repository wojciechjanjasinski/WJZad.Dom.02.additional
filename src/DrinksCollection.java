class DrinksCollection {
    public static void main(String[] args) {
        IngredientCharacteristic ingredientCharacteristic = new IngredientCharacteristic();
        IngredientCharacteristic ingredientCharacteristic1 = new IngredientCharacteristic();
        ingredientCharacteristic1.Name = "czysta wódka";
        ingredientCharacteristic1.Quantity = 60;
        ingredientCharacteristic.Volume = "ml";


        IngredientCharacteristic ingredientCharacteristic2 = new IngredientCharacteristic();
        ingredientCharacteristic2.Name = "sok z cytryny";
        ingredientCharacteristic2.Quantity = 20;

        IngredientCharacteristic ingredientCharacteristic3 = new IngredientCharacteristic();
        ingredientCharacteristic3.Name = "syrop cukrowy";
        ingredientCharacteristic3.Quantity = 20;

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
        System.out.println(drink.ingredient1.Name + " " + drink.ingredient1.Quantity + ingredientCharacteristic.Volume);
        System.out.println(drink.ingredient2.Name + " " + drink.ingredient2.Quantity + ingredientCharacteristic.Volume);
        System.out.println(drink.ingredient3.Name + " " + drink.ingredient3.Quantity + ingredientCharacteristic.Volume);
        System.out.println(drink.ingredient1.Quantity + drink.ingredient3.Quantity + drink.ingredient3.Quantity + " " + ingredientCharacteristic.Volume);
        System.out.println("Czy drink zawiera alkohol?" + " " + drink.alko);
        System.out.println(" ");
        System.out.println(drink.descriptionInfo);
        System.out.println(drink.description);
    }
}
// Na podstawie: https://www.mojbar.pl/wodka-sour-przepis-na-drink/
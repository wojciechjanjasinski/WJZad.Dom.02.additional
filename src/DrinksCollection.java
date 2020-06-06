class DrinksCollection {
    public static void main(String[] args) {
        IngredientCharacteristic ingredientCharacteristic = new IngredientCharacteristic();
        IngredientCharacteristic ingredientCharacteristic1 = new IngredientCharacteristic();
        ingredientCharacteristic1.ingredientName = "czysta wódka";
        ingredientCharacteristic1.ingredientQuantity = 60;
        ingredientCharacteristic.ingredientVolume = "ml";


        IngredientCharacteristic ingredientCharacteristic2 = new IngredientCharacteristic();
        ingredientCharacteristic2.ingredientName = "sok z cytryny";
        ingredientCharacteristic2.ingredientQuantity = 20;

        IngredientCharacteristic ingredientCharacteristic3 = new IngredientCharacteristic();
        ingredientCharacteristic3.ingredientName = "syrop cukrowy";
        ingredientCharacteristic3.ingredientQuantity = 20;

        Drink drink = new Drink();
        drink.name = "Wódka Sour";
        drink.price = 15.99;
        drink.currency = "zł";
        drink.alko = true;
        drink.descriptionInfo = "Opis drinku: ";
        drink.description = "\u201ECzy to w klubie, czy w domowych warunkach, czy w plenerze \u2026 Koktajl Wódka Sour sprawdzi się idealnie w każdych okolicznościach. Drink jest smaczny, jego skład jest prosty, a przygotowanie zajmuje tylko chwilę. Koktajl Wódka Sour zazwyczaj dekorowany jest ćwiartką pomarańczy oraz wisienką koktajlową.  Ciężko znaleźć coś bardziej klasycznego niż Wódka Sour, prawda? Zajrzyjcie do naszego przepisu i przekonajcie się sami jak idealnie wpasuje się na każdą okazję! \u201D";
        ingredientCharacteristic.ingredient1 = "wódka";
        ingredientCharacteristic.ingredient2 = "sok z cytryny";
        ingredientCharacteristic.ingredient3 = "syrop cukrowy";

        System.out.println(drink.name + "\t" + drink.price + drink.currency);
        System.out.println(ingredientCharacteristic1.ingredientName + " " + ingredientCharacteristic1.ingredientQuantity + ingredientCharacteristic.ingredientVolume);
        System.out.println(ingredientCharacteristic2.ingredientName + " " + ingredientCharacteristic2.ingredientQuantity + ingredientCharacteristic.ingredientVolume);
        System.out.println(ingredientCharacteristic3.ingredientName + " " + ingredientCharacteristic3.ingredientQuantity + ingredientCharacteristic.ingredientVolume);
        System.out.println(ingredientCharacteristic1.ingredientQuantity + ingredientCharacteristic2.ingredientQuantity + ingredientCharacteristic3.ingredientQuantity + " " + ingredientCharacteristic.ingredientVolume);
        System.out.println("Czy drink zawiera alkohol?" + " " + drink.alko);
        System.out.println(" ");
        System.out.println(drink.descriptionInfo);
        System.out.println(drink.description);
        System.out.println(ingredientCharacteristic.ingredient1);
        System.out.println(ingredientCharacteristic.ingredient2);
        System.out.println(ingredientCharacteristic.ingredient3);
    }
}
// Na podstawie: https://www.mojbar.pl/wodka-sour-przepis-na-drink/
package obj;

/**
 * FirstProject
 * 6/18/20 10: 37
 */
public class Cocktail {
    String name;
    Ingredient ingredient;

    Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
    }
    private void myPrint() {
        System.out.println("Ваш коктейль " + name + "готов");
    }

    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Vodka", 100);
        Ingredient rom = new Ingredient("Rom", 100);
        Ingredient cola = new Ingredient("Cola", 100);


        Cocktail javaBomba = new Cocktail("Бомба", vodka, rom, cola);
        javaBomba.myPrint();

    }
}

class Ingredient {
    String ingrTitle; //название ингридиентов
    int liquid;

    Ingredient(String ingrTitle, int liquid) {
        this.ingrTitle = ingrTitle;
        this.liquid = liquid;
        System.out.println("Береме ингридиент " + ingrTitle + liquid + " мл");
    }

}

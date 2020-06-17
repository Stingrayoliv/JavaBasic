package HomeworkAll.Homework039BookOBJ;

/**
 * FirstProject
 * 6/17/20 23: 38
 */
public class Book {
    int ISBN;
    String name;
    double price;
    int numberOfPages;
    String language;
    private int[] bestSellerId; // в массиве все ISBN только bestseller;
    boolean usedBook; // new or used

    // for example this is for the first book
    public Book(String language, boolean usedBook, double price) {
        this.price = price;
        this.language = language;
        this.usedBook = usedBook;
    }

    //for example this is for the second book
    public Book(int ISBN, String name, int numberOfPages) {
        this.ISBN = ISBN;
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    //for example this is for the third book
    public Book(int[] bestSellerId, int ISBN) {
        this.bestSellerId = bestSellerId;
        this.ISBN = ISBN;
    }

    // цена книг в магазине может поменяться в зависимости от того: новая книга, или прочитанная кем-то.
    // Книги на англ языке дороже на 15%.
    void calculatePriceInStore(String language, boolean usedBook, double price) {
        String english = "english";
        if (!usedBook && language.equalsIgnoreCase(english)) {
            System.out.println("Price in shop: " + (price + 15 / 100 * price));
        } else if (usedBook) {
            System.out.println("Price in shop: " + price * 50 / 100);
        } else {
            System.out.println("Price in shop: " + price);
        }
    }

    void showAmountOfPages(int ISBN, String name, int numberOfPages) {
        System.out.println("\"" + name + "\";" + " book's ISBN: " + ISBN + "; amount of pages: " + numberOfPages + " pages");

    }

    // проверяем будет ли книга bestseller
    boolean checkBestSeller(int[] bestSellerId, int ISBN) { //
        for (int i = 0; i < bestSellerId.length - 1; i++) {
            if (bestSellerId[i] == ISBN) {
                return true;
            }
        }
        return false;
    }

    // книги bestseller должны быть на витрине
    void makeShowcase(int[] bestSellerId, int ISBN) {
        if (checkBestSeller(bestSellerId, ISBN)) {
            System.out.println("take a book ISBN: " + ISBN + " and put on the showcase");
        } else {
            System.out.println("the book is not for showcase");
        }

    }
}

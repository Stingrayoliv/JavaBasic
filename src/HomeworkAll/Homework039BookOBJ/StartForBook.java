package HomeworkAll.Homework039BookOBJ;

import java.util.Arrays;

/**
 * FirstProject
 * 6/17/20 23: 40
 */
public class StartForBook {
    public static void main(String[] args) {
        Book book1 = new Book("english", false, 8.99);
//        book1.ISBN = 200;
//        book1.name = "ABC";
//        book1.price = 8.99;
//        book1.numberOfPages = 524;
//        book1.language = "english";
//        book1.bestSellerId = new int[]{123, 69, 80, 500};
//        book1.usedBook = false;
        System.out.println("---------book №1");
        book1.calculatePriceInStore("english", false, 8.99);

        Book book2 = new Book(64, "Vegan food", 59);
//        book2.ISBN = 64;
//        book2.name = "Vegan food";
//        book2.price = 25.64;
//        book2.numberOfPages = 59;
//        book2.language = "german";
//        book2.bestSellerId = new int[]{123, 69, 80, 500};
//        book2.usedBook = true;
        System.out.println("---------book №2");
        book2.showAmountOfPages(64, "Vegan food", 59);


        Book book3 = new Book(new int[]{123, 69, 80, 500}, 123);
//        book3.ISBN = 123;
//        book3.name = "War and Peace";
//        book3.price = 18.00;
//        book3.numberOfPages = 782;
//        book3.language = "german";
//        book3.bestSellerId = new int[]{123, 69, 80, 500};
//        book3.usedBook = false;
        System.out.println("---------book №3");
        book3.makeShowcase(new int[]{123, 69, 80, 500}, 123);

        Book[] booksInStore = {book1, book2, book3};
        System.out.println(Arrays.toString(booksInStore));

    }
}

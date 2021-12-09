package by.epam.ld.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Goods> list = new ArrayList<>();

        list.add(new Book("SomeBook", 100));
        list.add(new Bookmark("SomeBookMark", 10, "Colored"));
        list.add(new ChristmasTree("SomeChristmasTree", 1000, "Small", "White"));
        list.add(new FlowerPot("SomeFlowerPot", 50, "Long"));
        list.add(new Refrigerator("SomeRefrigerator", 10000, 100*360));

        System.out.println("List of Goods:\n");
        printCheck(list);
        Collections.sort(list);

        System.out.println("List of Goods after sorting by price:\n");
        printCheck(list);

        System.out.println("Enum task:\n");

        Book pride = new Book("Pride and Prejudice", Author.AUSTEN, 500, 500);

        if(pride.getAuthor() == Author.AUSTEN){
            System.out.println("You've got a Jane Austen's book.");
        }
        else{
            System.out.println("There is some other book of British writer, but not Austen");
        }

    }

    public static void printCheck(List<Goods> list){
        for(Goods goods : list) {
            System.out.println(""+goods.name()+", price: "+goods.price() + ".");
        }
        System.out.println();

    }

}

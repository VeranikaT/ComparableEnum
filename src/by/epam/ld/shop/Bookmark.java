package by.epam.ld.shop;

import java.util.Objects;

public class Bookmark implements Goods {
    String name;
    int price;
    String type;

    public Bookmark(){

    }

    public Bookmark(String name, int price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookmark bookmark = (Bookmark) o;
        return price == bookmark.price && name.equals(bookmark.name) && type.equals(bookmark.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type);
    }

    @Override
    public String toString() {
        return "Bookmark: " + name + ", price: " + price + ", type: " + type;
    }

    @Override
    public String name(){
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public int compareTo(Goods goods) {
        return (int)(this.price() - goods.price());
    }
}

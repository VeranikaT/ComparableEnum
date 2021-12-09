package by.epam.ld.shop;

import java.util.Objects;

public class Refrigerator implements Goods {
    String name;
    int price;
    int size;

    public Refrigerator(){

    }

    public Refrigerator(String name, int price, int size){
        this.name = name;
        this.price = price;
        this.size=size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return price == that.price && size == that.size && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, size);
    }

    @Override
    public String toString() {
        return "Refrigerator: " + name + ", price: " + price + ", size: " + size;
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

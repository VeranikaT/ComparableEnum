package by.epam.ld.shop;

import java.util.Objects;

public class ChristmasTree implements Goods {
    String name;
    int price;
    String shape;
    String color;

    public ChristmasTree(){

    }

    public ChristmasTree(String name, int price, String shape, String color){
        this.name = name;
        this.price = price;
        this.shape = shape;
        this.color = color;
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

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChristmasTree that = (ChristmasTree) o;
        return price == that.price && name.equals(that.name) && shape.equals(that.shape) && color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, shape, color);
    }

    @Override
    public String toString() {
        return "Christmas Tree: " + name + ", price: " + price + ", shape: " + shape + ", color: " + color;
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

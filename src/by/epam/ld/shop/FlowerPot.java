package by.epam.ld.shop;

import java.util.Objects;

public class FlowerPot implements Goods {
    String name;
    int price;
    String potShape;

    public FlowerPot(){

    }

    public FlowerPot(String name, int price, String potShape){
        this.name = name;
        this.price = price;
        this.potShape = potShape;
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

    public String getPotShape() {
        return potShape;
    }

    public void setPotShape(String potShape) {
        this.potShape = potShape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerPot flowerPot = (FlowerPot) o;
        return price == flowerPot.price && name.equals(flowerPot.name) && potShape.equals(flowerPot.potShape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, potShape);
    }

    @Override
    public String toString() {
        return "Christmas Tree: " + name + ", price: " + price + ", pot's shape: " + potShape;
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

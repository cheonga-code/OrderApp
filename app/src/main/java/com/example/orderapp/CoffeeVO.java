package com.example.orderapp;

public class CoffeeVO {

    String coffeeImgPath;
    String coffeeName;
    int coffeePrice;
    int coffeeQuantity;

    public CoffeeVO(String coffeeImgPath, String coffeeName, int coffeePrice, int coffeeQuantity) {
        this.coffeeImgPath = coffeeImgPath;
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeQuantity = coffeeQuantity;
    }

    public String getCoffeeImgPath() {
        return coffeeImgPath;
    }

    public void setCoffeeImgPath(String coffeeImgPath) {
        this.coffeeImgPath = coffeeImgPath;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public int getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(int coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }
}

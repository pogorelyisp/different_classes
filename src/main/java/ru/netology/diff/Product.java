package ru.netology.diff;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isTooExpensive() {        // метод проверки на дороговизну товара
        if (price > 1_000_000) {
            return true;
        } else {
            return false;
        }
    }


}

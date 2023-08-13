package models;

public class Toaster {
    private int id;
    private String name;
    private String brand;
    private int toastSlots;
    private int qty;
    private float price;

    public Toaster() {

    }




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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getToastSlots() {
        return toastSlots;
    }

    public void setToastSlots(int toastSlots) {
        this.toastSlots = toastSlots;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Toaster(int id, String name, String brand, int toastSlots, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.toastSlots = toastSlots;
        this.qty = qty;
        this.price = price;
    }
}

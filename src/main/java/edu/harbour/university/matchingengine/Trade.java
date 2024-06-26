package edu.harbour.university.matchingengine;

public class Trade {
    Side side;
    int size;
    double price;
    String productId;

    public Trade(Side side, int size, double price, String productId) {
        this.side = side;
        this.size = size;
        this.price = price;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return side + " " + size + " " + price + " " + productId;
    }
}
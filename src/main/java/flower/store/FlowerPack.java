package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }
    public void setQuantity(int quantityNew) {
        if (quantityNew < 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantityNew;
        }
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}

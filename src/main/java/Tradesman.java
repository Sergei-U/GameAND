package Homework.RPG.MyGame.src.main.java;

public class Tradesman implements Seller {

    @Override
    public String sell(Tradesman.Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }

    public static class Goods {
        public static Goods POTION;
    }
}

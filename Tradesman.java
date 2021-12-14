package Homework.RPG.MyGame;

public class Tradesman implements Seller {

    @Override
    public String sell(Tradesman.Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }

    public class Goods {
        public static Goods POTION;
    }
}

import Classes.*;
import Interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) {
//        Market market = new Market();
//        OrdinaryClient client1 = new OrdinaryClient("Boris");
//        OrdinaryClient client2 = new OrdinaryClient("Dasha");
//        VipClient client3 = new VipClient("Fedor", 1101);
//        market.acceptToMarket(client1);
//        market.acceptToMarket(client2);
//        market.acceptToMarket(client3);
//        market.update();

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new VipClient("Fedor", 1101);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        iActorBehaviour item4 = new PromotionClient("Nikolay", "Vse prosto");
        iActorBehaviour item5 = new PromotionClient("Lena", "Vse prosto");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.update();
        ReturnOrder returnOrder = new ReturnOrder();
        returnOrder.getReturnOrder(item2);
        returnOrder.updateReturnOrder();
    }
}
package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehavior;

import java.util.List;

/**
 * Это объект покупателя по акции
 */
public class PromotionClient extends Actor{
    /**
     * Наименование акции
     */
    private String promotionName;
    /**
     * Номер клиента по акции
     */
    private static int idPromoClient;

    /**
     * счетчик клиентов по акции
     */
    static {
        idPromoClient = 0;
    }

    /**
     * Это конструктор клиента по акции
     * @param name имя клиента
     * @param promotionName наименование акции
     */
    public PromotionClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
        idPromoClient++;
    }

    /**
     * @return получить наименование акции
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Получить число клиентов по акции
     * @param promotionName наименование акции
     */
    public static int getIdPromoClient(String promotionName) {
        return idPromoClient;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void setRefundApplication(boolean refundApplication) {
        super.isRefundApplication = refundApplication;
    }

    @Override
    public boolean isRefundApplication() {
        return super.isRefundApplication;
    }

    @Override
    public void returnMoney(boolean pickUpMoney) {
        super.isreturnMoney = pickUpMoney;

    }

    @Override
    public boolean isreturnMoney() {
        return super.isreturnMoney;
    }
}

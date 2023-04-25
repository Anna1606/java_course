package Classes;

/**
 * Класс стандартного покупателя
 */
public class OrdinaryClient extends Actor {
    /**
     * Это конструктор покупателя
     * @param name имя покупателя
     */
    public OrdinaryClient(String name){
        super(name);
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

package Classes;

/**
 * Класс для vip клиентов
 */
public class VipClient extends Actor{
    /**
     * индвивидуальный номер vip клиента
     */
    private int idVip;

    /**
     * Конструктор vip клиента
     * @param name имя клиента
     * @param idVip индивидуальный номер клиента
     */
    public VipClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getIdVip() {
        return idVip;
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

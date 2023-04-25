package Interfaces;

import Classes.Actor;

/**
 * Это интерфейс типовых действий заказчика
 */
public interface iActorBehaviour {
    /**
     * @param makeOrder создать заказ
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * @param pickUpOrder заказ выдан
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * статус заказа: заказ создан
     */
    boolean isMakeOrder();

    /**
     * статус заказа: заказ выдан
     */
    boolean isTakeOrder();

    /**
     * получить сведения о заказчике
     */
    Actor getActor();
    /**
     * сделать заявление на возврат
     */
    void setRefundApplication(boolean refundApplication);

    /**
     * Статус: заявление на возврат получено
     */
    boolean isRefundApplication();

    /**
     * Вернуть деньги за возврат товара
     */
    void returnMoney(boolean pickUpMoney);

    /**
     * Статус: деньги за возврат товара отправлены
     */
    boolean isreturnMoney();
}

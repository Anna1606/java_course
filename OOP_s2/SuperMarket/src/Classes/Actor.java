package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс абстрактного заказчика
 */
public abstract class Actor implements iActorBehaviour {
    /**
     * имя заказчика
     */
    protected String name;
    /**
     * статус: заказ выдан
     */
    protected boolean isTakeOrder;
    /**
     * статус: заказ сделан
     */
    protected boolean isMakeOrder;
    /**
     * статус: заявление на возврат подано
     */
    protected boolean isRefundApplication;
    /**
     * статус: деньги возвращены заказчику
     */
    protected boolean isreturnMoney;

    /**
     * конструктор абстрактного заказчика
     * @param name имя заказчика
     */

    public Actor(String name){
        this.name = name;
    }

    /**
     * узнать имя заказчика
     */
    public abstract String getName();

}

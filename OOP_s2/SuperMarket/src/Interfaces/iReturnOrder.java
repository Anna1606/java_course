package Interfaces;

import Classes.Actor;

/**
 * Это интерфейс возврата товара
 */
public interface iReturnOrder {
    /**
     * Покупатель подал заявление на возврат
     * @param actor это покупатель
     */
    void getReturnOrder(iActorBehaviour actor);

    /**
     * Заявление на возврат принято к исполнению
     */
    void returnOrderisReg();

    /**
     * Возврат исполнен. Покупатель удален из очереди
     */
    void returnOrderisEx();

    /**
     * Деньги отправлены клиенту
     */
    void giveMoneyBack();
    /**
     * Информация о текущем состоянии возвратов
     */
    void updateReturnOrder();
}

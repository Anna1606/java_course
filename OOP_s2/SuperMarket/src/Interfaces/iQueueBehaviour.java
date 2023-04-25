package Interfaces;

import Classes.Actor;

/**
 * Это интерфейс поведения покупателей в очереди магазина
 */
public interface iQueueBehaviour {
    /**
     * Встать в очередь
     * @param actor это покупатель
     */
    void takeInQueue(Actor actor);

    /**
     * выйти из очереди
     */
    void realiceFromQueue();

    /**
     * забрать заказ
     */
    void takeOrder();

    /**
     * сделать заказ
     */
    void giveOrger();
}

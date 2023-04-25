package Interfaces;

import Classes.Actor;

import java.util.List;

/**
 * Интерфейс присутствия заказчика в магазине
 */
public interface iMarketBehavior {
    /**
     * Покупатель зашел в магазин
     * @param actor это покупатель
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Покупатель вышел из магазина
     * @param actors это покупатель
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Информация о текущем состоянии покупателей в магазине
     */
    void update();
}

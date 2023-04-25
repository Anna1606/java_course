package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehaviour;

/**
 * Магазин
 */
public class Market implements iMarketBehavior, iQueueBehaviour{
    /**
     * список клиентов
     */
    private List<iActorBehaviour> queue;

    /**
     * Конструктор магазина
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин");
        takeInQueue(actor.getActor());
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors){
            System.out.println(actor.getName() + " клиент ушел из магазина");
            this.queue.remove(actor);
        }
    }
    @Override
    public void giveOrger() {
        for (iActorBehaviour actor: queue){
            if (actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ");
            }
        }
    }
    @Override
    public void update() {
       takeOrder();
       giveOrger();
       realiceFromQueue();
    }
    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " клиент добавлен в очередь ");
    }
    @Override
    public void realiceFromQueue() {
        List<Actor> releaseActors = new ArrayList<Actor>();
        for (iActorBehaviour actor: queue){
            if (actor.isTakeOrder()){
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor: queue){
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }
}

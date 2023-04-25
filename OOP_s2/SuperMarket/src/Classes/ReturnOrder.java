package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Возвраты товара
 */
public class ReturnOrder implements iReturnOrder {
    /**
     * Список покупателей на возврат
     */
    private List<iActorBehaviour> returnQueue;

    /**
     * Конструктор возвтратов
     */
    public ReturnOrder() {
        this.returnQueue = new ArrayList<iActorBehaviour>();
    }
    @Override
    public void getReturnOrder(iActorBehaviour actor) {
        this.returnQueue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент подал заявление на возврат");
    }
    @Override
    public void returnOrderisReg() {
        for (iActorBehaviour actor : returnQueue) {
            if (!actor.isRefundApplication()) {
                actor.setRefundApplication(true);
                System.out.println(actor.getActor().getName() + " Заявление на возврат принято к исполнению");
            }
        }
    }
    @Override
    public void returnOrderisEx() {
        List<Actor> returnOrderActors = new ArrayList<Actor>();
        for (iActorBehaviour actor : returnQueue) {
            if (actor.isreturnMoney()) {
                returnOrderActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " возврат исполнен ");
            }
        }
    }
    @Override
    public void giveMoneyBack() {
        for (iActorBehaviour actor : returnQueue) {
            if (actor.isRefundApplication()) {
                actor.returnMoney(true);
                System.out.println(actor.getActor().getName() + " деньги по возврату отправлены клиенту");
            }
        }
    }
    @Override
    public void updateReturnOrder() {
        returnOrderisReg();
        giveMoneyBack();
        returnOrderisEx();
    }
}

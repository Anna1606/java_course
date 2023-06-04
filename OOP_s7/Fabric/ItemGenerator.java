package Fabric;

/**
 * Класс создает новые продукты
 */
public abstract class ItemGenerator {
    /** Получить награду */
    public void openRerward(){
     iGameItem gameItem = createItem();
        gameItem.open();
    }
    public abstract iGameItem createItem();
}

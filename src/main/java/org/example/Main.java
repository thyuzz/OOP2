package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market market = new Market();
        human.name = "Клиент";

        market.acceptToMarker(human);
        market.takeinQueue(human);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.update();



    }
}
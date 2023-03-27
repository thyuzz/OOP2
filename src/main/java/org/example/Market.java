package org.example;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour{
    List<Buyer> actorsList = new ArrayList<>();
    Queue<Buyer> actQueue = new ArrayDeque<>();
    @Override
    public void acceptToMarker(Buyer actor) {
        System.out.println(actor.getName() + " зашёл в магазин.");
        actorsList.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actorsList.remove(0);
        System.out.println(actor.getName() + " покинул магазин.");
    }

    @Override
    public void update() {
        // вызов всех методов одновременно

    }

    @Override
    public void takeinQueue(Buyer actor) {
        actQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь.");

    }

    @Override
    public void takeOrders() {
        actQueue.peek().isTakeOrder();
        System.out.println(actQueue.peek().getName() + " забрал заказ.");
    }


    @Override
    public void giveOrders() {
        actQueue.peek().isMakeOrder();
        System.out.println(actQueue.peek().getName() + " сделал заказ.");

    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actQueue.poll().getName() + " покинул очередь.");
        actQueue.poll();

    }
}

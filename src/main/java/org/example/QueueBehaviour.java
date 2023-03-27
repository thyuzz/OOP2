package org.example;

public interface QueueBehaviour {
    void takeinQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}

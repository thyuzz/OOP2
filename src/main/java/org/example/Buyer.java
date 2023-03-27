package org.example;

public abstract class Buyer{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract String getName();

    public abstract boolean isTakeOrder();

    public abstract boolean isMakeOrder();
}

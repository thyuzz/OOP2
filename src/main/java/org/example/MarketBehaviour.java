package org.example;

import java.util.List;
public interface MarketBehaviour {
    void acceptToMarker(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();
}

package com.hozlabs.WebTimes.Models;

import lombok.Builder;
import lombok.Generated;

import java.time.Instant;

@Builder
public class StockPriceHistroy {

    @Generated
    int id;

    String symbol;

    Instant date;

    int open;
    int close;
    int high;
    int low;

    int volume;
}

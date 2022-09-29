package com.no.data;

import org.junit.Assert;
import org.junit.Test;

public class WarmupOneTest {

    @Test
    public void sleepOnVacationWeekend(){}

    @Test
    public void sleepOnNonVacationWeekend(){}

    @Test
    public void sleepOnVacationWeekday(){}

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation
     * is true if we are on vacation. We sleep in if is not a weekday or we're on
     * vacation.
     */
    @Test
    public void sleepIn(){
        Assert.assertEquals(true, WarmupOne.sleepIn(false, false));
        Assert.assertEquals(false, WarmupOne.sleepIn(true, false));
        Assert.assertEquals(true, WarmupOne.sleepIn(false, true));
    }
}

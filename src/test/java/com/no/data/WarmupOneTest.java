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

    @Test
    public void sleepIn(){
        Assert.assertEquals(true, WarmupOne.sleepIn(false, false));
        Assert.assertEquals(false, WarmupOne.sleepIn(true, false));
        Assert.assertEquals(true, WarmupOne.sleepIn(false, true));
    }
}

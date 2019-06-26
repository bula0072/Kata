package com.kata.SetAlarm;

import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ConstantConditions") public class SetAlarmTest {
    @Test
    public void setAlarmFunction() {
        assertTrue("Should be true.", SetAlarm.setAlarm(true, false));
        assertFalse("Should be false.", SetAlarm.setAlarm(true, true));
        assertFalse("Should be false.", SetAlarm.setAlarm(false, false));
        assertFalse("Should be false.", SetAlarm.setAlarm(false, true));
    }

}
package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainToBuyIfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainToBuyIfAmountMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainToBuyIfAmountLessThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }


}
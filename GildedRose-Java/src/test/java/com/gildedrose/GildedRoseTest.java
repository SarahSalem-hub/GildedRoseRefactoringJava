package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {


    public GildedRose CreateAndUpdate (String Name,int Sellin ,int Quality) {

        Item[] items = new Item[]  {new Item(Name,Sellin, Quality )};
        GildedRose app = new GildedRose(items);

        app.updateQuality();
        return app;
    }

    @Test
    public void SystemLowersValue(){

        GildedRose app= CreateAndUpdate("foo",15,25);
        //assertEquals("foo", app.items[0].name);
        assertEquals(14,app.items[0].sellIn);
        assertEquals(24,app.items[0].quality);

    }
    @Test
    public void QualityDegradesTwiceAsFast()
    {
        GildedRose app = CreateAndUpdate("foo", 0, 25);

        //assert quality
        assertEquals(23, app.items[0].quality);
    }

    @Test
    public void QualityNeverNegative()
    {
        //arrange
        GildedRose app = CreateAndUpdate("foo",10, 0);

         //assert quality
        assertEquals(0, app.items[0].quality);

        //assert sellin
        assertEquals(9, app.items[0].sellIn);
    }
}

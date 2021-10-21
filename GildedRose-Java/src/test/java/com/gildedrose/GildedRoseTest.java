package com.gildedrose;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GildedRoseTest {


    public GildedRose CreateAndUpdate (String Name,int Sellin ,int Quality) {

        Item[] items = new Item[]  {new Item(Name,Sellin, Quality )};
        GildedRose app = new GildedRose(items);

        app.updateQuality();
        return app;
    }
    @Test
    public void TestTheTruth()
    {
        assertTrue(true);
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
    @Test
    public void TheOlderItGets()
    {
        //arrange
        GildedRose app = CreateAndUpdate("Aged Brie", 1, 0);

        //assert sellin
        assertEquals(0, app.items[0].sellIn);

        //assert quality
        assertEquals(1, app.items[0].quality);

    }
    @Test
    public void QualityNeverIncreaseThanFifty()
    {
        //arrange
        GildedRose app = CreateAndUpdate("Aged Brie", 0, 49);

        //assert quality
        assertEquals(50, app.items[0].quality);


    }

    @Test
    public void SulfurasLegendaryItem()
    {
        //arrange
        GildedRose app = CreateAndUpdate("Sulfuras, Hand of Ragnaros",0, 80);

        //assert quality
        assertEquals(80, app.items[0].quality);

        //assert sellin
        assertEquals(0, app.items[0].sellIn);
    }
}

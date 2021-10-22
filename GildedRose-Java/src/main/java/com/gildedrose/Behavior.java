package com.gildedrose;

public class Behavior {

  // private Item[] items = new Item[];

    public Item AgedBrie(Item i)
    {
        if (i.quality < 50)
        {
            System.out.println("--------- ");
            System.out.println(i.name);

            i.quality = i.quality + 1;
            i.sellIn = i.sellIn - 1;
            System.out.println("b Q "+i.quality);
            System.out.println("b S "+i.sellIn);

        }
        return i;
    }
    public Item LowersValue(Item i)
    {
        i.quality = i.quality - 1;
        i.sellIn = i.sellIn - 1;

        return i;
    }
    public Item QualityDegradesTwiceAsFast(Item i)
    {
        i.quality = i.quality - 2;
        i.sellIn = i.sellIn - 1;
        return i;
    }

    public Item NeverNegativeNeverFifty(Item i)
    {
        if ( i.quality <50)
        {
            if(i.quality <0)
                i.quality=0;
                System.out.println("never " + i.quality);
                return i;

        }
        else

        return i;
    }
}

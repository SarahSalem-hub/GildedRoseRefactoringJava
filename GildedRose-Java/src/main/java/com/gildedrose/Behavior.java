package com.gildedrose;

public class Behavior {


    public Item AgedBrie(Item i)
    {
        if (i.quality < 50)
        {
            i.quality = i.quality + 1;
            i.sellIn = i.sellIn - 1;
        }
        return i;
    }

    public Item LowersValue(Item i)
    {
        ///lowers value AND QualityDegradesTwiceAsFast
        if (i.sellIn >0)
        {
            i.quality = i.quality - 1;
            i.sellIn = i.sellIn - 1;
        }
        if (i.sellIn <=0)
        {
            i.quality = i.quality - 2;
        }
        return i;
    }


    public Item NeverNegativeNeverFifty(Item i)
    {
        if ( i.quality <50)
        {
            if(i.quality <0)
                i.quality=0;
                return i;

        }
        return i;
    }


    public Item BackstagePasses(Item i)
    {
        System.out.println("item "+i.quality );
        if (i.sellIn <=10 && i.sellIn >=6)
        {
            i.quality += 2 ;
            i.sellIn --;
        }
        if (i.sellIn <= 5 )
        {
            i.quality += 3;
            i.sellIn --;

        }
        return i;
    }

    public Item SulfurasLegendary(Item i)
    {
        return i;
    }
}

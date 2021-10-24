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
    public Item QualityDegradesTwiceAsFast(Item i)
    {

        i.sellIn = i.sellIn - 1;
        return i;
    }

    public Item NeverNegativeNeverFifty(Item i)
    {
        if ( i.quality <50)
        {
            if(i.quality <0)
                i.quality=0;
                System.out.println("never =" + i.quality);
                return i;


        }



        return i;
    }
    public Item BackstagePasses(Item i)
    {
        if (i.sellIn <=10 && i.sellIn>=6)
        {
            System.out.println("less than 10");
            System.out.println(" B i.quality = +2   "+ i.quality);

            i.quality += 2 ;
            i.sellIn --;
            System.out.println(" A i.quality = +2   "+ i.quality);
        }
        if (i.sellIn <= 5 )
        {
            System.out.println("less than 5");

            i.quality += 3;
            i.sellIn --;

        }
        return i;
    }
    public Item SulfurasLegendary(Item i)
    {
        i.quality = i.quality;
        i.sellIn  = i.sellIn;
        System.out.println("q= "+i.quality);
        System.out.println("s= "+i.sellIn);

        return i;
    }
}

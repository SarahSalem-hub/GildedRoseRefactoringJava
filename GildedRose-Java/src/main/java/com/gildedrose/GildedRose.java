package com.gildedrose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GildedRose {

    Behavior B = new Behavior();
      Item[] item ;


    public GildedRose(){}
    public GildedRose(Item[] item) {
        this.item = item;
      ///  this.initialize();
    }

    private void initialize (){
        this.item= new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };
    }


    public static void main(String[] args) {
        Item[] i= new Item[]{new Item("dh",1,1)};
        GildedRose app = new GildedRose(i);



        app.Quality();


}
    public void Quality(){


        for (int i =0 ; i <item.length; i++) {
            System.out.println("i =" + i + " " + item[i]);

            if (!item[i].name.equals("foo"))
            {

                if (item[i].name.equals("Aged Brie"))
                {
                    B.AgedBrie(item[i]);
                }

                if (item[i].name.equals("Backstage passes to a TAFKAL80ETC concert"))
                {
                    B.BackstagePasses(item[i]);
                }

                if (item[i].name.equals("Sulfuras, Hand of Ragnaros"))
                {
                    B.SulfurasLegendary(item[i]);
                }
            }
             else

                B.LowersValue(item[i]);
                B.NeverNegativeNeverFifty(item[i]);


        }
    }


}
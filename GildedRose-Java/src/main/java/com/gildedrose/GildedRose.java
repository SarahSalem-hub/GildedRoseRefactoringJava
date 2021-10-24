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


       // app.updateQuality();
        //B.AgedBrie();
        app.Quality();


}
    public void Quality(){


        for (int i =0 ; i <item.length; i++)
        {
            //System.out.println("i =" +i + " " +items[i]);
            if (item[i].name.equals("foo")) {
                B.LowersValue(item[i]);
                B.NeverNegativeNeverFifty(item[i]);
            }
            if (item[i].name.equals("Aged Brie"))
            {
                System.out.println("ag");
                System.out.println(item[i].name);
                System.out.println("Q S "+item[i].sellIn);
                System.out.println("Q Q "+item[i].quality);
                B.AgedBrie(item[i]);
            }
            if (item[i].name.equals("Backstage passes to a TAFKAL80ETC concert"))
            {
                System.out.println("Back1");
                B.BackstagePasses(item[i]);
                System.out.println("Back2");

            }
            if (item[i].name.equals("Sulfuras, Hand of Ragnaros"))
            {
                B.SulfurasLegendary(item[i]);
            }
           // else
                // here item ,for example the foo item

        }
    }



//    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
//    }
}
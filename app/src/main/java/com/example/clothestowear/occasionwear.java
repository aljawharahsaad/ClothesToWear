package com.example.clothestowear;

import java.util.ArrayList;
import java.util.List;

public class occasionwear {
    String getoccasionoverview(String occasion){

        if (occasion.equals("Casual")) {
            return("You do not need to dress up. Sneakers, jeans and T-shirts are all acceptable, and even encouraged.");
        }
        else if(occasion.equals("Dressy Casual")){
            return("You should dress up, but only a little. It’s often just a matter of wearing nicer shoes, a snazzier \n" +
                    "top or pants that aren’t blue jeans");
        }
        else if(occasion.equals("Business attire")){
            return("You should dress as someone might for a client-facing job. Of course, there is plenty of variation \n" +
                    "within this category. It might mean a suit, a knee-length skirt, or a blazer and khaki bottoms.\n" +
                    "But it definitely means no jeans and no sneakers.");
        }
        else if(occasion.equals("Semi Formal")){
            return("You should dress much nicer than you do every day. Try separates in satin, silk or velvet. Suits. \n" +
                    "When in doubt, wear black.");
        }
        else
        {
            return("You should look very fancy. Tailcoats, floor-length gowns and, potentially, white gloves are all on \n" +
                    "the table.");
        }
}

    String getoccasiondetailed(String occasion){
        if (occasion.equals("Casual")) {
            return("Jeans and a T-shirt: When the most casual of outfits is perfectly acceptable, you might as well go with it.\n" +
                    "\n" +
                    "Khakis, modest shorts, day dresses and skirts\n" +
                    "\n" +
                    "Anything cotton or linen: In the summertime especially, it’s more pleasant to wear breathable fabrics,\n" +
                    "and these can easily be dressed up or down.\n" +
                    "\n" +
                    "Basically, you want to dress like any of the characters on your favorite sitcom routinely do: in comfortable \n" +
                    "clothing that is neither ostentatious nor schlubby.");
        }
        else if(occasion.equals("Dressy Casual")){
            return("Dress: A shirt dress or a sweater dress can appear refined and relaxed at once.\n" +
                    "\n" +
                    "Blouse or button-down shirt: You can’t go wrong with a crisp, classic top. Add a blazer to dress \n" +
                    "the look up a notch or two.\n" +
                    "\n" +
                    "Dark denim: Unfaded indigo or black jeans can make an outfit feel instantly more evening-appropriate.\n" +
                    "\n" +
                    "Jumpsuit: It’s a stylish one-piece alternative to the dress that can be scaled for elegance. Boiler \n" +
                    "suits in particular are very trendy this year.");
        }
        else if(occasion.equals("Business attire")){
            return("If business casual: khakis or dark dress pants; a button-down shirt; sport coat or blazer; tie optional.\n" +
                    "\n" +
                    "If business formal: dark suit, dress shirt and dress shoes; silk tie; sheath dress; pencil skirt.");
        }
        else if(occasion.equals("Semi Formal")){
            return("Dress: You’ll want to wear a dress that is made of a refined fabric (like silk, lace or taffeta) and cuts \n" +
                    "around the knee. It should be much more formal than a sundress, but less formal than a ballgown. Most \n" +
                    "department stores and online retailers have sections devoted to party dresses, and any of those should do.\n" +
                    "\n" +
                    "Suit: Most people wear dark suits to occasions with this dress code, but if the event is a daytime party,\n" +
                    " a light suit (beige, gray) is totally fine.\n" +
                    "\n" +
                    "Jumpsuit: Everyone wears dresses. Why not do wear something that makes a statement?");
        }
        else
        {
            return("Floor-length gown\n" +
                    "\n" +
                    "Tailcoat jacket\n" +
                    "\n" +
                    "Jewels\n" +
                    "\n" +
                    "Long white gloves: optional, and sort of extra, but isn’t that the point?\n" +
                    "\n" +
                    "Looking like royalty is the ideal outcome.");
        }
    }

}
package Poker;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

//System.out.println("пики (♠), червы (♥), бубны (♦) и крести (♣).");
public class CardBlock {
    final String[] card14 = new  String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"}; // {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    final String[] suits = new String[] {"♠","♥","♦","♣"};
    ArrayList<String> cardBlock = new ArrayList<>();
    public CardBlock()
    {

       sortBlock();
    }
    public void sortBlock()
    {
        cardBlock = new ArrayList<>();
        for (String suit : suits) {
            for (String s : card14) {
                cardBlock.add(s + suit);
            }
        }
    }
    public void shuffleBlock()
    {
        for(int i = 0; i < cardBlock.size();i++)
        {
            swap((List<?>) cardBlock, i,(int)Math.round(Math.random()*51));
        }
    }
    public void display()
    {
        for(int i = 0; i < cardBlock.size();i++)
        {
            if(i%13 == 0) System.out.println();
            System.out.print(cardBlock.get(i)+" ");
        }
        System.out.println("\n\n");
    }
    public String popCard()
    {
        if(!cardBlock.isEmpty())
            return  cardBlock.remove(cardBlock.size()-1);
        return "";
    }

    public static void main(String[] args) {
        CardBlock c = new CardBlock();
        c.display();
        c.shuffleBlock();
        c.display();
    }

}

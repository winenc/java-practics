package Poker;

import java.util.Scanner;

public class Poker extends CardBlock {
    int n;
    int quanC = 5;
    public Poker()
    {
        super();
        this.n = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void play()
    {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.print("Вы в игре Poker. ");
        do
        {
            System.out.print("Введите колличество участников: ");
            this.setN(in.nextInt());
            oneGame();
            System.out.print("Хотите сыграть еще? (y/n):  ");
            ch = in.next().charAt(0);
        }while (ch != 'n');
    }
    public void oneGame()
    {
        super.sortBlock();
        dealing();
    }
    public void dealing()
    {
        super.shuffleBlock();
        if(n > 10)
            System.out.println("Слишком много игроков!");
        else
        {
            for(int i = 0;i < n;i++)
            {
                System.out.print("Игрок номер "+(i+1)+": ");
                for(int j = 0; j < quanC ;j++)
                {
                    System.out.print(super.popCard()+" ");
                }
                System.out.println("\n");
            }
        }
    }
}

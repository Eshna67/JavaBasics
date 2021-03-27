package company;

import java.util.Scanner;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.
    public int getValue(){
        return value;
    }
    int getSuitPriority(String suitString) {

//Write your code here.
        int suitNumber;
        if(suitString.equalsIgnoreCase("spades")){
            suitNumber=4;
        }
        else if(suitString.equalsIgnoreCase("diamond")){
            suitNumber=3;
        }
        else if(suitString.equalsIgnoreCase("hearts")){
            suitNumber=2;
        }
        else if(suitString.equalsIgnoreCase("clubs")){
            suitNumber=1;
        }
        else{
            suitNumber=0;
        }
        return suitNumber;
    }




    static class ClassicGame {
        int points1 = 0;
        int points2 = 0;

        public void game(Cards c1, Cards c2) {

//Write your code here.
            if(c1.getValue() != c2.getValue()){
                if(c1.getValue()<c2.getValue()){
                    points2++;
                }
                else{
                    points1++;
                }
            }
            else{
                if(c1.getSuitPriority(c1.suit)<c2.getSuitPriority(c2.suit)){
                    points2++;
                }
                else{
                    points1++;
                }
            }

            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }

    }

    public static class Source {

        public void main(String[] args) {
//Two objects (cards) of class Cards
            Cards c1 = new Cards();
            Cards c2 = new Cards();
            Scanner in = new Scanner(System.in);
//Enter the suit of card 1
            String s1 = in.nextLine();
            c1.setCards(s1, in.nextInt());
            in.nextLine();
//Enter the suit of card 2
            String s2 = in.nextLine();
            c2.setCards(s2, in.nextInt());
            ClassicGame c = new ClassicGame();

            c.game(c1, c2);
        }
    }

}

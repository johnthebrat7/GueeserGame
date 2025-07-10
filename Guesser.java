package GuesserGame;
import java.util.*;
class Guesser {
    int GuesserNum;
    public int GuesserN(){
        System.out.println("Guesser guess a number:");
        Scanner s=new Scanner(System.in);
        GuesserNum=s.nextInt();
        return GuesserNum;
    }
}
class player{
    int playerNum;
    public int playerN(){
        //System.out.println("Player guess a number:");
        Scanner s=new Scanner(System.in);
        playerNum=s.nextInt();
        return playerNum;
    }
}
class Umpire{
    int gNum;
    int pNum1;
    int pNum2;
    int pNum3;
    public int CollectFromGuesser(){
        Guesser g=new Guesser();
        gNum=g.GuesserN();
        return gNum;
    }
    public void collectionFromPlayer(){
        player p1=new player();
        player p2=new player();
        player p3=new player();
        //player p4=new player();
        System.out.println("Player1 guess a number:");
        pNum1=p1.playerN();
        System.out.println("Player2 guess a number:");
        pNum2=p2.playerN();
        System.out.println("Player3 guess a number:");
        pNum3=p3.playerN();

    }
    public void Compare(){
        boolean flag1=false;
        boolean flag2=false;
        boolean flag3=false;
        if(gNum==pNum1){
            flag1=true;
        }
        if(gNum==pNum2){
            flag2=true;
        }
        if(gNum==pNum3){
            flag3=true;
        }
        if(flag1 && flag2 &&flag3){
            System.out.println("Hurrah!all the three players won.");
        }
        else if(flag1&& flag2){
            System.out.println("p1 & p2 won the game");
        }
        else if(flag1&& flag3){
            System.out.println("p1 & p3 won the game");
        }
        else if(flag2&& flag3){
            System.out.println("p2 & p3 won the game");
        }
        else if(flag1){
            System.out.println("p1 won the game");
        }
        else if(flag2) System.out.println("p2 won the game");
        else if(flag3)System.out.println("p3 won the game");
        else{
            System.out.println("All players lost the game.");
        }


    }

    public static void main(String[] args) {
        System.out.println("-------- GAME BEGINS-------");
        Umpire u=new Umpire();
        u.CollectFromGuesser();
        u.collectionFromPlayer();
        u.Compare();
        System.out.println("-------- GAME OVER-----");
    }


}
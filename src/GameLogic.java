/**
 * Created by taavev01 on 25/07/2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GameLogic {
    boolean exitGame = false;
    Map activeMap;

    GameLogic(){
        activeMap = new Map();
        gameFlow();
    }

    void gameFlow(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!exitGame){
            determineAction(userInput(br));
        }
    }

    String userInput(BufferedReader br){
        try{
            return br.readLine();
        } catch (IOException e){
            System.out.println("Failed to read userInput");
        }
        return "";
    }

    void determineAction(String action){
        switch(action.toUpperCase()){
            case "LOOK":    look();
                break;
            case "PICKUP":  pickup();
                break;
            case "MOVE N": move(action);
                break;
            case "MOVE E": move(action);
                break;
            case "MOVE S": move(action);
                break;
            case "MOVE W": move(action);
                break;
            default : System.out.println("Could not understand the input");
                break;
        }
    }

    void look(){
        System.out.println("Look");
    }

    void pickup(){
        System.out.println("pickup");
    }

    void move(String action){
        System.out.println("move");
    }



    public static void main(String args[]){
        GameLogic mainGame = new GameLogic();
    }
}

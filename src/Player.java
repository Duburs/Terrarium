/**
 * Created by taavev01 on 24/07/2017.
 */
public class Player {
    Stats playerStats;
    int[] location = new int[2];

    Player(){
        playerStats = new Stats();
    }

    int getXLocation(){
        return location[0];
    }

    void setXLocation(int x){
        location[0] = x;
    }

    int getYLocation(){
        return location[1];
    }

    void setYLocation(int y){
        location[1] = y;
    }

}

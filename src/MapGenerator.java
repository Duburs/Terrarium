/**
 * Created by taavev01 on 24/07/2017.
 */

import java.util.Random;

public class MapGenerator {
    int height;
    int width;
    private char[][] map;
    OpenSimplexNoise mapRandomiser;
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive

    MapGenerator(int mapWidth, int mapHeight){
        this.map = new char[mapWidth][mapHeight];
        this.height = mapHeight;
        this.width = mapWidth;
        generateMap();

    }

    public void generateMap(){
        mapRandomiser = new OpenSimplexNoise(rand.nextInt(Integer.MAX_VALUE));
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++) {
                mapRandomiser.eval(i,j);
            }
        }
    }

    char[][] getMap(){
        return map;
    }

//    public static void main(String[] args) {
//        MapGenerator maps = new MapGenerator(10,10);
//        char[][] mhfsadjlk = maps.getMap();
//        for(int i = 0; i < 10; i++){
//            for(int j = 0; j < 10; j++){
//                System.out.print(mhfsadjlk[i][j]);
//            }
//            System.out.println();
//        }
//    }

}

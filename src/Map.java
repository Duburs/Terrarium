/**
 * Created by taavev01 on 24/07/2017.
 */
public class Map {
    MapGenerator generateMap;

    public Map(){
        generateMap = new MapGenerator(255,255);
    }

    void createNewMap(int width, int height){
        generateMap = new MapGenerator(width, height);
    }

    char[][] getMap(){
        return generateMap.getMap();
    }

}

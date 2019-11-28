package game101;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class run {

    public static void main(String[] args) {

        Graph newMatrix = new Graph("C:\\Users\\Admin\\Desktop\\Game101\\Dijkstra_Game101\\src\\main\\resources\\matrix_data.txt");

        List<Connection> res = new ArrayList<Connection>();

        DijkstraPathFinder finder= new DijkstraPathFinder();

        System.out.println(finder.pathfindDijkstra(newMatrix, 0 , 7));
    }

}

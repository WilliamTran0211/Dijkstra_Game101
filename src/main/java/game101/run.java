package game101;

import java.util.ArrayList;
import java.util.List;

public class run {

    public static void main(String[] args) {

        Graph newMatrix = new Graph("C:\\Users\\Admin\\Desktop\\Game101\\Game101_Dijkstra\\src\\main\\java\\game101\\matrix.txt");

        List<Connection> res = new ArrayList<Connection>();

        DijkstraPathFinder finder= new DijkstraPathFinder();

        System.out.println(finder.pathfindDijkstra(newMatrix, 0 , 7));
    }

}

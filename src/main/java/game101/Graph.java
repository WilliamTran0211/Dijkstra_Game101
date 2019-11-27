/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game101;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.prefs.Preferences;

/**
 *
 * @author 103
 */
public class Graph {
    private int nodeQty;
    private double[][] adjacencyMatrix;

    public int getNodeQty() {
        return nodeQty;
    }

    public void setNodeQty(int nodeQty) {
        this.nodeQty = nodeQty;
    }
    
    public Graph(String path){
        System.out.println("Graph running ");
        System.out.println("Scan file: "+path);
        try{
            File textFile = new File(path);
            Scanner sc = new Scanner(textFile);
            this.nodeQty = sc.nextInt();

            adjacencyMatrix = new double[this.nodeQty][this.nodeQty];

            System.out.println("----- matrix ----- start -----");
            for(int i=0; i < this.nodeQty; ++i){
                for(int j=0; j < this.nodeQty; ++j) {
                    this.adjacencyMatrix[i][j] = sc.nextDouble();
                    System.out.print(this.adjacencyMatrix[i][j] + "\t");
                }
                System.out.println(" ");
            }
            System.out.println("------ matrix ----- end -----");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public List<Connection> getConnection(int fromNode){
        System.out.println("Graph getConnection running");
        List<Connection> result = new ArrayList<Connection>();
        Connection newConnection;
        for(int i=0; i< this.adjacencyMatrix[fromNode].length; i++){
            if(this.adjacencyMatrix[fromNode][i] != Double.MAX_VALUE || this.adjacencyMatrix[fromNode][i] != 0 ){
                newConnection = new Connection();
                newConnection.setCost(this.adjacencyMatrix[fromNode][i]);
                newConnection.setFromNode(fromNode);
                newConnection.setToNode(i);
                result.add(newConnection);
            }
        }
        return result;
    }
}

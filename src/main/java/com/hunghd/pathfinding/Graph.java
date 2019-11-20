/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hunghd.pathfinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        try{
            Scanner sc = new Scanner(path);
            this.nodeQty = sc.nextInt();
            
            for(int i=0; i< this.nodeQty; i++){
                for(int j=0; j< this.nodeQty; j++){
                    adjacencyMatrix[i][j] = sc.nextDouble();
                }
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public List<Connection> getConnection(int fromNode){
        List<Connection> result = new ArrayList<Connection>();
        Connection newConnection;       
        for(int i=0; i< adjacencyMatrix[fromNode].length; i++){
            if(adjacencyMatrix[fromNode][i] != Double.MAX_VALUE){
                newConnection = new Connection();
                newConnection.setCost(adjacencyMatrix[fromNode][i]);
                newConnection.setFromNode(fromNode);
                newConnection.setToNode(i);
                result.add(newConnection);
            }
        }
        return result;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hunghd.pathfinding;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 103
 */
public class DijkstraPathFinder {
  
   public  List<Connection> pathfindDijkstra(Graph graph, int start, int end){
       List<Connection> result = new ArrayList<Connection>();
       List<NodeRecord> open = new ArrayList<NodeRecord>();
       List<NodeRecord> close = new ArrayList<NodeRecord>();
       NodeRecord startRecord = new NodeRecord();
       
       startRecord.setNode(start);
       startRecord.setConnection(null);
       startRecord.setCostSoFar(0);
       
       open.add(startRecord);
       
       while(open.size() > 0){
           
       }
       
       
               
   }
   
   
    
    
    
}

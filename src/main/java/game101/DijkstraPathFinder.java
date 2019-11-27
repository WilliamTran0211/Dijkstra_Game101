package game101;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 103
 */
public class DijkstraPathFinder {
  
   public List<Connection> pathfindDijkstra(Graph graph, int start, int end){

       System.out.println("pathfindDijkstra running");
       List<Connection> result = new ArrayList<Connection>();
       List<NodeRecord> open = new ArrayList<NodeRecord>();
       List<NodeRecord> close = new ArrayList<NodeRecord>();
       List<Connection> connections = new ArrayList<Connection>();

       NodeRecord startNodeRecord = new NodeRecord();
       NodeRecord currentNodeRecord = new NodeRecord();
       NodeRecord endNodeRecord = new NodeRecord();

       int endNode;
       double endNodeCost;
       
       startNodeRecord.setNode(start);
       startNodeRecord.setConnection(null);
       startNodeRecord.setCostSoFar(0);
       
       open.add(startNodeRecord);
       
       while(open.size() > 0){
           currentNodeRecord = smallestElement(open);

           if(currentNodeRecord.getNode() == end){
               break;
           }

           connections = graph.getConnection(currentNodeRecord.getNode());



           for(int i=0; i< connections.size(); i++){

               endNode = connections.get(i).getToNode();
               endNodeCost = connections.get(i).getCost() + currentNodeRecord.getCostSoFar();


               if(contains(close, endNode)){
                   continue;
               }else if(contains(open, endNode)){
                   endNodeRecord = find(open, endNode);

                   if(endNodeRecord.getCostSoFar() <= endNodeCost){
                       continue;
                   }else{
                        endNodeRecord = new NodeRecord();
                        endNodeRecord.setNode(endNode);
                   }

                   endNodeRecord.setConnection(connections.get(i));
                   endNodeRecord.setCostSoFar(endNodeCost);

                   if(!contains(open, endNodeRecord.getNode())){
                       open.add(endNodeRecord);
                   }
               }

               open.remove(currentNodeRecord);
               close.add(currentNodeRecord);

           }

       }


       if(currentNodeRecord == null || currentNodeRecord.getNode() != end){
           System.out.println("null chỗ này");
           return null;
       }
       else{
           List<Connection> path = new ArrayList<Connection>();

           while(currentNodeRecord.getNode() != start){
               path.add(currentNodeRecord.getConnection());
               currentNodeRecord.setNode(currentNodeRecord.getConnection().getFromNode());
           }

           Collections.reverse(path);
           return path;
       }

   }


   public NodeRecord smallestElement(List<NodeRecord> listNodeRecords){

//        NodeRecord min = listNodeRecords.get(0);
//        for(int i=0; i<listNodeRecords.size(); i++){
//            if(min.getCostSoFar() > listNodeRecords.get(i).getCostSoFar()){
//                min = listNodeRecords.get(i);
//            }
//        }
//       System.out.println("s"min);
//       return min;

       System.out.println("smallestElement running");

       Collections.sort(listNodeRecords);

       System.out.println(listNodeRecords.get(0).toString());

       return listNodeRecords.get(0);
   }

   public boolean contains(List<NodeRecord> listNode, int node){
       for(int i=0; i < listNode.size(); i++) {
           if (listNode.get(i).getNode() == node) {
               return true;
           }
       }
       return false;
   }

   public NodeRecord find(List<NodeRecord> listNode, int node){
//       for(int i=0; i < listNode.size(); i++) {
//           if (listNode.get(i).getNode() == node) {
//                return listNode.get(i);
//           }
//       }
//       return null;

       NodeRecord k = new NodeRecord();

       k = listNode.stream().filter( p -> p.getNode() == node ? true : false).findAny().orElse(null);

       return k;
   }


   
   
    
    
    
}

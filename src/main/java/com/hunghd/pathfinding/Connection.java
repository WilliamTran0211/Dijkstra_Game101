/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hunghd.pathfinding;

/**
 *
 * @author 103
 */
public class Connection {
    private double cost;
    private int fromNode;
    private int toNode;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getFromNode() {
        return fromNode;
    }

    public void setFromNode(int fromNode) {
        this.fromNode = fromNode;
    }

    public int getToNode() {
        return toNode;
    }

    public void setToNode(int toNode) {
        this.toNode = toNode;
    }

    public Connection() {
    }

    public Connection(double cost, int fromNode, int toNode) {
        this.cost = cost;
        this.fromNode = fromNode;
        this.toNode = toNode;
    }
   
    
}

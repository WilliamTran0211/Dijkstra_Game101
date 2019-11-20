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
public class NodeRecord {
    private int node;
    private Connection connection;
    private double costSoFar;

    public NodeRecord() {
    }

    public NodeRecord(int node, Connection connection, double costSoFar) {
        this.node = node;
        this.connection = connection;
        this.costSoFar = costSoFar;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public double getCostSoFar() {
        return costSoFar;
    }

    public void setCostSoFar(double costSoFar) {
        this.costSoFar = costSoFar;
    }
    
    
}

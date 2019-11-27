/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game101;

/**
 *
 * @author 103
 */
public class NodeRecord implements Comparable<NodeRecord> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeRecord that = (NodeRecord) o;

        return node == that.node;
    }

    @Override
    public int hashCode() {
        return node;
    }

    @Override
    public int compareTo(NodeRecord o) {
        return this.costSoFar > o.getCostSoFar() ? 1 : -1;
    }

    @Override
    public String toString() {
        return "NodeRecord{" +
                "node=" + node +
                ", connection=" + connection +
                ", costSoFar=" + costSoFar +
                '}';
    }
}

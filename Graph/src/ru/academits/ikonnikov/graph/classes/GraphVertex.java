package ru.academits.ikonnikov.graph.classes;

import java.util.LinkedList;

public class GraphVertex<T> {
    private T data;
    private LinkedList <T> verticesConnected;

    public GraphVertex(T data) {
        this.data = data;
        //verticesConnected = new LinkedList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedList <T> getVerticesConnected() {
        return verticesConnected;
    }

    public void setVerticesConnected(LinkedList <T> verticesConnected) {
        this.verticesConnected = verticesConnected;
    }

    @Override
    public String toString() {
        if (data == null) {
            return "[]";
        }
        return String.format("[DATA: [%3s], verticesConnected : {%s} ]%n", data, verticesConnected.toString());
    }
}

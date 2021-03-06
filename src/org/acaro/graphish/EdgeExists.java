package org.acaro.graphish;

public class EdgeExists extends RuntimeException {
	public EdgeExists(Vertex from, Vertex to, String type){
		super("Edge " + type + " connecting " + from + " to " + to + " already exists!");
	}
}

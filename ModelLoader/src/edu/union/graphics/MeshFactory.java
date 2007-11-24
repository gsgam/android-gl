package edu.union.graphics;

public interface MeshFactory {
	public Mesh create();
	public Mesh create(int vertexCount, int texCoordCount, int faceCount);
}
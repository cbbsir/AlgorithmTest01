package AlgorithmTest;

public class GraphTest {
	public static void main(String[] args) {
		char[] vertex = {'A','B','C','D','E','F','G'};
		//�ڽӾ���
		int[][] matrix =new int[vertex.length][vertex.length];
		final int N = 65535;
		matrix[0] = new int[] {N,5,7,N,N,N,2};
		matrix[1] = new int[] {5,N,N,9,N,N,3};
		matrix[2] = new int[] {7,N,N,N,8,N,N};
		matrix[3] = new int[] {N,9,N,N,N,4,N};
		matrix[4] = new int[] {N,N,8,N,N,5,4};
		matrix[5] = new int[] {N,N,N,4,5,N,6};
		matrix[6] = new int[] {2,3,N,N,4,6,N};
		
		//����ͼ
		Graph graph = new Graph(vertex,matrix);
		//����Dijktra�㷨
		graph.djs(6);
		graph.showGraph();
		graph.djsShow();
	}

}

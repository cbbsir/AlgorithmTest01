import java.util.Arrays;

public class DijkstraAlgorithm {
	public static void main(String[] args) {
		char[] vertex = {'A','B','C','D','E','F','G'};
		//¡⁄Ω”æÿ’Û
		int[][] martrix =new int[vertex.length][vertex.length];
		final int N = 65535;
		martrix[0] = new int[] {N,5,7,N,N,N,2};
		martrix[1] = new int[] {5,N,N,9,N,N,3};
		martrix[2] = new int[] {7,N,N,N,8,N,N};
		martrix[3] = new int[] {N,9,N,N,N,4,N};
		martrix[4] = new int[] {N,N,8,N,N,5,4};
		martrix[5] = new int[] {N,N,N,4,5,N,6};
		martrix[6] = new int[] {2,3,N,N,4,6,N};
		
		//¥¥Ω®Õº
		Graph graph = new Graph(vertex,martrix);
		graph.showGraph();
		//≤‚ ‘DijktraÀ„∑®
		graph.dsj(6);
		graph.dijktraShow();
	}

}




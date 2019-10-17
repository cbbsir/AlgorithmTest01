package AlgorithmTest;

import java.util.Arrays;

public class Graph {
	//顶点数组
	char[] vertex;
	//邻接矩阵
	int[][] matrix;
	VisitedVertex vv;
	public Graph(char[] vertex, int[][] matrix) {
		super();
		this.vertex = vertex;
		this.matrix = matrix;
		
	}
	
	//更新出发点到各顶点的距离与前驱
	public void update(int index) {
//		for (int i =0 ;i<vertex.length;i++) {
//			if (matrix[index][i]<vv.dis[i]) {
//				vv.updateDis(i, matrix[index][i]);
//				vv.updatePre(i, index);
//			}
//		}

		//遍历matrix[index]行
		int len = 0;
		for (int i=0;i<matrix[index].length;i++) {
			len = vv.getDis(index) + matrix[index][i];
			if (len<vv.getDis(i) && !vv.visited(i)) {
				vv.updateDis(i,len);
				vv.updatePre(i, index);
			}
		}
	}
	
	//Dijsktra算法实现
	public void djs(int index) {
		vv = new VisitedVertex(index, vertex.length);
		update(index);
		for (int i=1;i<vertex.length;i++) {
			index = vv.updateArr(index);
			update(index);
		}
	}
	
	public void djsShow() {
		for (int d:vv.dis) {
			System.out.println(d);
		}
		
		for (int p:vv.pre_vertex) {
			System.out.println(p);
		}
		
	}
	
	//显示图
	public void showGraph() {
		for (int[] link:matrix) {
			System.out.println(Arrays.toString(link));
		}
	}

}

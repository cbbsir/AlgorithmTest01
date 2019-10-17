package AlgorithmTest;

import java.util.Arrays;

public class Graph {
	//��������
	char[] vertex;
	//�ڽӾ���
	int[][] matrix;
	VisitedVertex vv;
	public Graph(char[] vertex, int[][] matrix) {
		super();
		this.vertex = vertex;
		this.matrix = matrix;
		
	}
	
	//���³����㵽������ľ�����ǰ��
	public void update(int index) {
//		for (int i =0 ;i<vertex.length;i++) {
//			if (matrix[index][i]<vv.dis[i]) {
//				vv.updateDis(i, matrix[index][i]);
//				vv.updatePre(i, index);
//			}
//		}

		//����matrix[index]��
		int len = 0;
		for (int i=0;i<matrix[index].length;i++) {
			len = vv.getDis(index) + matrix[index][i];
			if (len<vv.getDis(i) && !vv.visited(i)) {
				vv.updateDis(i,len);
				vv.updatePre(i, index);
			}
		}
	}
	
	//Dijsktra�㷨ʵ��
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
	
	//��ʾͼ
	public void showGraph() {
		for (int[] link:matrix) {
			System.out.println(Arrays.toString(link));
		}
	}

}

package AlgorithmTest;

import java.util.Arrays;

public class VisitedVertex {
	//索引下标对应的点是否被访问
	int[] has_visited;
	//索引下标对应的顶点的前驱顶点
	int[] pre_vertex;
	//出发点到索引下标对应的顶点的距离
	int[] dis;
	
	public VisitedVertex(int index,int length) {
		super();
		has_visited = new int[length];
		pre_vertex = new int[length];
		dis = new int[length];
		Arrays.fill(dis, 65535);
		this.dis[index] = 0;
		has_visited[index] = 1;
	}
	//获取出发点到其它点的距离
	public int getDis(int index) {
		return dis[index];
	}
	//判断该顶点是否被访问
	public boolean visited(int index) {
		return has_visited[index]==1;
	}
	//更新前驱
	public void updatePre(int pre,int index) {
		pre_vertex[pre] = index;
	}
	//更新距离
	public void updateDis(int index, int len) {
		dis[index] = len;
	}
	
	//以新顶点为出发点
	public int updateArr(int index) {
		int min=65535,len=0;
		for (int i=0;i<has_visited.length;i++) {
			if (!visited(i) && dis[i]<min) {
				min = dis[i];
				index = i;
			}
		}
		has_visited[index] = 1;
		return index;
	}

}

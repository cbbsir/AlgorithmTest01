import java.util.Arrays;

public class Graph{
	private char[] vertex;//顶点数组
	private int[][] martrix;//邻接矩阵
	private VisitedVertex vv;
	
	
	//构造器
	public Graph(char[] vertex, int[][] martrix) {
		this.vertex = vertex;
		this.martrix = martrix;
	}
	
	//显示图
	public void showGraph() {
		for (int[] link:martrix) {
			System.out.println(Arrays.toString(link));
		}
	}
	
	//Dijkstra算法实现
	public void dsj(int index) {
		vv = new VisitedVertex(vertex.length, index);
		update(index);//更新
		
		for (int j=1;j<vertex.length;j++) {
			index = vv.updateArr();//选择并返回新的访问点
			update(index);//更新index顶点到周围顶点的距离和前驱顶点
		}
	}
	//更新index下标顶点到周围顶点的距离和周围顶点的前驱顶点
	public void update(int index) {
		int len = 0;
		//根据遍历邻接矩阵的martrix[index]行
		for (int j = 0;j<martrix[index].length;j++) {
			//len含义：出发点到index顶点的距离  +  从index顶点到j顶点的距离
			len = vv.getDis(index) + martrix[index][j];
			if (!vv.in(j) && len<vv.getDis(j)) {
				vv.updatePre(j, index);
				vv.updateDis(j, len);
			}
		}
	}
	
	public void dijktraShow() {
		vv.show();
	}
}
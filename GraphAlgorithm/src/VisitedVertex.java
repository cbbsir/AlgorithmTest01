import java.util.Arrays;

//已访问顶点的集合
public class VisitedVertex{
	//记录各个顶点是否访问过，1表示访问过，0表示未访问过
	//由于算法思想为从某一顶点出发找最短路径，故其它顶点的访问记录在此数组中
	public int[] already_arr;
	//每个下标对应的值为前一个顶点下标
	public int[] pre_visited;
	//记录出发点到其它所有顶点的距离，
	public int[] dis;
	
	//构造器
	/**
	 * 
	 * @param length:顶点个数
	 * @param index:出发点对应的下标
	 */
	public VisitedVertex(int length,int index) {
		this.already_arr = new int[length];
		this.pre_visited = new int[length];
		this.dis = new int[length];
		//初始化dis数组
		Arrays.fill(dis, 65535);
		//设置出发顶点被访问
		this.already_arr[index] = 1;
		this.dis[index] = 0;
		
	}
	/**
	 * 判断index顶点是否访问过
	 * @param index
	 * @return
	 */
	public boolean in(int index) {
		return already_arr[index] ==1;
	}
	/**
	 * 更新出发点到index顶点的距离
	 * @param index
	 * @param len
	 */
	public void updateDis(int index,int len) {
		dis[index] = len;
	}
	/**
	 * 更新pre顶点的前驱顶点为index
	 * @param pre
	 * @param index
	 */
	public void updatePre(int pre,int index) {
		pre_visited[pre] = index;
		
	}
	/**
	 * 返回出发顶点到index顶点的距离
	 * @param index
	 */
	public int getDis(int index) {
		return dis[index];
	}
	//继续选择并返回新的访问顶点，比如G访问完后，就以A作为新的访问点（不是出发点）
	public int updateArr() {
		int min = 65535, index = 0;
		for (int i= 0;i<already_arr.length;i++) {
			if (already_arr[i] == 0 && dis[i]<min) {
				//比较此刻出发点离自己周围距离最短的点，谁距离最短那么下一个出发点就是谁
				min = dis[i];
				index = i;
			}
		}
		//更新index顶点被访问过
		already_arr[index] = 1;
		return index;
	}
	
	public void show() {
		
		//前驱
		System.out.print("[");
		for (int p:pre_visited) {
			System.out.print(" "+p);
		}
		System.out.println("]");
		
		//出发点到各顶点的最短距离
		System.out.print("[");
		for (int d:dis) {			
			System.out.print(" "+d);			
		}
		System.out.println("]");
	}
}

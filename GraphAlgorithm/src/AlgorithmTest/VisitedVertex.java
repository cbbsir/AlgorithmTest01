package AlgorithmTest;

import java.util.Arrays;

public class VisitedVertex {
	//�����±��Ӧ�ĵ��Ƿ񱻷���
	int[] has_visited;
	//�����±��Ӧ�Ķ����ǰ������
	int[] pre_vertex;
	//�����㵽�����±��Ӧ�Ķ���ľ���
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
	//��ȡ�����㵽������ľ���
	public int getDis(int index) {
		return dis[index];
	}
	//�жϸö����Ƿ񱻷���
	public boolean visited(int index) {
		return has_visited[index]==1;
	}
	//����ǰ��
	public void updatePre(int pre,int index) {
		pre_vertex[pre] = index;
	}
	//���¾���
	public void updateDis(int index, int len) {
		dis[index] = len;
	}
	
	//���¶���Ϊ������
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

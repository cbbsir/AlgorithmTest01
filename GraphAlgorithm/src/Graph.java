import java.util.Arrays;

public class Graph{
	private char[] vertex;//��������
	private int[][] martrix;//�ڽӾ���
	private VisitedVertex vv;
	
	
	//������
	public Graph(char[] vertex, int[][] martrix) {
		this.vertex = vertex;
		this.martrix = martrix;
	}
	
	//��ʾͼ
	public void showGraph() {
		for (int[] link:martrix) {
			System.out.println(Arrays.toString(link));
		}
	}
	
	//Dijkstra�㷨ʵ��
	public void dsj(int index) {
		vv = new VisitedVertex(vertex.length, index);
		update(index);//����
		
		for (int j=1;j<vertex.length;j++) {
			index = vv.updateArr();//ѡ�񲢷����µķ��ʵ�
			update(index);//����index���㵽��Χ����ľ����ǰ������
		}
	}
	//����index�±궥�㵽��Χ����ľ������Χ�����ǰ������
	public void update(int index) {
		int len = 0;
		//���ݱ����ڽӾ����martrix[index]��
		for (int j = 0;j<martrix[index].length;j++) {
			//len���壺�����㵽index����ľ���  +  ��index���㵽j����ľ���
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
import java.util.Arrays;

//�ѷ��ʶ���ļ���
public class VisitedVertex{
	//��¼���������Ƿ���ʹ���1��ʾ���ʹ���0��ʾδ���ʹ�
	//�����㷨˼��Ϊ��ĳһ������������·��������������ķ��ʼ�¼�ڴ�������
	public int[] already_arr;
	//ÿ���±��Ӧ��ֵΪǰһ�������±�
	public int[] pre_visited;
	//��¼�����㵽�������ж���ľ��룬
	public int[] dis;
	
	//������
	/**
	 * 
	 * @param length:�������
	 * @param index:�������Ӧ���±�
	 */
	public VisitedVertex(int length,int index) {
		this.already_arr = new int[length];
		this.pre_visited = new int[length];
		this.dis = new int[length];
		//��ʼ��dis����
		Arrays.fill(dis, 65535);
		//���ó������㱻����
		this.already_arr[index] = 1;
		this.dis[index] = 0;
		
	}
	/**
	 * �ж�index�����Ƿ���ʹ�
	 * @param index
	 * @return
	 */
	public boolean in(int index) {
		return already_arr[index] ==1;
	}
	/**
	 * ���³����㵽index����ľ���
	 * @param index
	 * @param len
	 */
	public void updateDis(int index,int len) {
		dis[index] = len;
	}
	/**
	 * ����pre�����ǰ������Ϊindex
	 * @param pre
	 * @param index
	 */
	public void updatePre(int pre,int index) {
		pre_visited[pre] = index;
		
	}
	/**
	 * ���س������㵽index����ľ���
	 * @param index
	 */
	public int getDis(int index) {
		return dis[index];
	}
	//����ѡ�񲢷����µķ��ʶ��㣬����G������󣬾���A��Ϊ�µķ��ʵ㣨���ǳ����㣩
	public int updateArr() {
		int min = 65535, index = 0;
		for (int i= 0;i<already_arr.length;i++) {
			if (already_arr[i] == 0 && dis[i]<min) {
				//�Ƚϴ˿̳��������Լ���Χ������̵ĵ㣬˭���������ô��һ�����������˭
				min = dis[i];
				index = i;
			}
		}
		//����index���㱻���ʹ�
		already_arr[index] = 1;
		return index;
	}
	
	public void show() {
		
		//ǰ��
		System.out.print("[");
		for (int p:pre_visited) {
			System.out.print(" "+p);
		}
		System.out.println("]");
		
		//�����㵽���������̾���
		System.out.print("[");
		for (int d:dis) {			
			System.out.print(" "+d);			
		}
		System.out.println("]");
	}
}

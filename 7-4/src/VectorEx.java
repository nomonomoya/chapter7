import java.util.*;
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> rain = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int avg;
		
		while(true) {
			System.out.print("������ �Է� (0�Է½� ����)>> ");
			int a = scanner.nextInt(); //������ �Է¹ޱ�
			if(a == 0) break; //0 �Է��ϸ� ����
			rain.add(a); //rain���� �÷��ǿ� ������ ����
			sum += a; //�� ���ϱ�
			avg = sum/rain.size(); //��� ���ϱ�
			for(int i=0; i<rain.size(); i++) {
				System.out.print(rain.get(i) + " "); //���� ���
			}
			System.out.println("");
			System.out.println("���� ��� "+ avg);//������
		}
	}

}

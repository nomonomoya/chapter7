import java.util.*;
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Integer> nations = new HashMap<String,Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >>"); //����� �α� �� �Է� �ޱ�
			String n = scanner.next();
			if (n.equals("�׸�")) break; //�׸� �� �ԷµǸ� ����
			int p = scanner.nextInt(); 
			nations.put(n,p);
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String n = scanner.next();
			if(n.equals("�׸�")) break; //�׸��� �ԷµǸ� ����
			Integer p = nations.get(n); //�����̸��� �̿��� �α��� ã��
			if(p == null) System.out.println(n+" ����� �����ϴ�"); //�����̸��� ������
			System.out.println(n+"�� �α��� "+p); //���
		}
		scanner.close();
	}

}

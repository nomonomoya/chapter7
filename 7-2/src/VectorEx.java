import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		//���ڿ��� ���԰����� ArrayList����
		Scanner scanner = new Scanner(System.in);
		System.out.print("6���� ������ ��ĭ���� �и� �Է�(A/B/C/D/F)>>");
		for(int i =0; i<6; i++) {
			String s = scanner.next();//Ű����κ��� ���� �Է�
			a.add(s);//ArrayList �÷��ǿ� ����
		}
		
		double sum = 0;
		double avg = 0;
		
		for(int i=0;i<a.size();i++) {
			String grade = a.get(i); //�ҷ��� �б�
			if(grade.equals("A")) sum += 4.0; //������ ���� ���� ���ϱ�
			if(grade.equals("B")) sum += 3.0;
			if(grade.equals("C")) sum += 2.0;
			if(grade.equals("D")) sum += 1.0;
			if(grade.equals("F")) sum += 0;
		}
		avg = sum/6.0; //��� ���ϱ�
		System.out.print(avg);
	}

}

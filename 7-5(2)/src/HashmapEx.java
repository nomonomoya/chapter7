import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashmapEx {
	public static class Student{ //Student ��ü ����
		String name;
		String sub;
		String age;
		double grade;
		
		public Student(){};
		public Student(String n,String s,String a,double g) {
			name = n; sub = s; age = a; grade = g;
		}
		public void printStudent() {
			System.out.println("�̸�: "+name);
			System.out.println("�а�: "+sub);
			System.out.println("�й�: "+age);
			System.out.println("�������: "+grade);			
		}
		public void printStudent2() {
			System.out.println(name + ", " + sub + ", " + age + ", " + grade);
		}
		public boolean result(String n) {
			if(this.name.equals(n)) return true;
			else return false;
		}
	}
	public static void main(String[] args) {
		HashMap<String, Student> student = new HashMap<String, Student>();//�ؽ��� ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		Student [] c = new Student[4];
		for(int i = 0; i<4; i++) {
			System.out.print(">> ");
			String l = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(l, ","); //,�� �������� ��ū ����
			String n = st.nextToken().trim();
			String s = st.nextToken().trim();
			String a = st.nextToken().trim();
			double g = Double.parseDouble(st.nextToken().trim());
			
			c[i] = new Student(n, s, a, g);
			student.put(n,c[i]); // ArrayList�� ����
		}
		for(int i=0; i<student.size();i++) {
			c[i].printStudent();
			System.out.println("---------------------------");
		}
		
		while(true) {
			System.out.print("�л� �̸� >> ");
			String key = scanner.nextLine();
			if(key.equals("�׸�")) break;
			for(int i=0;i<4;i++) {//ã��
				if(c[i].result(key)) c[i].printStudent2();
			}
		}
	}
}

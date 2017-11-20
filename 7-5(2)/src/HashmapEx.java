import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashmapEx {
	public static class Student{ //Student 객체 생성
		String name;
		String sub;
		String age;
		double grade;
		
		public Student(){};
		public Student(String n,String s,String a,double g) {
			name = n; sub = s; age = a; grade = g;
		}
		public void printStudent() {
			System.out.println("이름: "+name);
			System.out.println("학과: "+sub);
			System.out.println("학번: "+age);
			System.out.println("학접평균: "+grade);			
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
		HashMap<String, Student> student = new HashMap<String, Student>();//해쉬맵 생성
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		Student [] c = new Student[4];
		for(int i = 0; i<4; i++) {
			System.out.print(">> ");
			String l = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(l, ","); //,를 기준으로 토큰 분할
			String n = st.nextToken().trim();
			String s = st.nextToken().trim();
			String a = st.nextToken().trim();
			double g = Double.parseDouble(st.nextToken().trim());
			
			c[i] = new Student(n, s, a, g);
			student.put(n,c[i]); // ArrayList에 저장
		}
		for(int i=0; i<student.size();i++) {
			c[i].printStudent();
			System.out.println("---------------------------");
		}
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String key = scanner.nextLine();
			if(key.equals("그만")) break;
			for(int i=0;i<4;i++) {//찾기
				if(c[i].result(key)) c[i].printStudent2();
			}
		}
	}
}

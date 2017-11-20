import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		//문자열만 삽입가능한 ArrayList생성
		Scanner scanner = new Scanner(System.in);
		System.out.print("6개의 학점을 빈칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i =0; i<6; i++) {
			String s = scanner.next();//키보드로부터 학점 입력
			a.add(s);//ArrayList 컬렉션에 삽입
		}
		
		double sum = 0;
		double avg = 0;
		
		for(int i=0;i<a.size();i++) {
			String grade = a.get(i); //불러와 읽기
			if(grade.equals("A")) sum += 4.0; //학점에 따라 점수 더하기
			if(grade.equals("B")) sum += 3.0;
			if(grade.equals("C")) sum += 2.0;
			if(grade.equals("D")) sum += 1.0;
			if(grade.equals("F")) sum += 0;
		}
		avg = sum/6.0; //평균 구하기
		System.out.print(avg);
	}

}

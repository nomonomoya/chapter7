import java.util.*;
public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> rain = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int avg;
		
		while(true) {
			System.out.print("강수량 입력 (0입력시 종료)>> ");
			int a = scanner.nextInt(); //강수량 입력받기
			if(a == 0) break; //0 입력하면 종료
			rain.add(a); //rain벡터 컬렉션에 강수량 저장
			sum += a; //합 구하기
			avg = sum/rain.size(); //평균 구하기
			for(int i=0; i<rain.size(); i++) {
				System.out.print(rain.get(i) + " "); //내용 출력
			}
			System.out.println("");
			System.out.println("현재 평균 "+ avg);//평균출력
		}
	}

}

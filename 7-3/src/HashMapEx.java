import java.util.*;
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Integer> nations = new HashMap<String,Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >>"); //나라와 인구 값 입력 받기
			String n = scanner.next();
			if (n.equals("그만")) break; //그만 이 입력되면 멈춤
			int p = scanner.nextInt(); 
			nations.put(n,p);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String n = scanner.next();
			if(n.equals("그만")) break; //그만이 입력되면 멈춤
			Integer p = nations.get(n); //나라이름을 이용해 인구수 찾기
			if(p == null) System.out.println(n+" 나라는 없습니다"); //나라이름이 없을때
			System.out.println(n+"의 인구는 "+p); //출력
		}
		scanner.close();
	}

}

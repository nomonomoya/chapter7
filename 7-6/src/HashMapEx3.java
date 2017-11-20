import java.util.*;
class Location {
	String name;
	String a, b;
	public Location(String n, String a, String b) {
		name = n;
		this.a = a;
		this.b = b;
	}
	public String getName() {
		return name;
	}
	public String getA() {
		return a;
	}
	public String getB() {
		return b;
	}
	
}
public class HashMapEx3 {
	public static void main(String[] args) {
		HashMap<String, Location> location = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String l = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(l, ","); //,를 기준으로 토큰 분할
			String n = st.nextToken().trim();
			String a = st.nextToken().trim();
			String b = st.nextToken().trim();
			Location lo = new Location(n,a,b);
			location.put(n,lo);
		}
		System.out.println("-------------------");
		Set<String> Keys = location.keySet();
		Iterator<String> it = Keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			Location c = location.get(name); // 이름을 키로하여 해시맵으로 location 객체 얻어냄
			System.out.print( c.getName());
			System.out.print(" " + c.getA());
			System.out.println(" " + c.getB());
			System.out.println("---------------------------");
		}
		while(true) {
			System.out.print("도시 이름 >> ");
			String name = scanner.nextLine(); // 도시 이름 입력
			if(name.equals("그만"))
				return; // 종료
			Location d = location.get(name); // 해시맵에서 이름을 키로 검색
			if(d == null) { // 도시 이름이 해시맵에 없다면
				System.out.println(name + " 는  없습니다.");
			}
			else {
				System.out.print(d.getName() + " ");
				System.out.print(d.getA() + " ");
				System.out.println(d.getB() + " ");
			}
		}
	}

}

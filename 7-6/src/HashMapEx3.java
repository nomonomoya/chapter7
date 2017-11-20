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
		
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String l = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(l, ","); //,�� �������� ��ū ����
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
			Location c = location.get(name); // �̸��� Ű���Ͽ� �ؽø����� location ��ü ��
			System.out.print( c.getName());
			System.out.print(" " + c.getA());
			System.out.println(" " + c.getB());
			System.out.println("---------------------------");
		}
		while(true) {
			System.out.print("���� �̸� >> ");
			String name = scanner.nextLine(); // ���� �̸� �Է�
			if(name.equals("�׸�"))
				return; // ����
			Location d = location.get(name); // �ؽøʿ��� �̸��� Ű�� �˻�
			if(d == null) { // ���� �̸��� �ؽøʿ� ���ٸ�
				System.out.println(name + " ��  �����ϴ�.");
			}
			else {
				System.out.print(d.getName() + " ");
				System.out.print(d.getA() + " ");
				System.out.println(d.getB() + " ");
			}
		}
	}

}

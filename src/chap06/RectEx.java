package chap06;

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width; this.height = height;
	}
	@Override
	public boolean equals(Object obj) { // 사각형 면적 비교
		Rect p = (Rect)obj; // obj를 Rect 타입으로 다운 캐스팅
		if (width*height == p.width*p.height) return true;
		else return false;
	}
}
public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(2,3); // 면적 6
		Rect b = new Rect(3,2); // 면적 6
		Rect c = new Rect(3,4); // 면적 12
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");
	}
}
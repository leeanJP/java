package chap07;
public class Dog {
	private String name;
	private String type;
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String showDogInfo() {
		return name + ", " + type;
	}
	//DogTest 클래스를 만들고 멤버 변수로 ArrayList
	//Dog 인스턴 스 5개를 생성 ArrayList 추가하고
	//ArrayList 정보를 출력하는 코드 작성


}

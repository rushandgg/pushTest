package 연습용;

public class Switch {
	
	public static void main(String[] args) {
	
		int book = 2;
		book = book / 10;
		switch (book) {
			case 0:
				System.out.println("좀 더 노력하세요");
				break;
			case 1:
				System.out.println("책 읽는 것을 즐기는 분이네요!");
				break;
			case 2:
				System.out.println("책을 사랑하시는 분이네용");
				break;
			default:
				System.out.println("당신은 다독왕 입니다.");
				break;
		}
	}
}

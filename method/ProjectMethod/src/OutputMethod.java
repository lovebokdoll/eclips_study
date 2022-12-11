
public class OutputMethod {

	public static String a() {
		//...
		return "a";
		
	}
	

	public static int one() {
		//...
		return 1;//리턴 뒤에 있는값이 매소드의 실행값이 된 
					//리턴값은 매소드를 종료시키기도 함
					//return값이 어떤 데이터 타입인지도 정해주어야 한다.
	}
				//리턴값이 없는 매소드 void	
	public static void main(String[] args) {
	 System.out.println(a());
	 System.out.println(one());

	}

}

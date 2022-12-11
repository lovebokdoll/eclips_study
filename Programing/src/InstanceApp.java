import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 =new PrintWriter("result1.txt"); //저장하고 싶은 파일의 이름 
			//p1 은 변수 
		p1.write("Hello 2");
		p1.close();
		
		PrintWriter p2 =new PrintWriter("result2.txt"); //저장하고 싶은 파일의 이름 
		
		p2.write("Hello 2");
		p2.close();
	}

}

//no1
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(11011101);
        solution(-100);
        solution(521455130);
        solution(7451000);
	}
	static void solution(int N) {
        int enablePrint = 0;
        while (N > 0) {
                enablePrint = enablePrint * 10;
                enablePrint = enablePrint + N%10; 
                N /= 10;
        }
        System.out.println(enablePrint);
    }
}


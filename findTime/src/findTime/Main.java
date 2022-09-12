package findTime;

public class Main {

	public static void main(String[] args) {
		String s3 = "Value1";
		String s2 = "Value2";
        
		long t1 =  System.currentTimeMillis();
		for (int i = 0; i < 100000; ++i) {
				s3 = s3 + s2;
		}
		long t2 =  System.currentTimeMillis();
	
		System.out.println(((double)(t2-t1)/1000)+"sec");;//finding time of concatenation done by String Literals
		
		long t3 = System.currentTimeMillis();
		StringBuffer s4 = new StringBuffer("Value1");
		String s5 = "Value2";

		for (int i = 0; i < 100000; ++i) {
			s4.append(s5);
		}
		long t4 = System.currentTimeMillis();
		
		System.out.println(((double)(t4-t3)/1000)+"sec");//finding time of concatenation done by StringBuffer
	
	}

}

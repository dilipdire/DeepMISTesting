package mis;

import java.util.EnumMap;

public class EnumDemo {
	
	public enum Test{
	     code,
	      mcq,
	}

	public static void main(String[] args) {
		
		EnumMap<Test,String> tst = new EnumMap<Test,String>(Test.class);
		tst.put(Test.code, "Start coding");
		tst.put(Test.mcq, "Start MCQ");
		
		System.out.println("Size : "+tst.size());
		System.out.println("Code :"+tst.get(Test.code));
		System.out.println("MCQ  :"+tst.get(Test.mcq));
		
	}
}

package mis;

import java.util.EnumMap;

public class EnumDemo {
	
	public enum Test{
	     code,
	      mcq,
	}
	
	public enum Color{
		
		RED,GREEN,YOLLOW,BLUE,BLACK,WHITE;
		
	}

	public static void main(String[] args) {
		
		EnumMap<Test,String> tst = new EnumMap<Test,String>(Test.class);
		tst.put(Test.code, "Start coding");
		tst.put(Test.mcq, "Start MCQ");
		
		System.out.println("Size : "+tst.size());
		System.out.println("Code :"+tst.get(Test.code));
		System.out.println("MCQ  :"+tst.get(Test.mcq));
		
		demoColor();
		
	}
	
	public static void demoColor()
	{
		EnumMap<Color,Integer> color = new EnumMap<Color,Integer>(Color.class);
		color.put(Color.RED, 1);
		color.put(Color.GREEN, 2);
		color.put(Color.YOLLOW, 3);
		color.put(Color.BLUE, 4);
		color.put(Color.BLACK, 5);
		color.put(Color.WHITE, 6);
		
		System.out.print("ENTRYSET: "+color.entrySet()+"\n KEYSET:"+color.keySet()+" \n Value:"+color.values());
		
		
		
	}
}

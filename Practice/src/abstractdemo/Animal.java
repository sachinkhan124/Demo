package abstractdemo;

public   class Animal {
	// abstarct method cannot have body
	 void sound() {};
	
	
	// concrete method have body
	public void sleep()
	{
		System.out.println("this is concrete method");
	}
	
//	public  void makesound()
//	{
//		System.out.println("this is animal make sound");
//	}

}

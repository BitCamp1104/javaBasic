package bcls;

import single.Singleton;

public class YouClass {

	private int youNum;
	/*
	public void setYouNum(int youNum) {
		this.youNum = youNum;
	}
	*/
	
	public void method() {
		Singleton single = Singleton.getInstance();
		youNum = single.num;
		
		System.out.println("youNum = " + youNum);
	}
}





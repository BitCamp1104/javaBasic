package cls;

import java.util.Observable;

public class MyClass extends Observable {

	private String preArg = null;
	
	// 일반 메소드
	
	@Override
	public void notifyObservers(Object arg) {
		
		String str = (String)arg;
		
		// 변화가 없다
		if(str.equals(preArg)) return;
		
		// 변화가 있다
		preArg = str;
		
		setChanged();	// reset		
		
		super.notifyObservers(arg);
		clearChanged();
	}

	

	
	
}





package fr.eni.singleton;

public class MonSingleton {
	
	private  static MonSingleton ms = null;

	private MonSingleton() {
		super();
	}
	
	static public MonSingleton getInstance() {
		if(ms==null) {
			ms = new MonSingleton();
		}
		return ms;
	}
	
}

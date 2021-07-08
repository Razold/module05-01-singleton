package fr.eni.ihm;

import fr.eni.singleton.MonSingleton;

public class MonMain {

	public static void main(String[] args) {
		//MonSingleton ms1= new MonSingleton();
		//MonSingleton ms2=new MonSingleton();
		MonSingleton ms3 = MonSingleton.getInstance();
		MonSingleton ms4 = MonSingleton.getInstance();
	}

}

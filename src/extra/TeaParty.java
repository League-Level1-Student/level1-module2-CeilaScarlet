package extra;

import javax.swing.JOptionPane;

public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
	    
	String welcome = "Hello ";
	
	if (isKnighted) {
		if (isWoman) {
			welcome += "Lady ";
		}else {
			welcome+= "Sir ";
		}
	}else {
		if (isWoman) {
			welcome += "Ms. ";
		}else {
			welcome+= "Mr. ";
		}
	}
	welcome += name;
	
	return welcome;
}
}

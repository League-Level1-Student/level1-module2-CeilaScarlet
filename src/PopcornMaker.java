import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
	
		String fla = JOptionPane.showInputDialog("What flavor do you want?");
		String mi = JOptionPane.showInputDialog("How many minutes do you want to cook it?");
		int min = Integer.parseInt(mi);
		Popcorn pop = new Popcorn(fla);
		Microwave mic = new Microwave();
		mic.putInMicrowave(pop);
		mic.setTime(min);
		mic.startMicrowave();
	}
	}

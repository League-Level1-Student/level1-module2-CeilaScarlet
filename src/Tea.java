import javax.swing.JOptionPane;

public class Tea {
public static void main(String[] args) {
	String fla = JOptionPane.showInputDialog("What tea flavor do you want?\n" + TeaBag.CHAMOMILE+ "\n" + TeaBag.GREEN + "\n" + TeaBag.MINT + "\n" + TeaBag.PASSION_FRUIT);
	TeaBag tb = new TeaBag(fla);
	Kettle ket = new Kettle();
	ket.getWater();
	ket.boil();
	Cup cup = new Cup();
	cup.makeTea(tb, ket.getWater());
	
}
}

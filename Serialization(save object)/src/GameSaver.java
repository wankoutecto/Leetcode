import java.io.*;
import javax.swing.*;

public class GameSaver {

	public static void main(String[] args) {
		
		GameCharacters one = new GameCharacters(100, "Elf", new String[] {"bow", "sword", "dust"});
		GameCharacters two = new GameCharacters(100, "bare hands", new String[] {"hammer", "knife", "ax"});
		GameCharacters three = new GameCharacters(100, "magician", new String[] {"spells", "invisibility"});
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showSaveDialog(new JFrame());
			FileOutputStream file = new FileOutputStream(fileChooser.getSelectedFile());
			ObjectOutputStream os = new ObjectOutputStream(file);
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream file = new FileInputStream("C:\\test\\game_save.ser");
			ObjectInputStream is = new ObjectInputStream(file);
			one = (GameCharacters) is.readObject();
			two = (GameCharacters) is.readObject();
			three = (GameCharacters) is.readObject();
			is.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(one.getType());
		System.out.println(two.getType());
		System.out.println(three.getType());

	}

}


class GameCharacters implements Serializable{
	private int power;
	private String type;
	private String[] weapons;
	
	public GameCharacters(int p, String t, String[] w){
		this.power = p;
		this.type = t;
		this.weapons = w;
	}
	public int getPower() {
		return power;
	}
	public String getType() {
		return type;
	}
	public String[] getWeapons() {
		return weapons;
	}
}
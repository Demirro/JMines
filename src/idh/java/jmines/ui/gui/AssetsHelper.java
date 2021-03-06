package idh.java.jmines.ui.gui;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import idh.java.jmines.JMines;


public class AssetsHelper {
	
	// Pfad zu GUI assets (icons)
	private static final String ASSETS_PATH = "/idh/java/jmines/ui/gui/assets/";
	
	
	public static ImageIcon getIcon(String assetName) {
		try {
			return new ImageIcon(ImageIO.read(JMines.class.getResource(ASSETS_PATH + assetName)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}

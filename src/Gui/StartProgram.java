package Gui;

import java.io.IOException;

import javax.swing.JFrame;

import AESimualtor.AESimulator;

public class StartProgram extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	static AESimulator aesimulator = new AESimulator();

	public static void main(String [] arguments) throws IOException{
				
		Main_Window window = new Main_Window(aesimulator);
		
		window.update_display();
		
	}

}

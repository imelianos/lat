package Gui;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

public class Log4JSettings {
	
	public JScrollPane getLog4JSettingsPanel() {
		
		JEditorPane editorPane = new JEditorPane();
		
		JScrollPane scrollEditorPane = new JScrollPane(editorPane);
				
		File file = new File("./settings/log4j.properties");
		
		try {
			
			editorPane.setPage(file.toURI().toURL());
						
		} catch (MalformedURLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
//		scrollEditorPane.add(editorPane);
		
		return scrollEditorPane;
		
	}

}

package Gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import AESimualtor.XMLSimulatorSettings;

public class TimeSettings{
	
	JSpinner minuteSpinner;
	
	JSpinner hourSpinner;
	
	JSpinner daySpinner;
	
	public JScrollPane getTimeSettingsPanel(XMLSimulatorSettings xmlSettings){
		
		JPanel simulatorTimeSettingsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JScrollPane scrollableSimulatorTimeSettingsPanel = new JScrollPane(simulatorTimeSettingsPanel);		
		
		JPanel simulatorTimeSettingsPanelInner = new JPanel(new GridLayout(2,3,10,10));
		
		simulatorTimeSettingsPanel.add(simulatorTimeSettingsPanelInner);
		
				
		JLabel minuteLabel = new JLabel("Minutes", JLabel.RIGHT);

		JLabel hourLabel = new JLabel("Hours", JLabel.RIGHT);
		
		JLabel dayLabel = new JLabel("Days", JLabel.RIGHT);


		SpinnerModel minuteModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE , 1);     
		
		minuteSpinner = new JSpinner(minuteModel);
		
		SpinnerModel hourModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE , 1);     
		
		hourSpinner = new JSpinner(hourModel);
		
		SpinnerModel dayModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE , 1);     
		
		daySpinner = new JSpinner(dayModel);
		
		
		simulatorTimeSettingsPanelInner.add(minuteLabel);
		
		simulatorTimeSettingsPanelInner.add(hourLabel);

		simulatorTimeSettingsPanelInner.add(dayLabel);

				
		simulatorTimeSettingsPanelInner.add(minuteSpinner);
		
		simulatorTimeSettingsPanelInner.add(hourSpinner);

		simulatorTimeSettingsPanelInner.add(daySpinner);
		
				
		return scrollableSimulatorTimeSettingsPanel;
	}

	public int getSimulationMinutes(){
		
		
		int minutes = (Integer)minuteSpinner.getValue();
		
		int hours = (Integer)hourSpinner.getValue();
		
		int days = (Integer)daySpinner.getValue();

		int duration = minutes+(60*hours)+(24*60*days);
		
		return duration;
			
	}
	
}

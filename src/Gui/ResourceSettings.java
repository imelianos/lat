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

public class ResourceSettings {
	
	private static int nurseSpinnerValue = 0;
	
	private static int doctorSpinnerValue = 0;
	
	private static JSpinner nurseSpinner;



	public JScrollPane getResourceSettingsPanel(XMLSimulatorSettings xmlSettings) {

		JPanel simulatorResourceSettingsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JScrollPane scrollableSimulatorResourceSettingsPanel = new JScrollPane(simulatorResourceSettingsPanel);		

		JPanel simulatorResourceSettingsPanelInner = new JPanel(new GridLayout(3, 3, 0, 10));

		simulatorResourceSettingsPanel.add(simulatorResourceSettingsPanelInner);

		JLabel valueLabel = new JLabel("Set");

		JLabel nurseLabel = new JLabel("Number Of Nurses");

		JLabel doctorLabel = new JLabel("Number Of Doctors");

		int currentSimulationNurses = Integer.parseInt(xmlSettings.loadXML("numberOfNurses"));

		int currentSimulationDoctors = Integer.parseInt(xmlSettings.loadXML("numberOfDoctors"));

		JLabel currentNursesLabel = new JLabel(String.valueOf(currentSimulationNurses));

		JLabel currentDoctorsLabel = new JLabel(String.valueOf(currentSimulationDoctors));

		JLabel currentValueLabel = new JLabel("Current Values");

		JLabel newValueLabel = new JLabel("New Values");

		SpinnerModel nurseModel = new SpinnerNumberModel(currentSimulationNurses, 0, Integer.MAX_VALUE, 1);

		nurseSpinner = new JSpinner(nurseModel);
		


		SpinnerModel doctorModel = new SpinnerNumberModel(currentSimulationDoctors, 0, Integer.MAX_VALUE, 1);

		JSpinner doctorSpinner = new JSpinner(doctorModel);
		
		doctorSpinnerValue = (Integer)doctorSpinner.getValue();

		
		simulatorResourceSettingsPanelInner.add(valueLabel);

		simulatorResourceSettingsPanelInner.add(currentValueLabel);

		simulatorResourceSettingsPanelInner.add(newValueLabel);

		simulatorResourceSettingsPanelInner.add(nurseLabel);

		simulatorResourceSettingsPanelInner.add(currentNursesLabel);

		simulatorResourceSettingsPanelInner.add(nurseSpinner);

		simulatorResourceSettingsPanelInner.add(doctorLabel);

		simulatorResourceSettingsPanelInner.add(currentDoctorsLabel);

		simulatorResourceSettingsPanelInner.add(doctorSpinner);

		return scrollableSimulatorResourceSettingsPanel;
	}

	public static String getNumberOfNurses(){
		
		nurseSpinnerValue = (Integer)nurseSpinner.getValue();
		
		return	String.valueOf(nurseSpinnerValue);	
		
	}
	
	public static String getNumberOfDoctors(){
		
		return	String.valueOf(doctorSpinnerValue);	
		
	}
	
	public void update(){
		
		
		
	}
	
}

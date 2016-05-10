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

public class StateDurationSettings {
	
	private static double meanArrivalStallSpinnerValue = 0.0;
	
	private static double meanRegistrationDurationSpinnerValue = 0.0;
	
	private static double meanTriageDurationSpinnerValue = 0.0;
	
	private static double meanNurseVisitDurationSpinnerValue = 0.0;
	
	private static double meanDoctorVisitDurationSpinnerValue = 0.0;
	
	private static double meanXrayDurationSpinnerValue = 0.0;
	
	private static double meanOtherTestsDurationSpinnerValue = 0.0;
	
	private static double meanTreatmentDurationSpinnerValue = 0.0;

	public JScrollPane getStateDurationSettingsPanel(XMLSimulatorSettings xmlSettings) {
		
		JPanel simulatorStateDurationSettingsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JScrollPane scrollableSimulatorStateDurationSettingsPanel = new JScrollPane(simulatorStateDurationSettingsPanel);		

		JPanel simulatorStateDurationSettingsPanelInner = new JPanel(new GridLayout(9, 3, 0, 10));

		simulatorStateDurationSettingsPanel.add(simulatorStateDurationSettingsPanelInner);

		JLabel valueLabel = new JLabel("Duration Means");
		
		JLabel arrivalStallLabel = new JLabel("Arrival Stall");

		JLabel registrationLabel = new JLabel("Registration");
		
		JLabel triageLabel = new JLabel("Triage");
		
		JLabel nurseAssessmentLabel = new JLabel("Nurse Assessment");

		JLabel doctorAssessmentLabel = new JLabel("Doctor Assessment");

		JLabel xrayLabel = new JLabel("XRay");
		
		JLabel otherTestsLabel = new JLabel("Other Tests");
		
		JLabel treatmentLabel = new JLabel("TreatMent");


		double currentSimulationMeanArrivalStallTime = Double.parseDouble(xmlSettings.loadXML("meanArrivalStallTime"));

		double currentSimulationMeanRegistrationDuration = Double.parseDouble(xmlSettings.loadXML("meanRegistrationDuration"));
		
		double currentSimulationMeanTriageDuration = Double.parseDouble(xmlSettings.loadXML("meanTriageDuration"));

		double currentSimulationMeanNurseVisitDuration = Double.parseDouble(xmlSettings.loadXML("meanNurseVisitDuration"));

		double currentSimulationMeanDoctorVisitDuration = Double.parseDouble(xmlSettings.loadXML("meanDoctorVisitDuration"));

		double currentSimulationMeanXrayDuration = Double.parseDouble(xmlSettings.loadXML("meanXrayDuration"));

		double currentSimulationMeanOtherTestsDuration = Double.parseDouble(xmlSettings.loadXML("meanOtherTestsDuration"));
		
		double currentSimulationMeanTreatmentDuration = Double.parseDouble(xmlSettings.loadXML("meanTreatmentDuration"));


		
		JLabel currentSimulationMeanArrivalStallTimeLabel = new JLabel(String.valueOf(currentSimulationMeanArrivalStallTime));
		
		JLabel currentSimulationMeanRegistrationDurationLabel = new JLabel(String.valueOf(currentSimulationMeanRegistrationDuration));

		JLabel currentSimulationMeanTriageDurationLabel = new JLabel(String.valueOf(currentSimulationMeanTriageDuration));

		JLabel currentSimulationMeanNurseVisitDurationLabel = new JLabel(String.valueOf(currentSimulationMeanNurseVisitDuration));

		JLabel currentSimulationMeanDoctorVisitDurationLabel = new JLabel(String.valueOf(currentSimulationMeanDoctorVisitDuration));

		JLabel currentSimulationMeanXrayDurationLabel = new JLabel(String.valueOf(currentSimulationMeanXrayDuration));

		JLabel currentSimulationMeanOtherTestsDurationLabel = new JLabel(String.valueOf(currentSimulationMeanOtherTestsDuration));

		JLabel currentSimulationMeanTreatmentDurationLabel = new JLabel(String.valueOf(currentSimulationMeanTreatmentDuration));

		
		
		JLabel currentValueLabel = new JLabel("Current Values");

		JLabel newValueLabel = new JLabel("New Values");
		


		SpinnerModel meanArrivalStallModel = new SpinnerNumberModel(currentSimulationMeanArrivalStallTime, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanArrivalStallSpinner = new JSpinner(meanArrivalStallModel);
		
		meanArrivalStallSpinnerValue = (Double)meanArrivalStallSpinner.getValue();
		

		
		SpinnerModel meanRegistrationDurationModel = new SpinnerNumberModel(currentSimulationMeanRegistrationDuration, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanRegistrationDurationSpinner = new JSpinner(meanRegistrationDurationModel);
		
		meanRegistrationDurationSpinnerValue = (Double)meanRegistrationDurationSpinner.getValue();

		
		
		SpinnerModel meanTriageDurationModel = new SpinnerNumberModel(currentSimulationMeanTriageDuration, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanTriageDurationSpinner = new JSpinner(meanTriageDurationModel);
		
		meanTriageDurationSpinnerValue = (Double)meanTriageDurationSpinner.getValue();

		
		
		SpinnerModel meanNurseVisitDurationModel = new SpinnerNumberModel(currentSimulationMeanNurseVisitDuration, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanNurseVisitDurationSpinner = new JSpinner(meanNurseVisitDurationModel);
		
		meanNurseVisitDurationSpinnerValue = (Double)meanNurseVisitDurationSpinner.getValue();

		
		
		SpinnerModel meanDoctorVisitDurationModel = new SpinnerNumberModel(currentSimulationMeanDoctorVisitDuration, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanDoctorVisitDurationSpinner = new JSpinner(meanDoctorVisitDurationModel);
		
		meanDoctorVisitDurationSpinnerValue = (Double)meanDoctorVisitDurationSpinner.getValue();

		
		
		SpinnerModel meanXrayDurationModel = new SpinnerNumberModel(currentSimulationMeanXrayDuration, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanXrayDurationSpinner = new JSpinner(meanXrayDurationModel);
		
		meanXrayDurationSpinnerValue = (Double)meanXrayDurationSpinner.getValue();

		
		
		SpinnerModel meanOtherTestsDurationModel = new SpinnerNumberModel(currentSimulationMeanOtherTestsDuration, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanOtherTestsDurationSpinner = new JSpinner(meanOtherTestsDurationModel);
		
		meanOtherTestsDurationSpinnerValue = (Double)meanOtherTestsDurationSpinner.getValue();

		
		
		SpinnerModel meanTreatmentDurationModel = new SpinnerNumberModel(currentSimulationMeanTreatmentDuration, 0, Integer.MAX_VALUE, 0.1);

		final JSpinner meanTreatmentDurationSpinner = new JSpinner(meanTreatmentDurationModel);
		
		meanTreatmentDurationSpinnerValue = (Double)meanTreatmentDurationSpinner.getValue();

		
		


		simulatorStateDurationSettingsPanelInner.add(valueLabel);

		simulatorStateDurationSettingsPanelInner.add(currentValueLabel);

		simulatorStateDurationSettingsPanelInner.add(newValueLabel);
		
		
		//Arrival Stall

		simulatorStateDurationSettingsPanelInner.add(arrivalStallLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanArrivalStallTimeLabel);

		simulatorStateDurationSettingsPanelInner.add(meanArrivalStallSpinner);
		
		
		//Registration Duration

		simulatorStateDurationSettingsPanelInner.add(registrationLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanRegistrationDurationLabel);

		simulatorStateDurationSettingsPanelInner.add(meanRegistrationDurationSpinner);
		
		
		//Triage Duration

		simulatorStateDurationSettingsPanelInner.add(triageLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanTriageDurationLabel);

		simulatorStateDurationSettingsPanelInner.add(meanTriageDurationSpinner);
		
		
		//Nurse Assessment Duration

		simulatorStateDurationSettingsPanelInner.add(nurseAssessmentLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanNurseVisitDurationLabel);

		simulatorStateDurationSettingsPanelInner.add(meanNurseVisitDurationSpinner);
		
		
		//Doctor Assessment Duration

		simulatorStateDurationSettingsPanelInner.add(doctorAssessmentLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanDoctorVisitDurationLabel);

		simulatorStateDurationSettingsPanelInner.add(meanDoctorVisitDurationSpinner);
		
		
		//Xray Duration

		simulatorStateDurationSettingsPanelInner.add(xrayLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanXrayDurationLabel);

		simulatorStateDurationSettingsPanelInner.add(meanXrayDurationSpinner);
		
		
		//Other Tests Duration

		simulatorStateDurationSettingsPanelInner.add(otherTestsLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanOtherTestsDurationLabel);

		simulatorStateDurationSettingsPanelInner.add(meanOtherTestsDurationSpinner);
		
		
		//Treatment Duration

		simulatorStateDurationSettingsPanelInner.add(treatmentLabel);

		simulatorStateDurationSettingsPanelInner.add(currentSimulationMeanTreatmentDurationLabel);

		simulatorStateDurationSettingsPanelInner.add(meanTreatmentDurationSpinner);


		return scrollableSimulatorStateDurationSettingsPanel;
	}
	
	public static String getMeanArrivalStallTime(){
		
		return	String.valueOf(meanArrivalStallSpinnerValue);	
		
	}
	
	public static String getMeanRegistrationDuration(){
		
		return	String.valueOf(meanRegistrationDurationSpinnerValue);	
		
	}
	
	public static String getMeanTriageDuration(){
		
		return	String.valueOf(meanTriageDurationSpinnerValue);	
		
	}
	
	public static String getMeanNurseVisitDuration(){
		
		return	String.valueOf(meanNurseVisitDurationSpinnerValue);	
		
	}
	
	public static String getMeanDoctorVisitDuration(){
		
		return	String.valueOf(meanDoctorVisitDurationSpinnerValue);	
		
	}
	
	public static String getMeanXrayDuration(){
		
		return	String.valueOf(meanXrayDurationSpinnerValue);	
		
	}
		
	public static String getMeanOtherTestsDuration(){
		
		return	String.valueOf(meanOtherTestsDurationSpinnerValue);	
		
	}
	
	public static String getMeanTreatmentDuration(){
		
		return	String.valueOf(meanTreatmentDurationSpinnerValue);	
		
	}
				
}

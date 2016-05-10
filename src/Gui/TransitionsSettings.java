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

public class TransitionsSettings {
	
	//transitions from 0
	
	static double spinner_0_0 = 0.0;
	
	static double spinner_0_1 = 0.0;
	
	static double spinner_0_2 = 0.0;
	
	static double spinner_0_3 = 0.0;
	
	static double spinner_0_4 = 0.0;
	
	static double spinner_0_5 = 0.0;
	
	static double spinner_0_6 = 0.0;
	
	static double spinner_0_7 = 0.0;
	
	static double spinner_0_8 = 0.0;
	
	static double spinner_0_9 = 0.0;
	
	//transitions from 1
	
	static double spinner_1_0 = 0.0;
	
	static double spinner_1_1 = 0.0;
	
	static double spinner_1_2 = 0.0;
	
	static double spinner_1_3 = 0.0;
	
	static double spinner_1_4 = 0.0;
	
	static double spinner_1_5 = 0.0;
	
	static double spinner_1_6 = 0.0;
	
	static double spinner_1_7 = 0.0;
	
	static double spinner_1_8 = 0.0;
	
	static double spinner_1_9 = 0.0;
	
	//transitions from 2
	
	static double spinner_2_0 = 0.0;
	
	static double spinner_2_1 = 0.0;
	
	static double spinner_2_2 = 0.0;
	
	static double spinner_2_3 = 0.0;
	
	static double spinner_2_4 = 0.0;
	
	static double spinner_2_5 = 0.0;
	
	static double spinner_2_6 = 0.0;
	
	static double spinner_2_7 = 0.0;
	
	static double spinner_2_8 = 0.0;
	
	static double spinner_2_9 = 0.0;
	
	//transitions from 3
	
	static double spinner_3_0 = 0.0;
	
	static double spinner_3_1 = 0.0;
	
	static double spinner_3_2 = 0.0;
	
	static double spinner_3_3 = 0.0;
	
	static double spinner_3_4 = 0.0;
	
	static double spinner_3_5 = 0.0;
	
	static double spinner_3_6 = 0.0;
	
	static double spinner_3_7 = 0.0;
	
	static double spinner_3_8 = 0.0;
	
	static double spinner_3_9 = 0.0;
	
	//transitions from 4
	
	static double spinner_4_0 = 0.0;
	
	static double spinner_4_1 = 0.0;
	
	static double spinner_4_2 = 0.0;
	
	static double spinner_4_3 = 0.0;
	
	static double spinner_4_4 = 0.0;
	
	static double spinner_4_5 = 0.0;
	
	static double spinner_4_6 = 0.0;
	
	static double spinner_4_7 = 0.0;
	
	static double spinner_4_8 = 0.0;
	
	static double spinner_4_9 = 0.0;
	
	//transitions from 5
	
	static double spinner_5_0 = 0.0;
	
	static double spinner_5_1 = 0.0;
	
	static double spinner_5_2 = 0.0;
	
	static double spinner_5_3 = 0.0;
	
	static double spinner_5_4 = 0.0;
	
	static double spinner_5_5 = 0.0;
	
	static double spinner_5_6 = 0.0;
	
	static double spinner_5_7 = 0.0;
	
	static double spinner_5_8 = 0.0;
	
	static double spinner_5_9 = 0.0;
	
	//transitions from 6
	
	static double spinner_6_0 = 0.0;
	
	static double spinner_6_1 = 0.0;
	
	static double spinner_6_2 = 0.0;
	
	static double spinner_6_3 = 0.0;
	
	static double spinner_6_4 = 0.0;
	
	static double spinner_6_5 = 0.0;
	
	static double spinner_6_6 = 0.0;
	
	static double spinner_6_7 = 0.0;
	
	static double spinner_6_8 = 0.0;
	
	static double spinner_6_9 = 0.0;
	
	//transitions from 7
	
	static double spinner_7_0 = 0.0;
	
	static double spinner_7_1 = 0.0;
	
	static double spinner_7_2 = 0.0;
	
	static double spinner_7_3 = 0.0;
	
	static double spinner_7_4 = 0.0;
	
	static double spinner_7_5 = 0.0;
	
	static double spinner_7_6 = 0.0;
	
	static double spinner_7_7 = 0.0;
	
	static double spinner_7_8 = 0.0;
	
	static double spinner_7_9 = 0.0;

	
	//transitions from 8
	
	static double spinner_8_0 = 0.0;
	
	static double spinner_8_1 = 0.0;
	
	static double spinner_8_2 = 0.0;
	
	static double spinner_8_3 = 0.0;
	
	static double spinner_8_4 = 0.0;
	
	static double spinner_8_5 = 0.0;
	
	static double spinner_8_6 = 0.0;
	
	static double spinner_8_7 = 0.0;
	
	static double spinner_8_8 = 0.0;
	
	static double spinner_8_9 = 0.0;
	
	//transitions from 9
	
	static double spinner_9_0 = 0.0;
	
	static double spinner_9_1 = 0.0;
	
	static double spinner_9_2 = 0.0;
	
	static double spinner_9_3 = 0.0;
	
	static double spinner_9_4 = 0.0;
	
	static double spinner_9_5 = 0.0;
	
	static double spinner_9_6 = 0.0;
	
	static double spinner_9_7 = 0.0;
	
	static double spinner_9_8 = 0.0;
	
	static double spinner_9_9 = 0.0;

	public JScrollPane getStateTransitionsSettingsPanel(XMLSimulatorSettings xmlSettings) {

		JPanel simulatorTransitionsSettingsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JScrollPane scrollableSimulatorTransitionsSettingsPanel = new JScrollPane(simulatorTransitionsSettingsPanel);		

		JPanel simulatorTransitionsSettingsPanelInner = new JPanel(new GridLayout(12, 21, 0, 0));

		simulatorTransitionsSettingsPanel.add(simulatorTransitionsSettingsPanelInner);

		JLabel valueLabel = new JLabel("States   ");
		
		JLabel labelStateHorizontalLeft_0 = new JLabel("0", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_0 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_1 = new JLabel("1", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_1 = new JLabel("");

		JLabel labelStateHorizontalLeft_2 = new JLabel("2", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_2 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_3 = new JLabel("3", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_3 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_4 = new JLabel("4", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_4 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_5 = new JLabel("5", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_5 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_6 = new JLabel("6", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_6 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_7 = new JLabel("7", JLabel.RIGHT);
	
		JLabel labelStateHorizontalRight_7 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_8 = new JLabel("8", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_8 = new JLabel("");
		
		JLabel labelStateHorizontalLeft_9 = new JLabel("9", JLabel.RIGHT);
		
		JLabel labelStateHorizontalRight_9 = new JLabel("");
		
		JLabel emptyLabel = new JLabel("");
		
		JLabel labelStateVertical_0 = new JLabel("0");
		
		JLabel labelStateVertical_1 = new JLabel("1");

		JLabel labelStateVertical_2 = new JLabel("2");
		
		JLabel labelStateVertical_3 = new JLabel("3");
		
		JLabel labelStateVertical_4 = new JLabel("4");
		
		JLabel labelStateVertical_5 = new JLabel("5");
		
		JLabel labelStateVertical_6 = new JLabel("6");
		
		JLabel labelStateVertical_7 = new JLabel("7");
		
		JLabel labelStateVertical_8 = new JLabel("8");
		
		JLabel labelStateVertical_9 = new JLabel("9");


		JLabel labelStateOld_0 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_0 = new JLabel("NEW");
		
		JLabel labelStateOld_1 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_1 = new JLabel("NEW");
		
		JLabel labelStateOld_2 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_2 = new JLabel("NEW");
		
		JLabel labelStateOld_3 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_3 = new JLabel("NEW");
		
		JLabel labelStateOld_4 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_4 = new JLabel("NEW");
		
		JLabel labelStateOld_5 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_5 = new JLabel("NEW");
		
		JLabel labelStateOld_6 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_6 = new JLabel("NEW");
		
		JLabel labelStateOld_7 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_7 = new JLabel("NEW");
		
		JLabel labelStateOld_8 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_8 = new JLabel("NEW");
		
		JLabel labelStateOld_9 = new JLabel("OLD ", JLabel.RIGHT);
		
		JLabel labelStateNew_9 = new JLabel("NEW");

		// Transitions from State 0 (ARRIVAL)
		
		String readTransitions_0 = xmlSettings.loadXML("0");
		
		String arrayLineTransitions_0[] = new String[getNumberOfPlacesInTheArray(readTransitions_0)];

		arrayLineTransitions_0 = readTransitions_0.split(",");
		
		double current_0_0 = Double.parseDouble(arrayLineTransitions_0[0]);
		
		JLabel currentLabel_0_0 = new JLabel(String.valueOf(current_0_0), JLabel.RIGHT);
		
		double current_0_1 = Double.parseDouble(arrayLineTransitions_0[1]);
		
		JLabel currentLabel_0_1 = new JLabel(String.valueOf(current_0_1), JLabel.RIGHT);
		
		double current_0_2 = Double.parseDouble(arrayLineTransitions_0[2]);
		
		JLabel currentLabel_0_2 = new JLabel(String.valueOf(current_0_2), JLabel.RIGHT);
		
		double current_0_3 = Double.parseDouble(arrayLineTransitions_0[3]);
		
		JLabel currentLabel_0_3 = new JLabel(String.valueOf(current_0_3), JLabel.RIGHT);
		
		double current_0_4 = Double.parseDouble(arrayLineTransitions_0[4]);
		
		JLabel currentLabel_0_4 = new JLabel(String.valueOf(current_0_4), JLabel.RIGHT);
		
		double current_0_5 = Double.parseDouble(arrayLineTransitions_0[5]);
		
		JLabel currentLabel_0_5 = new JLabel(String.valueOf(current_0_5), JLabel.RIGHT);
		
		double current_0_6 = Double.parseDouble(arrayLineTransitions_0[6]);
		
		JLabel currentLabel_0_6 = new JLabel(String.valueOf(current_0_6), JLabel.RIGHT);
		
		double current_0_7 = Double.parseDouble(arrayLineTransitions_0[7]);
		
		JLabel currentLabel_0_7 = new JLabel(String.valueOf(current_0_7), JLabel.RIGHT);
		
		double current_0_8 = Double.parseDouble(arrayLineTransitions_0[8]);
		
		JLabel currentLabel_0_8 = new JLabel(String.valueOf(current_0_8), JLabel.RIGHT);
		
		double current_0_9 = Double.parseDouble(arrayLineTransitions_0[9]);
		
		JLabel currentLabel_0_9 = new JLabel(String.valueOf(current_0_9), JLabel.RIGHT);
		
		// Transitions from State 1 (REGISTRATION)
		
		String readTransitions_1 = xmlSettings.loadXML("1");
		
		String arrayLineTransitions_1[] = new String[getNumberOfPlacesInTheArray(readTransitions_1)];

		arrayLineTransitions_1 = readTransitions_1.split(",");
		
		double current_1_0 = Double.parseDouble(arrayLineTransitions_1[0]);
		
		JLabel currentLabel_1_0 = new JLabel(String.valueOf(current_1_0), JLabel.RIGHT);
		
		double current_1_1 = Double.parseDouble(arrayLineTransitions_1[1]);
		
		JLabel currentLabel_1_1 = new JLabel(String.valueOf(current_1_1), JLabel.RIGHT);
		
		double current_1_2 = Double.parseDouble(arrayLineTransitions_1[2]);
		
		JLabel currentLabel_1_2 = new JLabel(String.valueOf(current_1_2), JLabel.RIGHT);
		
		double current_1_3 = Double.parseDouble(arrayLineTransitions_1[3]);
		
		JLabel currentLabel_1_3 = new JLabel(String.valueOf(current_1_3), JLabel.RIGHT);
		
		double current_1_4 = Double.parseDouble(arrayLineTransitions_1[4]);
		
		JLabel currentLabel_1_4 = new JLabel(String.valueOf(current_1_4), JLabel.RIGHT);
		
		double current_1_5 = Double.parseDouble(arrayLineTransitions_1[5]);
		
		JLabel currentLabel_1_5 = new JLabel(String.valueOf(current_1_5), JLabel.RIGHT);
		
		double current_1_6 = Double.parseDouble(arrayLineTransitions_1[6]);
		
		JLabel currentLabel_1_6 = new JLabel(String.valueOf(current_1_6), JLabel.RIGHT);
		
		double current_1_7 = Double.parseDouble(arrayLineTransitions_1[7]);
		
		JLabel currentLabel_1_7 = new JLabel(String.valueOf(current_1_7), JLabel.RIGHT);
		
		double current_1_8 = Double.parseDouble(arrayLineTransitions_1[8]);
		
		JLabel currentLabel_1_8 = new JLabel(String.valueOf(current_1_8), JLabel.RIGHT);
		
		double current_1_9 = Double.parseDouble(arrayLineTransitions_1[9]);
		
		JLabel currentLabel_1_9 = new JLabel(String.valueOf(current_1_9), JLabel.RIGHT);
		
		// Transitions from State 2 (TRIAGE)
		
		String readTransitions_2 = xmlSettings.loadXML("2");
		
		String arrayLineTransitions_2[] = new String[getNumberOfPlacesInTheArray(readTransitions_2)];

		arrayLineTransitions_2 = readTransitions_2.split(",");
		
		double current_2_0 = Double.parseDouble(arrayLineTransitions_2[0]);
		
		JLabel currentLabel_2_0 = new JLabel(String.valueOf(current_2_0), JLabel.RIGHT);
		
		double current_2_1 = Double.parseDouble(arrayLineTransitions_2[1]);
		
		JLabel currentLabel_2_1 = new JLabel(String.valueOf(current_2_1), JLabel.RIGHT);
		
		double current_2_2 = Double.parseDouble(arrayLineTransitions_2[2]);
		
		JLabel currentLabel_2_2 = new JLabel(String.valueOf(current_2_2), JLabel.RIGHT);
		
		double current_2_3 = Double.parseDouble(arrayLineTransitions_2[3]);
		
		JLabel currentLabel_2_3 = new JLabel(String.valueOf(current_2_3), JLabel.RIGHT);
		
		double current_2_4 = Double.parseDouble(arrayLineTransitions_2[4]);
		
		JLabel currentLabel_2_4 = new JLabel(String.valueOf(current_2_4), JLabel.RIGHT);
		
		double current_2_5 = Double.parseDouble(arrayLineTransitions_2[5]);
		
		JLabel currentLabel_2_5 = new JLabel(String.valueOf(current_2_5), JLabel.RIGHT);
		
		double current_2_6 = Double.parseDouble(arrayLineTransitions_2[6]);
		
		JLabel currentLabel_2_6 = new JLabel(String.valueOf(current_2_6), JLabel.RIGHT);
		
		double current_2_7 = Double.parseDouble(arrayLineTransitions_2[7]);
		
		JLabel currentLabel_2_7 = new JLabel(String.valueOf(current_2_7), JLabel.RIGHT);
		
		double current_2_8 = Double.parseDouble(arrayLineTransitions_2[8]);
		
		JLabel currentLabel_2_8 = new JLabel(String.valueOf(current_2_8), JLabel.RIGHT);
		
		double current_2_9 = Double.parseDouble(arrayLineTransitions_2[9]);
		
		JLabel currentLabel_2_9 = new JLabel(String.valueOf(current_2_9), JLabel.RIGHT);
		
		
		// Transitions from State 3 (NURSE ASSESSMENT)
		
		String readTransitions_3 = xmlSettings.loadXML("3");
		
		String arrayLineTransitions_3[] = new String[getNumberOfPlacesInTheArray(readTransitions_3)];

		arrayLineTransitions_3= readTransitions_3.split(",");
		
		double current_3_0 = Double.parseDouble(arrayLineTransitions_3[0]);
		
		JLabel currentLabel_3_0 = new JLabel(String.valueOf(current_3_0), JLabel.RIGHT);
		
		double current_3_1 = Double.parseDouble(arrayLineTransitions_3[1]);
		
		JLabel currentLabel_3_1 = new JLabel(String.valueOf(current_3_1), JLabel.RIGHT);
		
		double current_3_2 = Double.parseDouble(arrayLineTransitions_3[2]);
		
		JLabel currentLabel_3_2 = new JLabel(String.valueOf(current_3_2), JLabel.RIGHT);
		
		double current_3_3 = Double.parseDouble(arrayLineTransitions_3[3]);
		
		JLabel currentLabel_3_3 = new JLabel(String.valueOf(current_3_3), JLabel.RIGHT);
		
		double current_3_4 = Double.parseDouble(arrayLineTransitions_3[4]);
		
		JLabel currentLabel_3_4 = new JLabel(String.valueOf(current_3_4), JLabel.RIGHT);
		
		double current_3_5 = Double.parseDouble(arrayLineTransitions_3[5]);
		
		JLabel currentLabel_3_5 = new JLabel(String.valueOf(current_3_5), JLabel.RIGHT);
		
		double current_3_6 = Double.parseDouble(arrayLineTransitions_3[6]);
		
		JLabel currentLabel_3_6 = new JLabel(String.valueOf(current_3_6), JLabel.RIGHT);
		
		double current_3_7 = Double.parseDouble(arrayLineTransitions_3[7]);
		
		JLabel currentLabel_3_7 = new JLabel(String.valueOf(current_3_7), JLabel.RIGHT);
		
		double current_3_8 = Double.parseDouble(arrayLineTransitions_3[8]);
		
		JLabel currentLabel_3_8 = new JLabel(String.valueOf(current_3_8), JLabel.RIGHT);
		
		double current_3_9 = Double.parseDouble(arrayLineTransitions_3[9]);
		
		JLabel currentLabel_3_9 = new JLabel(String.valueOf(current_3_9), JLabel.RIGHT);
		
		
		// Transitions from State 4 (DOCTOR ASSESSMENT)
		
		String readTransitions_4 = xmlSettings.loadXML("4");
		
		String arrayLineTransitions_4[] = new String[getNumberOfPlacesInTheArray(readTransitions_4)];

		arrayLineTransitions_4 = readTransitions_4.split(",");
		
		double current_4_0 = Double.parseDouble(arrayLineTransitions_4[0]);
		
		JLabel currentLabel_4_0 = new JLabel(String.valueOf(current_4_0), JLabel.RIGHT);
		
		double current_4_1 = Double.parseDouble(arrayLineTransitions_4[1]);
		
		JLabel currentLabel_4_1 = new JLabel(String.valueOf(current_4_1), JLabel.RIGHT);
		
		double current_4_2 = Double.parseDouble(arrayLineTransitions_4[2]);
		
		JLabel currentLabel_4_2 = new JLabel(String.valueOf(current_4_2), JLabel.RIGHT);
		
		double current_4_3 = Double.parseDouble(arrayLineTransitions_4[3]);
		
		JLabel currentLabel_4_3 = new JLabel(String.valueOf(current_4_3), JLabel.RIGHT);
		
		double current_4_4 = Double.parseDouble(arrayLineTransitions_4[4]);
		
		JLabel currentLabel_4_4 = new JLabel(String.valueOf(current_4_4), JLabel.RIGHT);
		
		double current_4_5 = Double.parseDouble(arrayLineTransitions_4[5]);
		
		JLabel currentLabel_4_5 = new JLabel(String.valueOf(current_4_5), JLabel.RIGHT);
		
		double current_4_6 = Double.parseDouble(arrayLineTransitions_4[6]);
		
		JLabel currentLabel_4_6 = new JLabel(String.valueOf(current_4_6), JLabel.RIGHT);
		
		double current_4_7 = Double.parseDouble(arrayLineTransitions_4[7]);
		
		JLabel currentLabel_4_7 = new JLabel(String.valueOf(current_4_7), JLabel.RIGHT);
		
		double current_4_8 = Double.parseDouble(arrayLineTransitions_4[8]);
		
		JLabel currentLabel_4_8 = new JLabel(String.valueOf(current_4_8), JLabel.RIGHT);
		
		double current_4_9 = Double.parseDouble(arrayLineTransitions_4[9]);
		
		JLabel currentLabel_4_9 = new JLabel(String.valueOf(current_4_9), JLabel.RIGHT);
		
		
		// Transitions from State 5 (XRAY)
		
		String readTransitions_5 = xmlSettings.loadXML("5");
		
		String arrayLineTransitions_5[] = new String[getNumberOfPlacesInTheArray(readTransitions_5)];

		arrayLineTransitions_5 = readTransitions_5.split(",");
		
		double current_5_0 = Double.parseDouble(arrayLineTransitions_5[0]);
		
		JLabel currentLabel_5_0 = new JLabel(String.valueOf(current_5_0), JLabel.RIGHT);
		
		double current_5_1 = Double.parseDouble(arrayLineTransitions_5[1]);
		
		JLabel currentLabel_5_1 = new JLabel(String.valueOf(current_5_1), JLabel.RIGHT);
		
		double current_5_2 = Double.parseDouble(arrayLineTransitions_5[2]);
		
		JLabel currentLabel_5_2 = new JLabel(String.valueOf(current_5_2), JLabel.RIGHT);
		
		double current_5_3 = Double.parseDouble(arrayLineTransitions_5[3]);
		
		JLabel currentLabel_5_3 = new JLabel(String.valueOf(current_5_3), JLabel.RIGHT);
		
		double current_5_4 = Double.parseDouble(arrayLineTransitions_5[4]);
		
		JLabel currentLabel_5_4 = new JLabel(String.valueOf(current_5_4), JLabel.RIGHT);
		
		double current_5_5 = Double.parseDouble(arrayLineTransitions_5[5]);
		
		JLabel currentLabel_5_5 = new JLabel(String.valueOf(current_5_5), JLabel.RIGHT);
		
		double current_5_6 = Double.parseDouble(arrayLineTransitions_5[6]);
		
		JLabel currentLabel_5_6 = new JLabel(String.valueOf(current_5_6), JLabel.RIGHT);
		
		double current_5_7 = Double.parseDouble(arrayLineTransitions_5[7]);
		
		JLabel currentLabel_5_7 = new JLabel(String.valueOf(current_5_7), JLabel.RIGHT);
		
		double current_5_8 = Double.parseDouble(arrayLineTransitions_5[8]);
		
		JLabel currentLabel_5_8 = new JLabel(String.valueOf(current_5_8), JLabel.RIGHT);
		
		double current_5_9 = Double.parseDouble(arrayLineTransitions_5[9]);
		
		JLabel currentLabel_5_9 = new JLabel(String.valueOf(current_5_9), JLabel.RIGHT);
		
		
		// Transitions from State 6 (THER TESTS)
		
		String readTransitions_6 = xmlSettings.loadXML("6");
		
		String arrayLineTransitions_6[] = new String[getNumberOfPlacesInTheArray(readTransitions_6)];

		arrayLineTransitions_6 = readTransitions_6.split(",");
		
		double current_6_0 = Double.parseDouble(arrayLineTransitions_6[0]);
		
		JLabel currentLabel_6_0 = new JLabel(String.valueOf(current_6_0), JLabel.RIGHT);
		
		double current_6_1 = Double.parseDouble(arrayLineTransitions_6[1]);
		
		JLabel currentLabel_6_1 = new JLabel(String.valueOf(current_6_1), JLabel.RIGHT);
		
		double current_6_2 = Double.parseDouble(arrayLineTransitions_6[2]);
		
		JLabel currentLabel_6_2 = new JLabel(String.valueOf(current_6_2), JLabel.RIGHT);
		
		double current_6_3 = Double.parseDouble(arrayLineTransitions_6[3]);
		
		JLabel currentLabel_6_3 = new JLabel(String.valueOf(current_6_3), JLabel.RIGHT);
		
		double current_6_4 = Double.parseDouble(arrayLineTransitions_6[4]);
		
		JLabel currentLabel_6_4 = new JLabel(String.valueOf(current_6_4), JLabel.RIGHT);
		
		double current_6_5 = Double.parseDouble(arrayLineTransitions_6[5]);
		
		JLabel currentLabel_6_5 = new JLabel(String.valueOf(current_6_5), JLabel.RIGHT);
		
		double current_6_6 = Double.parseDouble(arrayLineTransitions_6[6]);
		
		JLabel currentLabel_6_6 = new JLabel(String.valueOf(current_6_6), JLabel.RIGHT);
		
		double current_6_7 = Double.parseDouble(arrayLineTransitions_6[7]);
		
		JLabel currentLabel_6_7 = new JLabel(String.valueOf(current_6_7), JLabel.RIGHT);
		
		double current_6_8 = Double.parseDouble(arrayLineTransitions_6[8]);
		
		JLabel currentLabel_6_8 = new JLabel(String.valueOf(current_6_8), JLabel.RIGHT);
		
		double current_6_9 = Double.parseDouble(arrayLineTransitions_6[9]);
		
		JLabel currentLabel_6_9 = new JLabel(String.valueOf(current_6_9), JLabel.RIGHT);
		
		// Transitions from State 7 (TREATMENT)
		
		String readTransitions_7 = xmlSettings.loadXML("7");
		
		String arrayLineTransitions_7[] = new String[getNumberOfPlacesInTheArray(readTransitions_7)];

		arrayLineTransitions_7 = readTransitions_7.split(",");
		
		double current_7_0 = Double.parseDouble(arrayLineTransitions_7[0]);
		
		JLabel currentLabel_7_0 = new JLabel(String.valueOf(current_7_0), JLabel.RIGHT);
		
		double current_7_1 = Double.parseDouble(arrayLineTransitions_7[1]);
		
		JLabel currentLabel_7_1 = new JLabel(String.valueOf(current_7_1), JLabel.RIGHT);
		
		double current_7_2 = Double.parseDouble(arrayLineTransitions_7[2]);
		
		JLabel currentLabel_7_2 = new JLabel(String.valueOf(current_7_2), JLabel.RIGHT);
		
		double current_7_3 = Double.parseDouble(arrayLineTransitions_7[3]);
		
		JLabel currentLabel_7_3 = new JLabel(String.valueOf(current_7_3), JLabel.RIGHT);
		
		double current_7_4 = Double.parseDouble(arrayLineTransitions_7[4]);
		
		JLabel currentLabel_7_4 = new JLabel(String.valueOf(current_7_4), JLabel.RIGHT);
		
		double current_7_5 = Double.parseDouble(arrayLineTransitions_7[5]);
		
		JLabel currentLabel_7_5 = new JLabel(String.valueOf(current_7_5), JLabel.RIGHT);
		
		double current_7_6 = Double.parseDouble(arrayLineTransitions_7[6]);
		
		JLabel currentLabel_7_6 = new JLabel(String.valueOf(current_7_6), JLabel.RIGHT);
		
		double current_7_7 = Double.parseDouble(arrayLineTransitions_7[7]);
		
		JLabel currentLabel_7_7 = new JLabel(String.valueOf(current_7_7), JLabel.RIGHT);
		
		double current_7_8 = Double.parseDouble(arrayLineTransitions_7[8]);
		
		JLabel currentLabel_7_8 = new JLabel(String.valueOf(current_7_8), JLabel.RIGHT);
		
		double current_7_9 = Double.parseDouble(arrayLineTransitions_7[9]);
		
		JLabel currentLabel_7_9 = new JLabel(String.valueOf(current_7_9), JLabel.RIGHT);
		
		// Transitions from State 8 (AAADMISSION)
		
		String readTransitions_8 = xmlSettings.loadXML("8");
		
		String arrayLineTransitions_8[] = new String[getNumberOfPlacesInTheArray(readTransitions_8)];

		arrayLineTransitions_8 = readTransitions_8.split(",");
		
		double current_8_0 = Double.parseDouble(arrayLineTransitions_8[0]);
		
		JLabel currentLabel_8_0 = new JLabel(String.valueOf(current_8_0), JLabel.RIGHT);
		
		double current_8_1 = Double.parseDouble(arrayLineTransitions_8[1]);
		
		JLabel currentLabel_8_1 = new JLabel(String.valueOf(current_8_1), JLabel.RIGHT);
		
		double current_8_2 = Double.parseDouble(arrayLineTransitions_8[2]);
		
		JLabel currentLabel_8_2 = new JLabel(String.valueOf(current_8_2), JLabel.RIGHT);
		
		double current_8_3 = Double.parseDouble(arrayLineTransitions_8[3]);
		
		JLabel currentLabel_8_3 = new JLabel(String.valueOf(current_8_3), JLabel.RIGHT);
		
		double current_8_4 = Double.parseDouble(arrayLineTransitions_8[4]);
		
		JLabel currentLabel_8_4 = new JLabel(String.valueOf(current_8_4), JLabel.RIGHT);
		
		double current_8_5 = Double.parseDouble(arrayLineTransitions_8[5]);
		
		JLabel currentLabel_8_5 = new JLabel(String.valueOf(current_8_5), JLabel.RIGHT);
		
		double current_8_6 = Double.parseDouble(arrayLineTransitions_8[6]);
		
		JLabel currentLabel_8_6 = new JLabel(String.valueOf(current_8_6), JLabel.RIGHT);
		
		double current_8_7 = Double.parseDouble(arrayLineTransitions_8[7]);
		
		JLabel currentLabel_8_7 = new JLabel(String.valueOf(current_8_7), JLabel.RIGHT);
		
		double current_8_8 = Double.parseDouble(arrayLineTransitions_8[8]);
		
		JLabel currentLabel_8_8 = new JLabel(String.valueOf(current_8_8), JLabel.RIGHT);
		
		double current_8_9 = Double.parseDouble(arrayLineTransitions_8[9]);
		
		JLabel currentLabel_8_9 = new JLabel(String.valueOf(current_8_9), JLabel.RIGHT);
		
		
		// Transitions from State 9 (DISCHARGE)
		
		String readTransitions_9 = xmlSettings.loadXML("9");
		
		String arrayLineTransitions_9[] = new String[getNumberOfPlacesInTheArray(readTransitions_9)];

		arrayLineTransitions_9 = readTransitions_9.split(",");
		
		double current_9_0 = Double.parseDouble(arrayLineTransitions_9[0]);
		
		JLabel currentLabel_9_0 = new JLabel(String.valueOf(current_9_0), JLabel.RIGHT);
		
		double current_9_1 = Double.parseDouble(arrayLineTransitions_9[1]);
		
		JLabel currentLabel_9_1 = new JLabel(String.valueOf(current_9_1), JLabel.RIGHT);
		
		double current_9_2 = Double.parseDouble(arrayLineTransitions_9[2]);
		
		JLabel currentLabel_9_2 = new JLabel(String.valueOf(current_9_2), JLabel.RIGHT);
		
		double current_9_3 = Double.parseDouble(arrayLineTransitions_9[3]);
		
		JLabel currentLabel_9_3 = new JLabel(String.valueOf(current_9_3), JLabel.RIGHT);
		
		double current_9_4 = Double.parseDouble(arrayLineTransitions_9[4]);
		
		JLabel currentLabel_9_4 = new JLabel(String.valueOf(current_9_4), JLabel.RIGHT);
		
		double current_9_5 = Double.parseDouble(arrayLineTransitions_9[5]);
		
		JLabel currentLabel_9_5 = new JLabel(String.valueOf(current_9_5), JLabel.RIGHT);
		
		double current_9_6 = Double.parseDouble(arrayLineTransitions_9[6]);
		
		JLabel currentLabel_9_6 = new JLabel(String.valueOf(current_9_6), JLabel.RIGHT);
		
		double current_9_7 = Double.parseDouble(arrayLineTransitions_9[7]);
		
		JLabel currentLabel_9_7 = new JLabel(String.valueOf(current_9_7), JLabel.RIGHT);
		
		double current_9_8 = Double.parseDouble(arrayLineTransitions_9[8]);
		
		JLabel currentLabel_9_8 = new JLabel(String.valueOf(current_9_8), JLabel.RIGHT);
		
		double current_9_9 = Double.parseDouble(arrayLineTransitions_9[9]);
		
		JLabel currentLabel_9_9 = new JLabel(String.valueOf(current_9_9), JLabel.RIGHT);


		double spinnerStep = 0.01;

		
		//Spinners for State 0 (ARRIVAL)

		SpinnerModel transitionModel_0_0 = new SpinnerNumberModel(current_0_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_0 = new JSpinner(transitionModel_0_0);
		
		SpinnerModel transitionModel_0_1 = new SpinnerNumberModel(current_0_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_1 = new JSpinner(transitionModel_0_1);
		
		SpinnerModel transitionModel_0_2 = new SpinnerNumberModel(current_0_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_2 = new JSpinner(transitionModel_0_2);
		
		SpinnerModel transitionModel_0_3 = new SpinnerNumberModel(current_0_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_3 = new JSpinner(transitionModel_0_3);
		
		SpinnerModel transitionModel_0_4 = new SpinnerNumberModel(current_0_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_4 = new JSpinner(transitionModel_0_4);
		
		SpinnerModel transitionModel_0_5 = new SpinnerNumberModel(current_0_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_5 = new JSpinner(transitionModel_0_5);
		
		SpinnerModel transitionModel_0_6 = new SpinnerNumberModel(current_0_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_6 = new JSpinner(transitionModel_0_6);
		
		SpinnerModel transitionModel_0_7 = new SpinnerNumberModel(current_0_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_7 = new JSpinner(transitionModel_0_7);
		
		SpinnerModel transitionModel_0_8 = new SpinnerNumberModel(current_0_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_8 = new JSpinner(transitionModel_0_8);
		
		SpinnerModel transitionModel_0_9 = new SpinnerNumberModel(current_0_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_0_9 = new JSpinner(transitionModel_0_9);
		
		//Spinners for State 1 (REGISTRATION)

		SpinnerModel transitionModel_1_0 = new SpinnerNumberModel(current_1_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_0 = new JSpinner(transitionModel_1_0);
		
		SpinnerModel transitionModel_1_1 = new SpinnerNumberModel(current_1_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_1 = new JSpinner(transitionModel_1_1);
		
		SpinnerModel transitionModel_1_2 = new SpinnerNumberModel(current_1_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_2 = new JSpinner(transitionModel_1_2);
		
		SpinnerModel transitionModel_1_3 = new SpinnerNumberModel(current_1_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_3 = new JSpinner(transitionModel_1_3);
		
		SpinnerModel transitionModel_1_4 = new SpinnerNumberModel(current_1_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_4 = new JSpinner(transitionModel_1_4);
		
		SpinnerModel transitionModel_1_5 = new SpinnerNumberModel(current_1_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_5 = new JSpinner(transitionModel_1_5);
		
		SpinnerModel transitionModel_1_6 = new SpinnerNumberModel(current_1_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_6 = new JSpinner(transitionModel_1_6);
		
		SpinnerModel transitionModel_1_7 = new SpinnerNumberModel(current_1_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_7 = new JSpinner(transitionModel_1_7);
		
		SpinnerModel transitionModel_1_8 = new SpinnerNumberModel(current_1_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_8 = new JSpinner(transitionModel_1_8);
		
		SpinnerModel transitionModel_1_9 = new SpinnerNumberModel(current_1_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_1_9 = new JSpinner(transitionModel_1_9);
		
		
		//Spinners for State 2 (TRIAGE)

		SpinnerModel transitionModel_2_0 = new SpinnerNumberModel(current_2_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_0 = new JSpinner(transitionModel_2_0);
		
		SpinnerModel transitionModel_2_1 = new SpinnerNumberModel(current_2_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_1 = new JSpinner(transitionModel_2_1);
		
		SpinnerModel transitionModel_2_2 = new SpinnerNumberModel(current_2_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_2 = new JSpinner(transitionModel_2_2);
		
		SpinnerModel transitionModel_2_3 = new SpinnerNumberModel(current_2_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_3 = new JSpinner(transitionModel_2_3);
		
		SpinnerModel transitionModel_2_4 = new SpinnerNumberModel(current_2_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_4 = new JSpinner(transitionModel_2_4);
		
		SpinnerModel transitionModel_2_5 = new SpinnerNumberModel(current_2_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_5 = new JSpinner(transitionModel_2_5);
		
		SpinnerModel transitionModel_2_6 = new SpinnerNumberModel(current_2_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_6 = new JSpinner(transitionModel_2_6);
		
		SpinnerModel transitionModel_2_7 = new SpinnerNumberModel(current_2_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_7 = new JSpinner(transitionModel_2_7);
		
		SpinnerModel transitionModel_2_8 = new SpinnerNumberModel(current_2_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_8 = new JSpinner(transitionModel_2_8);
		
		SpinnerModel transitionModel_2_9 = new SpinnerNumberModel(current_2_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_2_9 = new JSpinner(transitionModel_2_9);

		
		//Spinners for State 3 (NURSE ASSESSMENT)

		SpinnerModel transitionModel_3_0 = new SpinnerNumberModel(current_3_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_0 = new JSpinner(transitionModel_3_0);
		
		SpinnerModel transitionModel_3_1 = new SpinnerNumberModel(current_3_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_1 = new JSpinner(transitionModel_3_1);
		
		SpinnerModel transitionModel_3_2 = new SpinnerNumberModel(current_3_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_2 = new JSpinner(transitionModel_3_2);
		
		SpinnerModel transitionModel_3_3 = new SpinnerNumberModel(current_3_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_3 = new JSpinner(transitionModel_3_3);
		
		SpinnerModel transitionModel_3_4 = new SpinnerNumberModel(current_3_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_4 = new JSpinner(transitionModel_3_4);
		
		SpinnerModel transitionModel_3_5 = new SpinnerNumberModel(current_3_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_5 = new JSpinner(transitionModel_3_5);
		
		SpinnerModel transitionModel_3_6 = new SpinnerNumberModel(current_3_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_6 = new JSpinner(transitionModel_3_6);
		
		SpinnerModel transitionModel_3_7 = new SpinnerNumberModel(current_3_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_7 = new JSpinner(transitionModel_3_7);
		
		SpinnerModel transitionModel_3_8 = new SpinnerNumberModel(current_3_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_8 = new JSpinner(transitionModel_3_8);
		
		SpinnerModel transitionModel_3_9 = new SpinnerNumberModel(current_3_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_3_9 = new JSpinner(transitionModel_3_9);
		
		//Spinners for State 4 (DOCTOR ASSESSMENT)

		SpinnerModel transitionModel_4_0 = new SpinnerNumberModel(current_4_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_0 = new JSpinner(transitionModel_4_0);
		
		SpinnerModel transitionModel_4_1 = new SpinnerNumberModel(current_4_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_1 = new JSpinner(transitionModel_4_1);
		
		SpinnerModel transitionModel_4_2 = new SpinnerNumberModel(current_4_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_2 = new JSpinner(transitionModel_4_2);
		
		SpinnerModel transitionModel_4_3 = new SpinnerNumberModel(current_4_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_3 = new JSpinner(transitionModel_4_3);
		
		SpinnerModel transitionModel_4_4 = new SpinnerNumberModel(current_4_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_4 = new JSpinner(transitionModel_4_4);
		
		SpinnerModel transitionModel_4_5 = new SpinnerNumberModel(current_4_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_5 = new JSpinner(transitionModel_4_5);
		
		SpinnerModel transitionModel_4_6 = new SpinnerNumberModel(current_4_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_6 = new JSpinner(transitionModel_4_6);
		
		SpinnerModel transitionModel_4_7 = new SpinnerNumberModel(current_4_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_7 = new JSpinner(transitionModel_4_7);
		
		SpinnerModel transitionModel_4_8 = new SpinnerNumberModel(current_4_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_8 = new JSpinner(transitionModel_4_8);
		
		SpinnerModel transitionModel_4_9 = new SpinnerNumberModel(current_4_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_4_9 = new JSpinner(transitionModel_4_9);
		
		//Spinners for State 5 (XRAY)

		SpinnerModel transitionModel_5_0 = new SpinnerNumberModel(current_5_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_0 = new JSpinner(transitionModel_5_0);
		
		SpinnerModel transitionModel_5_1 = new SpinnerNumberModel(current_5_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_1 = new JSpinner(transitionModel_5_1);
		
		SpinnerModel transitionModel_5_2 = new SpinnerNumberModel(current_5_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_2 = new JSpinner(transitionModel_5_2);
		
		SpinnerModel transitionModel_5_3 = new SpinnerNumberModel(current_5_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_3 = new JSpinner(transitionModel_5_3);
		
		SpinnerModel transitionModel_5_4 = new SpinnerNumberModel(current_5_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_4 = new JSpinner(transitionModel_5_4);
		
		SpinnerModel transitionModel_5_5 = new SpinnerNumberModel(current_5_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_5 = new JSpinner(transitionModel_5_5);
		
		SpinnerModel transitionModel_5_6 = new SpinnerNumberModel(current_5_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_6 = new JSpinner(transitionModel_5_6);
		
		SpinnerModel transitionModel_5_7 = new SpinnerNumberModel(current_5_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_7 = new JSpinner(transitionModel_5_7);
		
		SpinnerModel transitionModel_5_8 = new SpinnerNumberModel(current_5_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_8 = new JSpinner(transitionModel_5_8);
		
		SpinnerModel transitionModel_5_9 = new SpinnerNumberModel(current_5_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_5_9 = new JSpinner(transitionModel_5_9);
		
		//Spinners for State 6 (TESTS)

		SpinnerModel transitionModel_6_0 = new SpinnerNumberModel(current_6_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_0 = new JSpinner(transitionModel_6_0);
		
		SpinnerModel transitionModel_6_1 = new SpinnerNumberModel(current_6_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_1 = new JSpinner(transitionModel_6_1);
		
		SpinnerModel transitionModel_6_2 = new SpinnerNumberModel(current_6_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_2 = new JSpinner(transitionModel_6_2);
		
		SpinnerModel transitionModel_6_3 = new SpinnerNumberModel(current_6_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_3 = new JSpinner(transitionModel_6_3);
		
		SpinnerModel transitionModel_6_4 = new SpinnerNumberModel(current_6_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_4 = new JSpinner(transitionModel_6_4);
		
		SpinnerModel transitionModel_6_5 = new SpinnerNumberModel(current_6_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_5 = new JSpinner(transitionModel_6_5);
		
		SpinnerModel transitionModel_6_6 = new SpinnerNumberModel(current_6_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_6 = new JSpinner(transitionModel_6_6);
		
		SpinnerModel transitionModel_6_7 = new SpinnerNumberModel(current_6_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_7 = new JSpinner(transitionModel_6_7);
		
		SpinnerModel transitionModel_6_8 = new SpinnerNumberModel(current_6_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_8 = new JSpinner(transitionModel_6_8);
		
		SpinnerModel transitionModel_6_9 = new SpinnerNumberModel(current_6_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_6_9 = new JSpinner(transitionModel_6_9);
		
		//Spinners for State 7 (TREATMENT)

		SpinnerModel transitionModel_7_0 = new SpinnerNumberModel(current_7_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_0 = new JSpinner(transitionModel_7_0);
		
		SpinnerModel transitionModel_7_1 = new SpinnerNumberModel(current_7_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_1 = new JSpinner(transitionModel_7_1);
		
		SpinnerModel transitionModel_7_2 = new SpinnerNumberModel(current_7_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_2 = new JSpinner(transitionModel_7_2);
		
		SpinnerModel transitionModel_7_3 = new SpinnerNumberModel(current_7_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_3 = new JSpinner(transitionModel_7_3);
		
		SpinnerModel transitionModel_7_4 = new SpinnerNumberModel(current_7_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_4 = new JSpinner(transitionModel_7_4);
		
		SpinnerModel transitionModel_7_5 = new SpinnerNumberModel(current_7_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_5 = new JSpinner(transitionModel_7_5);
		
		SpinnerModel transitionModel_7_6 = new SpinnerNumberModel(current_7_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_6 = new JSpinner(transitionModel_7_6);
		
		SpinnerModel transitionModel_7_7 = new SpinnerNumberModel(current_7_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_7 = new JSpinner(transitionModel_7_7);
		
		SpinnerModel transitionModel_7_8 = new SpinnerNumberModel(current_7_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_8 = new JSpinner(transitionModel_7_8);
		
		SpinnerModel transitionModel_7_9 = new SpinnerNumberModel(current_7_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_7_9 = new JSpinner(transitionModel_7_9);
		
		//Spinners for State 8 (ADMISSION)

		SpinnerModel transitionModel_8_0 = new SpinnerNumberModel(current_8_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_0 = new JSpinner(transitionModel_8_0);
		
		SpinnerModel transitionModel_8_1 = new SpinnerNumberModel(current_8_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_1 = new JSpinner(transitionModel_8_1);
		
		SpinnerModel transitionModel_8_2 = new SpinnerNumberModel(current_8_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_2 = new JSpinner(transitionModel_8_2);
		
		SpinnerModel transitionModel_8_3 = new SpinnerNumberModel(current_8_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_3 = new JSpinner(transitionModel_8_3);
		
		SpinnerModel transitionModel_8_4 = new SpinnerNumberModel(current_8_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_4 = new JSpinner(transitionModel_8_4);
		
		SpinnerModel transitionModel_8_5 = new SpinnerNumberModel(current_8_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_5 = new JSpinner(transitionModel_8_5);
		
		SpinnerModel transitionModel_8_6 = new SpinnerNumberModel(current_8_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_6 = new JSpinner(transitionModel_8_6);
		
		SpinnerModel transitionModel_8_7 = new SpinnerNumberModel(current_8_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_7 = new JSpinner(transitionModel_8_7);
		
		SpinnerModel transitionModel_8_8 = new SpinnerNumberModel(current_8_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_8 = new JSpinner(transitionModel_8_8);
		
		SpinnerModel transitionModel_8_9 = new SpinnerNumberModel(current_8_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_8_9 = new JSpinner(transitionModel_8_9);
		
		//Spinners for State 9 (DISCHARGE)

		SpinnerModel transitionModel_9_0 = new SpinnerNumberModel(current_9_0, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_0 = new JSpinner(transitionModel_9_0);
		
		SpinnerModel transitionModel_9_1 = new SpinnerNumberModel(current_9_1, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_1 = new JSpinner(transitionModel_9_1);
		
		SpinnerModel transitionModel_9_2 = new SpinnerNumberModel(current_9_2, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_2 = new JSpinner(transitionModel_9_2);
		
		SpinnerModel transitionModel_9_3 = new SpinnerNumberModel(current_9_3, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_3 = new JSpinner(transitionModel_9_3);
		
		SpinnerModel transitionModel_9_4 = new SpinnerNumberModel(current_9_4, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_4 = new JSpinner(transitionModel_9_4);
		
		SpinnerModel transitionModel_9_5 = new SpinnerNumberModel(current_9_5, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_5 = new JSpinner(transitionModel_9_5);
		
		SpinnerModel transitionModel_9_6 = new SpinnerNumberModel(current_9_6, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_6 = new JSpinner(transitionModel_9_6);
		
		SpinnerModel transitionModel_9_7 = new SpinnerNumberModel(current_9_7, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_7 = new JSpinner(transitionModel_9_7);
		
		SpinnerModel transitionModel_9_8 = new SpinnerNumberModel(current_9_8, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_8 = new JSpinner(transitionModel_9_8);
		
		SpinnerModel transitionModel_9_9 = new SpinnerNumberModel(current_9_9, 0, 1.0, spinnerStep);

		final JSpinner transitionSpinner_9_9 = new JSpinner(transitionModel_9_9);
		
		//spinner values
		
		spinner_0_0 = (Double)transitionSpinner_0_0.getValue();
		
		spinner_0_1 = (Double)transitionSpinner_0_1.getValue();
		
		spinner_0_2 = (Double)transitionSpinner_0_2.getValue();
		
		spinner_0_3 = (Double)transitionSpinner_0_3.getValue();
		
		spinner_0_4 = (Double)transitionSpinner_0_4.getValue();
		
		spinner_0_5 = (Double)transitionSpinner_0_5.getValue();
		
		spinner_0_6 = (Double)transitionSpinner_0_6.getValue();
		
		spinner_0_7 = (Double)transitionSpinner_0_7.getValue();
		
		spinner_0_8 = (Double)transitionSpinner_0_8.getValue();
		
		spinner_0_9 = (Double)transitionSpinner_0_9.getValue();
		
		//spinner values 1
		
		spinner_1_0 = (Double)transitionSpinner_1_0.getValue();
		
		spinner_1_1 = (Double)transitionSpinner_1_1.getValue();
		
		spinner_1_2 = (Double)transitionSpinner_1_2.getValue();
		
		spinner_1_3 = (Double)transitionSpinner_1_3.getValue();
		
		spinner_1_4 = (Double)transitionSpinner_1_4.getValue();
		
		spinner_1_5 = (Double)transitionSpinner_1_5.getValue();
		
		spinner_1_6 = (Double)transitionSpinner_1_6.getValue();
		
		spinner_1_7 = (Double)transitionSpinner_1_7.getValue();
		
		spinner_1_8 = (Double)transitionSpinner_1_8.getValue();
		
		spinner_1_9 = (Double)transitionSpinner_1_9.getValue();
		
		//spinner values 2
		
		spinner_2_0 = (Double)transitionSpinner_2_0.getValue();
		
		spinner_2_1 = (Double)transitionSpinner_2_1.getValue();
		
		spinner_2_2 = (Double)transitionSpinner_2_2.getValue();
		
		spinner_2_3 = (Double)transitionSpinner_2_3.getValue();
		
		spinner_2_4 = (Double)transitionSpinner_2_4.getValue();
		
		spinner_2_5 = (Double)transitionSpinner_2_5.getValue();
		
		spinner_2_6 = (Double)transitionSpinner_2_6.getValue();
		
		spinner_2_7 = (Double)transitionSpinner_2_7.getValue();
		
		spinner_2_8 = (Double)transitionSpinner_2_8.getValue();
		
		spinner_2_9 = (Double)transitionSpinner_2_9.getValue();
		
		//spinner values 3
		
		spinner_3_0 = (Double)transitionSpinner_3_0.getValue();
		
		spinner_3_1 = (Double)transitionSpinner_3_1.getValue();
		
		spinner_3_2 = (Double)transitionSpinner_3_2.getValue();
		
		spinner_3_3 = (Double)transitionSpinner_3_3.getValue();
		
		spinner_3_4 = (Double)transitionSpinner_3_4.getValue();
		
		spinner_3_5 = (Double)transitionSpinner_3_5.getValue();
		
		spinner_3_6 = (Double)transitionSpinner_3_6.getValue();
		
		spinner_3_7 = (Double)transitionSpinner_3_7.getValue();
		
		spinner_3_8 = (Double)transitionSpinner_3_8.getValue();
		
		spinner_3_9 = (Double)transitionSpinner_3_9.getValue();
		
		//spinner values 4
		
		spinner_4_0 = (Double)transitionSpinner_4_0.getValue();
		
		spinner_4_1 = (Double)transitionSpinner_4_1.getValue();
		
		spinner_4_2 = (Double)transitionSpinner_4_2.getValue();
		
		spinner_4_3 = (Double)transitionSpinner_4_3.getValue();
		
		spinner_4_4 = (Double)transitionSpinner_4_4.getValue();
		
		spinner_4_5 = (Double)transitionSpinner_4_5.getValue();
		
		spinner_4_6 = (Double)transitionSpinner_4_6.getValue();
		
		spinner_4_7 = (Double)transitionSpinner_4_7.getValue();
		
		spinner_4_8 = (Double)transitionSpinner_4_8.getValue();
		
		spinner_4_9 = (Double)transitionSpinner_4_9.getValue();
		
		//spinner values 5
		
		spinner_5_0 = (Double)transitionSpinner_5_0.getValue();
		
		spinner_5_1 = (Double)transitionSpinner_5_1.getValue();
		
		spinner_5_2 = (Double)transitionSpinner_5_2.getValue();
		
		spinner_5_3 = (Double)transitionSpinner_5_3.getValue();
		
		spinner_5_4 = (Double)transitionSpinner_5_4.getValue();
		
		spinner_5_5 = (Double)transitionSpinner_5_5.getValue();
		
		spinner_5_6 = (Double)transitionSpinner_5_6.getValue();
		
		spinner_5_7 = (Double)transitionSpinner_5_7.getValue();
		
		spinner_5_8 = (Double)transitionSpinner_5_8.getValue();
		
		spinner_5_9 = (Double)transitionSpinner_5_9.getValue();
		
		//spinner values 6
		
		spinner_6_0 = (Double)transitionSpinner_6_0.getValue();
		
		spinner_6_1 = (Double)transitionSpinner_6_1.getValue();
		
		spinner_6_2 = (Double)transitionSpinner_6_2.getValue();
		
		spinner_6_3 = (Double)transitionSpinner_6_3.getValue();
		
		spinner_6_4 = (Double)transitionSpinner_6_4.getValue();
		
		spinner_6_5 = (Double)transitionSpinner_6_5.getValue();
		
		spinner_6_6 = (Double)transitionSpinner_6_6.getValue();
		
		spinner_6_7 = (Double)transitionSpinner_6_7.getValue();
		
		spinner_6_8 = (Double)transitionSpinner_6_8.getValue();
		
		spinner_6_9 = (Double)transitionSpinner_6_9.getValue();
		
		//spinner values 7
		
		spinner_7_0 = (Double)transitionSpinner_7_0.getValue();
		
		spinner_7_1 = (Double)transitionSpinner_7_1.getValue();
		
		spinner_7_2 = (Double)transitionSpinner_7_2.getValue();
		
		spinner_7_3 = (Double)transitionSpinner_7_3.getValue();
		
		spinner_7_4 = (Double)transitionSpinner_7_4.getValue();
		
		spinner_7_5 = (Double)transitionSpinner_7_5.getValue();
		
		spinner_7_6 = (Double)transitionSpinner_7_6.getValue();
		
		spinner_7_7 = (Double)transitionSpinner_7_7.getValue();
		
		spinner_7_8 = (Double)transitionSpinner_7_8.getValue();
		
		spinner_7_9 = (Double)transitionSpinner_7_9.getValue();
		
		//spinner values 8
		
		spinner_8_0 = (Double)transitionSpinner_8_0.getValue();
		
		spinner_8_1 = (Double)transitionSpinner_8_1.getValue();
		
		spinner_8_2 = (Double)transitionSpinner_8_2.getValue();
		
		spinner_8_3 = (Double)transitionSpinner_8_3.getValue();
		
		spinner_8_4 = (Double)transitionSpinner_8_4.getValue();
		
		spinner_8_5 = (Double)transitionSpinner_8_5.getValue();
		
		spinner_8_6 = (Double)transitionSpinner_8_6.getValue();
		
		spinner_8_7 = (Double)transitionSpinner_8_7.getValue();
		
		spinner_8_8 = (Double)transitionSpinner_8_8.getValue();
		
		spinner_8_9 = (Double)transitionSpinner_8_9.getValue();
		
		//spinner values 9
		
		spinner_9_0 = (Double)transitionSpinner_9_0.getValue();
		
		spinner_9_1 = (Double)transitionSpinner_9_1.getValue();
		
		spinner_9_2 = (Double)transitionSpinner_9_2.getValue();
		
		spinner_9_3 = (Double)transitionSpinner_9_3.getValue();
		
		spinner_9_4 = (Double)transitionSpinner_9_4.getValue();
		
		spinner_9_5 = (Double)transitionSpinner_9_5.getValue();
		
		spinner_9_6 = (Double)transitionSpinner_9_6.getValue();
		
		spinner_9_7 = (Double)transitionSpinner_9_7.getValue();
		
		spinner_9_8 = (Double)transitionSpinner_9_8.getValue();
		
		spinner_9_9 = (Double)transitionSpinner_9_9.getValue();
		

		simulatorTransitionsSettingsPanelInner.add(valueLabel);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_0);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_0);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_1);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_1);		
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_2);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_2);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_3);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_3);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_4);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_4);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_5);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_5);		
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_6);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_6);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_7);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_7);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_8);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_8);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalLeft_9);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateHorizontalRight_9);
		
		//second line
		
		simulatorTransitionsSettingsPanelInner.add(emptyLabel);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_0);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_0);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_1);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_1);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_2);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_2);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_3);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_3);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_4);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_4);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_5);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_5);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_6);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_6);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_7);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_7);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_8);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_8);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateOld_9);
		
		simulatorTransitionsSettingsPanelInner.add(labelStateNew_9);
		
		
//ARRIVAL transitions (0)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_0_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_0_9);
		
		//REGISTRATION Transitions (1)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_1_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_1_9);
		
		//TRIAGE transitions (2)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_2_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_2_9);		
		
		//NURSE ASSESSMENT transitions (3)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_3_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_3_9);		
		
		//DOCTOR ASSESSMENT transitions (4)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_4_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_4_9);		
		
		//XRAY transitions (5)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_5_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_5_9);		
		
		//TESTS transitions (6)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_6_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_6_9);		
		
		//TREATMENT transitions (7)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_7_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_7_9);		
		
		//ADMISSION transitions (8)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_8_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_8_9);		
		
		//DISCHARGE transitions (9)
		
		simulatorTransitionsSettingsPanelInner.add(labelStateVertical_9);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_0);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_0);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_1);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_1);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_2);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_2);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_3);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_3);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_4);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_4);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_5);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_5);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_6);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_6);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_7);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_7);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_8);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_8);
		
		simulatorTransitionsSettingsPanelInner.add(currentLabel_9_9);
		
		simulatorTransitionsSettingsPanelInner.add(transitionSpinner_9_9);		
				
		for(int i=0;i<10;i++){
			
		System.out.println(getTransitions(i));}

		return scrollableSimulatorTransitionsSettingsPanel;
	}

	private int getNumberOfPlacesInTheArray(String inputString){
		
		int elements = 0;
		
		for (int i = 0; i < inputString.length(); i++) {

			if (inputString.charAt(i) == ',') {

				elements++;

			}

		}

	return elements;
	
	}
	
	public static String getTransitions(int fromState){
				
		String transitionStrings [] = new String [10];
		
		transitionStrings[0] = String.valueOf(spinner_0_0)
				.concat(",")
				.concat(String.valueOf(spinner_0_1))
				.concat(",")
				.concat(String.valueOf(spinner_0_2))
				.concat(",")
				.concat(String.valueOf(spinner_0_3))
				.concat(",")
				.concat(String.valueOf(spinner_0_4))
				.concat(",")
				.concat(String.valueOf(spinner_0_5))
				.concat(",")
				.concat(String.valueOf(spinner_0_6))
				.concat(",")
				.concat(String.valueOf(spinner_0_7))
				.concat(",")
				.concat(String.valueOf(spinner_0_8))
				.concat(",")
				.concat(String.valueOf(spinner_0_9));
		
		transitionStrings[1] = String.valueOf(spinner_1_0)
				.concat(",")
				.concat(String.valueOf(spinner_1_1))
				.concat(",")
				.concat(String.valueOf(spinner_1_2))
				.concat(",")
				.concat(String.valueOf(spinner_1_3))
				.concat(",")
				.concat(String.valueOf(spinner_1_4))
				.concat(",")
				.concat(String.valueOf(spinner_1_5))
				.concat(",")
				.concat(String.valueOf(spinner_1_6))
				.concat(",")
				.concat(String.valueOf(spinner_1_7))
				.concat(",")
				.concat(String.valueOf(spinner_1_8))
				.concat(",")
				.concat(String.valueOf(spinner_1_9));
		
		transitionStrings[2] = String.valueOf(spinner_2_0)
				.concat(",")
				.concat(String.valueOf(spinner_2_1))
				.concat(",")
				.concat(String.valueOf(spinner_2_2))
				.concat(",")
				.concat(String.valueOf(spinner_2_3))
				.concat(",")
				.concat(String.valueOf(spinner_2_4))
				.concat(",")
				.concat(String.valueOf(spinner_2_5))
				.concat(",")
				.concat(String.valueOf(spinner_2_6))
				.concat(",")
				.concat(String.valueOf(spinner_2_7))
				.concat(",")
				.concat(String.valueOf(spinner_2_8))
				.concat(",")
				.concat(String.valueOf(spinner_2_9));
		
		transitionStrings[3] = String.valueOf(spinner_3_0)
				.concat(",")
				.concat(String.valueOf(spinner_3_1))
				.concat(",")
				.concat(String.valueOf(spinner_3_2))
				.concat(",")
				.concat(String.valueOf(spinner_3_3))
				.concat(",")
				.concat(String.valueOf(spinner_3_4))
				.concat(",")
				.concat(String.valueOf(spinner_3_5))
				.concat(",")
				.concat(String.valueOf(spinner_3_6))
				.concat(",")
				.concat(String.valueOf(spinner_3_7))
				.concat(",")
				.concat(String.valueOf(spinner_3_8))
				.concat(",")
				.concat(String.valueOf(spinner_3_9));
		
		transitionStrings[4] = String.valueOf(spinner_4_0)
				.concat(",")
				.concat(String.valueOf(spinner_4_1))
				.concat(",")
				.concat(String.valueOf(spinner_4_2))
				.concat(",")
				.concat(String.valueOf(spinner_4_3))
				.concat(",")
				.concat(String.valueOf(spinner_4_4))
				.concat(",")
				.concat(String.valueOf(spinner_4_5))
				.concat(",")
				.concat(String.valueOf(spinner_4_6))
				.concat(",")
				.concat(String.valueOf(spinner_4_7))
				.concat(",")
				.concat(String.valueOf(spinner_4_8))
				.concat(",")
				.concat(String.valueOf(spinner_4_9));
		
		transitionStrings[5] = String.valueOf(spinner_5_0)
				.concat(",")
				.concat(String.valueOf(spinner_5_1))
				.concat(",")
				.concat(String.valueOf(spinner_5_2))
				.concat(",")
				.concat(String.valueOf(spinner_5_3))
				.concat(",")
				.concat(String.valueOf(spinner_5_4))
				.concat(",")
				.concat(String.valueOf(spinner_5_5))
				.concat(",")
				.concat(String.valueOf(spinner_5_6))
				.concat(",")
				.concat(String.valueOf(spinner_5_7))
				.concat(",")
				.concat(String.valueOf(spinner_5_8))
				.concat(",")
				.concat(String.valueOf(spinner_5_9));
		
		transitionStrings[6] = String.valueOf(spinner_6_0)
				.concat(",")
				.concat(String.valueOf(spinner_6_1))
				.concat(",")
				.concat(String.valueOf(spinner_6_2))
				.concat(",")
				.concat(String.valueOf(spinner_6_3))
				.concat(",")
				.concat(String.valueOf(spinner_6_4))
				.concat(",")
				.concat(String.valueOf(spinner_6_5))
				.concat(",")
				.concat(String.valueOf(spinner_6_6))
				.concat(",")
				.concat(String.valueOf(spinner_6_7))
				.concat(",")
				.concat(String.valueOf(spinner_6_8))
				.concat(",")
				.concat(String.valueOf(spinner_6_9));
		
		transitionStrings[7] = String.valueOf(spinner_7_0)
				.concat(",")
				.concat(String.valueOf(spinner_7_1))
				.concat(",")
				.concat(String.valueOf(spinner_7_2))
				.concat(",")
				.concat(String.valueOf(spinner_7_3))
				.concat(",")
				.concat(String.valueOf(spinner_7_4))
				.concat(",")
				.concat(String.valueOf(spinner_7_5))
				.concat(",")
				.concat(String.valueOf(spinner_7_6))
				.concat(",")
				.concat(String.valueOf(spinner_7_7))
				.concat(",")
				.concat(String.valueOf(spinner_7_8))
				.concat(",")
				.concat(String.valueOf(spinner_7_9));
		
		transitionStrings[8] = String.valueOf(spinner_8_0)
				.concat(",")
				.concat(String.valueOf(spinner_8_1))
				.concat(",")
				.concat(String.valueOf(spinner_8_2))
				.concat(",")
				.concat(String.valueOf(spinner_8_3))
				.concat(",")
				.concat(String.valueOf(spinner_8_4))
				.concat(",")
				.concat(String.valueOf(spinner_8_5))
				.concat(",")
				.concat(String.valueOf(spinner_8_6))
				.concat(",")
				.concat(String.valueOf(spinner_8_7))
				.concat(",")
				.concat(String.valueOf(spinner_8_8))
				.concat(",")
				.concat(String.valueOf(spinner_8_9));
		
		transitionStrings[9] = String.valueOf(spinner_9_0)
				.concat(",")
				.concat(String.valueOf(spinner_9_1))
				.concat(",")
				.concat(String.valueOf(spinner_9_2))
				.concat(",")
				.concat(String.valueOf(spinner_9_3))
				.concat(",")
				.concat(String.valueOf(spinner_9_4))
				.concat(",")
				.concat(String.valueOf(spinner_9_5))
				.concat(",")
				.concat(String.valueOf(spinner_9_6))
				.concat(",")
				.concat(String.valueOf(spinner_9_7))
				.concat(",")
				.concat(String.valueOf(spinner_9_8))
				.concat(",")
				.concat(String.valueOf(spinner_9_9));
		
		return transitionStrings[fromState];
	}
	
}


package Gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import AESimualtor.XMLSimulatorSettings;

public class DoctorIntervalStallSettings {
	
	static double spinner_0 = 0.0;
	
	static double spinner_1 = 0.0;

	static double spinner_2 = 0.0;

	static double spinner_3 = 0.0;

	static double spinner_4 = 0.0;

	static double spinner_5 = 0.0;

	static double spinner_6 = 0.0;

	static double spinner_7 = 0.0;

	static double spinner_8 = 0.0;

	static double spinner_9 = 0.0;

	static double spinner_10 = 0.0;

	static double spinner_11 = 0.0;

	static double spinner_12 = 0.0;

	static double spinner_13 = 0.0;

	static double spinner_14 = 0.0;

	static double spinner_15 = 0.0;
	
	static double spinner_16 = 0.0;

	static double spinner_17 = 0.0;

	static double spinner_18 = 0.0;

	static double spinner_19 = 0.0;

	static double spinner_20 = 0.0;

	static double spinner_21 = 0.0;

	static double spinner_22 = 0.0;

	static double spinner_23 = 0.0;

	public JScrollPane getDoctorIntervalStallSettingsPanel(XMLSimulatorSettings xmlSettings) throws IOException {

		JPanel simulatorDoctorIntervalStallSettingsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JScrollPane scrollableSimulatorDoctorIntervalStallSettingsPanel = new JScrollPane(simulatorDoctorIntervalStallSettingsPanel);		

		JPanel simulatorDoctorIntervalStallSettingsPanelInner = new JPanel(new GridLayout(25, 3, 0, 10));

		simulatorDoctorIntervalStallSettingsPanel.add(simulatorDoctorIntervalStallSettingsPanelInner);

		JLabel valueLabel = new JLabel("Set");

		JLabel Label_0_1 = new JLabel("00:00 - 01:00");
		
		JLabel Label_1_2 = new JLabel("01:00 - 02:00");
		
		JLabel Label_2_3 = new JLabel("02:00 - 03:00");
		
		JLabel Label_3_4 = new JLabel("03:00 - 04:00");
		
		JLabel Label_4_5 = new JLabel("04:00 - 05:00");
		
		JLabel Label_5_6 = new JLabel("05:00 - 06:00");
		
		JLabel Label_6_7 = new JLabel("06:00 - 07:00");
		
		JLabel Label_7_8 = new JLabel("07:00 - 08:00");

		JLabel Label_8_9 = new JLabel("08:00 - 09:00");
		
		JLabel Label_9_10 = new JLabel("09:00 - 10:00");
		
		JLabel Label_10_11 = new JLabel("10:00 - 11:00");
		
		JLabel Label_11_12 = new JLabel("11:00 - 12:00");
		
		JLabel Label_12_13 = new JLabel("12:00 - 13:00");
		
		JLabel Label_13_14 = new JLabel("13:00 - 14:00");
		
		JLabel Label_14_15 = new JLabel("14:00 - 15:00");
		
		JLabel Label_15_16 = new JLabel("15:00 - 16:00");
		
		JLabel Label_16_17 = new JLabel("16:00 - 17:00");
		
		JLabel Label_17_18 = new JLabel("17:00 - 18:00");
		
		JLabel Label_18_19 = new JLabel("18:00 - 19:00");
		
		JLabel Label_19_20 = new JLabel("19:00 - 20:00");
		
		JLabel Label_20_21 = new JLabel("20:00 - 21:00");
		
		JLabel Label_21_22 = new JLabel("21:00 - 22:00");
		
		JLabel Label_22_23 = new JLabel("22:00 - 23:00");
		
		JLabel Label_23_0 = new JLabel("23:00 - 00:00");
		
		
		JLabel currentValueLabel = new JLabel("Current Values");

		String readDoctorIntervalStallFromXML = xmlSettings.loadXML("meanPauseBetweenDoctorVisits");
		
		String arrayLine[] = new String[getNumberOfPlacesInTheArray(readDoctorIntervalStallFromXML)];

		arrayLine = readDoctorIntervalStallFromXML.split(",");
		
		double current_0_1 = Double.parseDouble(arrayLine[0]);
		
		JLabel currentLabel_0_1 = new JLabel(String.valueOf(current_0_1));

		double current_1_2 = Double.parseDouble(arrayLine[1]);
		
		JLabel currentLabel_1_2 = new JLabel(String.valueOf(current_1_2));

		double current_2_3 = Double.parseDouble(arrayLine[2]);
		
		JLabel currentLabel_2_3 = new JLabel(String.valueOf(current_2_3));

		
		double current_3_4 = Double.parseDouble(arrayLine[3]);
		
		JLabel currentLabel_3_4 = new JLabel(String.valueOf(current_3_4));

		
		double current_4_5 = Double.parseDouble(arrayLine[4]);
		
		JLabel currentLabel_4_5 = new JLabel(String.valueOf(current_4_5));

		
		double current_5_6 = Double.parseDouble(arrayLine[5]);
		
		JLabel currentLabel_5_6 = new JLabel(String.valueOf(current_5_6));

		
		double current_6_7 = Double.parseDouble(arrayLine[6]);
		
		JLabel currentLabel_6_7 = new JLabel(String.valueOf(current_6_7));

		
		double current_7_8 = Double.parseDouble(arrayLine[7]);
		
		JLabel currentLabel_7_8 = new JLabel(String.valueOf(current_7_8));

		
		double current_8_9 = Double.parseDouble(arrayLine[8]);
		
		JLabel currentLabel_8_9 = new JLabel(String.valueOf(current_8_9));

		
		double current_9_10 = Double.parseDouble(arrayLine[9]);
		
		JLabel currentLabel_9_10 = new JLabel(String.valueOf(current_9_10));

		
		double current_10_11 = Double.parseDouble(arrayLine[10]);
		
		JLabel currentLabel_10_11 = new JLabel(String.valueOf(current_10_11));

		
		double current_11_12 = Double.parseDouble(arrayLine[11]);
		
		JLabel currentLabel_11_12 = new JLabel(String.valueOf(current_11_12));

		
		double current_12_13 = Double.parseDouble(arrayLine[12]);
		
		JLabel currentLabel_12_13 = new JLabel(String.valueOf(current_12_13));

		
		double current_13_14 = Double.parseDouble(arrayLine[13]);
		
		JLabel currentLabel_13_14 = new JLabel(String.valueOf(current_13_14));

		
		double current_14_15 = Double.parseDouble(arrayLine[14]);
		
		JLabel currentLabel_14_15 = new JLabel(String.valueOf(current_14_15));

		
		double current_15_16 = Double.parseDouble(arrayLine[15]);
		
		JLabel currentLabel_15_16 = new JLabel(String.valueOf(current_15_16));

		
		double current_16_17 = Double.parseDouble(arrayLine[16]);
		
		JLabel currentLabel_16_17 = new JLabel(String.valueOf(current_16_17));

		
		double current_17_18 = Double.parseDouble(arrayLine[17]);
		
		JLabel currentLabel_17_18 = new JLabel(String.valueOf(current_17_18));

		
		double current_18_19 = Double.parseDouble(arrayLine[18]);
		
		JLabel currentLabel_18_19 = new JLabel(String.valueOf(current_18_19));

		
		double current_19_20 = Double.parseDouble(arrayLine[19]);
		
		JLabel currentLabel_19_20 = new JLabel(String.valueOf(current_19_20));

		
		double current_20_21 = Double.parseDouble(arrayLine[20]);
		
		JLabel currentLabel_20_21 = new JLabel(String.valueOf(current_20_21));

		
		double current_21_22 = Double.parseDouble(arrayLine[21]);
		
		JLabel currentLabel_21_22 = new JLabel(String.valueOf(current_21_22));

		
		double current_22_23 = Double.parseDouble(arrayLine[22]);
		
		JLabel currentLabel_22_23 = new JLabel(String.valueOf(current_22_23));

		
		double current_23_0 = Double.parseDouble(arrayLine[23]);
		
		JLabel currentLabel_23_0 = new JLabel(String.valueOf(current_23_0));




		JLabel newValueLabel = new JLabel("New Values");
		
		double spinnerStep = 0.1;

		SpinnerModel model_0_1 = new SpinnerNumberModel(current_0_1, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_1_2 = new SpinnerNumberModel(current_1_2, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_2_3 = new SpinnerNumberModel(current_2_3, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_3_4 = new SpinnerNumberModel(current_3_4, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_4_5 = new SpinnerNumberModel(current_4_5, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_5_6 = new SpinnerNumberModel(current_5_6, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_6_7 = new SpinnerNumberModel(current_6_7, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_7_8 = new SpinnerNumberModel(current_7_8, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_8_9 = new SpinnerNumberModel(current_8_9, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_9_10 = new SpinnerNumberModel(current_9_10, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_10_11 = new SpinnerNumberModel(current_10_11, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_11_12 = new SpinnerNumberModel(current_11_12, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_12_13 = new SpinnerNumberModel(current_12_13, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_13_14 = new SpinnerNumberModel(current_13_14, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_14_15 = new SpinnerNumberModel(current_14_15, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_15_16 = new SpinnerNumberModel(current_15_16, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_16_17 = new SpinnerNumberModel(current_16_17, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_17_18 = new SpinnerNumberModel(current_17_18, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_18_19 = new SpinnerNumberModel(current_18_19, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_19_20 = new SpinnerNumberModel(current_19_20, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_20_21 = new SpinnerNumberModel(current_20_21, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_21_22 = new SpinnerNumberModel(current_21_22, 0, Integer.MAX_VALUE, spinnerStep);
		
		SpinnerModel model_22_23 = new SpinnerNumberModel(current_22_23, 0, Integer.MAX_VALUE, spinnerStep);

		SpinnerModel model_23_0 = new SpinnerNumberModel(current_23_0, 0, Integer.MAX_VALUE, spinnerStep);
		
		
		final JSpinner spinner_0_1 = new JSpinner(model_0_1);

		final JSpinner spinner_1_2 = new JSpinner(model_1_2);
		
		final JSpinner spinner_2_3 = new JSpinner(model_2_3);
		
		final JSpinner spinner_3_4 = new JSpinner(model_3_4);
		
		final JSpinner spinner_4_5 = new JSpinner(model_4_5);
		
		final JSpinner spinner_5_6 = new JSpinner(model_5_6);
		
		final JSpinner spinner_6_7 = new JSpinner(model_6_7);
		
		final JSpinner spinner_7_8 = new JSpinner(model_7_8);
		
		final JSpinner spinner_8_9 = new JSpinner(model_8_9);
		
		final JSpinner spinner_9_10 = new JSpinner(model_9_10);
		
		final JSpinner spinner_10_11 = new JSpinner(model_10_11);
		
		final JSpinner spinner_11_12 = new JSpinner(model_11_12);
		
		final JSpinner spinner_12_13 = new JSpinner(model_12_13);

		final JSpinner spinner_13_14 = new JSpinner(model_13_14);

		final JSpinner spinner_14_15 = new JSpinner(model_14_15);
		
		final JSpinner spinner_15_16 = new JSpinner(model_15_16);
		
		final JSpinner spinner_16_17 = new JSpinner(model_16_17);
		
		final JSpinner spinner_17_18 = new JSpinner(model_17_18);
		
		final JSpinner spinner_18_19 = new JSpinner(model_18_19);
		
		final JSpinner spinner_19_20 = new JSpinner(model_19_20);
		
		final JSpinner spinner_20_21 = new JSpinner(model_20_21);
		
		final JSpinner spinner_21_22 = new JSpinner(model_21_22);
		
		final JSpinner spinner_22_23 = new JSpinner(model_22_23);

		final JSpinner spinner_23_0 = new JSpinner(model_23_0);
		

		simulatorDoctorIntervalStallSettingsPanelInner.add(valueLabel);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentValueLabel);

		simulatorDoctorIntervalStallSettingsPanelInner.add(newValueLabel);
		
		
		//00:00-01:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_0_1);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_0_1);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_0_1);
		
		//01:00-02:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_1_2);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_1_2);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_1_2);
		
		//02:00-03:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_2_3);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_2_3);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_2_3);
		
		//03:00-04:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_3_4);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_3_4);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_3_4);
		
		//04:00-05:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_4_5);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_4_5);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_4_5);
		
		//05:00-06:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_5_6);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_5_6);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_5_6);
		
		//06:00-07:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_6_7);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_6_7);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_6_7);
		
		//07:00-08:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_7_8);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_7_8);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_7_8);
		
		//08:00-09:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_8_9);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_8_9);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_8_9);
		
		//09:00-10:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_9_10);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_9_10);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_9_10);
		
		//10:00-11:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_10_11);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_10_11);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_10_11);
		
		//11:00-12:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_11_12);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_11_12);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_11_12);
		
		//12:00-13:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_12_13);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_12_13);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_12_13);
		
		//13:00-14:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_13_14);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_13_14);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_13_14);
		
		//14:00-15:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_14_15);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_14_15);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_14_15);
		
		//15:00-16:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_15_16);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_15_16);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_15_16);
		
		//16:00-17:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_16_17);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_16_17);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_16_17);
		
		//17:00-18:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_17_18);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_17_18);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_17_18);
		
		//18:00-19:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_18_19);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_18_19);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_18_19);
		
		//19:00-20:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_19_20);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_19_20);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_19_20);
		
		//20:00-21:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_20_21);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_20_21);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_20_21);
		
		//21:00-22:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_21_22);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_21_22);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_21_22);
		
		//22:00-23:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_22_23);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_22_23);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_22_23);
		
		//23:00-00:00
		simulatorDoctorIntervalStallSettingsPanelInner.add(Label_23_0);

		simulatorDoctorIntervalStallSettingsPanelInner.add(currentLabel_23_0);

		simulatorDoctorIntervalStallSettingsPanelInner.add(spinner_23_0);

		//spinner values
		
		spinner_0 = (Double)spinner_0_1.getValue();
		
		spinner_1 = (Double)spinner_1_2.getValue();
		
		spinner_2 = (Double)spinner_2_3.getValue();
		
		spinner_3 = (Double)spinner_3_4.getValue();
		
		spinner_4 = (Double)spinner_4_5.getValue();
		
		spinner_5 = (Double)spinner_5_6.getValue();
		
		spinner_6 = (Double)spinner_6_7.getValue();
		
		spinner_7 = (Double)spinner_7_8.getValue();
		
		spinner_8 = (Double)spinner_8_9.getValue();
		
		spinner_9 = (Double)spinner_9_10.getValue();
		
		spinner_10 = (Double)spinner_10_11.getValue();
		
		spinner_11 = (Double)spinner_11_12.getValue();
		
		spinner_12 = (Double)spinner_12_13.getValue();
		
		spinner_13 = (Double)spinner_13_14.getValue();
		
		spinner_14 = (Double)spinner_14_15.getValue();
		
		spinner_15 = (Double)spinner_15_16.getValue();
		
		spinner_16 = (Double)spinner_16_17.getValue();
		
		spinner_17 = (Double)spinner_17_18.getValue();
		
		spinner_18 = (Double)spinner_18_19.getValue();
		
		spinner_19 = (Double)spinner_19_20.getValue();
		
		spinner_20 = (Double)spinner_20_21.getValue();
		
		spinner_21 = (Double)spinner_21_22.getValue();
		
		spinner_22 = (Double)spinner_22_23.getValue();
		
		spinner_23 = (Double)spinner_23_0.getValue();
		
		
		return scrollableSimulatorDoctorIntervalStallSettingsPanel;
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

public static String getDoctorIntervalStallSettings(){
		
		String stringToReturn=null;

		stringToReturn = String.valueOf(spinner_0)
										.concat(",")
										.concat(String.valueOf(spinner_1))
										.concat(",")
										.concat(String.valueOf(spinner_2))
										.concat(",")
										.concat(String.valueOf(spinner_3))
										.concat(",")
										.concat(String.valueOf(spinner_4))
										.concat(",")
										.concat(String.valueOf(spinner_5))
										.concat(",")
										.concat(String.valueOf(spinner_6))
										.concat(",")
										.concat(String.valueOf(spinner_7))
										.concat(",")
										.concat(String.valueOf(spinner_8))
										.concat(",")
										.concat(String.valueOf(spinner_9))
										.concat(",")
										.concat(String.valueOf(spinner_10))
										.concat(",")
										.concat(String.valueOf(spinner_11))
										.concat(",")
										.concat(String.valueOf(spinner_12))
										.concat(",")
										.concat(String.valueOf(spinner_13))
										.concat(",")
										.concat(String.valueOf(spinner_14))
										.concat(",")
										.concat(String.valueOf(spinner_15))
										.concat(",")
										.concat(String.valueOf(spinner_16))
										.concat(",")
										.concat(String.valueOf(spinner_17))
										.concat(",")
										.concat(String.valueOf(spinner_18))
										.concat(",")
										.concat(String.valueOf(spinner_19))
										.concat(",")
										.concat(String.valueOf(spinner_20))
										.concat(",")
										.concat(String.valueOf(spinner_21))
										.concat(",")
										.concat(String.valueOf(spinner_22))
										.concat(",")
										.concat(String.valueOf(spinner_23))
										;
		
		return stringToReturn;
				
	}
	
}




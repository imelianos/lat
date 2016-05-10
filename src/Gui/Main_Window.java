package Gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import AESimualtor.AESimulator;
import AESimualtor.EventArrivalGenerator;
import AESimualtor.XMLSimulatorSettings;

public class Main_Window{
	
	static AESimulator aesimulator = new AESimulator();

	
	XMLSimulatorSettings loadXMLSettings =  new XMLSimulatorSettings();

	private JFrame mainFrame = new JFrame("Iakovos Melianos A&E Simple Simulator");
	
	private int width = 1152;
	
	private int height = 480;
	
	private JMenuBar mainWindowMenuBar = new JMenuBar();
	
	//Menu
	
	private JMenu fileMenu = new JMenu("File");
	
	private JMenu settingsMenu = new JMenu("Settings");

	private JMenu helpMenu = new JMenu("Help");
	
	//Menu Items
	
	private JMenuItem simulatorItem = new JMenuItem("Simulator");
	
	private JMenuItem logAnalysisItem = new JMenuItem("Log Analysis");
	
	private JMenuItem exitItem = new JMenuItem("Exit");
	
	private JMenuItem simulatorSettingsItem = new JMenuItem("Simulator Settings");
	
	private JMenuItem log4JSettingsItem = new JMenuItem("Log4J Settings");
	
	private JMenuItem aboutItem = new JMenuItem("About");
	
	private CardLayout cardLayout = new CardLayout();
	
	//Panels
	
	private JPanel cardPanel = new JPanel();
	
	private JPanel simulatorSettingsPanel = new JPanel();
	
	//log4j panel
	
	private JPanel log4JSettingsPanel = new JPanel();

	private JPanel aboutPanel = new JPanel();
	
	private JPanel logAnalysisPanel = new JPanel();
	
	private JPanel simulatorPanel = new JPanel();
	
	private JEditorPane aboutText = new JEditorPane();
				
	@SuppressWarnings("unused")
	
	private AESimulator simulator;
	
	public Main_Window(final AESimulator aesimulator) throws IOException{
		
		this.simulator = aesimulator;
			
		cardPanel.setLayout(cardLayout);
		
		cardPanel.add(simulatorPanel, "simulatorPanel");
		
		cardPanel.add(logAnalysisPanel, "logAnalysisPanel");
		
		cardPanel.add(simulatorSettingsPanel, "simulatorSettingsPanel");
		
		cardPanel.add(log4JSettingsPanel, "log4JSettingsPanel");
		
		cardPanel.add(aboutPanel, "aboutPanel");
		
		mainFrame.add(cardPanel);
					
		mainFrame.setVisible(true);
	
		mainFrame.setSize(width, height);
	
		mainFrame.setLocationRelativeTo(null);
		
		mainWindowMenuBar.add(fileMenu);
		
		fileMenu.add(simulatorItem);
		
		fileMenu.add(logAnalysisItem);
		
		fileMenu.add(exitItem);
		
		exitItem.addActionListener(new ExitActionListener());
		
		mainWindowMenuBar.add(settingsMenu);
		
		settingsMenu.add(simulatorSettingsItem);
		
		settingsMenu.add(log4JSettingsItem);

		mainWindowMenuBar.add(helpMenu);
		
		helpMenu.add(aboutItem);
		
		mainFrame.setJMenuBar(mainWindowMenuBar);

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//ActionListeners
		
		simulatorItem.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        {

	        	cardLayout.show(cardPanel, "simulatorPanel");
	        	
	        	update_display();
	        		        	
	        }
	    });
		
		logAnalysisItem.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        {

	        	cardLayout.show(cardPanel, "logAnalysisPanel");
	        	
	        	update_display();
	        	
	        }
	    });
		
		simulatorSettingsItem.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        {

	        	cardLayout.show(cardPanel, "simulatorSettingsPanel");
	        	
	        	update_display();
	        	
	        }
	    });
		
		log4JSettingsItem.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        {

	        	cardLayout.show(cardPanel, "log4JSettingsPanel");
	        	
	        	update_display();
	        	
	        }
	    });
				
		aboutItem.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        {

	        	cardLayout.show(cardPanel, "aboutPanel");
	        	
	        	update_display();
	        	
	        }
	    });
		
		
//simulator_panel
		
		simulatorPanel.setLayout(new BorderLayout());
		
		final TimeSettings timeSettings = new TimeSettings();
		
		simulatorPanel.add(timeSettings.getTimeSettingsPanel(loadXMLSettings),BorderLayout.CENTER);

		JButton startSimulation = new JButton("Start Simulator");
		
		startSimulation.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        {
	        	
	            EventArrivalGenerator.simulationDuration = timeSettings.getSimulationMinutes();
	            
	            try {
	            	
					aesimulator.start();
					
				} catch (IOException e1) {
					

					e1.printStackTrace();
					
				}
	        	
	        }
	    });

		
		JPanel startSimulaorFlowLayout = new JPanel(new FlowLayout());
		
		startSimulaorFlowLayout.add(startSimulation);
		
		simulatorPanel.add(startSimulaorFlowLayout,BorderLayout.SOUTH);

	
//log analysis panel
		
		logAnalysisPanel.setLayout(new FlowLayout());
		
		JButton readButton = new JButton("Count ARRIVAL - > REGISTRATION");
		
		readButton.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	

            	        		
            }
            
        }); 
		
		logAnalysisPanel.add(readButton);
		
		JButton printInterTime = new JButton("Inter Time");
		
		printInterTime.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	
      
        		
            }
            
        }); 
		
		logAnalysisPanel.add(printInterTime);
		
		JButton recursiveMean = new JButton("Recursive Mean");
		
		recursiveMean.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	
//        		ReadLog read = new ReadLog();
//        		
//        		read.getRecursiveMean("./log/ae_simulator.log", "ARRIVAL", 3);
        		
            }
            
        }); 
		
		logAnalysisPanel.add(recursiveMean);

//about_panel
		
		aboutPanel.setLayout(new GridLayout());
		
		aboutText.setText("Log Generator - Version 1 - 10 May 2015");
		
		aboutPanel.add(aboutText);
//log4j settings panel
		
		log4JSettingsPanel.setLayout(new BorderLayout());
		
		Log4JSettings log4j = new Log4JSettings();
		
		JButton saveLog4JSettings = new JButton ("Save Log4J Settings");
		
		saveLog4JSettings.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        
	        {
	        	
	        		System.out.println("to be implemented");
	        }
	    });
		
		JPanel flowLog4JButtons = new JPanel(new FlowLayout());
		
		flowLog4JButtons.add(saveLog4JSettings);
		
		log4JSettingsPanel.add(log4j.getLog4JSettingsPanel(), BorderLayout.CENTER);
		
		log4JSettingsPanel.add(flowLog4JButtons, BorderLayout.SOUTH);

//settings_panel
		
		simulatorSettingsPanel.setLayout(new BorderLayout());
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		ResourceSettings resourceSettings = new ResourceSettings();

		tabbedPane.addTab("Resource",null, resourceSettings.getResourceSettingsPanel(loadXMLSettings),
		                  "Define the resources of the AE simulator. Currently number of Doctors and Nurses");
		
		
		
		ArrivalIntervalSettings arrivalIntervalSettings = new ArrivalIntervalSettings();
		
		tabbedPane.addTab("Arrival Interval",null, arrivalIntervalSettings.getArrivalIntervalSettingsPanel(loadXMLSettings),
		                  "Define the patient's arrival interval. It is split into hourly configuration.");
		
		
		
		DoctorIntervalStallSettings doctorIntervalStallSettings = new DoctorIntervalStallSettings();
		
		tabbedPane.addTab("Doctor Stall",null, doctorIntervalStallSettings.getDoctorIntervalStallSettingsPanel(loadXMLSettings),
		                  "Define the doctor assessment interval. It is split into hourly configuration.");
		
				
		StateDurationSettings stateDurationSettings = new StateDurationSettings();

		
		tabbedPane.addTab("State Duration",null, stateDurationSettings.getStateDurationSettingsPanel(loadXMLSettings),
		                  "Define the duration of each state of the AE simulator");
		
		
		
		TransitionsSettings transitionsSettings = new TransitionsSettings();
		
		tabbedPane.addTab("Transitions",null, transitionsSettings.getStateTransitionsSettingsPanel(loadXMLSettings),
                "Define the transitions and the probabilities from one state to another for the AE simulator");

		
        tabbedPane.setTabPlacement(JTabbedPane.LEFT);
        
		simulatorSettingsPanel.add(tabbedPane, BorderLayout.CENTER);
		
		
		JPanel applySettingsPanel = new JPanel(new FlowLayout());
		
		JButton applySettingsButton = new JButton("Apply Settings");
		
		applySettingsButton.addActionListener(new ActionListener() {
			 
	        public void actionPerformed(ActionEvent e)
	        {
	        	
	        	loadXMLSettings.writeToXML(ResourceSettings.getNumberOfNurses(),
	        			ResourceSettings.getNumberOfDoctors(),
	        			StateDurationSettings.getMeanArrivalStallTime(),
	        			StateDurationSettings.getMeanRegistrationDuration(),
	        			StateDurationSettings.getMeanTriageDuration(),
	        			StateDurationSettings.getMeanNurseVisitDuration(),
	        			StateDurationSettings.getMeanDoctorVisitDuration(),
	        			StateDurationSettings.getMeanXrayDuration(),
	        			StateDurationSettings.getMeanOtherTestsDuration(),
	        			StateDurationSettings.getMeanTreatmentDuration(),
	        			ArrivalIntervalSettings.getArrivalIntervalSettings(),
	        			DoctorIntervalStallSettings.getDoctorIntervalStallSettings(),
	        			TransitionsSettings.getTransitions(0),
	        			TransitionsSettings.getTransitions(1),
	        			TransitionsSettings.getTransitions(2),
	        			TransitionsSettings.getTransitions(3),
	        			TransitionsSettings.getTransitions(4),
	        			TransitionsSettings.getTransitions(5),
	        			TransitionsSettings.getTransitions(6),
	        			TransitionsSettings.getTransitions(7),
	        			TransitionsSettings.getTransitions(8),
	        			TransitionsSettings.getTransitions(9)
	        			);
	        	
	        	update_display();
	        	
	        	mainFrame.doLayout();
	        }
	    });

		applySettingsPanel.add(applySettingsButton);
		
		simulatorSettingsPanel.add(applySettingsPanel, BorderLayout.SOUTH);
		
		// end of settings panel
		
	}

	protected void update_display() {
		
		cardPanel.revalidate();
		
		
		mainFrame.revalidate();
		
		
		
	}

}

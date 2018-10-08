/**
 * mappingsFrame.java
 *
 * This file was generated by MapForce 2018r2sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */


package biz.uniwear.batch.mappings;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import com.altova.types.*;


public class mappingsFrame extends JFrame implements com.altova.TraceTarget {
	
	JPanel			contentPane;
	TitledBorder	titledBorder1;
	Box 		jHeader = new Box(BoxLayout.X_AXIS);
	Box		jHeaderInfo = new Box(BoxLayout.Y_AXIS);
	Box 		jButtonPane = new Box(BoxLayout.X_AXIS);
	JScrollPane	jScrollPaneStructures	= new JScrollPane();
	JPanel		jPanelStructures		= new JPanel();
	JLabel		jIconLabel				= new JLabel();
	JLabel		jInfoLabel1				= new JLabel();
	JLabel		jInfoLabel2				= new JLabel();
	JLabel		jInfoLabel3				= new JLabel();
	JButton		jStartButton			= new JButton();
	JPanel		jPanel1					= new JPanel();
	JScrollPane	jTraceScrollPane		= new JScrollPane();
	JTextArea	jTraceTextArea			= new JTextArea();


	JLabel jInventorySPI2Label0 = new JLabel();
	JTextField jInventorySPI2TextField0 = new JTextField();

	JLabel juniwearLabel1 = new JLabel();
	JTextField juniwearTextField1 = new JTextField();

	JLabel juniwear2Label2 = new JLabel();
	JTextField juniwear2TextField2 = new JTextField();

	JLabel jXcart2Label3 = new JLabel();
	JTextField jXcart2TextField3 = new JTextField();


	public mappingsFrame() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		jInfoLabel1.setText("THIS APPLICATION WAS GENERATED BY MapForce 2018r2sp1");
		jInfoLabel2.setForeground(Color.blue);
		jInfoLabel2.setText("http://www.altova.com/mapforce");
		jInfoLabel3.setText("Please check the input and output files, and press the Start button...");
		jHeaderInfo.add(jInfoLabel1,0);
		jHeaderInfo.add(jInfoLabel2,1);
		jHeaderInfo.add(jInfoLabel3,2);
		
		jIconLabel.setIcon(new ImageIcon(mappingsFrame.class.getResource("mapforce.png")));
		jIconLabel.setText("");
				
		jHeader.add(jIconLabel);
		jHeader.add(Box.createHorizontalStrut(15));
		jHeader.add(jHeaderInfo);
		jHeader.add(Box.createGlue());
		
		jStartButton.setFont(new java.awt.Font("Dialog", 0, 11));
		jStartButton.setText("Start");
		jStartButton.addActionListener(new mappingsFrame_jStartButton_actionAdapter(this));
		jButtonPane.add(Box.createHorizontalStrut(5));
		jButtonPane.add(jStartButton);
		jButtonPane.add(Box.createGlue());
				
		jScrollPaneStructures.setBorder(BorderFactory.createLineBorder(Color.black));
		jScrollPaneStructures.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPaneStructures.setAutoscrolls(true);
		jPanelStructures.setLayout(null);
		fillScrollPane();
		jScrollPaneStructures.getViewport().add(jPanelStructures, null);
		
		jTraceTextArea.setBackground(Color.white);
		jTraceTextArea.setForeground(Color.black);
		jTraceTextArea.setToolTipText("");
		jTraceTextArea.setText("");
		jTraceTextArea.setRows(20);
		
		jTraceScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jTraceScrollPane.setViewportBorder(null);
		jTraceScrollPane.setAutoscrolls(true);
		jTraceScrollPane.setBorder(BorderFactory.createLineBorder(Color.black));
		jTraceScrollPane.setDebugGraphicsOptions(0);
		jTraceScrollPane.setToolTipText("");
		jTraceScrollPane.setVerifyInputWhenFocusTarget(true);
		jTraceScrollPane.getViewport().add(jTraceTextArea, null);
		jTraceScrollPane.setPreferredSize(new Dimension(0, 200));
				
		contentPane = (JPanel)this.getContentPane();
		titledBorder1 = new TitledBorder("");
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		this.setSize(new Dimension(603, 511));
		this.setTitle("Mapforce Application");
		contentPane.add(jHeader, 0);
		contentPane.add(jScrollPaneStructures, 1);
		contentPane.add(jButtonPane, 2);
		contentPane.add(jTraceScrollPane, 3);
	}

	protected void fillScrollPane() {

		jInventorySPI2Label0.setText("Source instance of InventorySPI file:");
		jInventorySPI2Label0.setBounds(new Rectangle(15, 10, 438, 23));
		jPanelStructures.add(jInventorySPI2Label0, null);
		jInventorySPI2TextField0.setText("schema/InventorySPI.csv");
		jInventorySPI2TextField0.setBounds(new Rectangle(15, 35, 438, 23));
		jInventorySPI2TextField0.setEditable(false);
		jPanelStructures.add(jInventorySPI2TextField0, null);

		juniwearLabel1.setText("JDBC-URL of uniwear database:");
		juniwearLabel1.setBounds(new Rectangle(15, 60, 438, 23));
		jPanelStructures.add(juniwearLabel1, null);

		juniwearTextField1.setText("jdbc:mariadb://127.0.0.1/uniwear");
		juniwearTextField1.setBounds(new Rectangle(15, 85, 438, 23));
		juniwearTextField1.setEditable(false);
		jPanelStructures.add(juniwearTextField1, null);

		juniwear2Label2.setText("Source JDBC-URL of uniwear2 database:");
		juniwear2Label2.setBounds(new Rectangle(15, 110, 438, 23));
		jPanelStructures.add(juniwear2Label2, null);

		juniwear2TextField2.setText("jdbc:mariadb://127.0.0.1/uniwear");
		juniwear2TextField2.setBounds(new Rectangle(15, 135, 438, 23));
		juniwear2TextField2.setEditable(false);
		jPanelStructures.add(juniwear2TextField2, null);

		jXcart2Label3.setText("Instance of Xcart file:");
		jXcart2Label3.setBounds(new Rectangle(15, 160, 438, 23));
		jPanelStructures.add(jXcart2Label3, null);
		jXcart2TextField3.setText("_Product.csv");
		jXcart2TextField3.setBounds(new Rectangle(15, 185, 438, 23));
		jXcart2TextField3.setEditable(false);
		jPanelStructures.add(jXcart2TextField3, null);

		jPanelStructures.setLayout(null);
		jPanelStructures.setPreferredSize(new Dimension(185, 500));
		jPanelStructures.setSize(new Dimension(185, 500));
		jPanelStructures.setMinimumSize(new Dimension(185, 500));
		jPanelStructures.setMaximumSize(new Dimension(185, 500));
	}

	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			System.exit(0);
		}
	}

    void jStartButton_actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jStartButton)) {
			jStartButton.setEnabled(false);
			jTraceTextArea.removeAll();
			jTraceTextArea.append("Started...\n");
			com.altova.TraceTarget ttc = this;


			try {

			MappingMapTouniwear MappingMapTouniwearObject = new MappingMapTouniwear();

			//java.sql.DriverManager.setLogWriter(new java.io.PrintWriter(java.lang.System.err));


			Class.forName("org.mariadb.jdbc.Driver");

			MappingMapTouniwearObject.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// MappingMapTouniwearObject.setCloseObjectsAfterRun(false);

			{
				com.altova.io.Input InventorySPI2Source = com.altova.io.StreamInput.createInput("schema/InventorySPI.csv");

				MappingMapTouniwearObject.run(
						InventorySPI2Source,
						com.altova.db.Dbs.newConnection(
							"jdbc:mariadb://127.0.0.1/uniwear",
							"root",
							"root"));


			}



				jTraceTextArea.append("Finished\n");
			} catch (Exception ex) {
				jTraceTextArea.append("ERROR: " + ex.getMessage());
			}

			try {

			MappingMapToXcart MappingMapToXcartObject = new MappingMapToXcart();

			//java.sql.DriverManager.setLogWriter(new java.io.PrintWriter(java.lang.System.err));


			Class.forName("org.mariadb.jdbc.Driver");

			MappingMapToXcartObject.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// MappingMapToXcartObject.setCloseObjectsAfterRun(false);

			{
				com.altova.io.Output Xcart2Target = new com.altova.io.FileOutput("_Product.csv");

				MappingMapToXcartObject.run(
						com.altova.db.Dbs.newConnection(
							"jdbc:mariadb://127.0.0.1/uniwear",
							"root",
							"root"),
						Xcart2Target);


			}



				jTraceTextArea.append("Finished\n");
			} catch (Exception ex) {
				jTraceTextArea.append("ERROR: " + ex.getMessage());
			}

			jStartButton.setEnabled(true);
		}
    }


	public void writeTrace(String info) {
		jTraceTextArea.append(info);
	}
}

class mappingsFrame_jStartButton_actionAdapter
	implements java.awt.event.ActionListener {
	mappingsFrame adaptee;

	mappingsFrame_jStartButton_actionAdapter(mappingsFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jStartButton_actionPerformed(e);
	}
}


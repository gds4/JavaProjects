import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(91, 91, 91));
		frame.setBounds(100, 100, 719, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textField = new JTextPane();
		textField.setBounds(10, 11, 683, 404);
		frame.getContentPane().add(textField);
		
		JButton loadButton = new JButton("LOAD");
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser selectFileBox = new JFileChooser();
				int isValid = selectFileBox.showOpenDialog(null);
				
				if(isValid == JFileChooser.APPROVE_OPTION) {
					File selectedFile = selectFileBox.getSelectedFile();
					
					try {
						Scanner readFile = new Scanner(selectedFile);
						String fileText = "";
						
						while(readFile.hasNextLine()) 
							fileText += readFile.nextLine() + "\n";
						
						textField.setText(fileText);
						readFile.close();
						
					} catch (FileNotFoundException x){
						x.printStackTrace();
					}
				}
				
			}
			
		});
		loadButton.setBounds(201, 426, 103, 42);
		frame.getContentPane().add(loadButton);
		
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				JFileChooser selectFile = new JFileChooser();
				int isValid = selectFile.showSaveDialog(null);
				
				if(isValid == JFileChooser.APPROVE_OPTION) {
					File toAddFile = selectFile.getSelectedFile();
					
					try {
						String fileContent = textField.getText();
						
						if(!fileContent.equals("")) {
						
							FileWriter writer = new FileWriter(toAddFile);
							
							writer.write(fileContent);
							
							writer.close();
							
							JOptionPane.showMessageDialog(null, "Arquivo Salvo!", "Ta la Meu Patrão", JOptionPane.INFORMATION_MESSAGE);
						}
						else 
							JOptionPane.showMessageDialog(null, "Arquivo Vazio!", "Salvando o Vento?", JOptionPane.INFORMATION_MESSAGE);
						
					} catch (IOException x){
						x.printStackTrace();
					}
				}
				
			}
		});
		saveButton.setBounds(370, 426, 103, 42);
		frame.getContentPane().add(saveButton);
		
	}
}

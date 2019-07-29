package PruebaSwing;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Uso_JTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uso_JTable frame = new Uso_JTable();
					frame.setVisible(true);
					frame.setTitle("Los Planetas");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Uso_JTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTable tablaPlanetas = new JTable (datosFila, nombresColumnas);
		add(new JScrollPane(tablaPlanetas),BorderLayout.CENTER);
		
		JButton botonImprimir = new JButton("Imprimir tabla");
		
		botonImprimir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					tablaPlanetas.print();
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		
		JPanel laminaBoton = new JPanel();
		
		laminaBoton.add(botonImprimir);
		
		add(laminaBoton, BorderLayout.SOUTH);
	}
	
	
	
	
	
	
	private String [] nombresColumnas = {"Nombre", "Radio", "Lunas", "Gaseoso"};
	
	private Object [][]datosFila= {
			{"Mercurio", 2440.0,0,false},
			{"Venus", 6052.0,0,false},
			{"Tierra", 6378.0,0,false},
			{"Marte", 3397.0,2,false},
			{"Jupiter", 71492.0,16,true},
			{"Saturno", 60268.0,18,true},
			{"Urano", 25559.0,17,true},
			{"Neptuno", 244766.0,8,true},
			{"Pluton", 1137.0,1,false},
	
	};
	
	

}

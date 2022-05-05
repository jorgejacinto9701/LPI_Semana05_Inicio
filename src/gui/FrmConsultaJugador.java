package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FrmConsultaJugador extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInicio;
	private JTextField txtFin;

	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConsultaJugador frame = new FrmConsultaJugador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmConsultaJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblConsultaDeJugador = new JLabel("Consulta de Jugador por rango de fechas");
		lblConsultaDeJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaDeJugador.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblConsultaDeJugador.setBounds(10, 29, 751, 34);
		contentPane.add(lblConsultaDeJugador);

		JLabel lblFechadesde = new JLabel("Fecha (desde)");
		lblFechadesde.setBounds(23, 93, 126, 14);
		contentPane.add(lblFechadesde);

		txtInicio = new JTextField();
		txtInicio.setBounds(167, 90, 126, 20);
		contentPane.add(txtInicio);
		txtInicio.setColumns(10);

		JLabel lblhasta = new JLabel("(Hasta)");
		lblhasta.setBounds(343, 93, 46, 14);
		contentPane.add(lblhasta);

		txtFin = new JTextField();
		txtFin.setBounds(412, 90, 153, 20);
		contentPane.add(txtFin);
		txtFin.setColumns(10);

		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setBounds(617, 89, 119, 23);
		contentPane.add(btnFiltrar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 134, 693, 237);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Nombre", "Apellido", "Fecha Nacimiento" }));
		scrollPane.setViewportView(table);
	}

	
	public void mensaje(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}

}

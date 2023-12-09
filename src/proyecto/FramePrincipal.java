package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import main.ConsultarCeramico;
//import main.Exception;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Datos mínimos del primer producto
	public static String modelo0 = "Cinza Plus"; 
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0; 
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	// Datos mínimos del segundo producto
	public static String modelo1 = "Luxury"; 
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5; 
	public static int contenido1 = 4;
	// Datos mínimos del tercer producto
	public static String modelo2 = "Austria"; 
	public static double precio2 = 52.45; 
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5; 
	public static int contenido2 = 12;
	// Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix"; 
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	// Datos mínimos del quinto producto
	public static String modelo4 = "Thalía";
	public static double precio4 = 45; 
	public static double ancho4 = 45;
	public static double largo4 = 11.8; 
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero"; 
	public static int obsequioCantidad1 = 2; 
	public static int obsequioCantidad2 = 3; 
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
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
	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 353);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(116, 250, 239));
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mnArchivo.add(mntmNewMenuItem);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar cerámico");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			
			//crear el action con anticlic.
			public void actionPerformed(ActionEvent e) {
				try {
					//crear el objeto jframe y mostrarlo cuando se hace clic
					ConsultarCeramico frameConsultar = new ConsultarCeramico();
					frameConsultar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameConsultar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
			
			
		});
		mnMantenimiento.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificar cerámicos\n");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//crear el objeto jframe y mostrarlo cuando se hace clic
					ModificarCeramico frameModificar = new ModificarCeramico(FramePrincipal.this);
					frameModificar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameModificar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
		});
		mnMantenimiento.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Listar cerámicos");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//crear el objeto jframe y mostrarlo cuando se hace clic
					Listarceramicos frameListar = new Listarceramicos();
					frameListar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameListar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
			}
		});
		mnMantenimiento.add(mntmNewMenuItem_3);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Vender");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//crear el objeto jframe y mostrarlo cuando se hace clic
					Vender frameVender = new Vender();
					frameVender.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameVender.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
				
			}
		});
		mnVentas.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Generar reportes");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//crear el objeto jframe y mostrarlo cuando se hace clic
					GenerarReportes frameGenerar = new GenerarReportes();
					frameGenerar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frameGenerar.setVisible(true);
				} catch (Exception error) {
					error.printStackTrace();
				}
				
				
			}
		});
		mnVentas.add(mntmNewMenuItem_5);
		
		JMenu mnConfiguracion = new JMenu("Configuración");
		menuBar.add(mnConfiguracion);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Configurar descuentos");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConfiguracion.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Configurar obsequios");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnConfiguracion.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Configurar cantidad óptima");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConfiguracion.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem(" \nConfigurar cuota diaria\n");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConfiguracion.add(mntmNewMenuItem_9);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Acerca de Tienda");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnAyuda.add(mntmNewMenuItem_10);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(248, 246, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	
}
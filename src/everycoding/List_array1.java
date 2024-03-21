package everycoding;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class List_array1 extends JFrame {
	private Image array1_list = new ImageIcon(Main.class.getResource("../images/array1_list.png")).getImage();

	private ImageIcon array1_button1 = new ImageIcon(Main.class.getResource("../images/array1_button1.png"));
	private ImageIcon array1_button2 = new ImageIcon(Main.class.getResource("../images/array1_button2.png"));
	private ImageIcon array1_button3 = new ImageIcon(Main.class.getResource("../images/array1_button3.png"));
	private ImageIcon array1_button4 = new ImageIcon(Main.class.getResource("../images/array1_button4.png"));
	private ImageIcon array1_button5 = new ImageIcon(Main.class.getResource("../images/array1_button5.png"));
	private ImageIcon back_button = new ImageIcon(Main.class.getResource("../images/back_button.png"));

	private JButton array1button1 = new JButton(array1_button1);
	private JButton array1button2 = new JButton(array1_button2);
	private JButton array1button3 = new JButton(array1_button3);
	private JButton array1button4 = new JButton(array1_button4);
	private JButton array1button5 = new JButton(array1_button5);
	private JButton backbutton = new JButton(back_button);

	static int num; // 다른 클래스에서 사용가능(static변수는 전역변수이기 때문에)

	public List_array1() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setTitle("1차원배열 예문");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(array1button1);
		array1button1.setBounds(158, 240, 460, 100);
		array1button1.setBorderPainted(false);
		array1button1.setContentAreaFilled(false);
		array1button1.setFocusPainted(false);
		array1button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array1button1.setIcon(array1_button1);
				array1button1.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 올려놓았을 때 손가락모양
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array1button1.setIcon(array1_button1);
				array1button1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				List_array1.num = 1; // Listbutton_array1에서 1로 설정한 배경이 나온다.
				new Listbutton_array1();
				setVisible(false);
			}
		});

		add(array1button2);
		array1button2.setBounds(158, 340, 460, 100);
		array1button2.setBorderPainted(false);
		array1button2.setContentAreaFilled(false);
		array1button2.setFocusPainted(false);
		array1button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array1button2.setIcon(array1_button2);
				array1button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array1button2.setIcon(array1_button2);
				array1button2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array1.num = 2;
				new Listbutton_array1();
				setVisible(false);
			}

		});

		add(array1button3);
		array1button3.setBounds(158, 440, 460, 100);
		array1button3.setBorderPainted(false);
		array1button3.setContentAreaFilled(false);
		array1button3.setFocusPainted(false);
		array1button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array1button3.setIcon(array1_button3);
				array1button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array1button3.setIcon(array1_button3);
				array1button3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array1.num = 3;
				new Listbutton_array1();
				setVisible(false);
			}

		});

		add(array1button4);
		array1button4.setBounds(158, 540, 460, 108);
		array1button4.setBorderPainted(false);
		array1button4.setContentAreaFilled(false);
		array1button4.setFocusPainted(false);
		array1button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array1button4.setIcon(array1_button4);
				array1button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array1button4.setIcon(array1_button4);
				array1button4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array1.num = 4;
				new Listbutton_array1();
				setVisible(false);
			}

		});

		add(array1button5);
		array1button5.setBounds(654, 240, 460, 100);
		array1button5.setBorderPainted(false);
		array1button5.setContentAreaFilled(false);
		array1button5.setFocusPainted(false);
		array1button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array1button5.setIcon(array1_button5);
				array1button5.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array1button5.setIcon(array1_button5);
				array1button5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array1.num = 5;
				new Listbutton_array1();
				setVisible(false);
			}

		});

		add(backbutton);
		backbutton.setBounds(1050, 585, 70, 70);
		backbutton.setBorderPainted(false);
		backbutton.setContentAreaFilled(false);
		backbutton.setFocusPainted(false);
		backbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backbutton.setIcon(back_button);
				backbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				backbutton.setIcon(back_button);
				backbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				new List_array(); // 프레임 전환 역할
				setVisible(false);
			}
		});
	}

	public void paint(Graphics g) {
		g.drawImage(array1_list, 0, 0, null);
	}

}

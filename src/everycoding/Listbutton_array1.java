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
import javax.swing.JFrame;

public class Listbutton_array1 extends JFrame {
	private Image array1_ex1 = new ImageIcon(Main.class.getResource("../images/array1_ex1.png")).getImage();
	private Image array1_ex2 = new ImageIcon(Main.class.getResource("../images/array1_ex2.png")).getImage();
	private Image array1_ex3 = new ImageIcon(Main.class.getResource("../images/array1_ex3.png")).getImage();
	private Image array1_ex4 = new ImageIcon(Main.class.getResource("../images/array1_ex4.png")).getImage();
	private Image array1_ex5 = new ImageIcon(Main.class.getResource("../images/array1_ex5.png")).getImage();

	private ImageIcon check_button = new ImageIcon(Main.class.getResource("../images/check_button.png"));

	private JButton checkbutton = new JButton();

	public Listbutton_array1() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setTitle("1차원배열");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(checkbutton);
		checkbutton.setBounds(1070, 583, 120, 58);
		checkbutton.setBorderPainted(false);
		checkbutton.setContentAreaFilled(false);
		checkbutton.setFocusPainted(false);
		checkbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				checkbutton.setIcon(check_button);
				checkbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				checkbutton.setIcon(check_button);
				checkbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});

	}

	public void paint(Graphics g) {
		JTextField answer = new JTextField();
		answer.setBounds(200, 580, 850, 63);
		Font font = new Font("굴림", Font.BOLD, 50);
		answer.setFont(font);
		add(answer);

		if (List_array1.num == 1) { // List_array1.num이 1이라면 /num은 static변수이기 때문에 헷갈리지 않도록 class를 앞에 써줘야한다.
			g.drawImage(array1_ex1, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("new int[100]")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_array1.num == 2) {
			g.drawImage(array1_ex2, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("65+i")) {
						new Answer_correct();
						setVisible(false);
					} else if (answer.getText().equals("i+65")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_array1.num == 3) {
			g.drawImage(array1_ex3, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("a.length")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_array1.num == 4) {
			g.drawImage(array1_ex4, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("new String")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_array1.num == 5) {
			g.drawImage(array1_ex5, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("sum+=a[i]")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		}

	}
}

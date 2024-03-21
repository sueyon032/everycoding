package everycoding;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Explain_array extends JFrame {
	private Image array_explain = new ImageIcon(Main.class.getResource("../images/array_explain.png")).getImage(); // 그림경로
	private ImageIcon home_button = new ImageIcon(Main.class.getResource("../images/home_button.png")); // home 버튼 아이콘

	private JButton homebutton = new JButton(home_button); // home 버튼 생성

	public Explain_array() {
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("배열 설명"); // 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(homebutton);// JFrame에 버튼 추가
		homebutton.setBounds(1100, 600, 70, 65); // 버튼위치 (x좌표, y좌표, 가로, 세로)
		homebutton.setBorderPainted(false); // 버튼의 외곽선을 없애준다
		homebutton.setContentAreaFilled(false); // 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		homebutton.setFocusPainted(false); // 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		homebutton.addMouseListener(new MouseAdapter() { // 마우스의 액션
			@Override // 상위클래스(기존에 정의 되어있던 클래스)로부터 상속받은 메서드를 변경하는 것
			public void mouseEntered(MouseEvent e) {
				homebutton.setIcon(home_button);
				homebutton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 올려놓았을 때 손가락모양으로 바뀜
			}

			@Override
			public void mouseExited(MouseEvent e) {
				homebutton.setIcon(home_button);
				homebutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				new Start(); // 여기가 프레임 전환 역할
				setVisible(false);
			}

		});

	}

	public void paint(Graphics g) {
		g.drawImage(array_explain, 0, 0, null);
	}

}

package everycoding;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Start extends JFrame { // extends : JFrame을 상속받은 것

	private Image start_background = new ImageIcon(Main.class.getResource("../images/background.png")).getImage(); // 배경그림경로

	private ImageIcon for_button = new ImageIcon(Main.class.getResource("../images/for_button.png")); // if문 버튼 아이콘화
	private ImageIcon if_button = new ImageIcon(Main.class.getResource("../images/if_button.png")); // for문 버튼 아이콘화
	private ImageIcon array_button = new ImageIcon(Main.class.getResource("../images/array_button.png")); // 배열 버튼 아이콘화
	private ImageIcon book_button = new ImageIcon(Main.class.getResource("../images/book.png")); // 책 버튼 아이콘화
	private ImageIcon bookopen_button = new ImageIcon(Main.class.getResource("../images/bookopen.png")); // 열린책 버튼 아이콘화
	private ImageIcon list_button = new ImageIcon(Main.class.getResource("../images/list_button.png")); // 예문 버튼 아이콘화

	private JButton forbutton = new JButton(for_button); // for문 버튼 생성
	private JButton ifbutton = new JButton(if_button); // if문 버튼 생성
	private JButton arraybutton = new JButton(array_button); // array 버튼 생성
	private JButton bookbutton1 = new JButton(book_button); // 책 버튼1 생성
	private JButton bookbutton2 = new JButton(book_button); // 책 버튼2 생성
	private JButton bookbutton3 = new JButton(book_button); // 책 버튼3 생성
	private JButton bookopenbutton = new JButton(book_button); // 열린책 버튼 생성
	private JButton listbutton = new JButton(list_button); // 예문 버튼 생성

	public Start() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 메인에서 고정 시킨 크기
		setTitle("Every Coding"); // 창의 제목
		setResizable(false); // 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null); // 창이 가운데 오도록 하는 것
		setLayout(null); // 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true); // 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(forbutton); // JFrame에 버튼 추가
		forbutton.setBounds(350, 273, 580, 88); // 버튼위치 (x좌표, y좌표, 가로, 세로)
		forbutton.setBorderPainted(false); // 버튼의 외곽선을 없애준다
		forbutton.setContentAreaFilled(false); // 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		forbutton.setFocusPainted(false); // 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		forbutton.addMouseListener(new MouseAdapter() { // 마우스의 액션
			@Override // 상위클래스(기존에 정의 되어있던 클래스)로부터 상속받은 메서드를 재구성(변경)하는 것
			public void mouseEntered(MouseEvent e) { // 마우스 버튼을 갖다놓을 때 발생
				forbutton.setIcon(for_button); // 아이콘으로 만들기
				forbutton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 버튼에 마우스를 올려놓았을 때 마우스 모양이 손가락모양으로 바뀜
			}

			@Override
			public void mouseExited(MouseEvent e) { // 마우스가 버튼에 갖다대지 않을 때 발생
				forbutton.setIcon(for_button);
				forbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				new Frame_for(); // 프레임 전환 역할
				new stopwatch();
				setVisible(false); // 기존 프레임 닫아주는 역할
			}
		});

		add(ifbutton);
		ifbutton.setBounds(350,406, 580, 88);
		ifbutton.setBorderPainted(false);
		ifbutton.setContentAreaFilled(false);
		ifbutton.setFocusPainted(false);
		ifbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton.setIcon(if_button);
				ifbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton.setIcon(if_button);
				ifbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new Frame_if();
				new stopwatch();
				setVisible(false);
			}
		});

		add(arraybutton);
		arraybutton.setBounds(350, 540, 580, 88);
		arraybutton.setBorderPainted(false);
		arraybutton.setContentAreaFilled(false);
		arraybutton.setFocusPainted(false);
		arraybutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				arraybutton.setIcon(array_button);
				arraybutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				arraybutton.setIcon(array_button);
				arraybutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new Frame_array();
				setVisible(false);
			}
		});

		add(bookbutton1);
		bookbutton1.setBounds(840, 285, 80, 60);
		bookbutton1.setBorderPainted(false);
		bookbutton1.setContentAreaFilled(false);
		bookbutton1.setFocusPainted(false);
		bookbutton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bookbutton1.setIcon(bookopen_button);
				bookbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				bookbutton1.setIcon(book_button);
				bookbutton1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new Explain_for();
				setVisible(false);
			}
		});

		add(bookbutton2);
		bookbutton2.setBounds(840, 418, 80, 60);
		bookbutton2.setBorderPainted(false);
		bookbutton2.setContentAreaFilled(false);
		bookbutton2.setFocusPainted(false);
		bookbutton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bookbutton2.setIcon(bookopen_button);
				bookbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				bookbutton2.setIcon(book_button);
				bookbutton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new Explain_if();
				setVisible(false);
			}
		});

		add(bookbutton3);
		bookbutton3.setBounds(840, 552, 80, 60);
		bookbutton3.setBorderPainted(false);
		bookbutton3.setContentAreaFilled(false);
		bookbutton3.setFocusPainted(false);
		bookbutton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bookbutton3.setIcon(bookopen_button);
				bookbutton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				bookbutton3.setIcon(book_button);
				bookbutton3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new Explain_array();
				setVisible(false);
			}
		});

		add(listbutton);
		listbutton.setBounds(138, 596, 50, 65);
		listbutton.setBorderPainted(false);
		listbutton.setContentAreaFilled(false);
		listbutton.setFocusPainted(false);
		listbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				listbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				listbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new List_aframe();
				setVisible(false);
			}
		});
	}

	public void paint(Graphics g) { // 그리는 함수
		g.drawImage(start_background, 0, 0, null);// background를 그려줌

		add(forbutton);
		add(ifbutton);
		add(arraybutton);
	}
}

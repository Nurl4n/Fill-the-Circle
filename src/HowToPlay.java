import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class HowToPlay extends JPanel implements FillTheCircleView{

	
	JButton soundButton;
	JButton backButton;
	JLabel nameLabel;
	JTextArea infoArea;
	JLabel backgroundLabel;
	/**
	 * Create the panel.
	 */
	public HowToPlay() {
		
		
		setPreferredSize(new Dimension(400, 600));
		setLayout(null);
		
		ImageIcon soundIcon = new ImageIcon("images\\muteIcon.png");     // adding High Score button
		soundButton = new JButton(new ImageIcon("C:\\Users\\user\\Desktop\\FillTheCircle_GUI\\GUI\\images\\rsz_soundicon41.png"));
		soundButton.setBorder(new LineBorder(Color.white, 0));
		soundButton.setContentAreaFilled(false);
		soundButton.setBounds(359, 0, 41, 41);
		add(soundButton);
		
		nameLabel = new JLabel("How To Play");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 49));
		nameLabel.setBounds(43, 27, 357, 81);
		add(nameLabel);
		
		infoArea = new JTextArea();
		infoArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		infoArea.setForeground(Color.WHITE);
		infoArea.append("On the screen there will be an empty circle \n");
		infoArea.append("and a ball. In order to win game you have \n");
		infoArea.append("to fill the empty circle by keeping the ball \n");
		infoArea.append("inside the circle by using arrow keys. But \n");
		infoArea.append("you will have a limited time. Time starts \n");
		infoArea.append("when ball enters to the circle. At the same \n");
		infoArea.append("time you should be careful about not letting \n");
		infoArea.append("the ball to go out of the circle. Moreover, \n");
		infoArea.append("you will have 5 chances when the game starts \n");
		infoArea.append("Each time ball leaves the circle you loose 1 \n");
		infoArea.append("of your chances. Good Luck! \n");
		infoArea.setRows(10);
		infoArea.setColumns(10);
		infoArea.setBounds(10, 161, 380, 291);
		infoArea.setOpaque(false);
		add(infoArea);
		
		ImageIcon backIcon = new ImageIcon("images\\backIcon.png");
		backButton = new JButton(backIcon);
		backButton.setBounds(10, 549, 45, 40);
		backButton.setBorder( new LineBorder(Color.WHITE, 0));
		backButton.setContentAreaFilled(false);
		add(backButton);
		
		ImageIcon backgroundIcon = new ImageIcon("images\\howToPlayBackground.jpg");
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setIcon(backgroundIcon);
		backgroundLabel.setBounds(0, 0, 400, 600);
		add(backgroundLabel);
		
	}
	public void updateLanguage(String lang)
	{
		if(lang.equals("Aze"))
		{
			nameLabel.setText("Nec?? oynamal?? ?");
			infoArea.setText("");
			infoArea.append("Oyun bo?? bir dair?? v?? top il?? ba??lay??r. \n");
			infoArea.append("M??rh??l??ni ke??m??k ??????n istiqam??t (????????????) \n");
			infoArea.append("v?? WASD d??ym??l??ri il?? topu dair?? dolana  \n");
			infoArea.append("q??d??r dair??nin i??ind?? tutmaq laz??md??r. \n");
			infoArea.append("Amma bunun ??????n vaxt??n??z m??hdud olacaq. \n");
			infoArea.append("Eyni zamanda topun dair??nin i??ind??n \n");
			infoArea.append("????xmamas??na da diqq??t etm??k laz??md??r. ????nki,  \n");
			infoArea.append("top h??r d??f?? dair??ni t??rk etdikd?? oyun  \n");
			infoArea.append("ba??lad?????? zaman siz?? verilmi?? 5 ??ansdan  \n");
			infoArea.append("birini itirirsiniz. U??urlar !");
			infoArea.setRows(10);
			infoArea.setColumns(10);
		}
		if(lang.equals("Eng"))
		{
			nameLabel.setText("How To Play");
			infoArea.setText("");
			infoArea.append("On the screen there will be an empty circle \n");
			infoArea.append("and a ball. In order to win game you have \n");
			infoArea.append("to fill the empty circle by keeping the ball \n");
			infoArea.append("inside the circle by using arrow keys. But \n");
			infoArea.append("you will have a limited time. Time starts \n");
			infoArea.append("when ball enters to the circle. At the same \n");
			infoArea.append("time you should be careful about not letting \n");
			infoArea.append("the ball to go out of the circle. Moreover, \n");
			infoArea.append("you will have 5 chances when the game starts \n");
			infoArea.append("Each time ball leaves the circle you loose 1 \n");
			infoArea.append("of your chances. Good Luck! \n");
			infoArea.setRows(10);
			infoArea.setColumns(10);
		}
		if(lang.equals("Rus"))
		{
			nameLabel.setText("????????????????????");
			infoArea.setText("");
			infoArea.append("???? ???????????? ???? ???????????? ?????????????????? ?????? ?? \n");
			infoArea.append("??????. ?????? ???????????? ?????? ?????????? ????????????????????  \n");
			infoArea.append("?????? ???????????? ???????? ???????? ?????? ?????????????????????? \n");
			infoArea.append("???????????? ?????????????????? ?????????????? ??????????????????????   \n");
			infoArea.append("???? ????????????????????. ???? ?? ?????? ??????????  \n");
			infoArea.append("?????????????????????? ??????????.?? ???? ???? ?????????? ??????  \n");
			infoArea.append("?????????? ?????????????? ???? ?????? ?????????? ?????? ???? \n");
			infoArea.append("?????????????? ?????? ?????????? ????????  ?????? ???? ???????????? \n");
			infoArea.append(" ????????????.?? ?????? ?????????? 5 ???????????? ??  \n");
			infoArea.append("?? ???????????? ?????????????? ???? ???????? ???? ???????????? \n");
			infoArea.append("???????????? ???? ???????????? ??????????. ??????????!");
			infoArea.setRows(12);
			infoArea.setColumns(12);
		}
		if(lang.equals("Trk"))
		{
			nameLabel.setText("Nas??l oynan??r ?");
			infoArea.setText("");
			infoArea.append("Oyun bo?? bir daire ve bir top ile ba??l??yor. \n");
			infoArea.append("Oyunu kazanmak i??in, y??n tu??lar??yla topu \n");
			infoArea.append("dairenin i??inde daire tamamen dolana kadar \n");
			infoArea.append("tutman??z gerekir.S??n??rl?? olan s??reniz top dairenin \n");
			infoArea.append("i??ine girdi??inde ba??lar. \n");
			infoArea.append("Topun daire d??????na ????kmamas??na da dikkat \n");
			infoArea.append(" etmek gerekiyor. ????nk?? top her defas??nda  \n");
			infoArea.append("dairenin d??????na ????kt??????nda, oyun ba??lad??????  \n");
			infoArea.append("zaman sahip oldu??unuz 5 ??ansdan birini \n");
			infoArea.append("kaybedersiniz. ??yi oyunlar!");
			infoArea.setRows(10);
			infoArea.setColumns(10);
		}
	}
	public JButton getSoundButton()
	{
		return soundButton;
	}
	
	public JButton getBackButton()
	{
		return backButton;
	}
}

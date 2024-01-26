package chap09;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
 
class MySokoban extends JFrame implements KeyListener, ActionListener { 
	 final int IXSize  = 60;  // Image X Size : Pixel 
	 final int IYSize  = 60;  // Image Y Size : Pixel 
	 final int BXSize  = 14;  // Block X Size 
	 final int BYSize  = 10; // Block Y Size 
	 final int DXSize  = IXSize*BXSize; // Display X Size : Pixel 
	 final int DYSize  = IYSize*BYSize; // Display Y Size : Pixel 
	 final int LThick  = 3;    // Line Thickness : Pixel 
	 final int MXSize  = LThick+LThick; // Margin X Size : Pixel(left+right) 
	 final int MYUSize  = 23+LThick;   // Margin Y Up Size : Pixel(Title+top) 
	 final int MYSize  = MYUSize+LThick; // Margin Y Size : Pixel(Title+top+bottom) 
	 final String Title  = "겜 만들기005"; 
	  
	 Image IWall  = Toolkit.getDefaultToolkit().getImage("src/chap09/Wall.png");
	 Image IManF  = Toolkit.getDefaultToolkit().getImage("src/chap09/ManF.png");
	 Image IManB  = Toolkit.getDefaultToolkit().getImage("src/chap09/ManB.png");
	 Image IManL  = Toolkit.getDefaultToolkit().getImage("src/chap09/ManL.png");
	 Image IManR  = Toolkit.getDefaultToolkit().getImage("src/chap09/ManR.png");
	 Image IMan   = IManF;                             
	 Image IDot   = Toolkit.getDefaultToolkit().getImage("src/chap09/Dot.png");
	 Image IBox   = Toolkit.getDefaultToolkit().getImage("src/chap09/Box.png");
	 Image IRoad  = Toolkit.getDefaultToolkit().getImage("src/chap09/Road.png");
	 int iStage   = 0; 
	 int iXMan   = 0; 
	 int iYMan   = 0; 
	 boolean bEndGame = true; 
	 int iScore; 
	 JLabel TitleLabel; 
	 JButton ButReset; 
	 JButton ButUp; 
	 JButton ButDown; 
	 JButton ButLeft; 
	 JButton ButRight; 
	  
  
	 char [][] Map  = new char[BYSize][BXSize]; 
	 String [][] Stage = { 
		       {//////////////////1 
		   "##############", 
		   "#  @B.       #", 
		   "#   B ###    #", 
		   "#   . ###    #", 
		   "#            #", 
		   "#   ####  #  #", 
		   "#   ####  #  #", 
		   "#   #     #  #", 
		   "#            #", 
		   "##############" 
		   },/////////////////1 
		   {//////////////////2 
		   "##############", 
		   "#  @ B.      #", 
		   "#   B ###    #", 
		   "#   . ###    #", 
		   "#            #", 
		   "#   ####  #  #", 
		   "#   ####  #  #", 
		   "#   #     #  #", 
		   "#            #", 
		   "##############" 
		   },//////////////////2 
		  /* {
		        "##############",
		        "##############",
		        "###  #   #####",
		        "### B..B #####",
		        "### B..B######",
		        "### B..B #####",
		        "###@ #   #####",
		        "##############",
		        "##############",
		        "##############"
		    },*/
	  }; 
	 
	 public MySokoban() { 
		  this.setTitle(Title); 
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		   
		  Container c = this.getContentPane(); 
		  c.setLayout(null); 
		   
		  ButUp = new JButton("UP"); 
		  ButUp.setFont(new Font("Arial", Font.BOLD, 15)); 
		  ButUp.setLocation(890, 290); 
		  ButUp.setSize(100, 50); 
		  ButUp.addActionListener(this); 
		  c.add(ButUp); 
		   
		  ButRight = new JButton("RIGHT"); 
		  ButRight.setFont(new Font("Arial", Font.BOLD, 15)); 
		  ButRight.setLocation(940, 340); 
		  ButRight.setSize(90, 50); 
		  ButRight.addActionListener(this); 
		  c.add(ButRight); 
		   
		  ButLeft = new JButton("LEFT"); 
		  ButLeft.setFont(new Font("Arial", Font.BOLD, 15)); 
		  ButLeft.setLocation(850, 340); 
		  ButLeft.setSize(90, 50); 
		  ButLeft.addActionListener(this); 
		  c.add(ButLeft); 
		   
		   
		  ButDown = new JButton("DOWN"); 
		  ButDown.setFont(new Font("Arial", Font.BOLD, 15)); 
		  ButDown.setLocation(890, 390); 
		  ButDown.setSize(100, 50); 
		  ButDown.addActionListener(this); 
		  c.add(ButDown); 
		   
		  ButReset = new JButton("Reset"); 
		  ButReset.setFont(new Font("Arial", Font.BOLD, 15)); 
		  ButReset.setLocation(890, 150); 
		  ButReset.setSize(100, 50); 
		  ButReset.addActionListener(this); 
		  c.add(ButReset); 
		   
		  TitleLabel = new JLabel(); 
		  TitleLabel.setFont(new Font("굴림", Font.BOLD, 25)); 
		  TitleLabel.setLocation(880, 50); 
		  TitleLabel.setSize(200, 50); 
		  c.add(TitleLabel); 
		   
		  c.addKeyListener(this); 
		  c.setFocusable(true); 
		  c.requestFocus(); 
		 
		  this.setSize(DXSize+MXSize+200, DYSize+MYSize); 
		  this.setResizable(false); 
		  this.setVisible(true); 
		   
		  LoadMap(); 
		  TitleLabel.setText("Score : " + iScore); 
		 } 
  
	 void LoadMap() { 
		 for(int iCnt=0; iCnt<Stage[iStage].length; ++iCnt) { 
			 Map[iCnt] = Stage[iStage][iCnt].toCharArray(); 
		 } 
		  IMan = IManF; 
		  iScore = 0; 
	 } 
 
	 public void paint(Graphics g) { 
		 Image aImage; 
   
		 bEndGame = true; 
		 super.paintComponents(g); 
		 Container c = this.getContentPane(); 
		 c.requestFocus(); 
	 
		 while(true) { 
			 for(int iY=0; iY<BYSize; ++iY) { 
				  for(int iX=0; iX<BXSize; ++iX)  { 
					  switch(Map[iY][iX])  { 
					      case '#': 
					    	  aImage = this.IWall; 
					    	  break; 
					      case '@': 
					    	  aImage = this.IMan; 
							  iXMan  = iX; 
							  iYMan  = iY; 
							  break; 
					      case 'B': 
					    	  char [] MapLine = Stage[iStage][iY].toCharArray(); 
					    	  if('.' != MapLine[iX]) { 
					    		  bEndGame = false; 
					    	  } 
							  aImage = this.IBox; 
							  break; 
					      case '.': 
							  aImage = this.IDot; 
							  break; 
					      default: 
							  aImage = this.IRoad; 
							  break; 
					  } 
					  g.drawImage(aImage, iX*IXSize+LThick, iY*IYSize+MYUSize, this); 
				  } 
				  //System.out.println(Map[iY]);// 디버깅용 코드 
			  } 
		   this.setTitle(Title+"[Score : "+iScore+"]"); 
		   TitleLabel.setText("Score : " + iScore); 
		   if(true == bEndGame)  { 
			   ++iStage; 
			   if(Stage.length <= iStage) { // 게임 종료  
				   JOptionPane.showMessageDialog(null, "종료"); 
				   System.exit(0); 
			   } 
	 
			    JOptionPane.showMessageDialog(null, "다음판"); 
			    LoadMap(); 
			    continue; 
		   } 
		   break; 
		 }// while  
	 } 
	 
	 public void ManMove(int iX, int iY){ 
		 if('#' != Map[iY][iX]) {// @가 이동할 위치가 벽이 아닐 때 
   
			 if('B' == Map[iY][iX]) {// @가 이동할 위치에 박스가 있으면 
    
				 //Map[2*iY-iYMan][2*iX-iXMan] : 박스가 이동할 위치 
				 if('#' == Map[2*iY-iYMan][2*iX-iXMan]) { // 박스가 이동할 위치가 벽이면 
					 									  //아무도 이동하면 안됨 
					 iY = iYMan; 
					 iX = iXMan; 
					 --iScore; 
				 } 
				 else if('B' == Map[2*iY-iYMan][2*iX-iXMan]) {  // 박스가 이동할 위치가 박스면 
					 											//아무도 이동하면 안됨 
					 iY = iYMan; 
					 iX = iXMan; 
					 --iScore; 
				 } 
				 else { // 박스가 이동할 위치가 벽과 박스가 아니면 

					 Map[2*iY-iYMan][2*iX-iXMan] = 'B'; // 박스를 새로운 위치로 이동 시킴 
				 } 
     
			 } 
			 char [] MapLine = Stage[iStage][iYMan].toCharArray(); 
			 if('.' == MapLine[iXMan]) {  
				 Map[iYMan][iXMan] = '.'; // @의 기존 위치를 '.'로 만듦 
			 } 
			 else { 
				 Map[iYMan][iXMan] = ' '; // @의 기존 위치를 '길'로 만듦 
			 } 
    
			 Map[iY][iX] = '@';   // @를 새로운 위치로 이동 시킴 
			 ++iScore; 
		 } 
	 } 
	 @Override 
	 public void keyPressed(KeyEvent e)  { 
		 int iX = iXMan;// iX는 뉴좌표, iXMan는 올드좌표 
		 int iY = iYMan;// iY는 뉴좌표, iYMan는 올드좌표 
		 switch(e.getKeyCode()) { 
   
		   case KeyEvent.VK_HOME: 
			    LoadMap(); 
			    repaint(); 
			    return; 
		   case KeyEvent.VK_UP: 
			    IMan = IManB; 
			    --iY; 
			    break; 
		   case KeyEvent.VK_DOWN: 
			    IMan = IManF; 
			    ++iY; 
			    break; 
		   case KeyEvent.VK_LEFT: 
			    IMan = IManL; 
			    --iX; 
			    break; 
		   case KeyEvent.VK_RIGHT: 
			    IMan = IManR; 
			    ++iX; 
			    break; 
			    default: 
			    return; 
		 } 
		  ManMove(iX, iY); 
		  repaint();//paint 호출 
	 } 
	 @Override 
	 public void keyTyped(KeyEvent e){} 
	 @Override 
	 public void keyReleased(KeyEvent e) {} 
	 
	 @Override 
	 public void actionPerformed(ActionEvent e) { 
		 JButton Temp = (JButton)e.getSource(); 
 
		 if(Temp.equals(ButReset)) { 
			  LoadMap(); 
			  repaint(); 
			  return; 
		 } 
   
		  int iX = iXMan; 
		  int iY = iYMan; 
   
		  if(Temp.equals(ButDown)) { 
			   IMan = IManF; 
			   ++iY; 
		  } 
		  else if(Temp.equals(ButUp)) { 
			  IMan = IManB; 
			  --iY; 
		  } 
		  else if(Temp.equals(ButLeft)) { 
			   IMan = IManL; 
			   --iX; 
		  } 
		  else if(Temp.equals(ButRight)) {  
			   IMan = IManR; 
			   ++iX; 
		  } 
		  ManMove(iX, iY); 
		  repaint(); 
	 } 
} 
 
public class MyGame { 
	public static void main(String[] args) { 
  
		MySokoban aMySokoban = new MySokoban(); 
	} 
}
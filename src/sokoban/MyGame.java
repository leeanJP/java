package sokoban;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MySokoban extends JFrame implements KeyListener, ActionListener{

    final int IXSize = 60; //Image X Size
    final int IYSize = 60; //Image Y Size
    final int BXSize = 14; //Box X Size
    final int BYSize = 10; //Box Y Size
    final int DXSize = IXSize * BXSize; //Display X Size
    final int DYSize = IYSize * BYSize; //Display X Size
    final int LThick = 3; //Line Thikenss
    final int MXSize = LThick*LThick; //Margin X Size;  (Left + Right)
    final int MYUpsize = 23+LThick; //Margin Y Size(Title + Top)
    final int MYSize = MYUpsize*LThick; //Margin X Size; (Title + Top + Bottom)

    final String TITLE = "Sokoban";

    Image Wall = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Wall.png");
    Image ManF = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManF.png");
    Image ManB = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManB.png");
    Image ManL = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManL.png");
    Image ManR = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/ManR.png");
    Image Dot = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Dot.png");
    Image Box = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Box.png");
    Image Road = Toolkit.getDefaultToolkit().getImage("src/sokoban/resources/Road.png");
    Image Man = ManF;

    int stage = 0;
    int iXMan = 0;
    int iYMan = 0;

    boolean bEndGame = true;
    int iScore = 0;

    JButton btnReset;
    JButton btnUP;
    JButton btnDOWN;
    JButton btnLEFT;
    JButton btnRIGHT;
    JLabel TitleLabel;

    char[][] Map = new char[BYSize][BXSize];

    String [][] Stage = {
            //stage1
            {"  ####        ",
             "  #  ###      ",
             "  #    #      ",
             "  # $  #      ",
             "### ###       ",
             "# $ $ #       ",
             "#..@..#       ",
             "#  $  #       ",
             "###  ##       ",
             " ####         ",
            },
            //stage2
            {"##############",
             "#  @$.       #",
             "#   $ ###    #",
             "#   . ###    #",
             "#            #",
             "#   ####  #  #",
             "#   ####  #  #",
             "#   #     #  #",
             "#            #",
             "##############"
            },
    };

    public MySokoban() {
        this.setTitle(TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        c.setLayout(null);

        btnUP = new JButton("UP");
        btnUP.setFont(new Font("Arial", Font.BOLD, 15));
        btnUP.setLocation(890, 290);
        btnUP.setSize(100, 50);
        btnUP.addActionListener(this);
        c.add(btnUP);

        btnDOWN = new JButton("DOWN");
        btnDOWN.setFont(new Font("Arial", Font.BOLD, 15));
        btnDOWN.setLocation(890, 390);
        btnDOWN.setSize(100, 50);
        btnDOWN.addActionListener(this);
        c.add(btnDOWN);

        btnLEFT = new JButton("LEFT");
        btnLEFT.setFont(new Font("Arial", Font.BOLD, 15));
        btnLEFT.setLocation(850, 340);
        btnLEFT.setSize(100, 50);
        btnLEFT.addActionListener(this);
        c.add(btnLEFT);

        btnRIGHT = new JButton("RIGHT");
        btnRIGHT.setFont(new Font("Arial", Font.BOLD, 15));
        btnRIGHT.setLocation(940, 340);
        btnRIGHT.setSize(100, 50);
        btnRIGHT.addActionListener(this);
        c.add(btnRIGHT);

        btnReset = new JButton("RESET");
        btnReset.setFont(new Font("Arial", Font.BOLD, 15));
        btnReset.setLocation(890, 150);
        btnReset.setSize(100, 50);
        btnReset.addActionListener(this);
        c.add(btnReset);

        TitleLabel = new JLabel();
        TitleLabel.setFont(new Font("굴림", Font.BOLD, 25));
        TitleLabel.setLocation(880, 50);
        TitleLabel.setSize(200,50);
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

    void LoadMap(){
        for(int i=0; i<Stage[stage].length; ++i){
            Map[i] = Stage[stage][i].toCharArray();
        }
        Man = ManF;
        iScore = 0;
    }

    public void paint(Graphics g){
        Image aImage;

        bEndGame = true;
        super.paintComponents(g);
        Container c = this.getContentPane();
        c.requestFocus();

        while (true){
            for(int iY=0 ; iY<BYSize; ++iY){
                for(int iX=0; iX<BXSize; ++iX){
                    switch (Map[iY][iX]){
                        case '#':
                            aImage = this.Wall;
                            break;
                        case  '@':
                            aImage = this.Man;
                            iXMan = iX;
                            iYMan = iY;
                            break;
                        case '$':
                            aImage = this.Box;
                            char[] MapLine = Stage[stage][iY].toCharArray();
                            if('.' != MapLine[iX]){
                                bEndGame = false;
                            }
                            break;
                        case '.' :
                            aImage = this.Dot;
                            break;
                        default:
                            aImage = this.Road;
                            break;
                    }
                    g.drawImage(aImage, iX*IXSize+LThick, iY*IYSize+MYUpsize, this);
                }
                System.out.println(Map[iY]); //디버깅 코드
            }
            this.setTitle(TITLE + "[Score : " + iScore + "]");
            TitleLabel.setText("Score : " + iScore);
            if(bEndGame == true){
                ++stage;
                if(Stage.length <= stage){ //게임종료
                    JOptionPane.showMessageDialog(null, "종료");
                    System.exit(0);
                }

                JOptionPane.showMessageDialog(null,"Next Stage");
                LoadMap();
                continue;
            }
            break;
        }//while 문 종료

    }

    public void ManMove(int iX, int iY){
        if('#' != Map[iY][iX]){ // @가 이동할 위치가 벽이 아닐때
            if('$' == Map[iY][iX]){ //@가 이동할 위치에 박스가 있을때

                //Map[2*iY - iYMan][2*iX -iXMan] : 박스가 이동할 위치
                if('#' == Map[2*iY - iYMan][2*iX -iXMan]){ //박스가 이동할 위치가 벽이면 아무도 이동하면 안됨
                    iY = iYMan;
                    iX = iXMan;
                    --iScore;
                }else if('$' == Map[2*iY - iYMan][2*iX -iXMan]){ //박스가 이동할 위치가 박스면 이동하면 안됨
                    iY = iYMan;
                    iX = iXMan;
                    --iScore;
                }else { //박스가 이동할 위치가 벽과 박스가 아니면
                    Map[2*iY - iYMan][2*iX -iXMan] = '$'; //박스를 새로운 위치로 이동
                }
            }

            char[] MapLine = Stage[stage][iYMan].toCharArray();
            if('.' == MapLine[iXMan]){
                Map[iYMan][iXMan] = '.'; //@의 기존 위치를 '.'으로 만듦
            }else {
                Map[iYMan][iXMan] = ' '; //@의 기존 위치를 '길'로 만듦
            }
            Map[iY][iX] = '@'; //@를 새로운 위치로 이동시킴
            ++iScore;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        int iX = iXMan; //iX 새 좌표값, iXMan은 기존 좌표값
        int iY=  iYMan; //iY 새 좌표값, iYMan은 기존 좌표값

        if(temp.equals(btnReset)){
            LoadMap();
            repaint();
            return;
        }else if(temp.equals(btnUP)){
            Man = ManB;
            --iY;
        }else if(temp.equals(btnDOWN)){
            Man = ManF;
            ++iY;
        }else if(temp.equals(btnLEFT)){
            Man = ManL;
            --iX;
        }else if(temp.equals(btnRIGHT)){
            Man = ManR;
            ++iX;
        }
        ManMove(iX,iY);
        repaint();


    }


    @Override
    public void keyPressed(KeyEvent e) {
        int iX = iXMan; //iX 새 좌표값, iXMan은 기존 좌표값
        int iY=  iYMan; //iY 새 좌표값, iYMan은 기존 좌표값

        switch (e.getKeyCode()){
            case KeyEvent.VK_HOME:
                LoadMap();
                repaint();
                return;
            case KeyEvent.VK_UP:
                Man = ManB;
                --iY;
                break;
            case KeyEvent.VK_DOWN:
                Man = ManF;
                ++iY;
                break;
            case KeyEvent.VK_LEFT:
                Man = ManL;
                --iX;
                break;
            case KeyEvent.VK_RIGHT:
                Man = ManR;
                ++iX;
                break;
            default:
                return;

        }
        ManMove(iX,iY);
        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
}



public class MyGame {
    public static void main(String[] args) {
        MySokoban sokoban = new MySokoban();
    }
}

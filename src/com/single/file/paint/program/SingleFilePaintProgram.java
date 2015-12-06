package com.single.file.paint.program;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SingleFilePaintProgram {
 
     public static void main(String[] args){
      
      try {
          UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
       } catch (Exception e) {
                  e.printStackTrace();
       }
      
  JFrame frame = new JFrame("Brush Stroke");
        Container content = frame.getContentPane();
        final PadDraw drawPad = new PadDraw();
        
  content.add(drawPad, BorderLayout.CENTER);
  // sets the padDraw in the center

  
  // This sets the size of the panel
  JPanel panel = new JPanel();
     panel.setPreferredSize(new Dimension(85, 85));
  panel.setMinimumSize(new Dimension(85, 85));
  panel.setMaximumSize(new Dimension(85, 85));
  panel.setBackground(new Color(255,215,0));
  
  

 
  // //////////drawPad size setter//////////////
        
  
  JButton clearButton = new JButton("Clear");
  clearButton.setForeground(Color.white);
  clearButton.setBackground(new Color(0,201,87));
  clearButton.setFocusPainted(false);
  clearButton.setSize(135, 20);
  clearButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.clear();
   }
  });
  
        
  JButton Rubber = new JButton("Rubber");
  Rubber.setForeground(Color.white);
  Rubber.setBackground(new Color(0,201,87));
  Rubber.setFocusPainted(false);
  Rubber.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.Rubber();
   }
  });
  
 
  JButton redButton = new JButton();
  redButton.setBackground(Color.red);
  redButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.red();
   }

  });
  
  JButton darkRedButton = new JButton();
  darkRedButton.setBackground(new Color(176,23,31));
  darkRedButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.darkred();
   }

  });
  
  JButton lightRedButton = new JButton();
  lightRedButton.setBackground(new Color(238,99,99));
  lightRedButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.lightred();
   }

  });
  // when pressed it will call the red() method. So on and so on

  JButton blackButton = new JButton();
  blackButton.setBackground(Color.black);
  blackButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.black();
   }
  });
  
  JButton greyButton = new JButton();
  greyButton.setBackground(new Color(139,137,137));
  greyButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.grey();
   }
  });

  JButton lightGreyButton = new JButton();
  lightGreyButton.setBackground(new Color(205,201,201));
  lightGreyButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.lightgrey();
   }
  });

  JButton magentaButton = new JButton();
  // magenta button
  magentaButton.setBackground(Color.magenta);
  magentaButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.magenta();
   }
  });

  JButton blueButton = new JButton();
  // blue button
  blueButton.setBackground(Color.blue);
  blueButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.blue();
   }
  });
  
  JButton midBlueButton = new JButton();
  // blue button
  midBlueButton.setBackground(new Color(49,132,226));
  midBlueButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.midblue();
   }
  });
  
  JButton darkGreenButton = new JButton();
  //  dark blue button
  darkGreenButton.setBackground(new Color(36,158,6));
  darkGreenButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.darkgreen();
   }
  });

  JButton greenButtonTwo = new JButton();
  //  dark blue button
  greenButtonTwo.setBackground(new Color(170,255,130));
  greenButtonTwo.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.secondgreen();
   }
  });
  JButton greenButton = new JButton();
  // green button
  greenButton.setBackground(Color.green);
  greenButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.green();
   }
  });

  JButton orangeButton = new JButton();
  // orange button
  orangeButton.setBackground(Color.orange);
  orangeButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.orange();
   }
  });
  
  JButton midOrangeButton = new JButton();
  // orange button
  midOrangeButton.setBackground(new Color(248,148,21));
  midOrangeButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.midorange();
   }
  });
  
  JButton darkOrangeButton = new JButton();
  // orange button
  darkOrangeButton.setBackground(new Color(206,112,11));
  darkOrangeButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.darkorange();
   }
  });
  
  JButton yellowButton = new JButton();
  // blue button
  yellowButton.setBackground(Color.yellow);
  yellowButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.yellow();
   }
  });
  
  JButton cyanButton = new JButton();
  // cyan button
  cyanButton.setBackground(Color.cyan);
  cyanButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.cyan();
   }
  });
  
  JButton pinkButton = new JButton();
  // pink button
  pinkButton.setBackground(Color.pink);
  pinkButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.pink();
   }
  });
  
  JButton lightPinkButton = new JButton();
  // pink button
  lightPinkButton.setBackground(new Color(255,204,229));
  lightPinkButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.lightpink();
   }
  });

  // ////////////////size setter///////////////////////

  JButton one = new JButton("1");
  // size 5 button
  one.setFocusPainted(false);
  one.setBackground(new Color(0,201,87));
  one.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.oneset();
   }
  });

  JButton two = new JButton("2");
  // size 5 button
  two.setFocusPainted(false);
  two.setBackground(new Color(0,201,87));
  two.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.twoset();
   }
  });

  JButton three = new JButton("3");
  // size 5 button
  three.setFocusPainted(false);
  three.setBackground(new Color(0,201,87));
  three.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.threeset();
   }
  });

  JButton four = new JButton("4");
  // size 5 button
  four.setFocusPainted(false);
  four.setBackground(new Color(0,201,87));
  four.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fourset();
   }
  });

  JButton five = new JButton("5");
  // size 5 button
  five.setFocusPainted(false);
  five.setBackground(new Color(0,201,87));
  five.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fiveset();
   }
  });

  JButton six = new JButton("6");
  // size 6 button
  six.setFocusPainted(false);
  six.setBackground(new Color(0,201,87));
  six.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.sixset();
   }
  });
  
  JButton seven = new JButton("7");
  // size 7 button
  seven.setFocusPainted(false);
  seven.setBackground(new Color(0,201,87));
  seven.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.sevenset();
   }
  });
  
  JButton eight = new JButton("8");
  // size 8 button
  eight.setFocusPainted(false);
  eight.setBackground(new Color(0,201,87));
  eight.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.eightset();
   }
  });
  
  JButton nine = new JButton("9");
  // size 8 button
  nine.setFocusPainted(false);
  nine.setBackground(new Color(0,201,87));
  nine.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.nineset();
   }
  });
  
  JButton ten = new JButton("10");
  // size 8 button
  ten.setFocusPainted(false);
  ten.setBackground(new Color(255,185,15));
  ten.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.tenset();
   }
  });
  JButton twelve = new JButton("12");
  // size 8 button
  twelve.setFocusPainted(false);
  twelve.setBackground(new Color(255,185,15));
  twelve.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.twelveset();
   }
  });
  
  JButton fourteen = new JButton("14");
  // size 8 button
  fourteen.setFocusPainted(false);
  fourteen.setBackground(new Color(255,185,15));
  fourteen.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fourteenset();
   }
  });
  
  JButton sixteen = new JButton("16");
  // size 8 button
  sixteen.setFocusPainted(false);
  sixteen.setBackground(new Color(255,185,15));
  sixteen.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.sixteenset();
   }
  });
  
  JButton eightteen = new JButton("18");
  // size 8 button
  eightteen.setFocusPainted(false);
  eightteen.setBackground(new Color(255,185,15));
  eightteen.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.eightteenset();
   }
  });
  
  JButton twenty = new JButton("20");
  twenty.setFocusPainted(false);
  twenty.setBackground(new Color(238,59,59));
  twenty.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.twentyset();
   }
  });
  
  JButton twentytwo = new JButton("22");
  twentytwo.setFocusPainted(false);
  twentytwo.setBackground(new Color(238,59,59));
  twentytwo.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.twentytwoset();
   }
  });
  
  JButton twentyfour = new JButton("24");
  twentyfour.setFocusPainted(false);
  twentyfour.setBackground(new Color(238,59,59));
  twentyfour.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.twentyfourset();
   }
  });
  
  JButton twentysix = new JButton("26");
  twentysix.setFocusPainted(false);
  twentysix.setBackground(new Color(238,59,59));
  twentysix.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.twentysixset();
   }
  });
  
  JButton twentyeight = new JButton("28");
  twentyeight.setFocusPainted(false);
  twentyeight.setBackground(new Color(238,59,59));
  twentyeight.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.twentyeightset();
   }
  });
  
  JButton thirty = new JButton("30");
  thirty.setFocusPainted(false);
  thirty.setBackground(new Color(238,59,59));
  thirty.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.thirtyset();
   }
  });


  // ///////////////////fill setter/////////////////////

  JButton fillBlack = new JButton();
  fillBlack.setBackground(Color.black);
  fillBlack.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillBlack();
   }
  });

  JButton fillMagenta = new JButton();
  fillMagenta.setBackground(Color.magenta);
  fillMagenta.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillMagenta();
   }
  });

  JButton fillRed = new JButton();
  fillRed.setBackground(Color.red);
  fillRed.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillRed();
   }
  });

  JButton fillBlue = new JButton();
  fillBlue.setBackground(Color.blue);
  fillBlue.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillBlue();
   }
  });

  JButton fillGreen = new JButton();
  fillGreen.setBackground(Color.green);
  fillGreen.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillGreen();
   }
  });

  JButton fillOrange = new JButton();
  fillOrange.setBackground(Color.orange);
  fillOrange.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillOrange();
   }
  });
  
  JButton fillYellow = new JButton();
  fillYellow.setBackground(Color.yellow);
  fillYellow.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillYellow();
   }
  });
  
  JButton fillCyan = new JButton();
  fillCyan.setBackground(Color.cyan);
  fillCyan.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillCyan();
   }
  });
  
  JButton fillPink = new JButton();
  fillPink.setBackground(Color.pink);
  fillPink.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    drawPad.fillPink();
   }
  });
  
  
  /////////////////screenshot/////
 
  

  // //////////////////////////setter end///////////////////////

  JLabel colourSign = new JLabel("Color:");
  JLabel sizeSign = new JLabel("Brush/Rubber Size:");
  sizeSign.setForeground(Color.black);
  JLabel fillSign = new JLabel("Fill:");
  JLabel spacer = new JLabel("  ");
  JLabel spacertwo = new JLabel("  ");
  
  colourSign.setPreferredSize(new Dimension(70, 22));
  blackButton.setPreferredSize(new Dimension(34, 30));
  greyButton.setPreferredSize(new Dimension(34, 30));
  lightGreyButton.setPreferredSize(new Dimension(34, 30));
  magentaButton.setPreferredSize(new Dimension(34, 30));
  darkRedButton.setPreferredSize(new Dimension(34, 30));
  redButton.setPreferredSize(new Dimension(34, 30));
  lightRedButton.setPreferredSize(new Dimension(34, 30));
  blueButton.setPreferredSize(new Dimension(34, 30));
  midBlueButton.setPreferredSize(new Dimension(34, 30));
  darkGreenButton.setPreferredSize(new Dimension(34, 30));
  greenButton.setPreferredSize(new Dimension(34, 30));
  greenButtonTwo.setPreferredSize(new Dimension(34, 30));
  darkOrangeButton.setPreferredSize(new Dimension(34, 30));
  midOrangeButton.setPreferredSize(new Dimension(34, 30));
  orangeButton.setPreferredSize(new Dimension(34, 30));
  yellowButton.setPreferredSize(new Dimension(34, 30));
  cyanButton.setPreferredSize(new Dimension(34, 30));
  pinkButton.setPreferredSize(new Dimension(34, 30));
  lightPinkButton.setPreferredSize(new Dimension(34, 30));

  sizeSign.setPreferredSize(new Dimension(120, 18));
  one.setPreferredSize(new Dimension(50, 18));
  two.setPreferredSize(new Dimension(50, 18));
  three.setPreferredSize(new Dimension(50, 18));
  four.setPreferredSize(new Dimension(50, 18));
  five.setPreferredSize(new Dimension(50, 18));
  six.setPreferredSize(new Dimension(50, 18));
  seven.setPreferredSize(new Dimension(50, 18));
  eight.setPreferredSize(new Dimension(50, 18));
  nine.setPreferredSize(new Dimension(50, 18));
  ten.setPreferredSize(new Dimension(50, 18));
  twelve.setPreferredSize(new Dimension(50, 18));
  fourteen.setPreferredSize(new Dimension(50, 18));
  eightteen.setPreferredSize(new Dimension(50, 18));
  sixteen.setPreferredSize(new Dimension(50, 18));
  twenty.setPreferredSize(new Dimension(50, 18));
  twentytwo.setPreferredSize(new Dimension(50, 18));
  twentyfour.setPreferredSize(new Dimension(50, 18));
  twentysix.setPreferredSize(new Dimension(50, 18));
  twentyeight.setPreferredSize(new Dimension(50, 18));
  thirty.setPreferredSize(new Dimension(50, 18));

  fillSign.setPreferredSize(new Dimension(70, 18));
  fillBlack.setPreferredSize(new Dimension(34, 30));
  fillMagenta.setPreferredSize(new Dimension(34, 30));
  fillRed.setPreferredSize(new Dimension(34, 30));
  fillBlue.setPreferredSize(new Dimension(34, 30));
  fillGreen.setPreferredSize(new Dimension(34, 30));
  fillOrange.setPreferredSize(new Dimension(34, 30));
  fillYellow.setPreferredSize(new Dimension(34, 30));
  fillCyan.setPreferredSize(new Dimension(34, 30));
  fillPink.setPreferredSize(new Dimension(34, 30));


  Rubber.setPreferredSize(new Dimension(78, 50));
  clearButton.setPreferredSize(new Dimension(78, 50));
  spacer.setPreferredSize(new Dimension(17, 18));
  spacertwo.setPreferredSize(new Dimension(70, 18));
  // sets the sizes of the buttons

  panel.add(clearButton);
  panel.add(Rubber);
  panel.add(colourSign);
  panel.add(blackButton);
  panel.add(greyButton);
  panel.add(lightGreyButton);
  //panel.add(yellowButton);
  panel.add(darkGreenButton);
  panel.add(greenButton);
  panel.add(greenButtonTwo);
  panel.add(blueButton);
  panel.add(midBlueButton);
  panel.add(cyanButton);
  panel.add(darkOrangeButton);
  panel.add(midOrangeButton);
  panel.add(orangeButton);
  panel.add(magentaButton);
  panel.add(pinkButton);
  panel.add(lightPinkButton);
  panel.add(darkRedButton);
  panel.add(redButton);
  panel.add(lightRedButton);
  //panel.add(yellowButton);

  panel.add(fillSign);
  panel.add(fillBlack);
  panel.add(fillMagenta);
  panel.add(fillRed);
  panel.add(fillBlue);
  panel.add(fillPink);
  panel.add(fillGreen);
  panel.add(fillOrange);
  //panel.add(fillYellow);
  panel.add(fillCyan);
  
  
  content.add(panel,BorderLayout.WEST);
   
  
  /////////////////////top panel/////////////////////////////
 
   
  JPanel fourthpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));//------------------------------
     fourthpanel.setPreferredSize(new Dimension(40,28));
  fourthpanel.setMinimumSize(new Dimension(40, 28));
  fourthpanel.setMaximumSize(new Dimension(40, 28));
  fourthpanel.setBackground(Color.yellow);
 
  content.add(fourthpanel, BorderLayout.NORTH);
  
  fourthpanel.add(sizeSign);
  fourthpanel.add(one);
  fourthpanel.add(two);
  fourthpanel.add(three);
  fourthpanel.add(four);
  fourthpanel.add(five);
  fourthpanel.add(six);
  fourthpanel.add(seven);
  fourthpanel.add(eight);
  fourthpanel.add(nine);
  fourthpanel.add(ten);
  fourthpanel.add(twelve);
  fourthpanel.add(fourteen);
  fourthpanel.add(sixteen);
  fourthpanel.add(eightteen);
  fourthpanel.add(twenty);
  fourthpanel.add(twentytwo);
  fourthpanel.add(twentyfour);
  fourthpanel.add(twentysix);
  fourthpanel.add(twentyeight);
  fourthpanel.add(thirty);
  
 
  
  ////////////////end//////////
  
  frame.setSize(5000,5000);
  // sets the size of the frame
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  // makes it so you can close
  frame.setVisible(true);
  // makes it so you can see it
  frame.setResizable(true);
  frame.setLocationRelativeTo(null);
  
     }
     

}


class PadDraw extends JComponent{
 Image image;
 Graphics2D graphics2D;
 int currentX, currentY, oldX, oldY;

 public PadDraw(){
  setDoubleBuffered(false);
  addMouseListener(new MouseAdapter(){
   public void mousePressed(MouseEvent e){
    oldX = e.getX();
    oldY = e.getY();
   }
  });

  addMouseMotionListener(new MouseMotionAdapter(){
   public void mouseDragged(MouseEvent e){
    currentX = e.getX();
    currentY = e.getY();
    if(graphics2D != null)
    graphics2D.drawLine(oldX, oldY, currentX, currentY);
    repaint();
    oldX = currentX;
    oldY = currentY;
   }

  });
  
  
 }


 public void paintComponent(Graphics g){
  if(image == null){
   image = createImage(getSize().width, getSize().height);
   graphics2D = (Graphics2D)image.getGraphics();
   graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
   clear();

  }
  g.drawImage(image, 0, 0, null);
 }
 

 //////////////////brush colors///////////////////////////
 
 public void clear(){
  graphics2D.setPaint(Color.white);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  graphics2D.setPaint(Color.black);
  repaint();
 }
 

 
 public void Rubber(){
  graphics2D.setPaint(Color.white);
  graphics2D.setStroke(new BasicStroke(60));
  repaint();
 }
 
 public void red(){
  graphics2D.setPaint(Color.red);
  repaint();
 }
 
 public void darkred(){
  graphics2D.setPaint(new Color(176,23,31));
  repaint();
 }
 
 public void lightred(){
  graphics2D.setPaint(new Color(238,99,99));
  repaint();
 }
 //this is the red paint
 public void black(){
  graphics2D.setPaint(Color.black);
  repaint();
 }
 //black paint
 public void grey(){
  graphics2D.setPaint(new Color(139,137,137));
  repaint();
 }
 
 public void lightgrey(){
  graphics2D.setPaint(new Color(205,201,201));
  repaint();
 }
 public void magenta(){
  graphics2D.setPaint(Color.magenta);
  repaint();
 }
 //magenta paint
 public void blue(){
  graphics2D.setPaint(Color.blue);
  repaint();
 }
 
 public void midblue(){
  graphics2D.setPaint(new Color(49,132,226));
  repaint();
 }
 //blue paint
 public void darkgreen(){
  graphics2D.setPaint(new Color(36,158,6));
  repaint();
 }
 public void secondgreen(){
  graphics2D.setPaint(new Color(170,255,130));
  repaint();
 }
 //green paint
 public void green(){
  graphics2D.setPaint(Color.green);
  repaint();
 }
 //green paint
 
 public void orange(){
  graphics2D.setPaint(Color.orange);
  repaint();
 }
 
 public void midorange(){
  graphics2D.setPaint(new Color(248,148,21));
  repaint();
 }
 
 public void darkorange(){
  graphics2D.setPaint(new Color(206,112,11));
  repaint();
 }
 
 public void yellow(){
  graphics2D.setPaint(Color.yellow);
  repaint();
 }
 
 public void cyan(){
  graphics2D.setPaint(Color.cyan);
  repaint();
 }
 
 public void pink(){
  graphics2D.setPaint(Color.pink);
  repaint();
 }
 
 public void lightpink(){
  graphics2D.setPaint(new Color(255,204,229));
  repaint();
 }
 
 
 /////////////////////////////////////brush size/////////////////////////////
 
 
 public void oneset(){
  graphics2D.setStroke(new BasicStroke(1));
  repaint();
 }
 //size 1 brush
 
 public void twoset(){
  graphics2D.setStroke(new BasicStroke(2));
  repaint();
 }
 //size 2 brush
 
 public void threeset(){
  graphics2D.setStroke(new BasicStroke(3));
  repaint();
 }
 //size 3 brush
 
 public void fourset(){
  graphics2D.setStroke(new BasicStroke(4));
  repaint();
 }
 //size 4 brush
 
 public void fiveset(){
  graphics2D.setStroke(new BasicStroke(5));
  repaint();
 }
 //size 5 brush
 
 public void sixset(){
  graphics2D.setStroke(new BasicStroke(6));
  repaint();
 }
 //size 6 brush
 
 public void sevenset(){
  graphics2D.setStroke(new BasicStroke(7));
  repaint();
 }
 //size 7 brush
 

 public void eightset(){
  graphics2D.setStroke(new BasicStroke(8));
  repaint();
 }
 //size 8 brush
 

 public void nineset(){
  graphics2D.setStroke(new BasicStroke(9));
  repaint();
 }
 //size 9 brush
 

 public void tenset(){
  graphics2D.setStroke(new BasicStroke(10));
  repaint();
 }
 //size 15 brush
 public void twelveset(){
  graphics2D.setStroke(new BasicStroke(12));
  repaint();
 }
 
 public void fourteenset(){
  graphics2D.setStroke(new BasicStroke(14));
  repaint();
 }
 
 public void sixteenset(){
  graphics2D.setStroke(new BasicStroke(16));
  repaint();
 }
 
 public void eightteenset(){
  graphics2D.setStroke(new BasicStroke(18));
  repaint();
 }
 
 public void twentyset(){
  graphics2D.setStroke(new BasicStroke(20));
  repaint();
 }
 
 public void twentytwoset(){
  graphics2D.setStroke(new BasicStroke(22));
  repaint();
 }
 
 public void twentyfourset(){
  graphics2D.setStroke(new BasicStroke(24));
  repaint();
 }
 
 public void twentysixset(){
  graphics2D.setStroke(new BasicStroke(26));
  repaint();
 }
 
 public void twentyeightset(){
  graphics2D.setStroke(new BasicStroke(28));
  repaint();
 }
 
 public void thirtyset(){
  graphics2D.setStroke(new BasicStroke(30));
  repaint();
 }
 

 
 
 ///////////////////////fill colours/////////////////////
 
 public void fillBlack(){
  graphics2D.setPaint(Color.black);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 
 public void fillMagenta(){
  graphics2D.setPaint(Color.magenta);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 public void fillRed(){
  graphics2D.setPaint(Color.red);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 public void fillBlue(){
  graphics2D.setPaint(Color.blue);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 public void fillGreen(){
  graphics2D.setPaint(Color.green);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 public void fillOrange(){
  graphics2D.setPaint(Color.orange);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 public void fillYellow(){
  graphics2D.setPaint(Color.yellow);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 
 public void fillCyan(){
  graphics2D.setPaint(Color.cyan);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }
 public void fillPink(){
  graphics2D.setPaint(Color.pink);
  graphics2D.fillRect(0, 0, getSize().width, getSize().height);
  repaint();
 }





}

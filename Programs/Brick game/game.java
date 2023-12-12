import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class game extends JFrame implements ActionListener, KeyListener {

    private Timer timer;
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private int paddleX = 310;
    private int ballPosX = 120;
    private int ballPosY = 350;
    private int ballXDir = -1;
    private int ballYDir = -2;
    private int brickWidth = 70;
    private int brickHeight = 30;
    private int brickRows = 3;
    private int brickCols = 7;
    private int delay = 8;

    private int[][] bricks;

    public game() {
        bricks = new int[brickRows][brickCols];
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                bricks[i][j] = 1;
            }
        }
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }
    public void paint(Graphics g) {
        // background
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);

        // drawing bricks
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                if (bricks[i][j] == 1) {
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }

        // drawing paddle
        g.setColor(Color.green);
        g.fillRect(paddleX, 550, 100, 8);

        // drawing ball
        g.setColor(Color.yellow);
        g.fillOval(ballPosX, ballPosY, 20, 20);

        // display score
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("Score: " + score, 590, 30);

        if (totalBricks <= 0) {
            play = false;
            ballXDir = 0;
            ballYDir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("You Won!", 260, 300);
        }

        if (ballPosY > 570) {
            play = false;
            ballXDir = 0;
            ballYDir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Game Over!", 260, 300);
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();

        if (play) {
            if (new Rectangle(ballPosX, ballPosY).intersects(new Rectangle(paddleX, 550))) {
                ballYDir = -ballYDir;
            }

            loop:
            for (int i = 0; i < brickRows; i++) {
                for (int j = 0; j < brickCols; j++) {
                    if (bricks[i][j] == 1) {
                        int brickX = j * brickWidth + 80;
                        int brickY = i * brickHeight + 50;
                        // int brickWidth = brickWidth;
                        // int brickHeight = brickHeight;

                        Rectangle brickRect = new Rectangle(brickX, brickY);
                        Rectangle ballRect = new Rectangle(ballPosX, ballPosY);

                        if (ballRect.intersects(brickRect)) {
                            bricks[i][j] = 0;
                            totalBricks--;
                            score += 5;

                            if (ballPosX + 19 <= brickRect.x || ballPosX + 1 >= brickRect.x + brickRect.width) {
                                ballXDir = -ballXDir;
                            } else {
                                ballYDir = -ballYDir;
                            }

                            break loop;
                        }
                    }
                }
            }
            ballPosX += ballXDir;
            ballPosY += ballYDir;

            if (ballPosX < 0) {
                ballXDir = -ballXDir;
            }
            if (ballPosY < 0) {
                ballYDir = -ballYDir;
            }
            if (ballPosX > 670) {
                ballXDir = -ballXDir;
            }
        }

        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (paddleX >= 600) {
                paddleX = 600;
            } else {
                moveRight();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (paddleX < 10) {
                paddleX = 10;
            } else {
                moveLeft();
            }
        }
    }

    private void moveRight() {
        play = true;
        paddleX += 20;
    }
    private void moveLeft() {
        play = true;
        paddleX -= 20;
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        game game = new game();
        game.setSize(700, 600);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setResizable(false);
        game.setVisible(true);
    }
}
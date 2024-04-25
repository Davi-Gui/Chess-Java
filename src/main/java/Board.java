import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Board {

    JFrame board = new JFrame(); // Creation of the board

    private void boardLayout() {

        board.setTitle("Chess Game"); // Sets title
        board.setSize(512, 549); // Sets x-dimension and y-dimension sizes (considering the window decoration)
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
        board.setResizable(false); // Prevent the window from being resized
        board.setLayout(null);
        board.getContentPane().setBackground(new Color(0xFFFFFF)); // Change background color
        board.setVisible(true); // Make board visible
    }

    private void squareCreation() {
        for (int y = 0; y < 512; y = y + 128) {

            for (int x = 0; x < 512; x = x + 128) {

                JPanel blackSquare = new JPanel();

                blackSquare.setBackground(Color.BLACK); // Create the black squares
                blackSquare.setBounds(x, y, 64, 64); // Sets square's coordinates and size
                board.add(blackSquare);
            }
        }

        for (int y = 64; y < 512; y = y + 128) {

            for (int x = 64; x < 512; x = x + 128) {

                JPanel blackSquare = new JPanel();

                blackSquare.setBackground(Color.BLACK); // Create the black squares
                blackSquare.setBounds(x, y, 64, 64); // Sets square's coordinates and size
                board.add(blackSquare);
            }
        }
    }

    public void display() {
        boardLayout();
        squareCreation();
    }

}

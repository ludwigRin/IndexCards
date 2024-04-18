import javax.swing.JFrame;

public class MainWindow {

    private JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("IndexCards");
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }



    
}

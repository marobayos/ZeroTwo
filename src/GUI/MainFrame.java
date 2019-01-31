package GUI;

import javax.swing.*;

public class MainFrame{
    private JPanel panel1 ;
    private JButton rightButton ;
    private JButton backButton ;
    private JButton leftButton ;
    private JButton frontButton;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        System.out.println("hello");
        JFrame frame = new JFrame();

        frame.setSize(400, 400);
        panel1 = new JPanel();
        frame.add(panel1);
        rightButton = newB();
        leftButton = newB();
        frontButton = newB();
        backButton = newB();
        System.out.println("bye");
        frame.setVisible(true);
    }

    private JButton newB(){
        JButton button = new JButton();
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setSize(30, 30);
        return button;
    }
}

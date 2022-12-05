import java.io.*;
import javax.swing.*;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();


        JButton button = new JButton("Button");
        button.setBounds(150, 200, 200, 50);

        frame.add(button);
        frame.add(menuBar);
        frame.setJMenuBar(menuBar);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        menuBar.setVisible(true);

        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemCreate = new JMenuItem("Create");
        JMenuItem menuItemEdit = new JMenuItem("Edit");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuFile.add(menuItemCreate);
        menuFile.add(menuItemEdit);
        menuFile.add(menuItemExit);
        menuBar.add(menuFile);






    }
}

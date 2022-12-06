import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumnModel;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        Jframe();
    }
    static void Jframe() {
        //main page: currently only has the login option. trying to add image
        JFrame frame = new JFrame("Touch of Joyy");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBorder(new EmptyBorder(150, 10, 10, 10));

        JLabel label = new JLabel("Welcome to Touch of Joyy! Click the button to Login: ", JLabel.CENTER);
        JButton login = new JButton("Login");

        panel.add(label);
        panel.add(login);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        label.setFont(new Font("Monospaced", Font.BOLD, 15));
        login.setFont(new Font("Monospaced", Font.BOLD, 20));

        ImageIcon icon = new ImageIcon("imgs/toj.jpg"); //trying to create an icon as well
        frame.add(new JLabel(icon));

        login.addActionListener(e -> {
            frame.setVisible(false);
            loginPage();
        });
    }
    static void loginPage() {
        //users can login here. will add required boxes later and doesn't validate yet
        //can go back to the main page or launch
        JFrame frame = new JFrame("Please Login Here");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(Box.createRigidArea(new Dimension(0,50)));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));



        JLabel email = new JLabel("Username: ");
        JLabel password = new JLabel("Password: ");
        JButton launch = new JButton("Launch");
        JButton back = new JButton("Back");

        panel.add(email);
        JTextField emailText = new JTextField();
        panel.add(emailText);
        panel.add(password);
        JPasswordField passwordText= new JPasswordField("");
        panel.add(passwordText);
        panel.add(launch);
        panel.add(back);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        email.setFont(new Font("Monospaced", Font.PLAIN, 20));
        password.setFont(new Font("Monospaced", Font.PLAIN, 20));
        emailText.setFont(new Font("Monospaced", Font.PLAIN, 20));
        passwordText.setFont(new Font("Monospaced", Font.PLAIN, 20));
        launch.setFont(new Font("Monospaced", Font.BOLD, 25));
        back.setFont(new Font("Monospaced", Font.BOLD, 25));

        launch.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
        back.addActionListener(e -> {
            frame.setVisible(false);
            Jframe();
        });
    }
    static void table() {
        JFrame frame = new JFrame("Touch of Joyy");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        frame.setSize(500, 500);

        JButton staff = new JButton("View Staff");
        JButton client = new JButton("View Clients");
        JButton appoint = new JButton("View Appointments");
        JButton services = new JButton("View Services");
        JButton reviews = new JButton("View Reviews");
        JButton training = new JButton("View Trainings");


        panel.add(staff);
        panel.add(client);
        panel.add(appoint);
        panel.add(services);
        panel.add(reviews);
        panel.add(training);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        staff.setFont(new Font("Monospaced", Font.BOLD, 20));
        client.setFont(new Font("Monospaced", Font.BOLD, 20));
        appoint.setFont(new Font("Monospaced", Font.BOLD, 20));
        services.setFont(new Font("Monospaced", Font.BOLD, 20));
        reviews.setFont(new Font("Monospaced", Font.BOLD, 20));
        training.setFont(new Font("Monospaced", Font.BOLD, 20));

        staff.addActionListener(e -> {
            frame.setVisible(false);
            staffTable();
        });

        client.addActionListener(e -> {
            frame.setVisible(false);
            clientTable();
        });
        appoint.addActionListener(e -> {
            frame.setVisible(false);
            appointTable();
        });
        services.addActionListener(e -> {
            frame.setVisible(false);
            servicesTable();
        });
        reviews.addActionListener(e -> {
            frame.setVisible(false);
            reviews();
        });
        training.addActionListener(e -> {
            frame.setVisible(false);
            training();
        });

    }
    static void staffTable() {
        JFrame frame = new JFrame("Staff Table");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,2)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel update = new JLabel("Updated since 12/6/2022.",JLabel.CENTER);

       JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);
        frame.add(update);

        frame.setVisible(true);
        headerLabel.setText("Staff of Current Staff working at Touch of Joyy");

        String[] columnNames = {"First Name", "Last Name", "Phone Number", "StaffNo"};
        Object[][] data = {
                {"Joyce", "Olaniyi", "000-000-0000", 1},
                {"Worker", "#2", "000-000-0000", 2}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        panel.add(scrollPane);
        frame.add(back);
        table.setRowHeight(30);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }

    static void clientTable() {
        JFrame frame = new JFrame("Client Table");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,2)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel update = new JLabel("Updated since 12/6/2022.",JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);
        frame.add(update);

        frame.setVisible(true);
        headerLabel.setText("Existing Clients at Touch of Joyy");

        String[] columnNames = {"First Name", "Last Name", "Phone Number", "ClientNo"};
        Object[][] data = {
                {"Sarah", "Doe", "000-000-0000", 1 },
                {"Amy", "Patrick", "000-000-0000", 2},
                {"Gold", "Eve", "000-000-0000", 3}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        table.setRowHeight(30);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }

    static void appointTable() {
        JFrame frame = new JFrame("Appointments");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,2)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel update = new JLabel("Updated since 12/6/2022.",JLabel.CENTER);
        update.setSize(350,100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);
        frame.add(update);

        frame.setVisible(true);
        headerLabel.setText("Current Appointments for Touch of Joyy");

        String[] columnNames = {"Time", "Date", "Service Name", "ID"};
        Object[][] data = {
                {"08:00am", "12/03/2022", "Soft Glam", "12345"},
                {"09:00am", "12/12/2022", "Soft Glam", "00000"},
                {"02:00pm", "1/30/2023", "Soft Glam", "54321"}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }

    static void servicesTable() {
        JFrame frame = new JFrame("Services");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,2)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel update = new JLabel("Updated since 12/6/2022.",JLabel.CENTER);
        update.setSize(350,100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);
        frame.add(update);

        frame.setVisible(true);
        headerLabel.setText("Services Provided at Touch of Joyy");

        String[] columnNames = {"Products Needed", "Eligible Staff", "Cost"};
        Object[][] data = {
                {"Eyeliner, lip gloss, etc.", "Joyce", "$50"},
                {"Add", "other", "services", "here"}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }
    static void reviews() {
        JFrame frame = new JFrame("Reviews");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,2)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel update = new JLabel("Updated since 12/6/2022.",JLabel.CENTER);
        update.setSize(350,100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);
        frame.add(update);

        frame.setVisible(true);
        headerLabel.setText("Touch of Joyy Reviews");

        String[] columnNames = {"ID", "Rating", "Comments"};
        Object[][] data = {
                {"12345", "5/5", "Beautiful! Loved it"},
                {"0000", "5/5", "No comments."}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }

    static void training() {
        JFrame frame = new JFrame("Training");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,2)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel update = new JLabel("Updated since 12/6/2022.",JLabel.CENTER);
        update.setSize(350,100);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);
        frame.add(update);

        frame.setVisible(true);
        headerLabel.setText("For Staff: Complete your Trainings");

        String[] columnNames = {"Staff_ID", "Completion Date"};
        Object[][] data = {
                {"11111", "12/03/2022"},
                {"12121", "12/04/2022"}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }
}

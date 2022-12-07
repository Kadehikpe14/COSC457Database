import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        Jframe();
    }
    static void Jframe() {
        //main page
        JFrame frame = new JFrame("Touch of Joyy");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBorder(new EmptyBorder(150, 10, 10, 10));

        JLabel label = new JLabel("Welcome to Touch of Joyy! Click the button to Login: ", JLabel.CENTER);
        JButton login = new JButton("Login");
        JButton guest = new JButton("Continue as Guest");

        panel.add(label);
        panel.add(login);
        panel.add(guest);
        frame.add(panel);

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        label.setFont(new Font("Monospaced", Font.BOLD, 15));
        login.setFont(new Font("Monospaced", Font.BOLD, 20));

        login.addActionListener(e -> {
            frame.setVisible(false);
            loginPage();
        });
        guest.addActionListener(e -> {
            frame.setVisible(false);
            guest();
        });
    }
    static void loginPage() {
        //users can login here. will add required boxes later and doesn't validate yet
        JFrame frame = new JFrame("Please Login Here");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(100,10,800,10));


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
        back.setBackground(Color.lightGray);

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
        frame.setLayout(new GridLayout(4,1));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JButton logout= new JButton("Log Out");
        JLabel headerLabel = new JLabel("Staff of Current Staff working at Touch of Joyy", JLabel.CENTER);

       JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"S_ID","FName", "LName", "Phone", "Staffcol"};
        Object[][] data = {
                {12345,"Joyce", "Olaniyi", "4105647890", null},
                {54321,"John", "Smith", "4104104110", null}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        panel.add(scrollPane);
        frame.add(back);
        frame.add(logout);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
        logout.addActionListener(e -> {
            frame.setVisible(false);
            logout();
        });
    }
    static void clientTable() {
        JFrame frame = new JFrame("Client Table");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("Existing Clients at Touch of Joyy", JLabel.CENTER);

        JButton addClient = new JButton("Add");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"C_ID","FName", "LName", "Phone", "Clientcol"};
        Object[][] data = {
                {11111, "Jack", "Smith", "410124567", null },
                {22222, "Random","Name", "443337890", null},
                {null, null, null, null, null}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.add(addClient);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
        addClient.addActionListener(e -> {
            frame.setVisible(false);
            addClient();
        });
    }
    static void appointTable() {
        JFrame frame = new JFrame("Appointments");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("Current Appointments for Touch of Joyy", JLabel.CENTER);
        JButton addAppoint = new JButton("Add");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"C_ID","Time", "Date", "Service_Name", "S_ID"};
        Object[][] data = {
                {11111, "12:30","2022-12-22", "Babydoll Soft Glam", 12345},
                {22222, "13:00", "2022-12-22","Bratzdoll Full Glam", 54321}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.add(addAppoint);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
        addAppoint.addActionListener(e -> {
            frame.setVisible(false);
            addAppoint();
        });
    }
    static void servicesTable() {
        JFrame frame = new JFrame("Services");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("Services Provided at Touch of Joyy", JLabel.CENTER);
        JButton logout= new JButton("Log Out");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"ServName","Products Needed", "Eligible_Staff", "Cost"};
        Object[][] data = {
                {"Babydoll Soft Glam"," ", "Joyce", 75},
                {"Bratzdoll Full Glam"," ", "Joyce", 90},
                {"Marylin Soft Glam"," ", "Joyce", 65}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.add(logout);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
        logout.addActionListener(e -> {
            frame.setVisible(false);
            logout();
        });
    }
    static void reviews() {
        JFrame frame = new JFrame("Reviews");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("Touch of Joyy Reviews", JLabel.CENTER);
        JButton logout= new JButton("Log Out");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"Staff_ID", "Rating", "Comments", "Client_ID"};
        Object[][] data = {
                {12345, "100", "Awesome!", 11111},
                {null, "100", "Perfect!", null}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.add(logout);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
        logout.addActionListener(e -> {
            frame.setVisible(false);
            logout();
        });
    }
    static void training() {
        JFrame frame = new JFrame("Training");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("For Staff: Complete your Trainings", JLabel.CENTER);
        JButton logout= new JButton("Log Out");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"T_Name","Staff_ID", "Completion Date"};
        Object[][] data = {
                {"Eyeshadow",12345, "2022-07-23"},
                {"Rhinestones",12345, "2022-07-23"},
                {null,null, null}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.add(logout);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
        logout.addActionListener(e -> {
            frame.setVisible(false);
            logout();
        });
    }
    static void logout(){
        JFrame frame = new JFrame("Touch of Joyy Logout");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBorder(new EmptyBorder(150, 10, 10, 10));

        JLabel label = new JLabel("Thank you for checking out Touch of Joyy!", JLabel.CENTER);
        JButton exit = new JButton("Exit");

        panel.add(label);
        panel.add(exit);
        frame.add(panel);

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        label.setFont(new Font("Monospaced", Font.BOLD, 15));
        exit.setFont(new Font("Monospaced", Font.BOLD, 20));
        exit.setBackground(Color.lightGray);

        exit.addActionListener(e -> {
            frame.setVisible(false);
        });
    }
    static void addClient(){
        JFrame frame = new JFrame("Add a New Client");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(100,10,800,10));


        JLabel Fname = new JLabel("First Name: ");
        panel.add(Fname);
        JTextField fnameText = new JTextField();
        panel.add(fnameText);

        JLabel Lname = new JLabel("Last Name: ");
        panel.add(Lname);
        JTextField lnameText = new JTextField();
        panel.add(lnameText);

        JLabel number = new JLabel("Phone Number: ");
        panel.add(number);
        JTextField numberText = new JTextField();
        panel.add(numberText);

        JButton launch = new JButton("Add");
        panel.add(launch);
        JButton back = new JButton("Cancel");
        panel.add(back);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        back.setBackground(Color.lightGray);

        launch.addActionListener(e -> {
            frame.setVisible(false);
            table();
            JOptionPane.showMessageDialog(frame, "The client has been added.");
        });
        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }
    static void addAppoint(){
        JFrame frame = new JFrame("Create New Appointment");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(100,10,800,10));
//        JOptionPane type = new JOptionPane()


        JLabel Fname = new JLabel("Name: ");
        panel.add(Fname);
        JTextField fnameText = new JTextField();
        panel.add(fnameText);
        JLabel time = new JLabel("Time: ");
        panel.add(time);
        JTextField timeText = new JTextField();
        panel.add(timeText);
        JLabel service = new JLabel("Type of Service: ");
        panel.add(service);
        JTextField serviceText = new JTextField();
        panel.add(serviceText);
        JLabel pay = new JLabel("Pay Type: ");
        panel.add(pay);
        JTextField payText = new JTextField("$");
        panel.add(payText);

        JButton launch = new JButton("Add");
        panel.add(launch);
        JButton back = new JButton("Cancel");
        panel.add(back);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        back.setBackground(Color.lightGray);

        launch.addActionListener(e -> {
            frame.setVisible(false);
            table();
            JOptionPane.showMessageDialog(frame, "The appointment has been scheduled.");
        });
        back.addActionListener(e -> {
            frame.setVisible(false);
            table();
        });
    }
    static void guest(){
        //TODO make new guest pages, view only
        JFrame frame = new JFrame("Touch of Joyy");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        frame.setSize(500, 500);

        JButton staff = new JButton("Staff");
        JButton appoint = new JButton("Appointments");
        JButton services = new JButton("View Services");
        JButton reviews = new JButton("View Reviews");

        panel.add(staff);
        panel.add(appoint);
        panel.add(services);
        panel.add(reviews);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        staff.setFont(new Font("Monospaced", Font.BOLD, 20));
        appoint.setFont(new Font("Monospaced", Font.BOLD, 20));
        services.setFont(new Font("Monospaced", Font.BOLD, 20));
        reviews.setFont(new Font("Monospaced", Font.BOLD, 20));

        staff.addActionListener(e -> {
            frame.setVisible(false);
            guestStaff();
        });
        appoint.addActionListener(e -> {
            frame.setVisible(false);
            guestAppoint();
        });
        services.addActionListener(e -> {
            frame.setVisible(false);
            guestService();
        });
        reviews.addActionListener(e -> {
            frame.setVisible(false);
            guestReview();
        });
    }
    static void guestStaff(){
        JFrame frame = new JFrame("Staff at Touch of Joyy");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JButton logout= new JButton("Log Out");
        JLabel headerLabel = new JLabel("Staff of Current Staff working at Touch of Joyy", JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);

        frame.setVisible(true);

        String[] columnNames = {"S_ID","FName", "LName", "Phone", "Staffcol"};
        Object[][] data = {
                {12345,"Joyce", "Olaniyi", "4105647890", null},
                {54321,"John", "Smith", "4104104110", null}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        panel.add(scrollPane);
        frame.add(back);
        frame.add(logout);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            guest();
        });
        logout.addActionListener(e -> {
            frame.setVisible(false);
            logout();
        });
    }
    static void guestAppoint(){
        JFrame frame = new JFrame("Appointments");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1)); //hard-coded but can change
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("Current Appointments for Touch of Joyy", JLabel.CENTER);
        JButton addAppoint = new JButton("Add");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"C_ID","Time", "Date", "Service_Name", "S_ID"};
        Object[][] data = {
                {11111, "12:30","2022-12-22", "Babydoll Soft Glam", 12345},
                {22222, "13:00", "2022-12-22","Bratzdoll Full Glam", 54321}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.add(addAppoint);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            guest();
        });
        addAppoint.addActionListener(e -> {
            frame.setVisible(false);
            addAppoint();
        });
    }
    static void guestService(){
        JFrame frame = new JFrame("Services");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,1));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton back = new JButton("Back");
        JLabel headerLabel = new JLabel("Services Provided at Touch of Joyy", JLabel.CENTER);
        JButton logout= new JButton("Log Out");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        frame.add(headerLabel);
        frame.add(panel);


        frame.setVisible(true);

        String[] columnNames = {"ServName","Products Needed", "Eligible_Staff", "Cost"};
        Object[][] data = {
                {"Babydoll Soft Glam"," ", "Joyce", 75},
                {"Bratzdoll Full Glam"," ", "Joyce", 90},
                {"Marylin Soft Glam"," ", "Joyce", 65}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300, 300);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        frame.add(back);
        frame.add(logout);
        frame.setVisible(true);

        back.addActionListener(e -> {
            frame.setVisible(false);
            guest();
        });
        logout.addActionListener(e -> {
            frame.setVisible(false);
            logout();
        });
    }
    static void guestReview(){
        JFrame frame = new JFrame("Add Review");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(50,10,100,10));


        JLabel name = new JLabel("Name: ");
        panel.add(name);
        JTextField fnameText = new JTextField();
        panel.add(fnameText);

        JLabel rating = new JLabel("Rating(0-100): ");
        panel.add(rating);
        JTextField rate = new JTextField();
        panel.add(rate);

        JLabel comment = new JLabel("Comments: ");
        panel.add(comment);
        JTextField comments = new JTextField();
        panel.add(comments);

        JButton launch = new JButton("Add");
        panel.add(launch);
        JButton back = new JButton("Cancel");
        panel.add(back);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        back.setBackground(Color.lightGray);

        launch.addActionListener(e -> {
            frame.setVisible(false);
            guest();
            JOptionPane.showMessageDialog(frame, "Thank you for the feedback!");
        });
        back.addActionListener(e -> {
            frame.setVisible(false);
            guest();
        });
    }
}

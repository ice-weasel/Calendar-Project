import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;

class lessgo {
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JFrame f;
    JTextField tf;
    JPasswordField pf;
    JButton b1;
    JButton b2;
    JButton b3;
    lessgo(){
        f=new JFrame();
        //f.setBounds(400,400,1000,1000);
        f.setSize(600,700);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);
        

        l1=new JLabel("username");
        l1.setBounds(150, 200, 100, 30);
        l1.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l1.setForeground(Color.LIGHT_GRAY);
        f.add(l1);

        l4=new JLabel("incorrect username or password");
        l4.setBounds(150, 550, 300, 30);
        l4.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l4.setForeground(Color.LIGHT_GRAY);
        l4.setVisible(false);
        f.add(l4);


        
        tf=new JTextField();
        tf.setBounds(270,200,150,30);
        f.add(tf);

        pf=new JPasswordField();
        pf.setBounds(270,300,150,30);
        f.add(pf);

        l2=new JLabel("password");
        l2.setBounds(150,300,100,30);
        l2.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l2.setForeground(Color.LIGHT_GRAY);
        f.add(l2);

        l3=new JLabel("WELCOME TO OOTY");
        l3.setBounds(150,100,300,30);
        l3.setFont(new Font("Segoe Script", Font.PLAIN, 25)); 
        l3.setForeground(Color.LIGHT_GRAY);
        f.add(l3);
        
        b1=new JButton("login");
        b1.setBounds(250,400,80,30);
        b1.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String name=tf.getText();
                String pw=pf.getText();
                if(name.equals("user") && pw.equals("test")){
                    UI u = new UI();
                    u.frntEnd();
                    f.dispose();
                }
                else{
                    l4.setVisible(true);
                }
            }
        });
        //b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("create new account");
        b2.setBounds(190,450,200,30);
        b2.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        b2.addActionListener(new ActionListener(){
            @Override
            //shows error but the code still works
            public void actionPerformed(ActionEvent e) {
                create c=new create();

                }
        });
        f.add(b2);

        b3=new JButton("forgot password");
        b3.setBounds(190,500,200,30);
        b3.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        f.add(b3);
        b3.addActionListener(new ActionListener(){
            @Override
            //shows error but the code still works
            public void actionPerformed(ActionEvent e) {
                forget f=new forget();
                }
        });

        f.setVisible(true);
    }
}

class create implements ActionListener{
    JFrame f;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JButton b1;
    create(){
        //create s=new create();
        f=new JFrame();
        f.setSize(600,700);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);

        l1=new JLabel("username :");
        l1.setBounds(150, 200, 100, 30);
        l1.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l1.setForeground(Color.LIGHT_GRAY);
        f.add(l1);

        tf1=new JTextField();
        tf1.setBounds(300,200,150,30);
        f.add(tf1);

        l2=new JLabel("register number :");
        l2.setBounds(150, 250, 180, 30);
        l2.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l2.setForeground(Color.LIGHT_GRAY);
        f.add(l2);

        tf2=new JTextField();
        tf2.setBounds(300,250,150,30);
        f.add(tf2);

        l3=new JLabel("semester :");
        l3.setBounds(150, 300, 100, 30);
        l3.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l3.setForeground(Color.LIGHT_GRAY);
        f.add(l3);

        tf3=new JTextField();
        tf3.setBounds(300,300,150,30);
        f.add(tf3);

        

        b1=new JButton("next");
        b1.setBounds(220,400,120,30);
        b1.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        b1.addActionListener(this);
        f.add(b1);

        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
    forget r=new forget();
    f.dispose();
    }
}
class forget implements ActionListener{
    JFrame f;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JPasswordField pf1;
    JPasswordField pf2;
    JButton b1;
    forget(){
        f=new JFrame();
        f.setSize(600,700);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);

        l1=new JLabel("enter a password : ");
        l1.setBounds(100, 200, 250, 30);
        l1.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l1.setForeground(Color.LIGHT_GRAY);
        f.add(l1);

        l2=new JLabel("confirm password : ");
        l2.setBounds(100, 300, 250, 30);
        l2.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l2.setForeground(Color.LIGHT_GRAY);
        f.add(l2);

        l3=new JLabel();
        l3.setBounds(170, 450, 280, 30);
        l3.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        l3.setForeground(Color.LIGHT_GRAY);
        //l3.setVisible(false);
        f.add(l3);

        pf1=new JPasswordField();
        pf1.setBounds(320,200,150,30);
        pf1.setEchoChar('*');
        f.add(pf1);

        pf2=new JPasswordField();
        pf2.setBounds(320,300,150,30);
        pf2.setEchoChar('*');
        f.add(pf2);

        b1=new JButton("confirm");
        b1.setBounds(220,400,120,30);
        b1.setFont(new Font("Segoe Script", Font.PLAIN, 16)); 
        b1.addActionListener(this);
        f.add(b1);

        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (!(new String(pf1.getPassword()).equals(new String(pf2.getPassword())))){
            l3.setText("passwords do not match");
        }
        else{
            l3.setText("password set successfully");
            f.dispose();
        }
    }
}

class UI {
    void frntEnd() {
        JFrame jf = new JFrame("Calendar");
        jf.setBounds(400, 400, 1500, 1000);
        jf.setResizable(false);

        JPanel topLeftPanel = new JPanel();
        topLeftPanel.setBounds(0, 0, 200, 1000);
        topLeftPanel.setBackground(Color.GRAY);
        

        JPanel topRightPanel = new JPanel();
        topRightPanel.setBounds(150, 0, 1300, 200);
        topRightPanel.setBackground(new Color(51, 51, 51));
        

        /*JPanel middlePanel = new JPanel();
        middlePanel.setBounds(0, 150, 1500, 500);
        middlePanel.setBackground(Color.LIGHT_GRAY);
        */
        

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat date = new SimpleDateFormat("dd");
        SimpleDateFormat month = new SimpleDateFormat("MMMM");
        SimpleDateFormat year = new SimpleDateFormat("YYYY");
        String date1 = date.format(calendar.getTime());
        String month1 = month.format(calendar.getTime());
        String year1 = year.format(calendar.getTime());

        JLabel dateLabel = new JLabel(date1);
        dateLabel.setFont(new Font("Montserrat", Font.PLAIN, 18));
        topLeftPanel.add(dateLabel);

        JLabel monthLabel = new JLabel(month1);
        monthLabel.setFont(new Font("Montserrat", Font.PLAIN, 18));
        monthLabel.setFont(new Font("Normafixed",Font.BOLD,10));
        topLeftPanel.add(monthLabel);

        JLabel yearLabel = new JLabel(year1);
        yearLabel.setFont(new Font("Montserrat", Font.PLAIN, 18));
        topLeftPanel.add(yearLabel);

        JLabel nameLabel = new JLabel("Welcome, User");
        nameLabel.setFont(new Font("Normafixed", Font.BOLD, 30));
        nameLabel.setForeground(new Color(51, 153, 255));
       
        nameLabel.setBounds(370,100,300,50);
       // topRightPanel.add(nameLabel);
       jf.add(nameLabel);

       JLabel atlabel = new JLabel("Check your attendance here");
       atlabel.setBounds(650,350,250,40);
       atlabel.setFont(new Font("Jupiteroid",Font.PLAIN,18));
       atlabel.setForeground(Color.GREEN);
       jf.add(atlabel);

       JButton attendenceButton = new JButton("Attendence");
       
       attendenceButton.setBounds(900,350,200,40);
       attendenceButton.setFont(new Font("Jupiteroid", Font.PLAIN, 16));
       jf.add(attendenceButton);
       attendenceButton.addActionListener(new ActionListener()
       { 
           public void actionPerformed(ActionEvent e)
           {
               attend at = new attend();
               at.attend_UI();
           }
       });
      
       JLabel evlabel = new JLabel("Check today's events here");
       evlabel.setBounds(650,450,200,40);
       evlabel.setFont(new Font("Jupiteroid",Font.PLAIN,18));
       evlabel.setForeground(Color.GREEN);
       jf.add(evlabel);

        JButton eventsButton = new JButton("Today's Events");
        eventsButton.setBounds(900,450,200,40);
        eventsButton.setFont(new Font("Jupiteroid", Font.PLAIN, 16)); 
        //middlePanel.add(eventsButton);
        jf.add(eventsButton);
        eventsButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                DynamicList dl = new DynamicList();
                dl.addElement("PE Assign");
                dl.addElement("SE Assign");
                dl.addElement("Minor Assign");
            }
        });

       JLabel hlabel = new JLabel("Check Public Holidays here");
       hlabel.setBounds(650,550,200,40);
       hlabel.setFont(new Font("Jupiteroid",Font.PLAIN,18));
       hlabel.setForeground(Color.GREEN);
       jf.add(hlabel);

        JButton holidaysButton = new JButton("Holidays");
        holidaysButton.setBounds(900,550,150,40);
        holidaysButton.setFont(new Font("Jupiteroid", Font.PLAIN, 16));
        //middlePanel.add(holidaysButton);
        holidaysButton.addActionListener(new ActionListener()
       { 
           public void actionPerformed(ActionEvent e)
           {
               holidays h = new holidays();
           }
       });
        jf.add(holidaysButton);

        jf.add(topLeftPanel);
        jf.add(topRightPanel);
       // jf.add(middlePanel);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);
    }
}
class holidays{
    holidays(){
        JFrame frame = new JFrame("Holidays");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        String[] columnNames = {"Column 1", "Column 2", "Column 3","coloumn 4"};
        Object[][] data = {
            {"Sl.No","Holidays","day","date"},
            {"1","Mannam Jayanthi","Monday","02-01-2023"},
            {"2","Republic Day","Thursday",	"26-01-2023"},
            {"3","Sivarathri","Saturday",	"18-02-2023"},
            {"4",	"Maundy Thursday",	"Thursday","06-04-2023"},
            {"5",	"Good Friday","	Friday","	07-04-2023"},
            {"6	","Dr. B. R. Ambedkar Jayanthi","Friday",	"14-04-2023"},
            {"7","	Vishu","Saturday","	15-04-2023"},
            {"8", "Id-ul Fitr (Ramzan)","	Friday","	21-04-2023"},
            {"9",	"May Day","	Monday","	01-05-2023"},
            {"10",	"Id-ul-Ad’ha (Bakrid) ","	Wednesday	","28-06-2023"},
            {"11","	Karkkadaka Vaavu","	Monday","	17-07-2023"},
            {"12","	Muharram 	","Friday","	28-07-2023"},
            {"13","	Independence Day","	Tuesday	","15-08-2023"},
            {"14","	First Onam /Ayyankali Jayanthi	","Monday	","28-08-2023"},
            {"15","	Thiruvonam","	Tuesday	","29-08-2023"},
            {"16","	Third Onam	","Wednesday","	30-08-2023"},
            {"17","	Fourth Onam / Sree Narayana Guru Jayanthi	","Thursday	","31-08-2023"},
            {"18","	Sreekrishna Jayanthi","	Wednesday	","06-09-2023"},
            {"19","	Sree Narayana Guru Samadhi Day","	Friday","	22-09-2023"},
            {"20","	Milad-i-Sherif  (Birthday of Prophet Muhammed)","	Wednesday","	27-09-2023"},
            {"21","	Gandhi Jayanthi","	Monday","	02-10-2023"},
            {"22","	Mahanavami","	Monday","	23-10-2023"},
            {"23","	Vijayadasami","	Tuesday","	24-10-2023"},
            {"24","	Christmas	","Monday	","25-12-2023"}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);


        frame.setVisible(true);
    }
}
class attend
{
    void attend_UI()
    {
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        String[] columnNames = {"Column 1", "Column 2", "Column 3", "Column 4", "Column 5", "Column 6"};
        Object[][] data = {
            {"Sl.No", "Number of Attended Hour", "Total Hour", "Duty Leave Hours", "Attendance Percentage", "Attendance Percentage in Class"},
            {"1", "Skill Development Programme (SDP)", "Row 2 Column 3", "Row 2 Column 4", "Row 2 Column 5", "Row 2 Column 6"},
            {"2", "Professional Ethics (HS0U20A)", "Row 3 Column 3", "Row 3 Column 4", "Row 3 Column 5", "Row 3 Column 6"},
            {"3", "Sustainable Engineering (NC0U20A)", "Row 4 Column 3", "Row 4 Column 4", "Row 4 Column 5", "Row 4 Column 6"},
            {"4", "Discrete Mathematical Structures (MA0U20B)", "Row 5 Column 3", "Row 5 Column 4", "Row 5 Column 5", "Row 5 Column 6"},
            {"5", "Data Structures (CS1U20A)", "Row 6 Column 3", "Row 6 Column 4", "Row 6 Column 5", "Row 6 Column 6"},
            {"6", "Logic System Design (CS1U20B)", "Row 7 Column 3", "Row 7 Column 4", "Row 7 Column 5", "Row 7 Column 6"},
            {"7", "Object Oriented Programming using Java (CS1U20C)", "Row 8 Column 3", "Row 8 Column 4", "Row 8 Column 5", "Row 8 Column 6"},
            {"8", "Data Structures Lab (CS1U28A)", "Row 6 Column 3", "Row 6 Column 4", "Row 6 Column 5", "Row 6 Column 6"},
            {"9", "Object Oriented Programming Lab (in JAVA) (CS1U28B)", "Row 6 Column 3", "Row 6 Column 4", "Row 6 Column 5", "Row 6 Column 6"},
            {"10", "Electronic Circuits (EC Basket-I) (EC0M20A)", "Row 6 Column 3", "Row 6 Column 4", "Row 6 Column 5", "Row 6 Column 6"},
            
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}

class DynamicList {
    JFrame frame;
    JList<String> list;
    DefaultListModel<String> model;
    
    DynamicList() {
      frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setSize(800, 800);
  
      model = new DefaultListModel<>();
      list = new JList<>(model);
      list.setFont(new Font("Serif", Font.PLAIN, 30));
      
      JPanel listPanel = new JPanel();
      listPanel.setLayout(new BorderLayout());
      listPanel.add(new JScrollPane(list), BorderLayout.CENTER);
      
      frame.add(listPanel);
      
      frame.setVisible(true);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      
    }
    
    public void addElement(String element) {
      model.addElement(element);
    }
  }

/*class tEvents extends AbstractTableModel
{
    private final int ros;
    private final int cols;
    public tEvents(int ros, int cols) 
    {
        this.ros = ros;
        this.cols = cols; 
    }
    @Override
    public int getRowCount

}
*/

class loginpageultimate{
    public static void main(String args[]){
        lessgo l=new lessgo();
    }
}
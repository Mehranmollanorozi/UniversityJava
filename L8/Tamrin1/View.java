package tamrin1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    public static void main(String[] args) {
        Controller controller1=new Controller();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Model. window = new Model.View();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    Controller controller=new Controller();

    private JFrame frame;
    private JTextField txt_Name;
    private JTextField txt_Id;
    private JTextField txt_Family;
    private JTextField txt_Age;
    private JTextField txt_Father;
    private JTextField txt_Job;
    private JTextField txt_Address;
    private JTextField txt_Phone;
    public View() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setBounds(100, 100, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(10, 0, 1920, 1091);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(285, 333, 121, 78);
        panel.add(lblNewLabel);

        txt_Name = new JTextField();
        txt_Name.setBounds(435, 348, 475, 57);
        txt_Name.setFont(new Font("Tahoma", Font.PLAIN, 24));
        panel.add(txt_Name);
        txt_Name.setColumns(10);
        JLabel lblId = new JLabel("Id");
        lblId.setForeground(Color.WHITE);
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblId.setBounds(285, 232, 121, 78);
        panel.add(lblId);

        txt_Id = new JTextField();
        txt_Id.setColumns(10);
        txt_Id.setBounds(435, 247, 475, 57);
        txt_Id.setFont(new Font("Tahoma", Font.PLAIN, 24));
        panel.add(txt_Id);

        JLabel lblFamilyName = new JLabel("Family Name");
        lblFamilyName.setForeground(Color.WHITE);
        lblFamilyName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFamilyName.setBounds(285, 434, 121, 78);
        panel.add(lblFamilyName);
        txt_Family = new JTextField();
        txt_Family.setColumns(10);
        txt_Family.setBounds(435, 449, 475, 57);
        txt_Family.setFont(new Font("Tahoma", Font.PLAIN, 24));
        panel.add(txt_Family);

        JLabel lblAge = new JLabel("Age");
        lblAge.setForeground(Color.WHITE);
        lblAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAge.setBounds(285, 537, 121, 78);
        panel.add(lblAge);

        txt_Age = new JTextField();
        txt_Age.setColumns(10);
        txt_Age.setBounds(435, 552, 475, 57);
        txt_Age.setFont(new Font("Tahoma", Font.PLAIN, 24));
        panel.add(txt_Age);

        JLabel lblFatherName = new JLabel("Father Name");
        lblFatherName.setForeground(Color.WHITE);
        lblFatherName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFatherName.setBounds(1013, 232, 121, 78);
        panel.add(lblFatherName);
        txt_Father = new JTextField();
        txt_Father.setColumns(10);
        txt_Father.setBounds(1155, 247, 475, 57);
        txt_Father.setFont(new Font("Tahoma", Font.PLAIN, 24));
        panel.add(txt_Father);

        txt_Job = new JTextField();
        txt_Job.setColumns(10);
        txt_Job.setBounds(1155, 348, 475, 57);
        panel.add(txt_Job);

        JLabel lblJob = new JLabel("Job");
        lblJob.setForeground(Color.WHITE);
        lblJob.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblJob.setBounds(1013, 333, 121, 78);
        panel.add(lblJob);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setForeground(Color.WHITE);
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAddress.setBounds(1013, 434, 121, 78);
        panel.add(lblAddress);

        txt_Address = new JTextField();
        txt_Address.setColumns(10);
        txt_Address.setBounds(1155, 449, 475, 57);
        txt_Address.setFont(new Font("Tahoma", Font.PLAIN, 24));
        panel.add(txt_Address);

        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setForeground(Color.WHITE);
        lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPhone.setBounds(1013, 537, 121, 78);
        panel.add(lblPhone);

        txt_Phone = new JTextField();
        txt_Phone.setColumns(10);
        txt_Phone.setBounds(1155, 552, 475, 57);
        txt_Phone.setFont(new Font("Tahoma", Font.PLAIN, 24));
        panel.add(txt_Phone);

        JButton btn_Create = new JButton("Create");
        btn_Create.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btn_Create.setBounds(1463, 792, 167, 98);
        panel.add(btn_Create);
        btn_Create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setModelId(txt_Id.getText());
                controller.setModelName(txt_Name.getText());
                controller.setModelFamily(txt_Family.getText());
                controller.setModelAge(txt_Age.getText());
                controller.setModelFather(txt_Father.getText());
                controller.setModelJob(txt_Job.getText());
                controller.setModelAddress(txt_Address.getText());
                controller.setModelPhone(txt_Phone.getText());
                controller.Database();
                JLabel label1=new JLabel("Created!");
                label1.setFont(new Font("Toham",Font.PLAIN,22));
                label1.setBounds(1000,792,121,78);
                label1.setVisible(true);
                panel.add(label1);


            }
        });
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnCancel.setBounds(285, 792, 167, 98);
        panel.add(btnCancel);
    }
}

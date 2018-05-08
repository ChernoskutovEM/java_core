import javax.swing.*;
import java.awt.*;


public class MyWindow extends JFrame {
    private JTextField jtf;
    private JTextArea jta;

    public MyWindow() {
        super("My Chat Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(1000, 100, 350, 550);

        JMenuBar mainBar = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem mItemNew = new JMenuItem("New");
        JMenuItem mItemExit = new JMenuItem("Exit");
        setJMenuBar(mainBar);
        mainBar.add(mFile);
        mainBar.add(mEdit);
        mFile.add(mItemNew);
        mFile.addSeparator();
        mFile.add(mItemExit);
        mItemExit.addActionListener(e -> System.exit(0));

        setLayout(new BorderLayout());

        jta = new JTextArea();
        jta.setLineWrap(true);
        jta.setEditable(false);
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp, BorderLayout.CENTER);


        JPanel jp = new JPanel(new BorderLayout());
        add(jp, BorderLayout.SOUTH);
        jtf = new JTextField();
        JButton jb = new JButton("Send");
        jp.add(jtf, BorderLayout.CENTER);
        jtf.addActionListener(e -> sendMassage());
        jp.add(jb, BorderLayout.EAST);
        jb.addActionListener(e -> sendMassage());

        setVisible(true);
    }

    public void sendMassage(){
        jta.append(jtf.getText() + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}

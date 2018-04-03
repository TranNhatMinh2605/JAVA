
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author NhatMinh
 */
public class TongAB {
    Label lbA,lbB,lbC;
    TextField txtA,txtB,txtC;
    Button btnTong,btnHieu,btnTich,btnThuong;
    public TongAB(){
    Frame fr = new Frame("TongAB");
        fr.setSize(200,230);
        fr.setTitle("Tổng AB");
        fr.setLayout(new FlowLayout());
        lbA = new Label("Nhập vào A");
        fr.add(lbA);
        txtA = new TextField(20);
        fr.add(txtA);
        lbB = new Label("Nhập vào B");
        fr.add(lbB);
        txtB = new TextField(20);
        fr.add(txtB);
        btnTong = new Button("+");
        btnTong.addActionListener(new ListenTong());
        fr.add(btnTong);
        btnHieu= new Button("-");
        btnHieu.addActionListener(new ListenHieu());
        fr.add(btnHieu);
        btnTich= new Button("*");
        btnTich.addActionListener(new ListenTich());
        fr.add(btnTich);
        btnThuong= new Button("/");
        btnThuong.addActionListener(new ListenThuong());
        fr.add(btnThuong);
        lbC = new Label(" Kết Quả");
        fr.add(lbC);
        txtC = new TextField(20);
        fr.add(txtC);
        XuLyCuaSo BoLangNghe = new XuLyCuaSo();
        fr.addWindowListener(BoLangNghe);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        TongAB tinhtong = new TongAB();
    }
    class ListenTong implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a + b;
            txtC.setText(String.valueOf(kq));
        }
        
    }
    
    class ListenHieu implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a - b;
            txtC.setText(String.valueOf(kq));
        }
        
    }
    
    class ListenTich implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a * b;
            txtC.setText(String.valueOf(kq));
        }
        
    }
    
    class ListenThuong implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            float kq = a / b;
            txtC.setText(String.valueOf(kq));
        }
        
    }

    static class XuLyCuaSo implements WindowListener {
        

        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
   }
    
}


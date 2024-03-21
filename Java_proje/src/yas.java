/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 90553
 */
class yas {
    import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    String correctPassword = "123";
    int incorrectAttempts = 0;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        // ... (Önceki kodu buraya ekleyin)

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                checkPassword();
            }
        });
    }

    private void checkPassword() {
        String enteredPassword = pass.getText().trim();

        if (correctPassword.equals(enteredPassword)) {
            Home home = new Home();
            setVisible(false);
            home.setVisible(true);
        } else {
            incorrectAttempts++;

            if (incorrectAttempts < 3) {
                JOptionPane.showMessageDialog(null, "Şifreniz Hatalı, Lütfen Tekrar Deneyiniz!");
            } else {
                showForgotPasswordDialog();
            }
        }
    }

    private void showForgotPasswordDialog() {
        String phoneNumber = JOptionPane.showInputDialog(null, "Şifrenizi mi unuttunuz? Lütfen telefon numaranızı giriniz:");

        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            sendPasswordToPhoneNumber(phoneNumber);
        } else {
            JOptionPane.showMessageDialog(null, "Geçersiz telefon numarası.");
            System.exit(0); // Programı kapat
        }
    }

    private void sendPasswordToPhoneNumber(String phoneNumber) {
        // Burada gerçek bir telefon numarasına şifre gönderimi işlemleri yapılabilir.
        // Örneğin, SMS gönderme servisleri veya başka bir veritabanı sorgusu kullanılabilir.
        // Bu örnek sadece basit bir dialog penceresi gösterir.

        JOptionPane.showMessageDialog(null, "Şifreniz başarıyla telefon numaranıza gönderildi.");
        System.exit(0); // Programı kapat
    }

    public static void main(String args[]) {
        // ... (Önceki kodu buraya ekleyin)
    }

    // ... (Önceki kodu buraya ekleyin)
}
}

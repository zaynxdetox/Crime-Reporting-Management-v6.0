import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatbot extends javax.swing.JFrame {

public Chatbot() {
initComponents();
}

private void chatting() {
String userText = userInputField.getText();
displayMessage("You : " + userText);
new Thread(() -> {          //Thread.
String response = getChatBotResponse(userText);
displayMessage("Virtual Assistant : " + response);
}).start();
userInputField.setText("");
}
    
private void displayMessage(String message) {
SwingUtilities.invokeLater(() -> chatArea.append(message + "\n"));
}

private String getChatBotResponse(String message) {
if (message.equalsIgnoreCase("Hello")) {
return "Hello there! How Can I Help You Today. Select: \n "
+ "(1: Incident Report Help, 2: Emergency Reporting, 3: Report Logs)";} 
else if (message.equalsIgnoreCase("Hi")) {
return "Hi there! How Can I Help You Today. Select: \n "
+ "(1: Incident Report Help, 2: Emergency Reporting, 3: Report Logs)";
} else if (message.equalsIgnoreCase("1")) {
return "\n1.Go To Main Menu Page 1\n 2.Select Incident Reports\n 3.Add Details: Name,Victim, Crime\n"
+ "Anything Else I Can Help With? Select Key: \n" + "Or Type No thanks\n";
} else if (message.equalsIgnoreCase("2")) {
return "\n1.Go To Main Menu Page 1\n 2.Click Emergency Reporting\n 3.Add Details Faster With Quick Response\n"
+ "Anything Else I Can Help With? Select Key: \n" + "Or Type No thanks\n";
} else if (message.equalsIgnoreCase("3")) {
return "\n1.Go To Main Menu Page 1\n 2.Click Report Logs\n 3.View Details To Track Your Report.\n"
+ "Anything Else I Can Help With? Select Key: \n" + "Or Type No thanks\n";
} else if (message.equalsIgnoreCase("How are you?")) {
return "I'm just a chatbot, I don't have feelings.\n";
} else if (message.equalsIgnoreCase("Who are you?")) {
return "I'm the police force's virtual assistant. Feel free to ask for help\n";
} else if (message.equalsIgnoreCase("No thanks")) {
return "Thank You For Using Virtual Assistance! Have a great day!";
} else if (message.equalsIgnoreCase("Bye")) {
return "Goodbye!";
} else {
return "Sorry, I didn't understand that.";
  }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextArea();
        userInputField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Online Police Crime Reporting System™ ");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chatArea.setColumns(20);
        chatArea.setRows(5);
        jScrollPane1.setViewportView(chatArea);

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Emergency Contact : 15 | 115 | 911");

        jLabel4.setText("Created By Zayn Ul Abideen 33 ©");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton1))
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    chatting();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    MainMenuII mb = new MainMenuII();
    mb.setVisible(true);    
    dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
try {
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
} catch (Exception e) {
e.printStackTrace();
}
new Chatbot().setVisible(true);
    }
});
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField userInputField;
    // End of variables declaration//GEN-END:variables
}

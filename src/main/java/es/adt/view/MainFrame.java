package es.adt.view;

import es.adt.view.dialog.FemaleMaxEpisodesCountDialog;
import es.adt.view.dialog.ShowAliveAliensDialog;

import java.net.MalformedURLException;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aliveAliensButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        femaleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Ver aliens vivos:");

        aliveAliensButton.setText("Ver");
        aliveAliensButton.addActionListener(evt -> {
            try {
                aliveAliensButtonActionPerformed(evt);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        });

        jLabel2.setText("Ver personajes femeninos que han salido en ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setText("mayor numero de episodios:");

        femaleButton.setText("Ver");
        femaleButton.addActionListener(evt -> {
            try {
                femaleButtonActionPerformed(evt);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aliveAliensButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(femaleButton))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(aliveAliensButton))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(femaleButton))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }

    private void aliveAliensButtonActionPerformed(java.awt.event.ActionEvent evt) throws MalformedURLException {
        // TODO add your handling code here:
        ShowAliveAliensDialog showAliveAliensDialog = new ShowAliveAliensDialog(this, true);
        showAliveAliensDialog.setVisible(true);
    }

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) throws MalformedURLException {
        // TODO add your handling code here:
        FemaleMaxEpisodesCountDialog femaleMaxEpisodesCountDialog = new FemaleMaxEpisodesCountDialog(this, true);
        femaleMaxEpisodesCountDialog.setVisible(true);
    }


    private javax.swing.JButton aliveAliensButton;
    private javax.swing.JButton femaleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
}

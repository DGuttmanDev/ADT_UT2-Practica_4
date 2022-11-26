package es.adt.view.dialog;

import es.adt.business.model.Character;
import es.adt.business.service.FemaleCharacterService;

import javax.swing.*;
import java.net.MalformedURLException;

public class FemaleMaxEpisodesCountDialog extends javax.swing.JDialog {

    FemaleCharacterService fcs = new FemaleCharacterService();

    public FemaleMaxEpisodesCountDialog(java.awt.Frame parent, boolean modal) throws MalformedURLException {
        super(parent, modal);
        initComponents();

        Character character = fcs.getCharactersWithMaxEpisodes();

        DefaultListModel model = new DefaultListModel<>();

        for (String episodes: character.getEpisode()){
            model.addElement(episodes);
        }

        jList1.setModel(model);

        idLabel.setText(String.valueOf(character.getEpisode().size()));

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }

    private javax.swing.JLabel episodesCountLabel;
    private javax.swing.JLabel especieLabel;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreLabel;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PictureExplorer.gui;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import PictureExplorer.classLoader.JavaClassLoader;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Luk
 */
public final class GuiFrame extends javax.swing.JFrame {

    String picturePanelPath = "";
    String currentClickedPath = "";
    ArrayList<String> files;
    JLabel[] pics;
    ImageIcon imageIcon, newIcon;
    Image img, newimg;
    File[] filesList;

    /**
     * Creates new form GuiFrame
     */
    public GuiFrame() {
        initComponents();
        scanner();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picturePanel = new javax.swing.JPanel();
        effectsLabel = new javax.swing.JLabel();
        loadingLabel = new javax.swing.JLabel();
        explorerScrollPane = new javax.swing.JScrollPane();
        thumbsPanel = new javax.swing.JPanel();
        effectsComboBox = new javax.swing.JComboBox<>();
        effectButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Picture Explorer");

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        effectsLabel.setText("Status:");

        loadingLabel.setText(".");

        thumbsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thumbsPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout thumbsPanelLayout = new javax.swing.GroupLayout(thumbsPanel);
        thumbsPanel.setLayout(thumbsPanelLayout);
        thumbsPanelLayout.setHorizontalGroup(
            thumbsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        thumbsPanelLayout.setVerticalGroup(
            thumbsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        explorerScrollPane.setViewportView(thumbsPanel);

        effectsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Original", "Reverse", "Monochrome", "Rotate", "Blur" }));
        effectsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effectsComboBoxActionPerformed(evt);
            }
        });

        effectButton.setText("Apply");
        effectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effectButtonActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        result.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(effectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effectButton)
                    .addComponent(effectsLabel)
                    .addComponent(loadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(explorerScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(effectsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(effectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(effectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(explorerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thumbsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thumbsPanelMousePressed

    }//GEN-LAST:event_thumbsPanelMousePressed

    private void effectsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effectsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_effectsComboBoxActionPerformed

    private void effectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effectButtonActionPerformed

        int idx = effectsComboBox.getSelectedIndex();
        Thread t;
        JavaClassLoader javaClassLoader = new JavaClassLoader();
        loadingLabel.setText("<html><font color=red>loading effect...</font></html>");
        switch (idx) {
            case 0:
                fitToPicturePanel(currentClickedPath);
                loadingLabel.setText("<html><font color=green>loaded</font></html>");
                break;
            case 1:
                t = new Thread(() -> {
                    String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.InverseColors", "invertImage", currentClickedPath);
                    fitToPicturePanel(newPic);
                    loadingLabel.setText("<html><font color=green>loaded</font></html>");
                });
                t.start();
                break;
            case 2:
                t = new Thread(() -> {
                    String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.MonochromeColors", "monochromeImage", currentClickedPath);
                    fitToPicturePanel(newPic);
                    loadingLabel.setText("<html><font color=green>loaded</font></html>");
                });
                t.start();
                break;
            case 3:
                t = new Thread(() -> {
                    String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.RotateImage", "rotateImage", currentClickedPath);
                    fitToPicturePanel(newPic);
                    loadingLabel.setText("<html><font color=green>loaded</font></html>");
                });
                t.start();
                break;
            case 4:
                t = new Thread(() -> {
                    String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.BlurImage", "blurImage", currentClickedPath);
                    fitToPicturePanel(newPic);
                    loadingLabel.setText("<html><font color=green>loaded</font></html>");
                });
                t.start();
                break;

        }

    }//GEN-LAST:event_effectButtonActionPerformed

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
        String buff = "";
        TreePath folders = result.getAnchorSelectionPath();
        if (folders.getPathCount() > 0) {
            for (int i = 1; i < folders.getPathCount(); i++) {
                buff += folders.getPathComponent(i) + "\\";
            }
        } else {
            buff += folders.getPathComponent(0);
        }
        picturePanelPath = buff;
         Thread t = new Thread(() -> {
              loadingLabel.setText("<html><font color=red>loading thumbnails</font></html>");
                   loadThumbnails();
                    loadingLabel.setText("<html><font color=green>loaded</font></html>");
                });
                t.start();
         
    }//GEN-LAST:event_resultMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton effectButton;
    private javax.swing.JComboBox<String> effectsComboBox;
    private javax.swing.JLabel effectsLabel;
    private javax.swing.JScrollPane explorerScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JPanel picturePanel;
    private javax.swing.JTree result;
    private javax.swing.JPanel thumbsPanel;
    // End of variables declaration//GEN-END:variables

    private void fitToPicturePanel(String pic) {
        ImageIcon imageIcon = new ImageIcon(pic);
        Image img = imageIcon.getImage();
        Image newimg = img.getScaledInstance(picturePanel.getWidth(), picturePanel.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);

        JLabel imageLabel = new JLabel(newIcon);
        picturePanel.removeAll();
        picturePanel.setLayout(new java.awt.BorderLayout());
        picturePanel.add(imageLabel, BorderLayout.CENTER);
        picturePanel.validate();
    }

    private void loadThumbnails() {

        files = fileNames(picturePanelPath);
        pics = new JLabel[files.size()];

        for (int i = 0; i < files.size(); i++) {
            imageIcon = new ImageIcon(files.get(i));
            img = imageIcon.getImage();
            newimg = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
            newIcon = new ImageIcon(newimg);
            WeakReference sr = new WeakReference(new JLabel(newIcon));
            JLabel picLabel = (JLabel) sr.get();
            pics[i] = picLabel;
            pics[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    onMouseClicked(e);
                }
            });
        }
        thumbsPanel.removeAll();
        thumbsPanel.setLayout(new java.awt.FlowLayout());
        for (JLabel pic : pics) {
            thumbsPanel.add(pic);
        }
        explorerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        explorerScrollPane.repaint();
    }

    private void onMouseClicked(MouseEvent e) {
        for (int i = 0; i < files.size(); i++) {
            pics[i].setBorder(null);
            if (e.getSource() == pics[i]) {
                currentClickedPath = files.get(i);
                pics[i].setBorder(BorderFactory
                        .createLineBorder(Color.BLUE, 3));
                fitToPicturePanel(currentClickedPath);

            }
        }
    }

    private ArrayList<String> fileNames(String directoryPath) {

        File dir = new File(directoryPath);
        ArrayList<String> filesList = new ArrayList<>();
        if (dir.isDirectory()) {
            File[] listFiles = dir.listFiles();

            for (File file : listFiles) {
                if (file.isFile()) {
                    filesList.add(file.getPath());
                }
            }
        }

        return filesList;
    }

    public void displayDirectoryContents(File dir, DefaultMutableTreeNode root2) throws InterruptedException {
        DefaultMutableTreeNode newdir = new DefaultMutableTreeNode();
        filesList = dir.listFiles();
        for (File file : filesList) {
            if (file == null) {
                continue;
            }
            if (file.isDirectory()) {
                if (file.listFiles() == null) {
                    continue;
                }
                DefaultTreeModel model = (DefaultTreeModel) result.getModel();
                DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
                newdir = new DefaultMutableTreeNode(file.getName());
                root2.add(newdir);
                model.reload();
                displayDirectoryContents(file, newdir);
            }
        }
    }

    public void scanner() {
// creates a file with the location filename
        String location = "G:\\Lukasz\\Desktop\\PWR\\semestr_6\\java\\netbans\\PictureExplorer";
        File currentDir = new File(location);

        //result is the variable name for jtree
        DefaultTreeModel model = (DefaultTreeModel) result.getModel();
        //gets the root of the current model used only once at the starting
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        try {
            //function caled
            displayDirectoryContents(currentDir, root);
        } catch (InterruptedException ex) {
            Logger.getLogger(GuiFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

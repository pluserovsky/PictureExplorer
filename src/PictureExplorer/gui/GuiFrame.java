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
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Luk
 */
public class GuiFrame extends javax.swing.JFrame {

    String picturePanelPath = "resources\\cats\\kot2.jpg";
    String currentClickedPath = "";
    ArrayList<String> files;
    JLabel[] pics;
    ImageIcon imageIcon, newIcon;
    Image img, newimg;

    /**
     * Creates new form GuiFrame
     */
    public GuiFrame() {
        initComponents();

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
        reverseButton = new javax.swing.JButton();
        loadPicButton = new javax.swing.JButton();
        monochromeButton = new javax.swing.JButton();
        rotateButton = new javax.swing.JButton();
        blurButton = new javax.swing.JButton();
        effectsLabel = new javax.swing.JLabel();
        loadingLabel = new javax.swing.JLabel();
        explorerScrollPane = new javax.swing.JScrollPane();
        thumbsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        reverseButton.setText("Reverse");
        reverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseButtonActionPerformed(evt);
            }
        });

        loadPicButton.setText("Load pic");
        loadPicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPicButtonActionPerformed(evt);
            }
        });

        monochromeButton.setText("Monochrome");
        monochromeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monochromeButtonActionPerformed(evt);
            }
        });

        rotateButton.setText("Rotate");
        rotateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateButtonActionPerformed(evt);
            }
        });

        blurButton.setText("Blur");
        blurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blurButtonActionPerformed(evt);
            }
        });

        effectsLabel.setText("Effect status:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(effectsLabel)
                    .addComponent(reverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monochromeButton)
                    .addComponent(rotateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadPicButton)
                    .addComponent(loadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(explorerScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(effectsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reverseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(monochromeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blurButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadPicButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(188, 188, 188)
                .addComponent(explorerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadPicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadPicButtonActionPerformed
        loadThumbnails();
        fitToPicturePanel(picturePanelPath);
    }//GEN-LAST:event_loadPicButtonActionPerformed

    private void reverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseButtonActionPerformed
        Thread t = new Thread(() -> {
            loadingLabel.setText("loading...");
            JavaClassLoader javaClassLoader = new JavaClassLoader();
            String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.InverseColors", "invertImage", picturePanelPath);
            fitToPicturePanel(newPic);
            loadingLabel.setText("loaded");
        });
        t.start();
    }//GEN-LAST:event_reverseButtonActionPerformed

    private void monochromeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monochromeButtonActionPerformed
        Thread t = new Thread(() -> {
            loadingLabel.setText("loading...");
            JavaClassLoader javaClassLoader = new JavaClassLoader();
            String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.MonochromeColors", "monochromeImage", picturePanelPath);
            fitToPicturePanel(newPic);
            loadingLabel.setText("loaded");
        });
        t.start();
    }//GEN-LAST:event_monochromeButtonActionPerformed

    private void rotateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateButtonActionPerformed
        Thread t = new Thread(() -> {
            loadingLabel.setText("loading...");
            JavaClassLoader javaClassLoader = new JavaClassLoader();
            String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.RotateImage", "rotateImage", picturePanelPath);
            fitToPicturePanel(newPic);
            loadingLabel.setText("loaded");
        });
        t.start();
    }//GEN-LAST:event_rotateButtonActionPerformed

    private void blurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blurButtonActionPerformed
        Thread t = new Thread(() -> {
            loadingLabel.setText("loading...");
            JavaClassLoader javaClassLoader = new JavaClassLoader();
            String newPic = javaClassLoader.invokeClassMethod("PictureExplorer.plugins.BlurImage", "blurImage", picturePanelPath);
            fitToPicturePanel(newPic);
            loadingLabel.setText("loaded");
        });
        t.start();

    }//GEN-LAST:event_blurButtonActionPerformed

    private void thumbsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thumbsPanelMousePressed

    }//GEN-LAST:event_thumbsPanelMousePressed

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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JButton blurButton;
    private javax.swing.JLabel effectsLabel;
    private javax.swing.JScrollPane explorerScrollPane;
    private javax.swing.JButton loadPicButton;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JButton monochromeButton;
    private javax.swing.JPanel picturePanel;
    private javax.swing.JButton reverseButton;
    private javax.swing.JButton rotateButton;
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
        files = fileNames("resources\\cats\\");
        pics = new JLabel[files.size()];

        for (int i = 0; i < files.size(); i++) {
            imageIcon = new ImageIcon(files.get(i));
            img = imageIcon.getImage();
            newimg = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
            newIcon = new ImageIcon(newimg);
            SoftReference sr = new SoftReference(new JLabel(newIcon));
            JLabel picLabel = (JLabel)sr.get();
            pics[i] = picLabel;
            pics[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    onMouseClicked(e);
                }
            });
        }
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

            }
        }
    }

    private ArrayList<String> fileNames(String directoryPath) {

        File dir = new File(directoryPath);
        ArrayList<String> files = new ArrayList<>();

        if (dir.isDirectory()) {
            File[] listFiles = dir.listFiles();

            for (File file : listFiles) {
                if (file.isFile()) {
                    files.add(file.getPath());
                }
            }
        }

        return files;
    }

}

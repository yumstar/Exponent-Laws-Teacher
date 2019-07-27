 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentLaws;


import java.lang.*;
import org.apache.commons.io.FileUtils;
import java.io.*;
import java.awt.image.BufferedImage;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.charset.StandardCharsets;
import javax.swing.AbstractButton;





/**
 *
 * @author Abu
 */
public class exponentProgram extends javax.swing.JFrame {
// below  variables are created which when modified tell the components how to look
public int pageNumber = -1;
public int backNumber = -1;
public int mark = 0;
// arrayLists are created that hold the content that the expression area, explanation area, and title area are to display, the array is set up to match the page number
ArrayList <String> expressions = new ArrayList ();
ArrayList <String> explanations =  new ArrayList();
ArrayList <String> titles = new ArrayList();


 





    /**
     * Creates new form exponentProgram
     */
    public exponentProgram() throws FileNotFoundException {
        initComponents();
        // addding the content that must be displayed in to the arrayLists
        Collections.addAll(expressions,"{2^3}","\\frac{2^8}{2^6}=\\ \\textbf{?}","\\frac{256}{64}=\\ 4", "(2^2)(2^4)","(2\\times2)(2\\times2\\times2\\times2)", "2\\times2\\times2\\times2\\times2\\times2=\\ 64 ","2\\times2\\times2\\times2\\times2\\times2=\\ 2^6 ", " 2^{2+4}=\\ 2^6","\\frac{3^7}{3^3}","\\frac{2187}{27}=\\ 81=\\ 3^4 ","\\frac{3\\times3\\times3\\times3\\times3\\times3\\times3}{3\\times3\\times3}");
        Collections.addAll(expressions,"{3\\times3\\times3\\times3}","7-3","3^{7-3}=\\ 3^4","(2^2)^2","(4)^2", "4^2=\\ 16","(2\\times2)(2\\times2)","2\\times2\\times2\\times2=\\ 16","2^{2\\times2}=\\ 2^4=\\ 16", "3^4\\times2^4 \\neq 6^8 ","(3\\times2)^2","(3^2\\times2^2)=\\ 36", "36=\\ 6^2, 6=\\ 2\\times3","(\\frac{1}{2})^2","\\frac{1^2}{2^2}=\\ \\frac{1}{4}","\\frac{1}{2}\\times\\frac{1}{2}=\\ \\frac{1}{4}","\\frac{4}{4}");
        Collections.addAll(expressions,"\\frac{4}{4}=\\ 1, \\frac{2^2}{2^2}, 2^{2-2=\\ 0}, 2^0=\\ 1", " 5^{-4}","(\\frac{1}{2})^2=\\ \\frac{1}{2^2}","\\frac{2^0}{2^2}, 2^{0-2=\\ -2", " 2^{-2}=\\ \\frac{1}{2^2}","(\\frac{2}{3})^{-3}","(\\frac{2}{3})^{-3}=\\ (\\frac{3}{2})^{3}","(\\frac{2}{3^{-2}})^{-3} \\neq (\\frac{3^{2}}{2})^{3}, (\\frac{2}{3^{-2}})^{-3}=\\ (\\frac{3^{-2}}{2})^3", "13^{-5}\\times(\\frac {13^2}{13^8})^{-1}","13^{-5}\\times(13^{-6})^{-1}");
        Collections.addAll(expressions,"13^{-5}\\times13^{6}","13^{-5}\\times(\\frac {13^-2}{13^-8})","13^{-5}\\times13^{6}", "13^1=\\ 13", "4^2\\times4^5","\\frac {2^2}{2^1}","(2^8)^2", "5^{-4}","3^4+3^2","0^0");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\1.txt","src\\exponentLaws\\resources\\2.txt","src\\exponentLaws\\resources\\3.txt","src\\exponentLaws\\resources\\4.txt","src\\exponentLaws\\resources\\5.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\6.txt","src\\exponentLaws\\resources\\7.txt","src\\exponentLaws\\resources\\8.txt","src\\exponentLaws\\resources\\9.txt","src\\exponentLaws\\resources\\10.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\11.txt","src\\exponentLaws\\resources\\12.txt","src\\exponentLaws\\resources\\13.txt","src\\exponentLaws\\resources\\14.txt","src\\exponentLaws\\resources\\15.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\16.txt","src\\exponentLaws\\resources\\17.txt","src\\exponentLaws\\resources\\18.txt","src\\exponentLaws\\resources\\19.txt","src\\exponentLaws\\resources\\20.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\21.txt","src\\exponentLaws\\resources\\22.txt","src\\exponentLaws\\resources\\23.txt","src\\exponentLaws\\resources\\24.txt","src\\exponentLaws\\resources\\25.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\26.txt","src\\exponentLaws\\resources\\27.txt","src\\exponentLaws\\resources\\28.txt","src\\exponentLaws\\resources\\29.txt","src\\exponentLaws\\resources\\30.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\31.txt","src\\exponentLaws\\resources\\32.txt","src\\exponentLaws\\resources\\33.txt","src\\exponentLaws\\resources\\34.txt","src\\exponentLaws\\resources\\35.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\36.txt","src\\exponentLaws\\resources\\37.txt","src\\exponentLaws\\resources\\38.txt","src\\exponentLaws\\resources\\39.txt","src\\exponentLaws\\resources\\40.txt");
        Collections.addAll(explanations,"src\\exponentLaws\\resources\\41.txt","src\\exponentLaws\\resources\\42.txt", "src\\exponentLaws\\resources\\43.txt","src\\exponentLaws\\resources\\44.txt","src\\exponentLaws\\resources\\45.txt","src\\exponentLaws\\resources\\46.txt","src\\exponentLaws\\resources\\47.txt","src\\exponentLaws\\resources\\48.txt");
        Collections.addAll(titles, "Start", "Challenge", "Good job!", "Review","Repeated Multiplication!","Equals 64", "6th Power, Baby!","Product Law","Divided","AT1","The ExpAndables","Don't cross me!","You get what I mean?","Quotient Law","Endless Exponents","4 is a perfect square!", "Hmm....","Two more!", "Two many Twos","Power Law","Not done yet!","Brackets","36?", "2 and 3","Fraction power!"," A quarter left", "Almost there!", " I don't believe you.", "0 is 1");
        Collections.addAll(titles,"Terrifying", "Again?", " Do you see now?", "Negative Exponents", "One over", "Flipped","Flip me!","Let's go!");
        Collections.addAll(titles,"Go on!","Go on!","Go on!","Go on!","YAY!","Question 1","Question 2","Question 3","Question 4","QUIZ","The end! or is it?");
        // makess sure user cannot mess with window or see what they're not supposed to
        setResizable(false);
        backButton.setEnabled(false);
        marksLabel.setVisible(false);
        quizButton.setVisible(false);
        restartButton.setVisible(false);
        
        
    

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextButton = new javax.swing.JButton();
        expressionArea = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        answerInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        enterButton = new javax.swing.JButton();
        productButton = new javax.swing.JButton();
        quotientButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        marksLabel = new javax.swing.JLabel();
        quizButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        expressionArea.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        expressionArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expressionArea.setText("Expression Area-->");
        getContentPane().add(expressionArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 116));

        titleLabel.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        titleLabel.setText("WELCOME!");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        pageLabel.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        pageLabel.setText("PAGE:");
        getContentPane().add(pageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));
        getContentPane().add(answerInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 76, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Euphemia", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to the exponent law program! You can use this program and navigate it using the back and next button. For any questions asked  by the program, you can answer using the text field above. Other useful things to know is that the expression area up above will show the math expressions and the page # will be displayed in  the corner.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, 780, 153));

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 70, -1));

        productButton.setText("Product");
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });
        getContentPane().add(productButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        productButton.setVisible(false);

        quotientButton.setText("Quotient");
        quotientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quotientButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quotientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        quotientButton.setVisible(false);

        powerButton.setText("Power");
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(powerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));
        powerButton.setVisible(false);

        marksLabel.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        marksLabel.setText("Mark:");
        getContentPane().add(marksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 104, 170, 30));

        quizButton.setText("Restart Quiz");
        quizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quizButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        restartButton.setText("Restart Program");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(restartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
   
        // TODO add your handling code here:
        // changeGUI changes component to the next page
        // increases the backNumber allowing the user to go ahead again if they go back without havng the next button enabled again   
        changeGUI();
        backNumber++;
        // allows the user to go back once they reach page one, the first time they should be allowed
        if (pageNumber == 1){
            backButton.setEnabled(true);
        }
        // makes sure that the user should not be able to go forward initially when on the early pages
        if (backNumber == pageNumber && pageNumber < 2 ){
            nextButton.setEnabled(false);
        }
        else {
            nextButton.setEnabled(true);
        }
       
        // enables/disables the buttons for the simplifying expressions part
        if (pageNumber == 36 ){
            productButton.setVisible(true);
            productButton.setEnabled(false);
            quotientButton.setVisible(true);
            quotientButton.setEnabled(true);
            powerButton.setVisible(true);
            powerButton.setEnabled(true);
            quotientButton.setEnabled(true);
            enterButton.setEnabled(false);
            nextButton.setEnabled(false);
            backButton.setEnabled(false);
        }
        // enables/disables the buttons for the questions part
        if (pageNumber == 42){
            nextButton.setEnabled(false);
            enterButton.setEnabled(true);
        }
        

  
      
    }//GEN-LAST:event_nextButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        // goes back two pages then change guis making it actually 1 page back
        pageNumber-=2; 
        changeGUI();
                                        
        if (pageNumber == 0 ){
            backButton.setEnabled(false);
        }
                
    }//GEN-LAST:event_backButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
        // answer variable takes user answer from the input field
        // if statements check answer based on page number
      double answer = Double.parseDouble(answerInput.getText());
       if (pageNumber == 0){
            if (answer == 8){
                nextButton.setEnabled(true);
            }      
       }
       if (pageNumber == 1){
            if (answer == 4){
                nextButton.setEnabled(true);
            }
       }
    switch (pageNumber) {
        case 42:
            if (answer == 16384){
                mark++;
            }   changeGUI();
            break;
        case 43:
            if (answer == 2){
                mark++;
            }   changeGUI();
            break;
        case 44:
            if (answer == 65536){
                mark++;
            }   changeGUI();
            break;
        case 45:
            if (answer == 0.0016){
                mark++;
            }   changeGUI();
            break;
        case 46:
            if (answer == 90){
                mark++;
            }   changeGUI();
            marksLabel.setVisible(true);
            marksLabel.setText("Mark: " +Math.pow(mark, 2) + " / 25" );
            quizButton.setVisible(true);
            restartButton.setVisible(true);
            break;
        default:
            break;
    }
        
        
      
System.out.println(pageNumber);
                
       
    }//GEN-LAST:event_enterButtonActionPerformed

    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        // TODO add your handling code here:
       // changes expression to final simplified expression
        pageNumber = 40;
        
        changeGUI();
        productButton.setEnabled(false);
        nextButton.setEnabled(true);
        
    }//GEN-LAST:event_productButtonActionPerformed

    private void quotientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quotientButtonActionPerformed
        // TODO add your handling code here:
        // changes expression based on buttons pressed before
        if (pageNumber == 36){
            changeGUI();
            quotientButton.setEnabled(false);
        }
        if (pageNumber == 39){
            changeGUI();
            quotientButton.setEnabled(false);
            productButton.setEnabled(true);
        
        }
        
    }//GEN-LAST:event_quotientButtonActionPerformed

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed
        // TODO add your handling code here:
        // changes expression based on buttons pressed before
        if (pageNumber == 37){
            changeGUI();
            powerButton.setEnabled(false);
            productButton.setEnabled(true);
        }
        if (pageNumber == 36){
            pageNumber = 38;
            changeGUI();
            powerButton.setEnabled(false);
        }
       
    }//GEN-LAST:event_powerButtonActionPerformed

    private void quizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizButtonActionPerformed
        // TODO add your handling code here:
        //goes back to start of quiz and resets mark
        pageNumber = 41;
        mark = 0; 
        marksLabel.setVisible(false);
        quizButton.setVisible(false);
        restartButton.setVisible(false);
        changeGUI();
    }//GEN-LAST:event_quizButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        // TODO add your handling code here:
        // restarts from page 0 and fixes button
        
        for(int i=1; i<=48; i++){
              pageNumber--;
         }
        mark = 0;
        backNumber = 0;
        productButton.setVisible(false);
        powerButton.setVisible(false);
        quotientButton.setVisible(false);
        marksLabel.setVisible(false);
        quizButton.setVisible(false);
        restartButton.setVisible(false);
        changeGUI();
    }//GEN-LAST:event_restartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(exponentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exponentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exponentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exponentProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new exponentProgram().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(exponentProgram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerInput;
    private javax.swing.JButton backButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel expressionArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel marksLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton powerButton;
    private javax.swing.JButton productButton;
    private javax.swing.JButton quizButton;
    private javax.swing.JButton quotientButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
 private int changeGUI(){
     

    // changes page number, then creates an icon for thr jlatexmath library to use
    // jlatex math reads the string data from the expressions arraylist and creates a formaula icon based on page number and displays it
    // the explanations are also taken from the arraylist from the files that contain them
    //the titles are is also taken from thr arraylist and displayed
    // the page label displays the value of the pageNumber for page numbering
    // makes sure certain buttons are set disabled on certain pages 
        expressionArea.setIcon(null);
        pageNumber++;
        String expression = expressions.get(pageNumber);
        String title = titles.get(pageNumber);
        TeXFormula formula = new TeXFormula(expression); 
        TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY,40);
        expressionArea.setIcon(icon);
        try {
        String text = FileUtils.readFileToString(new File(explanations.get(pageNumber)));
        System.out.println(text);
        jTextArea1.setText(text);       
    } catch (FileNotFoundException ex) {
        Logger.getLogger(exponentProgram.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(exponentProgram.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        titleLabel.setText(title);
        pageLabel.setText("PAGE: " + pageNumber);
        backButton.setEnabled(true);
        if (pageNumber == 0 ){
            backButton.setEnabled(false);
        }
        if (pageNumber >= 36){
            backButton.setEnabled(false);
        } 
        return pageNumber;
 }
}

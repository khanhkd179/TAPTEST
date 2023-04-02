/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Division;
import model.Subject;

/**
 *
 * @author Monkay
 */
public class MainView extends javax.swing.JFrame {

    List<Subject> subjectList;
    List<Division> divisionList;
    DefaultTableModel examineeTableModel;
    DefaultTableModel subjectTableModel;
    DefaultTableModel divisionTableModel;
    String[] divisionCodes;
    List<String> subjectCodeList;

    /**
     * Creates new form MainView
     */
    public MainView() {
        setTitle("TAPTEST");
        initComponents();
        initData();
        showExamineeTable();
        showSubjectTable();
        showDivisionTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examineeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        examineeAmountButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        addExamineeButton = new javax.swing.JButton();
        deleteExamineeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        addSubjectButton = new javax.swing.JButton();
        applySubjectButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        codeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteSubject = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        divisionTable = new javax.swing.JTable();
        addDivision = new javax.swing.JButton();
        applyDivisionButton = new javax.swing.JButton();
        deleteDivisionCode = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        examineeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != getColumnCount() - 1;
            }
        });
        jScrollPane1.setViewportView(examineeTable);

        jLabel1.setText("Number of examinees");

        examineeAmountButton.setText("OK");
        examineeAmountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examineeAmountButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resultLabel.setText("Number of passed examinees:");

        addExamineeButton.setText("Add");
        addExamineeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExamineeButtonActionPerformed(evt);
            }
        });

        deleteExamineeButton.setText("Delete");
        deleteExamineeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExamineeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(examineeAmountButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addExamineeButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteExamineeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resultLabel)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examineeAmountButton)
                    .addComponent(submitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLabel)
                    .addComponent(addExamineeButton)
                    .addComponent(deleteExamineeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Caculating", jPanel1);

        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(subjectTable);

        addSubjectButton.setText("Add Subject");
        addSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjectButtonActionPerformed(evt);
            }
        });

        applySubjectButton.setText("Apply");
        applySubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applySubjectButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Code");

        deleteSubject.setText("Delete");
        deleteSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(addSubjectButton)
                            .addGap(220, 220, 220)
                            .addComponent(deleteSubject)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(applySubjectButton)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSubjectButton)
                    .addComponent(applySubjectButton)
                    .addComponent(deleteSubject))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Subject", jPanel4);

        divisionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Pass Score", "Subject Code List"
            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return !((row == 0 && column != 2));
            }
        }
    );
    jScrollPane3.setViewportView(divisionTable);

    addDivision.setText("Add Division");
    addDivision.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addDivisionActionPerformed(evt);
        }
    });

    applyDivisionButton.setText("Apply");
    applyDivisionButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            applyDivisionButtonActionPerformed(evt);
        }
    });

    deleteDivisionCode.setText("Delete Division");
    deleteDivisionCode.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteDivisionCodeActionPerformed(evt);
        }
    });

    jLabel4.setForeground(new java.awt.Color(255, 0, 0));
    jLabel4.setText("*In Division Total, only score can be edited");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(addDivision)
                        .addGap(227, 227, 227)
                        .addComponent(deleteDivisionCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(applyDivisionButton)))
                .addComponent(jLabel4))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(5, 5, 5)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDivision)
                    .addComponent(deleteDivisionCode))
                .addComponent(applyDivisionButton))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPane3.addTab("Division", jPanel5);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane3)
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane3)
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jTabbedPane2.addTab("Condition Setting", jPanel2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void examineeAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examineeAmountButtonActionPerformed
        // TODO add your handling code here:
        try {
            removeTableRows(examineeTableModel);
            int newRowCount = Integer.parseInt(amountText.getText());
            JComboBox divisionCombo = new JComboBox<>(divisionCodes);
            examineeTable.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(divisionCombo));
            for (int i = 0; i < newRowCount; i++) {
                examineeTableModel.addRow(new Object[]{});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Entry 1 number!");
        }
    }//GEN-LAST:event_examineeAmountButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        int count = 0;
        Map<Subject, Integer> inputMap = new HashMap<>();
        System.out.println("Input:");
        for (int i = 0; i < examineeTable.getRowCount(); i++) {
            try{
                System.out.print(examineeTable.getValueAt(i, 0).toString());
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(rootPane, "Fill division in row " + (i + 1));
                return;
            }
            for (int j = 1; j < examineeTable.getColumnCount() - 1; j++) {
                try {
                    System.out.print(" " + Integer.parseInt(examineeTable.getValueAt(i, j).toString()));
                    inputMap.put(subjectList.get(j - 1), Integer.parseInt(examineeTable.getValueAt(i, j).toString()));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Entry number in column score in row " + (i + 1));
                    return;
                }
            }
            if (checkPass(examineeTable.getValueAt(i, 0).toString(), inputMap)) {
                count++;
                examineeTable.setValueAt(new String("Pass"), i, examineeTable.getColumnCount() - 1);
            } else {
                examineeTable.setValueAt(new String("Fail"), i, examineeTable.getColumnCount() - 1);
            }
            System.out.println("");
        }
        System.out.println("Output:\n" + count);
        resultLabel.setText("Number of passed examinees: " + count);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void addExamineeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExamineeButtonActionPerformed
        // TODO add your handling code here:
        JComboBox divisionCombo = new JComboBox<>(divisionCodes);
        examineeTable.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(divisionCombo));
        examineeTableModel.addRow(new Object[]{});
        amountText.setText(String.valueOf(examineeTable.getRowCount()));
    }//GEN-LAST:event_addExamineeButtonActionPerformed

    private void deleteExamineeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExamineeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = examineeTable.getSelectedRow();
        if (selectedRow != -1) {
            examineeTableModel.removeRow(selectedRow);
        }
        amountText.setText(String.valueOf(examineeTable.getRowCount()));
    }//GEN-LAST:event_deleteExamineeButtonActionPerformed

    private void addSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjectButtonActionPerformed
        // TODO add your handling code here:
        if (validateSubjectCode(codeText.getText()) && nameText.getText().trim().length() > 1) {
            subjectTableModel.addRow(new Object[]{nameText.getText(), codeText.getText()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Wrong format or Duplicated Code!");
        }
    }//GEN-LAST:event_addSubjectButtonActionPerformed

    private void applySubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applySubjectButtonActionPerformed
        // TODO add your handling code here:
        subjectList.clear();
        subjectCodeList.clear();
        for (int i = 0; i < subjectTable.getRowCount(); i++) {
            subjectList.add(new Subject(subjectTable.getValueAt(i, 0).toString(), subjectTable.getValueAt(i, 1).toString()));
        }
        removeTableRows(examineeTableModel);
        amountText.setText("0");
        examineeTableModel.setColumnCount(1);
        for (Subject s : subjectList) {
            subjectCodeList.add(s.getCode());
            examineeTableModel.addColumn(s.getName());
        }
        examineeTableModel.addColumn("Status");
        JOptionPane.showMessageDialog(rootPane, "Apply Subject Succesfully!");
    }//GEN-LAST:event_applySubjectButtonActionPerformed

    private void deleteSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSubjectActionPerformed
        // TODO add your handling code here:
        int selectedRow = subjectTable.getSelectedRow();
        if (selectedRow != -1) {
            if (checkSubjectDelete(subjectTable.getValueAt(selectedRow, 1).toString())) {
                subjectTableModel.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Delete this subject in division before delete it!");
            }
        }
    }//GEN-LAST:event_deleteSubjectActionPerformed

    private void addDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDivisionActionPerformed
        // TODO add your handling code here:
        divisionTableModel.addRow(new Object[]{});
    }//GEN-LAST:event_addDivisionActionPerformed

    private void applyDivisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyDivisionButtonActionPerformed
        // TODO add your handling code here:
        if (checkDuplicated(divisionTable, 1)) {
            JOptionPane.showMessageDialog(rootPane, "Duplicated Division Code");
            return;
        }
        List<Division> tmpList=new ArrayList<Division>();
        
        for (int i = 0; i < divisionTable.getRowCount(); i++) {
            if (validateSubjectCodeList(divisionTable.getValueAt(i, 3)) || i == 0) {
                String[] codes = divisionTable.getValueAt(i, 3).toString().split("-");
                if (!checkCodeList(codes) && i != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Not exist or Duplicated Subject code in line " + (i + 1));
                    return;
                }
                try {
                    tmpList.add(new Division(divisionTable.getValueAt(i, 0).toString(),
                            divisionTable.getValueAt(i, 1).toString(),
                            Integer.valueOf(divisionTable.getValueAt(i, 2).toString()),
                            Arrays.asList(codes)
                    ));
                }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(rootPane, "Entry number for total score in row " + (i + 1));
                    return;
                }
                catch(NullPointerException e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Fill all cell in row " + (i + 1));
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Input Wrong format for subject code list");
                return;
            }

        }
        divisionList.clear();
        for(Division d: tmpList){
            divisionList.add(d);
        }
        removeTableRows(examineeTableModel);
        amountText.setText("0");
        updateDivision();
        JOptionPane.showMessageDialog(rootPane, "Apply Division Succesfully!");
    }//GEN-LAST:event_applyDivisionButtonActionPerformed

    private void deleteDivisionCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDivisionCodeActionPerformed
        // TODO add your handling code here:
        int selectedRow = divisionTable.getSelectedRow();
        if (selectedRow > 0) {
            divisionTableModel.removeRow(selectedRow);
        }
    }//GEN-LAST:event_deleteDivisionCodeActionPerformed

    public boolean checkPass(String t, Map<Subject, Integer> inputMap) {
        int totalScore = 0;
        int scoreByDivision = 0;
        Division division = getDivisionByCode(t);
        if (division == null) {
            return false;
        }

        for (Map.Entry<Subject, Integer> entry : inputMap.entrySet()) {
            //sum subject score by division
            if (division.getSubjectCodeList().indexOf(entry.getKey().getCode()) > -1) {
                scoreByDivision += entry.getValue();
            }
            totalScore += entry.getValue();
        }
        //check first stage( all subjects)
        if (totalScore < getDivisionByCode("a").getPassScore()) {
            return false;
        }
        //check second stage( subjects by division)
        if (scoreByDivision < division.getPassScore()) {
            return false;
        }
        return true;
    }

    public void showExamineeTable() {
        examineeTableModel = (DefaultTableModel) examineeTable.getModel();
        examineeTableModel.addColumn("Division");
        for (Subject s : subjectList) {
            examineeTableModel.addColumn(s.getName());
        }
        examineeTableModel.addColumn("Status");
    }

    public void showSubjectTable() {
        subjectCodeList = new ArrayList<>();
        subjectTableModel = (DefaultTableModel) subjectTable.getModel();
        for (Subject s : subjectList) {
            subjectCodeList.add(s.getCode());
            subjectTableModel.addRow(new Object[]{s.getName(), s.getCode()});
        }
    }

    public void showDivisionTable() {
        divisionTableModel = (DefaultTableModel) divisionTable.getModel();
        for (Division d : divisionList) {
            if ("a".equals(d.getCode())) {
                divisionTableModel.addRow(new Object[]{d.getName(), d.getCode(), d.getPassScore(), "-----ALL SUBJECT-----"});
            } else {
                String subjectCodeList = "";
                for (String s : d.getSubjectCodeList()) {
                    subjectCodeList += s + "-";
                }
                subjectCodeList = subjectCodeList.substring(0, subjectCodeList.length() - 1);
                divisionTableModel.addRow(new Object[]{d.getName(), d.getCode(), d.getPassScore(), subjectCodeList});
            }

        }

    }

    public void initData() {
        subjectList = new ArrayList<>();
        subjectList.add(new Subject("English", "ENG"));
        subjectList.add(new Subject("Math", "MAT"));
        subjectList.add(new Subject("Science", "SCI"));
        subjectList.add(new Subject("Japanese", "JPN"));
        subjectList.add(new Subject("Geography/History", "GOH"));
        divisionList = new ArrayList<Division>();
        divisionList.add(new Division("Total", "a", 350, Arrays.asList()));
        divisionList.add(new Division("Science", "s", 160, Arrays.asList("MAT", "SCI")));
        divisionList.add(new Division("Humanities", "l", 160, Arrays.asList("JPN", "GOH")));
        updateDivision();

    }

    public void updateDivision() {
        divisionCodes = new String[divisionList.size() - 1];
        for (int i = 0; i < divisionList.size(); i++) {
            if (i != 0) {
                divisionCodes[i - 1] = divisionList.get(i).getCode();
            }

        }
    }

    public void removeTableRows(DefaultTableModel dm) {
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    public Division getDivisionByCode(String code) {
        for (Division d : divisionList) {
            if (code.equals(d.getCode())) {
                return d;
            }
        }
        return null;
    }

    public boolean validateSubjectCodeList(Object obj) {
        if (obj == null) {
            return false;
        }
        String s = obj.toString();
        Pattern pattern = Pattern.compile("^[A-Z0-9]{3}(-[A-Z0-9]{3})*$");
        return pattern.matcher(s).matches();
    }

    public boolean validateSubjectCode(String s) {
        Set<String> set=new HashSet<>();
        for (int i = 0; i < subjectTable.getRowCount(); i++) {
            set.add(subjectTable.getValueAt(i, 1).toString());
                
        }
        if(!set.add(s)) return false;
        Pattern pattern = Pattern.compile("^[A-Z0-9]{3}");
        return pattern.matcher(s).matches();
        
    }

    public boolean checkDuplicated(JTable table, int col) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            try {
                set.add(table.getValueAt(i, col).toString().trim());
            } catch (NullPointerException e) {

                return false;
            }

        }
        if (set.size() < table.getRowCount()) {
            return true;
        }
        return false;
    }

    public boolean checkSubjectDelete(String code) {
        for (Division d : divisionList) {
            if (d.getSubjectCodeList().indexOf(code) != -1) {
                return false;
            }
        }
        return true;
    }

    public boolean checkCodeList(String[] arr) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (subjectCodeList.indexOf(arr[i]) == -1) {
                return false;
            }
            set.add(arr[i]);
        }
        if (set.size() < arr.length) {
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDivision;
    private javax.swing.JButton addExamineeButton;
    private javax.swing.JButton addSubjectButton;
    private javax.swing.JTextField amountText;
    private javax.swing.JButton applyDivisionButton;
    private javax.swing.JButton applySubjectButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JButton deleteDivisionCode;
    private javax.swing.JButton deleteExamineeButton;
    private javax.swing.JButton deleteSubject;
    private javax.swing.JTable divisionTable;
    private javax.swing.JButton examineeAmountButton;
    private javax.swing.JTable examineeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTable subjectTable;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
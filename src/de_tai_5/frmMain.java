/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

/**
 *
 * @author DerKaiser
 */

public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    private String fullName;
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 12345;
    private InputStream inputStream;
    private OutputStream outputStream;

    public frmMain(String fullName) {
        initComponents();
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);

            // Get the input and output streams from the socket
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the server: " + ex.getMessage());
        }
        this.fullName = fullName;
        lb_Show_fullname.setText(fullName);
        
    }

    frmMain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSignOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbFullName = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lb_Show_fullname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRank = new javax.swing.JButton();
        cbKhoa = new javax.swing.JCheckBox();
        cbDepartment = new javax.swing.JCheckBox();
        cbMajor = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRank = new javax.swing.JTable();
        cbClass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PHẦN MỀM TRA CỨU KẾT QUẢ SINH VIÊN");

        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de_tai_5/images/btn_logout.png"))); // NOI18N
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        lbFullName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbFullName.setText("Họ tên:");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de_tai_5/images/btnSearch.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lb_Show_fullname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nhập mã số sinh viên");

        btnRank.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de_tai_5/images/btn_list_rank.png"))); // NOI18N
        btnRank.setText("Xếp hạng sinh viên");
        btnRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankActionPerformed(evt);
            }
        });

        cbKhoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbKhoa.setText("Khóa");

        cbDepartment.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbDepartment.setText("Khoa");

        cbMajor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbMajor.setText("Ngành");

        tbRank.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbRank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbRank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRankMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRank);

        cbClass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbClass.setText("Lớp");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbFullName)
                        .addGap(34, 34, 34)
                        .addComponent(lb_Show_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbKhoa))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbClass)
                                .addGap(116, 116, 116)
                                .addComponent(cbDepartment)
                                .addGap(89, 89, 89)
                                .addComponent(cbMajor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRank, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnSearch)))
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lb_Show_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRank, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
                .addComponent(btnSignOut))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        // TODO add your handling code here:
        Object[] options = { "Có", "Không" };
        int choice = JOptionPane.showOptionDialog(null, "Bạn có muốn đăng xuất khỏi tài khoản?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice == JOptionPane.YES_OPTION) {
        // Hiển thị lại frmSignIn
        frmSignIn signInForm = new frmSignIn();
        signInForm.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String mssv = txtSearch.getText();
        if(mssv != null){
            try {
            // Send the search request to the server
            PrintWriter out = new PrintWriter(outputStream, true);
            out.println(mssv);

            // Receive the Student information from the server
            try (BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
                 ObjectInputStream objectIn = new ObjectInputStream(inputStream)) {

                Student student = (Student) objectIn.readObject();

                if (student != null) {
                    // If student is found, open the frmStudentInformation page
                    frmStudentInformation studentInfoForm = new frmStudentInformation(mssv, fullName);
                    // Set other information if needed
                    studentInfoForm.setStudentInformation(
                    student.getMasv(), student.getTensv(), student.isGioitinh(),
                    student.getNgaysinh(), student.getNoisinh(), student.getKhoa(),
                    student.getTenkhoa(), student.getTennganh(), student.getMalop()
                    );
        
                    studentInfoForm.setVisible(true);
                    this.dispose(); // Assuming this is the current form
                } else {
                    JOptionPane.showMessageDialog(this, "Mã số sinh viên không tồn tại!");
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }     
        }else{
            JOptionPane.showMessageDialog(this,"Chưa nhập mã số sinh viên");
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankActionPerformed
        // TODO add your handling code here:
        
        // Get the entered Student ID (MSSV)
        String studentID = txtSearch.getText().trim();
        // Check if the Ngành checkbox is selected
        if (cbMajor.isSelected()) {    
            // Check if the entered Student ID is not empty
            if (!studentID.isEmpty()) {
                try {
                    // Perform database connection and query to retrieve Ngành of the entered Student ID
                    Connection connection = Connect_Database.connect();
                    String nganhQuery = "SELECT ng.tennganh " +
                                        "FROM SinhVien sv " +
                                        "JOIN Lop l ON sv.malop = l.malop " +
                                        "JOIN Nganh ng ON l.manganh = ng.manganh " +
                                        "WHERE sv.masv = ?";
                    PreparedStatement nganhStatement = connection.prepareStatement(nganhQuery);
                    nganhStatement.setString(1, studentID);
                    ResultSet nganhRs = nganhStatement.executeQuery();

                    // If the entered Student ID exists, retrieve the Ngành
                    if (nganhRs.next()) {
                        String selectedMajor = nganhRs.getString("tennganh");

                        // Perform database connection and query to retrieve ranking information
                        String rankQuery = "SELECT ROW_NUMBER() OVER (ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC) AS STT, " +
                            "    sv.masv AS MSSV, " +
                            "    sv.tensv AS 'Tên SV', " +
                            "    CASE WHEN sv.gioitinh = 1 THEN 'Nam' ELSE 'Nữ' END AS 'Giới tính', " +
                            "    ng.tennganh AS 'Ngành học', " +
                            "    SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) AS 'Điểm trung bình tích lũy hệ 10' " +
                            "FROM BangDiem bd " +
                            "JOIN SinhVien sv ON bd.masv = sv.masv " +
                            "JOIN Lop l ON sv.malop = l.malop " +
                            "JOIN Nganh ng ON l.manganh = ng.manganh " +
                            "WHERE ng.tennganh = ? " +
                            "GROUP BY sv.masv, sv.tensv, sv.gioitinh, ng.tennganh " +
                            "ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC";


                        PreparedStatement rankStatement = connection.prepareStatement(rankQuery);
                        rankStatement.setString(1, selectedMajor);
                        ResultSet rs = rankStatement.executeQuery();

                        // Populate the table with the ranking results
                        DefaultTableModel model = new DefaultTableModel();
                        model.addColumn("STT");
                        model.addColumn("MSSV");
                        model.addColumn("Tên SV");
                        model.addColumn("Giới tính");
                        model.addColumn("Ngành học");
                        model.addColumn("Điểm trung bình tích lũy hệ 10");

                        while (rs.next()) {
                            int position = rs.getInt("STT");
                            String studentIDResult = rs.getString("MSSV");
                            String studentName = rs.getString("Tên SV");
                            String gender = rs.getString("Giới tính");
                            String major = rs.getString("Ngành học");
                            double cumulativeGPA = rs.getDouble("Điểm trung bình tích lũy hệ 10");
                            
                            model.addRow(new Object[]{position, studentIDResult, studentName, gender, major, cumulativeGPA});
                        }

                        tbRank.setModel(model);

                        // Close database connections
                        rs.close();
                        rankStatement.close();
                    } else {
                        // Handle the case where the entered Student ID doesn't exist
                        JOptionPane.showMessageDialog(this, "Mã số sinh viên không tồn tại!");
                    }

                    // Close database connections
                    nganhRs.close();
                    nganhStatement.close();
                    connection.close();
                } catch (SQLException e) {
                    // Handle SQL exceptions
                    e.printStackTrace();
                }
            } else {
                // Handle the case where the entered Student ID is empty
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã số sinh viên!");
            }
        }
        else if(cbDepartment.isSelected()){
            // Check if the entered Student ID is not empty
            if (!studentID.isEmpty()) {
                try {
                    // Perform database connection and query to retrieve Khoa of the entered Student ID
                    Connection connection = Connect_Database.connect();
                    String khoaQuery = "SELECT kh.tenkhoa " +
                                        "FROM SinhVien sv " +
                                        "JOIN Lop l ON sv.malop = l.malop " +
                                        "JOIN Nganh ng ON l.manganh = ng.manganh " +
                                        "JOIN Khoa kh ON kh.makhoa = ng.makhoa " + // Add a space here
                                        "WHERE sv.masv = ?";

                    PreparedStatement khoaStatement = connection.prepareStatement(khoaQuery);
                    khoaStatement.setString(1, studentID);
                    ResultSet khoaRs = khoaStatement.executeQuery();

                    // If the entered Student ID exists, retrieve the Ngành
                    if (khoaRs.next()) {
                        String selectedDepartment = khoaRs.getString("tenkhoa");

                        // Perform database connection and query to retrieve ranking information
                        String rankQuery = "SELECT ROW_NUMBER() OVER (ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC) AS STT, " +
                                            "    sv.masv AS MSSV, " +
                                            "    sv.tensv AS 'Tên SV', " +
                                            "    CASE WHEN sv.gioitinh = 1 THEN 'Nam' ELSE 'Nữ' END AS 'Giới tính', " +
                                            "    kh.tenkhoa AS 'Khoa', " +
                                            "    SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) AS 'Điểm trung bình tích lũy hệ 10' " +
                                            "FROM BangDiem bd " +
                                            "JOIN SinhVien sv ON bd.masv = sv.masv " +
                                            "JOIN Lop l ON sv.malop = l.malop " +
                                            "JOIN Nganh ng ON l.manganh = ng.manganh " +
                                            "JOIN Khoa kh ON kh.makhoa = ng.makhoa " + // Add a space here
                                            "WHERE kh.tenkhoa = ? " +
                                            "GROUP BY sv.masv, sv.tensv, sv.gioitinh, kh.tenkhoa " +
                                            "ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC";



                        PreparedStatement rankStatement = connection.prepareStatement(rankQuery);
                        rankStatement.setString(1, selectedDepartment);
                        ResultSet rs = rankStatement.executeQuery();

                        // Populate the table with the ranking results
                        DefaultTableModel model = new DefaultTableModel();
                        model.addColumn("STT");
                        model.addColumn("MSSV");
                        model.addColumn("Tên SV");
                        model.addColumn("Giới tính");
                        model.addColumn("Khoa");
                        model.addColumn("Điểm trung bình tích lũy hệ 10");

                        while (rs.next()) {
                            int position = rs.getInt("STT");
                            String studentIDResult = rs.getString("MSSV");
                            String studentName = rs.getString("Tên SV");
                            String gender = rs.getString("Giới tính");
                            String department = rs.getString("Khoa");
                            double cumulativeGPA = rs.getDouble("Điểm trung bình tích lũy hệ 10");
                            
                            model.addRow(new Object[]{position, studentIDResult, studentName, gender, department, cumulativeGPA});
                        }

                        tbRank.setModel(model);

                        // Close database connections
                        rs.close();
                        rankStatement.close();
                    } else {
                        // Handle the case where the entered Student ID doesn't exist
                        JOptionPane.showMessageDialog(this, "Mã số sinh viên không tồn tại!");
                    }

                    // Close database connections
                    khoaRs.close();
                    khoaStatement.close();
                    connection.close();
                } catch (SQLException e) {
                    // Handle SQL exceptions
                    e.printStackTrace();
                }
            } else {
                // Handle the case where the entered Student ID is empty
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã số sinh viên!");
            }
        }
        else if(cbClass.isSelected()){
            // Check if the entered Student ID is not empty
            if (!studentID.isEmpty()) {
                try {
                    // Perform database connection and query to retrieve Khoa of the entered Student ID
                    Connection connection = Connect_Database.connect();
                    String lopQuery = "SELECT l.malop " +
                                        "FROM SinhVien sv " +
                                        "JOIN Lop l ON sv.malop = l.malop " +
                                        "WHERE sv.masv = ?";

                    PreparedStatement lopStatement = connection.prepareStatement(lopQuery);
                    lopStatement.setString(1, studentID);
                    ResultSet lopRs = lopStatement.executeQuery();

                    // If the entered Student ID exists, retrieve the Ngành
                    if (lopRs.next()) {
                        String selectedClop = lopRs.getString("malop");

                        // Perform database connection and query to retrieve ranking information
                        String rankQuery = "SELECT ROW_NUMBER() OVER (ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC) AS STT, " +
                                            "    sv.masv AS MSSV, " +
                                            "    sv.tensv AS 'Tên SV', " +
                                            "    CASE WHEN sv.gioitinh = 1 THEN 'Nam' ELSE 'Nữ' END AS 'Giới tính', " +
                                            "    l.malop AS 'Lớp', " +
                                            "    SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) AS 'Điểm trung bình tích lũy hệ 10' " +
                                            "FROM BangDiem bd " +
                                            "JOIN SinhVien sv ON bd.masv = sv.masv " +
                                            "JOIN Lop l ON sv.malop = l.malop " +
                                            "WHERE l.malop = ? " +
                                            "GROUP BY sv.masv, sv.tensv, sv.gioitinh, l.malop " +
                                            "ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC";



                        PreparedStatement rankStatement = connection.prepareStatement(rankQuery);
                        rankStatement.setString(1, selectedClop);
                        ResultSet rs = rankStatement.executeQuery();

                        // Populate the table with the ranking results
                        DefaultTableModel model = new DefaultTableModel();
                        model.addColumn("STT");
                        model.addColumn("MSSV");
                        model.addColumn("Tên SV");
                        model.addColumn("Giới tính");
                        model.addColumn("Lớp");
                        model.addColumn("Điểm trung bình tích lũy hệ 10");

                        while (rs.next()) {
                            int position = rs.getInt("STT");
                            String studentIDResult = rs.getString("MSSV");
                            String studentName = rs.getString("Tên SV");
                            String gender = rs.getString("Giới tính");
                            String lop = rs.getString("Lớp");
                            double cumulativeGPA = rs.getDouble("Điểm trung bình tích lũy hệ 10");
                            
                            model.addRow(new Object[]{position, studentIDResult, studentName, gender, lop, cumulativeGPA});
                        }

                        tbRank.setModel(model);

                        // Close database connections
                        rs.close();
                        rankStatement.close();
                    } else {
                        // Handle the case where the entered Student ID doesn't exist
                        JOptionPane.showMessageDialog(this, "Mã số sinh viên không tồn tại!");
                    }

                    // Close database connections
                    lopRs.close();
                    lopStatement.close();
                    connection.close();
                } catch (SQLException e) {
                    // Handle SQL exceptions
                    e.printStackTrace();
                }
            } else {
                // Handle the case where the entered Student ID is empty
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã số sinh viên!");
            }
        }
        else if(cbKhoa.isSelected()){
            // Check if the entered Student ID is not empty
            if (!studentID.isEmpty()) {
                try {
                    // Perform database connection and query to retrieve Khoa of the entered Student ID
                    Connection connection = Connect_Database.connect();
                    String khoaQuery = "SELECT sv.khoa " +
                                        "FROM SinhVien sv " +
                                        "WHERE sv.masv = ?";

                    PreparedStatement khoaStatement = connection.prepareStatement(khoaQuery);
                    khoaStatement.setString(1, studentID);
                    ResultSet khoaRs = khoaStatement.executeQuery();

                    // If the entered Student ID exists, retrieve the Ngành
                    if (khoaRs.next()) {
                        String selectedKhoa = khoaRs.getString("khoa");

                        // Perform database connection and query to retrieve ranking information
                        // Modify your rankQuery to include the WHERE clause for filtering by Khoa
                        String rankQuery = "SELECT ROW_NUMBER() OVER (ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC) AS STT, " +
                            "    sv.masv AS MSSV, " +
                            "    sv.tensv AS 'Tên SV', " +
                            "    CASE WHEN sv.gioitinh = 1 THEN 'Nam' ELSE 'Nữ' END AS 'Giới tính', " +
                            "    sv.khoa AS 'Khóa', " +
                            "    SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) AS 'Điểm trung bình tích lũy hệ 10' " +
                            "FROM BangDiem bd " +
                            "JOIN SinhVien sv ON bd.masv = sv.masv " +
                            "WHERE sv.khoa = ? " +  // Add this line to filter by Khoa
                            "GROUP BY sv.masv, sv.tensv, sv.gioitinh, sv.khoa " +
                            "ORDER BY SUM(bd.diem_monhoc_he10) / COUNT(DISTINCT bd.mamh) DESC";




                        PreparedStatement rankStatement = connection.prepareStatement(rankQuery);
                        rankStatement.setString(1, selectedKhoa);
                        ResultSet rs = rankStatement.executeQuery();

                        // Populate the table with the ranking results
                        DefaultTableModel model = new DefaultTableModel();
                        model.addColumn("STT");
                        model.addColumn("MSSV");
                        model.addColumn("Tên SV");
                        model.addColumn("Giới tính");
                        model.addColumn("Khóa");
                        model.addColumn("Điểm trung bình tích lũy hệ 10");

                        while (rs.next()) {
                            int position = rs.getInt("STT");
                            String studentIDResult = rs.getString("MSSV");
                            String studentName = rs.getString("Tên SV");
                            String gender = rs.getString("Giới tính");
                            String khoa = rs.getString("Khóa");
                            double cumulativeGPA = rs.getDouble("Điểm trung bình tích lũy hệ 10");
                            
                            model.addRow(new Object[]{position, studentIDResult, studentName, gender, khoa, cumulativeGPA});
                        }

                        tbRank.setModel(model);

                        // Close database connections
                        rs.close();
                        rankStatement.close();
                    } else {
                        // Handle the case where the entered Student ID doesn't exist
                        JOptionPane.showMessageDialog(this, "Mã số sinh viên không tồn tại!");
                    }

                    // Close database connections
                    khoaRs.close();
                    khoaStatement.close();
                    connection.close();
                } catch (SQLException e) {
                    // Handle SQL exceptions
                    e.printStackTrace();
                }
            } else {
                // Handle the case where the entered Student ID is empty
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mã số sinh viên!");
            }
        }
        else {
            // Handle the case where the Ngành checkbox is not selected
            JOptionPane.showMessageDialog(this, "Vui lòng chọn xếp hạng theo khoa, ngành, khóa !");
        }
    }//GEN-LAST:event_btnRankActionPerformed

    
    private void tbRankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRankMouseClicked
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRow = tbRank.getSelectedRow();

        // Check if a valid row is selected
        if (selectedRow != -1) {
            try {
                // Perform database connection and query to retrieve student information based on MSSV
                Connection connection = Connect_Database.connect();
                String studentInfoQuery = "SELECT sv.tensv, sv.ngaysinh, sv.gioitinh, sv.noisinh, sv.khoa, khoa.tenkhoa, nganh.tennganh, l.malop " +
                    "FROM SinhVien sv " +
                    "JOIN Lop l ON sv.malop = l.malop " +
                    "JOIN Nganh nganh ON l.manganh = nganh.manganh " +
                    "JOIN Khoa khoa ON nganh.makhoa = khoa.makhoa " +
                    "WHERE sv.masv = ?";

                // Get the MSSV from the selected row
                String selectedMSSV = tbRank.getValueAt(selectedRow, 1).toString();

                PreparedStatement studentInfoStatement = connection.prepareStatement(studentInfoQuery);
                studentInfoStatement.setString(1, selectedMSSV);

                ResultSet studentInfoRs = studentInfoStatement.executeQuery();

                if (studentInfoRs.next()) {
                    String tenSV = studentInfoRs.getString("tensv");
                    boolean gioiTinh = studentInfoRs.getBoolean("gioitinh");
                    Date ngaySinh = studentInfoRs.getDate("ngaysinh");
                    String noiSinh = studentInfoRs.getString("noisinh");
                    int khoa = studentInfoRs.getInt("khoa");
                    String tenKhoa = studentInfoRs.getString("tenkhoa");
                    String tenNganh = studentInfoRs.getString("tennganh");
                    String maLop = studentInfoRs.getString("malop");
                    // Retrieve other details from the query

                    // Create an instance of frmStudentInformation
                    frmStudentInformation studentInfoForm = new frmStudentInformation(selectedMSSV,fullName);

                    // Set the student information in frmStudentInformation
                    studentInfoForm.setStudentInformation(selectedMSSV, tenSV, gioiTinh, ngaySinh, noiSinh, khoa, tenKhoa, tenNganh, maLop);

                    // Show frmStudentInformation
                    studentInfoForm.setVisible(true);

                    // Close database connections
                    studentInfoRs.close();
                    studentInfoStatement.close();
                    connection.close();
                }
            } catch (SQLException ex) {
                // Handle SQL exceptions
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_tbRankMouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRank;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JCheckBox cbClass;
    private javax.swing.JCheckBox cbDepartment;
    private javax.swing.JCheckBox cbKhoa;
    private javax.swing.JCheckBox cbMajor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lb_Show_fullname;
    private javax.swing.JTable tbRank;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

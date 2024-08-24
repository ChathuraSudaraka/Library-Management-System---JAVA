package gui;

import com.formdev.flatlaf.ui.FlatInternalFrameUI;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modal.Mysql;

public class Menu11 extends javax.swing.JInternalFrame {

    HashMap<String, Integer> CityMap = new HashMap<>();

    public Menu11() {
        initComponents();
        loadUserName();
        loadBooks();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        FlatInternalFrameUI ui = (FlatInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBorrowBackPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel5.setText("Book Name");

        jLabel3.setText("User Name");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-button.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("CONFORM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel6.setText("Borrow Date");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButton3.setText("FILTER");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("FILTER");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBorrowBackPanelLayout = new javax.swing.GroupLayout(jBorrowBackPanel);
        jBorrowBackPanel.setLayout(jBorrowBackPanelLayout);
        jBorrowBackPanelLayout.setHorizontalGroup(
            jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                .addGroup(jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBorrowBackPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jBorrowBackPanelLayout.setVerticalGroup(
            jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                    .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBorrowBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBorrowBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBorrowBackPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Clear function
    private void Clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jDateChooser2.setDate(null);
    }

// Load UserName
    private void loadUserName() {
        String searchData = jTextField1.getText();

        try {
            String query = "SELECT u.name AS user_name "
                    + "FROM borrowed_books b "
                    + "JOIN users u ON b.users_id = u.id "
                    + "WHERE b.is_returned = 0";

            if (!searchData.isEmpty()) {
                query += " AND u.name LIKE '%" + searchData + "%'";
            }

            query += " ORDER BY u.name ASC";

            ResultSet username = Mysql.search(query);

            DefaultListModel<String> list = new DefaultListModel<>();

            while (username.next()) {
                String userName = username.getString("user_name");
                list.addElement(userName);
            }

            jList2.setModel(list);

            jList2.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent evt) {
                    if (!evt.getValueIsAdjusting()) {
                        String selectedUser = jList2.getSelectedValue();
                        jTextField1.setText(selectedUser);
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// Load Books
    private void loadBooks() {
        String searchData = jTextField2.getText();

        try {
            String query = "SELECT t.title AS book_name "
                    + "FROM borrowed_books b "
                    + "JOIN books c ON b.books_id = c.id "
                    + "JOIN titles t ON c.titles_id = t.id "
                    + "WHERE b.is_returned = 0";

            if (!searchData.isEmpty()) {
                query += " AND t.title LIKE '%" + searchData + "%'";
            }

            query += " ORDER BY t.title ASC";

            ResultSet loadbook = Mysql.search(query);

            DefaultListModel<String> list = new DefaultListModel<>();

            while (loadbook.next()) {
                String books = loadbook.getString("book_name");
                list.addElement(books);
            }

            // Set the populated list model to the JList
            jList1.setModel(list);

            // Add a listener to set the selected item to the JTextField
            jList1.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent evt) {
                    if (!evt.getValueIsAdjusting()) {
                        String selectedBook = jList1.getSelectedValue();
                        jTextField2.setText(selectedBook);
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Menu7 menu7 = new Menu7();
        jBorrowBackPanel.removeAll();
        jBorrowBackPanel.add(menu7).setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String username = jTextField1.getText().trim();
        String bookname = jTextField2.getText().trim();
        Date date = jDateChooser2.getDate();

        if (username.isEmpty() || bookname.isEmpty() || date == null) {
            JOptionPane.showMessageDialog(this, "Please enter name, book name, and select a date.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            // Fetch the user ID from the `users` table
            String userIdQuery = "SELECT id FROM `users` WHERE name = '" + username + "' ";
            ResultSet userResult = Mysql.search(userIdQuery);
            if (!userResult.next()) {
                JOptionPane.showMessageDialog(this, "User not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int userId = userResult.getInt("id");

            // Fetch the book ID from the `titles` table
            String bookIdQuery = "SELECT b.id FROM `books` b JOIN `titles` t ON b.titles_id = t.id WHERE t.title = '" + bookname + "' ";
            ResultSet bookResult = Mysql.search(bookIdQuery);
            if (!bookResult.next()) {
                JOptionPane.showMessageDialog(this, "Book not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int bookId = bookResult.getInt("id");

            // Check if a borrowing record with the given user ID, book ID, and date exists
            String checkBorrowedBookQuery = "SELECT id FROM `borrowed_books` WHERE users_id = '" + userId + "' AND books_id = '" + bookId + "' AND DATE(borrowed_date) = '" + sqlDate + "' ";
            ResultSet borrowedBookResult = Mysql.search(checkBorrowedBookQuery);
            boolean recordExists = borrowedBookResult.next();

            if (recordExists) {
                // Update the existing record to set it as returned
                String updateQuery = "UPDATE `borrowed_books` SET is_returned = 1 WHERE users_id = '" + userId + "' AND books_id = '" + bookId + "' AND DATE(borrowed_date) = '" + sqlDate + "' ";
                Mysql.update(updateQuery);

                // Update the `IsAvailable` field in the `books` table
                String updateAvailabilityQuery = "UPDATE books SET IsAvailable = IsAvailable + 1 WHERE id = '" + bookId + "' ";
                Mysql.update(updateAvailabilityQuery);

                JOptionPane.showMessageDialog(this, "Book returned successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No borrowing record found for the specified book and user.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            Clear();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error processing book return: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
        if (!evt.getValueIsAdjusting()) {
            // Get the selected item from jList2
            String selectedValue = jList2.getSelectedValue();

            // Set the selected item into jTextField1
            jTextField1.setText(selectedValue);
        }
    }//GEN-LAST:event_jList2ValueChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        loadUserName();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        loadBooks();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBorrowBackPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

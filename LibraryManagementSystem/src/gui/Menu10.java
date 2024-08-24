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

public class Menu10 extends javax.swing.JInternalFrame {

    HashMap<String, Integer> CityMap = new HashMap<>();

    public Menu10() {
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
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jBorrowBackPanelLayout.createSequentialGroup()
                        .addComponent(jTextField1)
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
            String query = "SELECT name FROM `users`";

            if (!searchData.isEmpty()) {
                query += " WHERE name LIKE '%" + searchData + "%'";
            }

            query += " ORDER BY name ASC";

            ResultSet username = Mysql.search(query);

            DefaultListModel<String> list = new DefaultListModel<>();

            while (username.next()) {
                String userName = username.getString("name");
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
            // Build the SQL query
            String query = "SELECT title FROM `titles`";

            // Apply the search filter if there is any input in the search field
            if (!searchData.isEmpty()) {
                query += " WHERE title LIKE '%" + searchData + "%' ";
            }

            // Add the ORDER BY clause to sort the titles alphabetically
            query += " ORDER BY title ASC";

            // Execute the query
            ResultSet loadbook = Mysql.search(query);

            // Create a new DefaultListModel to hold the book titles
            DefaultListModel<String> list = new DefaultListModel<>();

            // Iterate over the ResultSet to add each book title to the list
            while (loadbook.next()) {
                String books = loadbook.getString("title");
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
        String username = jTextField1.getText();
        String bookname = jTextField2.getText();
        Date date = jDateChooser2.getDate();

        if (username.equals("") || bookname.equals("") || date == null) {
            JOptionPane.showMessageDialog(this, "Please enter name, book name, and select a date.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());

                // Fetch the user ID from the `users` table
                String userIdQuery = "SELECT id FROM `users` WHERE name = '" + username + "'";
                ResultSet userResult = Mysql.search(userIdQuery);
                int userId = -1;
                if (userResult.next()) {
                    userId = userResult.getInt("id");
                } else {
                    JOptionPane.showMessageDialog(this, "User not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Fetch the book ID from the `books` table
                String bookIdQuery = "SELECT b.id "
                        + "FROM books b "
                        + "JOIN titles t ON b.titles_id = t.id "
                        + "WHERE t.title = '" + bookname + "'";
                ResultSet bookResult = Mysql.search(bookIdQuery);
                int bookId = -1;
                if (bookResult.next()) {
                    bookId = bookResult.getInt("id");
                } else {
                    JOptionPane.showMessageDialog(this, "Book not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Check if the user has already borrowed a book that hasn't been returned
                String checkBorrowedQuery = "SELECT id FROM `borrowed_books` WHERE users_id = '" + userId + "' AND is_returned = 0";
                ResultSet borrowedResult = Mysql.search(checkBorrowedQuery);
                if (borrowedResult.next()) {
                    JOptionPane.showMessageDialog(this, "User has already borrowed a book and hasn't returned it yet.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Insert new borrowing record
                int returnedStatus = 0;
                String insertQuery = "INSERT INTO `borrowed_books` (`borrowed_date`, `users_id`, `books_id`, `is_returned`) "
                        + "VALUES ('" + sqlDate + "', '" + userId + "', '" + bookId + "', '" + returnedStatus + "')";
                Mysql.update(insertQuery);

                // Update the book copies count
                String updateQuery = "UPDATE books SET IsAvailable = IsAvailable - 1 WHERE id = '" + bookId + "'";
                Mysql.update(updateQuery);

                JOptionPane.showMessageDialog(this, "Book borrowing record inserted successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                Clear();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting book borrowing record: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
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

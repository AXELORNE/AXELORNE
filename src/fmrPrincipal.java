/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Josee
 */
public class fmrPrincipal extends javax.swing.JFrame {
    private double valor1 = 0;
    private String operacion = null;
    
    //Factorial
    public int factorial(int num){
        if(num==0){
            return 1;
        }else{
            return num * factorial(num - 1);
        }   
    }
    /**
     * Creates new form fmrPrincipal
     */
    public fmrPrincipal() {
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

        jButton29 = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPorrcentaje = new javax.swing.JButton();
        btnTAN = new javax.swing.JButton();
        btnCOS = new javax.swing.JButton();
        btnSEN = new javax.swing.JButton();
        btnLogaritmo = new javax.swing.JButton();
        btnLogaritmo10 = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnAlCuadrado = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        lbnBinario = new javax.swing.JRadioButton();
        lbnDecimal = new javax.swing.JRadioButton();
        lbnHexadecimal = new javax.swing.JRadioButton();
        btnCero = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();

        jButton29.setText("CE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        btnUno.setBackground(new java.awt.Color(204, 0, 0));
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(204, 0, 0));
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(204, 0, 0));
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(204, 0, 0));
        btnCuatro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(204, 0, 0));
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(204, 0, 0));
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSiete.setBackground(new java.awt.Color(204, 0, 0));
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(204, 0, 0));
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(255, 0, 0));
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(204, 0, 0));
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(204, 0, 0));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMas.setBackground(new java.awt.Color(0, 255, 0));
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(0, 255, 0));
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(0, 204, 0));
        btnMultiplicacion.setText("x");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(0, 255, 0));
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnPorrcentaje.setBackground(new java.awt.Color(0, 255, 51));
        btnPorrcentaje.setText("%");
        btnPorrcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorrcentajeActionPerformed(evt);
            }
        });

        btnTAN.setBackground(new java.awt.Color(0, 255, 0));
        btnTAN.setText("TAN");
        btnTAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTANActionPerformed(evt);
            }
        });

        btnCOS.setBackground(new java.awt.Color(0, 255, 0));
        btnCOS.setText("COS");
        btnCOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOSActionPerformed(evt);
            }
        });

        btnSEN.setBackground(new java.awt.Color(0, 255, 51));
        btnSEN.setText("SEN");
        btnSEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSENActionPerformed(evt);
            }
        });

        btnLogaritmo.setBackground(new java.awt.Color(0, 204, 51));
        btnLogaritmo.setText("ln");
        btnLogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoActionPerformed(evt);
            }
        });

        btnLogaritmo10.setBackground(new java.awt.Color(0, 255, 0));
        btnLogaritmo10.setText("log");
        btnLogaritmo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmo10ActionPerformed(evt);
            }
        });

        btnRaiz.setBackground(new java.awt.Color(0, 204, 51));
        btnRaiz.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRaiz.setText("Raiz");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnPotencia.setBackground(new java.awt.Color(0, 204, 0));
        btnPotencia.setText("x^y");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnAlCuadrado.setBackground(new java.awt.Color(0, 204, 0));
        btnAlCuadrado.setText("x^2");
        btnAlCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlCuadradoActionPerformed(evt);
            }
        });

        btnFactorial.setBackground(new java.awt.Color(0, 204, 0));
        btnFactorial.setText("x!");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnBorrarTodo.setBackground(new java.awt.Color(0, 204, 51));
        btnBorrarTodo.setText("C");
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(0, 204, 0));
        btnBorrar.setText("CE");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 255, 255));

        txtDatos.setColumns(20);
        txtDatos.setForeground(new java.awt.Color(0, 204, 204));
        txtDatos.setRows(5);
        jScrollPane1.setViewportView(txtDatos);

        lbnBinario.setBackground(new java.awt.Color(0, 204, 204));
        lbnBinario.setText("Binario");
        lbnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnBinarioActionPerformed(evt);
            }
        });

        lbnDecimal.setBackground(new java.awt.Color(255, 255, 0));
        lbnDecimal.setText("Decimal");
        lbnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnDecimalActionPerformed(evt);
            }
        });

        lbnHexadecimal.setBackground(new java.awt.Color(0, 204, 204));
        lbnHexadecimal.setText("Hexadecimal");
        lbnHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnHexadecimalActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(204, 0, 0));
        btnCero.setText("0");

        btnAutor.setBackground(new java.awt.Color(204, 0, 0));
        btnAutor.setText("autor");
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnUno)
                                        .addComponent(btnDos))
                                    .addComponent(btnTres))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCuatro)
                                    .addComponent(btnCinco)
                                    .addComponent(btnSeis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSiete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPunto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnOcho)
                                            .addComponent(btnNueve))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIgual))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnCero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAutor)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiplicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDivision)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPorrcentaje))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTAN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSEN))
                    .addComponent(lbnBinario)
                    .addComponent(lbnDecimal)
                    .addComponent(lbnHexadecimal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnLogaritmo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLogaritmo10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRaiz))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnAlCuadrado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPotencia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarTodo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFactorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbnBinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbnDecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbnHexadecimal)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiete)
                            .addComponent(btnPunto)
                            .addComponent(btnMas)
                            .addComponent(btnMenos)
                            .addComponent(btnMultiplicacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDivision)
                                    .addComponent(btnPorrcentaje))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTAN)
                                    .addComponent(btnCOS)
                                    .addComponent(btnSEN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLogaritmo)
                                    .addComponent(btnLogaritmo10)
                                    .addComponent(btnRaiz))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAlCuadrado)
                                    .addComponent(btnPotencia)
                                    .addComponent(btnBorrarTodo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnOcho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNueve))
                                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCinco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSeis)
                                    .addComponent(btnTres))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFactorial)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnBinarioActionPerformed
        lbnDecimal.setSelected(false);
        lbnHexadecimal.setSelected(false);
        txtDatos.setText(Integer.toBinaryString(Integer.parseInt(txtDatos.getText())));
    
    }//GEN-LAST:event_lbnBinarioActionPerformed

    private void lbnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnDecimalActionPerformed
        lbnBinario.setSelected(false);
        lbnHexadecimal.setSelected(false);
        
        btnCero.setEnabled(true);
        btnUno.setEnabled(true);
        btnDos.setEnabled(true);
        btnTres.setEnabled(true);
        btnCuatro.setEnabled(true);
        btnCinco.setEnabled(true);
        btnSeis.setEnabled(true);
        btnSiete.setEnabled(true);
        btnOcho.setEnabled(true);
        btnNueve.setEnabled(true);
    }//GEN-LAST:event_lbnDecimalActionPerformed

    private void lbnHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnHexadecimalActionPerformed
        lbnDecimal.setSelected(false);
        lbnBinario.setSelected(false);
        txtDatos.setText(Integer.toHexString(Integer.parseInt(txtDatos.getText())));
    }//GEN-LAST:event_lbnHexadecimalActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        txtDatos.append("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        txtDatos.append("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtDatos.append("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        txtDatos.append("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        txtDatos.append("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        txtDatos.append("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        txtDatos.append("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        txtDatos.append("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        txtDatos.append("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        txtDatos.append(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Double valor2 = Double.parseDouble(txtDatos.getText());
        switch(operacion)
        {
            case "suma":
                txtDatos.setText(String.valueOf(valor1+valor2));
                break;
            case "resta":
                txtDatos.setText(String.valueOf(valor1-valor2));
                break;
            case "multiplicacion":
                txtDatos.setText(String.valueOf(valor1*valor2));
                break;
            case "Division":
                if(valor2==0){
                    txtDatos.setText(String.valueOf("E"));
                } else{
                    txtDatos.setText(String.valueOf(valor1/valor2));
                }
                break;
            case "porcentaje":
                txtDatos.setText(String.valueOf(valor1*valor2));
                break;
            case "Potencia2":
                txtDatos.setText(String.valueOf(Math.pow(valor1,valor2)));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="suma";
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="resta";
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="multiplicacion";
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="division";
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPorrcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorrcentajeActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion="porcentaje";
    }//GEN-LAST:event_btnPorrcentajeActionPerformed

    private void btnTANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTANActionPerformed
         txtDatos.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnTANActionPerformed

    private void btnCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOSActionPerformed
        txtDatos.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnCOSActionPerformed

    private void btnSENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSENActionPerformed
        txtDatos.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(txtDatos.getText())))));
    }//GEN-LAST:event_btnSENActionPerformed

    private void btnLogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoActionPerformed
        double valor,log;
        valor = Double.parseDouble(txtDatos.getText());
        log = Math.log(valor);
        txtDatos.setText(String.valueOf(log));
    }//GEN-LAST:event_btnLogaritmoActionPerformed

    private void btnLogaritmo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmo10ActionPerformed
        double numero, log;
        numero = Double.parseDouble(txtDatos.getText());
        log = Math.log10(numero);
        txtDatos.setText(String.valueOf(log));  
    }//GEN-LAST:event_btnLogaritmo10ActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        txtDatos.setText(String.valueOf(Math.sqrt(Double.parseDouble(txtDatos.getText()))));
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnAlCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlCuadradoActionPerformed
        txtDatos.setText(String.valueOf(Math.pow(Double.parseDouble(txtDatos.getText()),2)));
    }//GEN-LAST:event_btnAlCuadradoActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        valor1 = Double.parseDouble(txtDatos.getText());
        txtDatos.setText("");
        operacion = "potencia2";
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        txtDatos.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String valor = txtDatos.getText();
        txtDatos.setText( valor.substring(0, valor.length()-1) );
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        txtDatos.setText(String.valueOf(factorial(Integer.parseInt(txtDatos.getText()))));
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        FrmAutor frm = new FrmAutor();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAutorActionPerformed

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
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlCuadrado;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnCOS;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLogaritmo;
    private javax.swing.JButton btnLogaritmo10;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorrcentaje;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSEN;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTAN;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton29;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lbnBinario;
    private javax.swing.JRadioButton lbnDecimal;
    private javax.swing.JRadioButton lbnHexadecimal;
    private javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables
}

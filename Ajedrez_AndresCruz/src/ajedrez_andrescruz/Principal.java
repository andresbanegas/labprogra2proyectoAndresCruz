/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez_andrescruz;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author MBanegas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        ImageIcon img = new ImageIcon("./src/iconos/fondo.jpg");
        Icon image = new ImageIcon(img.getImage().getScaledInstance(jl_fondo.getWidth(), jl_fondo.getHeight(), Image.SCALE_DEFAULT));
        jl_fondo.setIcon(image);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_juego = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jsxinicio = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jsyinicio = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jug_turno = new javax.swing.JLabel();
        jp_botones = new javax.swing.JPanel();
        jb_mover = new javax.swing.JButton();
        jsyfin = new javax.swing.JSpinner();
        jsxfin = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_jugador1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_jugador2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jb_iniciojuego = new javax.swing.JButton();
        jl_fondo = new javax.swing.JLabel();

        jLabel1.setText("Posicion de Pieza a Mover:");

        jLabel2.setText("X");

        jsxinicio.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel4.setText("Y");

        jsyinicio.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel6.setText("Posicion para movimiento:");

        jLabel9.setText("Turno de:");

        jug_turno.setText("jLabel10");

        jp_botones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.darkGray));
        jp_botones.setPreferredSize(new java.awt.Dimension(570, 570));

        javax.swing.GroupLayout jp_botonesLayout = new javax.swing.GroupLayout(jp_botones);
        jp_botones.setLayout(jp_botonesLayout);
        jp_botonesLayout.setHorizontalGroup(
            jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jp_botonesLayout.setVerticalGroup(
            jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jb_mover.setText("Completar Accion");
        jb_mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_moverMouseClicked(evt);
            }
        });

        jsyfin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jsxfin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel10.setText("Y");

        jLabel11.setText("X");

        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("*Para saber cual es la posicion de la pieza que desea mover presione sobre el boton del tablero");

        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("**No se valida el jaque mate");

        javax.swing.GroupLayout jd_juegoLayout = new javax.swing.GroupLayout(jd_juego.getContentPane());
        jd_juego.getContentPane().setLayout(jd_juegoLayout);
        jd_juegoLayout.setHorizontalGroup(
            jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_juegoLayout.createSequentialGroup()
                .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_juegoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addComponent(jug_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addGroup(jd_juegoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsxinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsyinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_juegoLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_mover)
                            .addGroup(jd_juegoLayout.createSequentialGroup()
                                .addComponent(jsxfin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsyfin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_juegoLayout.setVerticalGroup(
            jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_juegoLayout.createSequentialGroup()
                .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_juegoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jug_turno))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jsxinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsyinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jsxfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsyfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addComponent(jb_mover)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_jugador1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JUGADOR 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        tf_jugador2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(tf_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JUGADOR 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jb_iniciojuego.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jb_iniciojuego.setText("Iniciar Juego");
        jb_iniciojuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_iniciojuegoMouseClicked(evt);
            }
        });
        jb_iniciojuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_iniciojuegoActionPerformed(evt);
            }
        });
        jb_iniciojuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb_iniciojuegoKeyPressed(evt);
            }
        });
        getContentPane().add(jb_iniciojuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));
        getContentPane().add(jl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_jugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_jugador1ActionPerformed

    private void jb_iniciojuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_iniciojuegoMouseClicked
        if (HayElementos()) {
            EliminarRecursiva(MatrizBotones, 7, 7);
            jp_botones.removeAll();
            RedibujarTablero();
        }
        if (tf_jugador1.getText().equals("")) {
            jug1 = "Jugador 1";
        } else {
            jug1 = tf_jugador1.getText();
        }
        if (tf_jugador2.getText().equals("")) {
            jug2 = "Jugador 2";
        } else {
            jug2 = tf_jugador2.getText();
        }
        tf_jugador1.setText("");
        tf_jugador2.setText("");
        if (ValidarDimensiones()) {
            MatrizBotones = new JButton[DimensionX][DimensionY];
            jp_botones.setLayout(new GridLayout(DimensionX, DimensionY));
            ObtenerTamanioObjetos(DimensionX, DimensionY);
            for (int contadorX = 0; contadorX < DimensionX; contadorX++) {
                for (int contadorY = 0; contadorY < DimensionY; contadorY++) {
                    JButton btnNuevo = new JButton();
                    if ((contadorX + contadorY) % 2 == 0) {
                        btnNuevo.setBackground(java.awt.Color.YELLOW);
                    } else {
                        btnNuevo.setBackground(java.awt.Color.BLUE);
                    }
                    btnNuevo.setSize(TamX, TamY);
                    btnNuevo.setToolTipText(Integer.toString(contadorX) + "," + Integer.toString(contadorY));
                    MatrizBotones[contadorX][contadorY] = btnNuevo;
                    MatrizBotones[contadorX][contadorY].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Click(btnNuevo);
                        }
                    });
                    jp_botones.add(MatrizBotones[contadorX][contadorY]);
                    RedibujarTablero();
                }
            }
        }
        for (int i = 0; i < MatrizBotones.length; i++) {
            for (int j = 0; j < MatrizBotones[i].length; j++) {
                if (i == 6) {
                    piezas[i][j] = new Peon("Blanco", i, j);
                }
                if (i == 1) {
                    piezas[i][j] = new Peon("Negro", i, j);
                }
                if ((i == 0 && j == 0) || (i == 0 && j == 7)) {
                    piezas[i][j] = new Torre("Negro", i, j);
                }
                if ((i == 7 && j == 0) || (i == 7 && j == 7)) {
                    piezas[i][j] = new Torre("Blanco", i, j);
                }
                if ((i == 7 && j == 1) || (i == 7 && j == 6)) {
                    piezas[i][j] = new Caballo("Blanco", i, j);
                }
                if ((i == 0 && j == 1) || (i == 0 && j == 6)) {
                    piezas[i][j] = new Caballo("Negro", i, j);
                }
                if ((i == 0 && j == 2) || (i == 0 && j == 5)) {
                    piezas[i][j] = new Alfil("Negro", i, j);
                }
                if ((i == 7 && j == 2) || (i == 7 && j == 5)) {
                    piezas[i][j] = new Alfil("Blanco", i, j);
                }
                if (j == 3) {
                    if (i == 0) {
                        piezas[i][j] = new Reina("Negro", i, j);
                    } else if (i == 7) {
                        piezas[i][j] = new Reina("Blanco", i, j);
                    }
                }
                if (j == 4) {
                    if (i == 0) {
                        piezas[i][j] = new Rey("Negro", i, j);
                    } else if (i == 7) {
                        piezas[i][j] = new Rey("Blanco", i, j);
                    }
                }
            }
        }
        for (int i = 0; i < MatrizBotones.length; i++) {
            for (int j = 0; j < MatrizBotones.length; j++) {
                if (piezas[i][j] == null) {
                } else {
                    MatrizBotones[i][j].setIcon(piezas[i][j].getIcon());
                }
            }
        }
        if (turno) {
            jug_turno.setText(jug1);
        } else {
            jug_turno.setText(jug2);
        }
        jd_juego.setModal(true);
        jd_juego.setLocationRelativeTo(this);
        jd_juego.pack();
        jd_juego.setVisible(true);
    }//GEN-LAST:event_jb_iniciojuegoMouseClicked

    public void actualizar() {
        if (HayElementos()) {
            EliminarRecursiva(MatrizBotones, 7, 7);
            jp_botones.removeAll();
            RedibujarTablero();
        }
        if (ValidarDimensiones()) {
            MatrizBotones = new JButton[DimensionX][DimensionY];
            jp_botones.setLayout(new GridLayout(DimensionX, DimensionY));
            ObtenerTamanioObjetos(DimensionX, DimensionY);
            for (int contadorX = 0; contadorX < DimensionX; contadorX++) {
                for (int contadorY = 0; contadorY < DimensionY; contadorY++) {
                    JButton btnNuevo = new JButton();
                    if ((contadorX + contadorY) % 2 == 0) {
                        btnNuevo.setBackground(java.awt.Color.YELLOW);
                    } else {
                        btnNuevo.setBackground(java.awt.Color.BLUE);
                    }
                    btnNuevo.setSize(TamX, TamY);
                    btnNuevo.setToolTipText(Integer.toString(contadorX) + "," + Integer.toString(contadorY));
                    MatrizBotones[contadorX][contadorY] = btnNuevo;
                    MatrizBotones[contadorX][contadorY].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Click(btnNuevo);
                        }
                    });
                    jp_botones.add(MatrizBotones[contadorX][contadorY]);
                    RedibujarTablero();
                }
            }
        }
        for (int i = 0; i < MatrizBotones.length; i++) {
            for (int j = 0; j < MatrizBotones.length; j++) {
                if (piezas[i][j] == null) {
                } else {
                    MatrizBotones[i][j].setIcon(piezas[i][j].getIcon());
                }
            }
        }
        if (turno) {
            jug_turno.setText(jug1);
        } else {
            jug_turno.setText(jug2);
        }
    }

    private void jb_iniciojuegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_iniciojuegoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_iniciojuegoKeyPressed

    private void jb_moverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_moverMouseClicked
        // TODO add your handling code here:
        try {
            boolean comb = false;
            String col;
            if (turno) {
                col = "blanco";
            } else {
                col = "negro";
            }
            int xi = (Integer) jsxinicio.getValue();
            int yi = (Integer) jsyinicio.getValue();
            int xf = (Integer) jsxfin.getValue();
            int yf = (Integer) jsyfin.getValue();
            Pieza h = piezas[xi][yi];
            if (turno == true && h.getColor().equals("Blanco")) {
                comb = true;
            } else if (turno == false && h.getColor().equals("Negro")) {
                comb = true;
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una pieza que pertenezca a su color.");
            }
            if (comb) {

                ArrayList<Posicion> comp = new ArrayList();
                if (h instanceof Caballo) {
                    boolean move = false;
                    if (piezas[xf][yf] != null) {
                        if (piezas[xf][yf].getColor().equalsIgnoreCase(col)) {
                            JOptionPane.showMessageDialog(jd_juego, "No se pueden comer piezas del mismo color.");
                        } else {
                            move = legalMoveCaballo(xi, yi, xf, yf);
                            if (move) {
                                piezas[xf][yf] = null;
                                piezas[xi][yi].setPosX(xf);
                                piezas[xi][yi].setPosY(yf);
                                piezas[xf][yf] = piezas[xi][yi];
                                piezas[xi][yi] = null;
                                actualizar();
                                gana();
                                turno = !turno;
                            } else {
                                JOptionPane.showMessageDialog(jd_juego, "Movimiento no valido!");
                            }
                        }
                    } else {
                        move = legalMoveCaballo(xi, yi, xf, yf);
                        if (move) {
                            piezas[xi][yi].setPosX(xf);
                            piezas[xi][yi].setPosY(yf);
                            piezas[xf][yf] = piezas[xi][yi];
                            piezas[xi][yi] = null;
                            actualizar();
                            gana();
                            turno = !turno;
                        } else {
                            JOptionPane.showMessageDialog(jd_juego, "Movimiento no valido!");
                        }
                    }
                } else if (h instanceof Peon) {
                    boolean move = false;
                    int current;
                    if (turno) {
                        current = 1;
                    } else {
                        current = 2;
                    }
                    if (piezas[xf][yf] != null) {
                        if (piezas[xf][yf].getColor().equalsIgnoreCase(col)) {
                            JOptionPane.showMessageDialog(jd_juego, "No se pueden comer piezas del mismo color.");
                        } else {
                            move = legalMovePeon(xi, yi, xf, yf, piezas, current);
                            if (move) {
                                piezas[xf][yf] = null;
                                piezas[xi][yi].setPosX(xf);
                                piezas[xi][yi].setPosY(yf);
                                piezas[xf][yf] = piezas[xi][yi];
                                piezas[xi][yi] = null;
                                actualizar();
                                gana();
                                turno = !turno;
                            } else {
                                JOptionPane.showMessageDialog(jd_juego, "Movimiento no valido!");
                            }
                        }
                    } else {
                        move = legalMovePeon(xi, yi, xf, yf, piezas, current);
                        if (move) {
                            piezas[xf][yf] = null;
                            piezas[xi][yi].setPosX(xf);
                            piezas[xi][yi].setPosY(yf);
                            piezas[xf][yf] = piezas[xi][yi];
                            piezas[xi][yi] = null;
                            actualizar();
                            gana();
                            turno = !turno;
                        } else {
                            JOptionPane.showMessageDialog(jd_juego, "Movimiento no valido!");
                        }
                    }
                } else {
                    boolean mover = false;
                    comp = h.posiblesMovimientos(piezas);
                    for (int i = 0; i < comp.size(); i++) {
                        if ((comp.get(i).getX() == xf) && (comp.get(i).getY() == yf)) {
                            mover = true;
                            break;
                        }
                    }
                    if (mover) {
                        piezas[xf][yf] = null;
                        piezas[xi][yi].setPosX(xf);
                        piezas[xi][yi].setPosY(yf);
                        piezas[xf][yf] = piezas[xi][yi];
                        piezas[xi][yi] = null;
                        actualizar();
                        gana();
                        turno = !turno;
                    } else {
                        JOptionPane.showMessageDialog(jd_juego, "Movimiento no valido!");
                    }
                }
                actualizar();
                jsxfin.setValue(0);
                jsxinicio.setValue(0);
                jsyfin.setValue(0);
                jsyinicio.setValue(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_moverMouseClicked

    private void jb_iniciojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_iniciojuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_iniciojuegoActionPerformed

    public boolean legalMoveCaballo(int startRow, int startColumn, int desRow, int desColumn) {

        if (desRow == (startRow - 2) && desColumn == (startColumn - 1))
        {
            return true;
        } else if (desRow == (startRow - 2) && desColumn == (startColumn + 1))
        {
            return true;
        } else if (desRow == (startRow + 2) && desColumn == (startColumn - 1))
        {
            return true;
        } else if (desRow == (startRow + 2) && desColumn == (startColumn + 1))
        {
            return true;
        } else if (desRow == (startRow - 1) && desColumn == (startColumn - 2))
        {
            return true;
        } else if (desRow == (startRow - 1) && desColumn == (startColumn + 2)) 
        {
            return true;
        } else if (desRow == (startRow + 1) && desColumn == (startColumn - 2))
        {
            return true;
        } else if (desRow == (startRow + 1) && desColumn == (startColumn + 2)) 
        {
            return true;
        }

        return false;

    }

    public void gana() {
        int cont = 0;
        for (int i = 0; i < piezas.length; i++) {
            for (int j = 0; j < piezas.length; j++) {
                if (piezas[i][j] instanceof Rey) {
                    cont++;
                }
            }
        }
        String gana;
        if (turno) {
            gana = jug1;
        } else {
            gana = jug2;
        }
        if (cont == 2) {

        } else {
            JOptionPane.showMessageDialog(jd_juego, "Felicidades ha ganado " + gana);
            jd_juego.dispose();
        }
    }

    public boolean legalMovePeon(int startRow, int startColumn, int desRow, int desColumn, Pieza[][] playerMatrix, int currentPlayer) {

        boolean legalMove = true;
        int[] playerPawnStart = {6, 1};
        if ((currentPlayer == 1 && desRow >= startRow) || (currentPlayer == 2 && desRow <= startRow))
        {
            legalMove = false;
        } else if (desColumn != startColumn) {
            if ((desColumn > startColumn && desColumn == (startColumn + 1)) || (desColumn < startColumn && desColumn == (startColumn - 1))) {
                if ((desRow == (startRow + 1) && currentPlayer == 2) || (desRow == (startRow - 1) && currentPlayer == 1)) {
                    if (playerMatrix[desRow][desColumn] == null) {
                        legalMove = false;
                    }
                } else {
                    legalMove = false;
                }
            } else {
                legalMove = false;
            }
        } else if ((currentPlayer == 1 && desRow < (startRow - 1)) || (currentPlayer == 2 && desRow > (startRow + 1)))
        {
            if ((currentPlayer == 1 && desRow == (startRow - 2)) || (currentPlayer == 2 && desRow == (startRow + 2)))
            {
                if (playerPawnStart[currentPlayer - 1] != startRow) {
                    legalMove = false;
                }
            } else {
                legalMove = false;
            }
        }
        return legalMove;

    }

    private void EliminarRecursiva(JButton matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            matriz[filas][cols] = null;
        } else {
            if (cols == matriz[0].length - 1) {
                matriz[filas][cols] = null;
                EliminarRecursiva(matriz, filas + 1, 0);
            } else {
                matriz[filas][cols] = null;
                EliminarRecursiva(matriz, filas, cols + 1);
            }
        }
    }

    private boolean HayElementos() {
        return jp_botones.getComponentCount() > 0;
    }

    private void Click(JButton btn) {
        JOptionPane.showMessageDialog(jd_juego, btn.getToolTipText());
    }

    boolean esNumerico(String valorString) {
        try {
            Integer.parseInt(valorString);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    private boolean ValidarDimensiones() {
        boolean valido = false;
        if (esNumerico("8")) {
            if (esNumerico("8")) {
                DimensionX = Integer.parseInt("8");
                DimensionY = Integer.parseInt("8");
                if (((DimensionX < 101) && (DimensionY < 101)) && ((DimensionX > 0) && (DimensionY > 0))) {
                    return true;
                }
            }
        }
        return valido;
    }

    private void ObtenerTamanioObjetos(int cantX, int cantY) {
        TamX = TableroX / cantX;
        TamY = TableroY / cantY;
    }

    private void RedibujarTablero() {
        jp_botones.validate();
        jp_botones.repaint();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_iniciojuego;
    private javax.swing.JButton jb_mover;
    private javax.swing.JDialog jd_juego;
    private javax.swing.JLabel jl_fondo;
    private javax.swing.JPanel jp_botones;
    private javax.swing.JSpinner jsxfin;
    private javax.swing.JSpinner jsxinicio;
    private javax.swing.JSpinner jsyfin;
    private javax.swing.JSpinner jsyinicio;
    private javax.swing.JLabel jug_turno;
    private javax.swing.JTextField tf_jugador1;
    private javax.swing.JTextField tf_jugador2;
    // End of variables declaration//GEN-END:variables
    String jug1, jug2;
    int DimensionX = 8;
    int DimensionY = 8;
    int TamX = 0;
    int TamY = 0;
    static final int TableroX = 456;
    static final int TableroY = 456;
    JButton[][] MatrizBotones;
    Pieza[][] piezas = new Pieza[8][8];
    boolean turno = true;
    boolean ganar = false;
}

package view;

import controller.GridController;
import model.Cell;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.SwingConstants;

public class GridSudokuView extends JFrame {

    private HashMap<String, JTextField> textFieldHashMap = new HashMap<String, JTextField>();
    private JTextField[][] matTextFields = new JTextField[9][9];

    private JPanel contentPane;
    private JPanel mainGrid;
    private JPanel southButtons;
    private JPanel panel;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JButton btnReady;
    private JPanel panel_1;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JPanel panel_2;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JPanel panel_3;
    private JTextField textField_27;
    private JTextField textField_28;
    private JTextField textField_29;
    private JTextField textField_30;
    private JTextField textField_31;
    private JTextField textField_32;
    private JTextField textField_33;
    private JTextField textField_34;
    private JTextField textField_35;
    private JPanel panel_4;
    private JTextField textField_36;
    private JTextField textField_37;
    private JTextField textField_38;
    private JTextField textField_39;
    private JTextField textField_40;
    private JTextField textField_41;
    private JTextField textField_42;
    private JTextField textField_43;
    private JTextField textField_44;
    private JPanel panel_5;
    private JTextField textField_45;
    private JTextField textField_46;
    private JTextField textField_47;
    private JTextField textField_48;
    private JTextField textField_49;
    private JTextField textField_50;
    private JTextField textField_51;
    private JTextField textField_52;
    private JTextField textField_53;
    private JPanel panel_6;
    private JTextField textField_54;
    private JTextField textField_55;
    private JTextField textField_56;
    private JTextField textField_57;
    private JTextField textField_58;
    private JTextField textField_59;
    private JTextField textField_60;
    private JTextField textField_61;
    private JTextField textField_62;
    private JPanel panel_7;
    private JTextField textField_63;
    private JTextField textField_64;
    private JTextField textField_65;
    private JTextField textField_66;
    private JTextField textField_67;
    private JTextField textField_68;
    private JTextField textField_69;
    private JTextField textField_70;
    private JTextField textField_71;
    private JPanel panel_8;
    private JTextField textField_72;
    private JTextField textField_73;
    private JTextField textField_74;
    private JTextField textField_75;
    private JTextField textField_76;
    private JTextField textField_77;
    private JTextField textField_78;
    private JTextField textField_79;
    private JTextField textField_80;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GridSudokuView frame = new GridSudokuView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public GridSudokuView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        mainGrid = new JPanel();
        contentPane.add(mainGrid, BorderLayout.CENTER);
        mainGrid.setLayout(new GridLayout(3, 3, 5, 5));

        panel = new JPanel();
        panel.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel);
        panel.setLayout(new GridLayout(3, 3, 1, 1));

        textField = new JTextField();

        textField.setName("00");

        matTextFields[0][0] = textField;
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField.setColumns(10);
        textField_1 = new JTextField();

        textField_1.setName("01");
        panel.add(textField);

        matTextFields[0][1] = textField_1;
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_1.setColumns(10);
        panel.add(textField_1);

        textField_2 = new JTextField();

        textField_2.setName("02");

        matTextFields[0][2] = textField_2;
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_2.setColumns(10);
        panel.add(textField_2);

        textField_3 = new JTextField();

        textField_3.setName("10");

        matTextFields[1][0] = textField_3;
        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_3.setColumns(10);
        panel.add(textField_3);
        textField_4 = new JTextField();

        textField_4.setName("11");

        matTextFields[1][1] = textField_4;
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_4.setColumns(10);
        panel.add(textField_4);

        textField_5 = new JTextField();

        textField_5.setName("12");

        matTextFields[1][2] = textField_5;
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_5.setColumns(10);
        panel.add(textField_5);

        textField_6 = new JTextField();

        textField_6.setName("20");

        matTextFields[2][0] = textField_6;
        textField_6.setHorizontalAlignment(SwingConstants.CENTER);
        textField_6.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_6.setColumns(10);
        panel.add(textField_6);
        textField_7 = new JTextField();

        textField_7.setName("21");

        matTextFields[2][1] = textField_7;
        textField_7.setHorizontalAlignment(SwingConstants.CENTER);
        textField_7.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_7.setColumns(10);
        panel.add(textField_7);
        textField_8 = new JTextField();

        textField_8.setToolTipText("");
        textField_8.setName("22");
        panel.add(textField_8);
        matTextFields[2][2] = textField_8;
        textField_8.setHorizontalAlignment(SwingConstants.CENTER);
        textField_8.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_8.setColumns(10);

        panel_1 = new JPanel();
        panel_1.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_1);
        panel_1.setLayout(new GridLayout(3, 3, 1, 1));

        textField_9 = new JTextField();

        textField_9.setName("03");

        matTextFields[0][3] = textField_9;
        textField_9.setHorizontalAlignment(SwingConstants.CENTER);
        textField_9.setFont(new Font("Consolas", Font.PLAIN, 20));
        panel_1.add(textField_9);

        textField_10 = new JTextField();

        ;
        textField_10.setName("04");
        matTextFields[0][4] = textField_10;

        textField_10.setHorizontalAlignment(SwingConstants.CENTER);
        textField_10.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_10.setColumns(10);
        panel_1.add(textField_10);

        textField_11 = new JTextField();

        textField_11.setName("05");
        matTextFields[0][5] = textField_11;

        textField_11.setHorizontalAlignment(SwingConstants.CENTER);
        textField_11.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_11.setColumns(10);
        panel_1.add(textField_11);

        textField_12 = new JTextField();
        textField_12.setName("13");
        matTextFields[1][3] = textField_12;

        textField_12.setHorizontalAlignment(SwingConstants.CENTER);
        textField_12.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_12.setColumns(10);
        panel_1.add(textField_12);

        textField_13 = new JTextField();

        textField_13.setName("14");
        matTextFields[1][4] = textField_13;

        textField_13.setHorizontalAlignment(SwingConstants.CENTER);
        textField_13.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_13.setColumns(10);
        panel_1.add(textField_13);

        textField_14 = new JTextField();
        textField_14.setName("15");
        matTextFields[1][5] = textField_14;

        textField_14.setHorizontalAlignment(SwingConstants.CENTER);
        textField_14.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_14.setColumns(10);
        panel_1.add(textField_14);

        textField_15 = new JTextField();
        textField_15.setName("23");
        matTextFields[2][3] = textField_15;

        textField_15.setHorizontalAlignment(SwingConstants.CENTER);
        textField_15.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_15.setColumns(10);
        panel_1.add(textField_15);

        textField_16 = new JTextField();
        textField_16.setName("24");
        matTextFields[2][4] = textField_16;

        textField_16.setHorizontalAlignment(SwingConstants.CENTER);
        textField_16.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_16.setColumns(10);
        panel_1.add(textField_16);

        textField_17 = new JTextField();

        textField_17.setName("25");
        matTextFields[2][5] = textField_17;

        textField_17.setHorizontalAlignment(SwingConstants.CENTER);
        textField_17.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_17.setColumns(10);
        panel_1.add(textField_17);

        panel_2 = new JPanel();
        panel_2.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_2);
        panel_2.setLayout(new GridLayout(3, 3, 1, 1));

        textField_18 = new JTextField();

        textField_18.setName("06");
        matTextFields[0][6] = textField_18;

        textField_18.setHorizontalAlignment(SwingConstants.CENTER);
        textField_18.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_18.setColumns(10);
        panel_2.add(textField_18);

        textField_19 = new JTextField();
        textField_19.setName("07");
        matTextFields[0][7] = textField_19;

        textField_19.setHorizontalAlignment(SwingConstants.CENTER);
        textField_19.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_19.setColumns(10);
        panel_2.add(textField_19);

        textField_20 = new JTextField();

        textField_20.setName("08");
        matTextFields[0][8] = textField_20;

        textField_20.setHorizontalAlignment(SwingConstants.CENTER);
        textField_20.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_20.setColumns(10);
        panel_2.add(textField_20);

        textField_21 = new JTextField();
        textField_21.setName("16");
        matTextFields[1][6] = textField_21;

        textField_21.setHorizontalAlignment(SwingConstants.CENTER);
        textField_21.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_21.setColumns(10);
        panel_2.add(textField_21);

        textField_22 = new JTextField();

        textField_22.setName("17");
        matTextFields[1][7] = textField_22;

        textField_22.setHorizontalAlignment(SwingConstants.CENTER);
        textField_22.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_22.setColumns(10);
        panel_2.add(textField_22);

        textField_23 = new JTextField();
        textField_23.setName("18");
        matTextFields[1][8] = textField_23;

        textField_23.setHorizontalAlignment(SwingConstants.CENTER);
        textField_23.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_23.setColumns(10);
        panel_2.add(textField_23);

        textField_24 = new JTextField();

        textField_24.setName("26");
        matTextFields[2][6] = textField_24;

        textField_24.setHorizontalAlignment(SwingConstants.CENTER);
        textField_24.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_24.setColumns(10);
        panel_2.add(textField_24);

        textField_25 = new JTextField();
        textField_25.setName("27");
        matTextFields[2][7] = textField_25;

        textField_25.setHorizontalAlignment(SwingConstants.CENTER);
        textField_25.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_25.setColumns(10);
        panel_2.add(textField_25);

        textField_26 = new JTextField();
        textField_26.setName("28");
        matTextFields[2][8] = textField_26;

        textField_26.setHorizontalAlignment(SwingConstants.CENTER);
        textField_26.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_26.setColumns(10);
        panel_2.add(textField_26);

        panel_3 = new JPanel();
        panel_3.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_3);
        panel_3.setLayout(new GridLayout(3, 3, 1, 1));

        textField_27 = new JTextField();

        textField_27.setName("30");
        matTextFields[3][0] = textField_27;

        textField_27.setHorizontalAlignment(SwingConstants.CENTER);
        textField_27.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_27.setColumns(10);
        panel_3.add(textField_27);

        textField_28 = new JTextField();

        textField_28.setToolTipText("");
        textField_28.setName("31");
        matTextFields[3][1] = textField_28;

        textField_28.setHorizontalAlignment(SwingConstants.CENTER);
        textField_28.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_28.setColumns(10);
        panel_3.add(textField_28);

        textField_29 = new JTextField();

        textField_29.setName("32");
        matTextFields[3][2] = textField_29;

        textField_29.setHorizontalAlignment(SwingConstants.CENTER);
        textField_29.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_29.setColumns(10);
        panel_3.add(textField_29);

        textField_30 = new JTextField();

        textField_30.setName("40");
        matTextFields[4][0] = textField_30;

        textField_30.setHorizontalAlignment(SwingConstants.CENTER);
        textField_30.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_30.setColumns(10);
        panel_3.add(textField_30);

        textField_31 = new JTextField();

        textField_31.setName("41");
        matTextFields[4][1] = textField_31;

        textField_31.setHorizontalAlignment(SwingConstants.CENTER);
        textField_31.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_31.setColumns(10);
        panel_3.add(textField_31);

        textField_32 = new JTextField();

        textField_32.setName("42");
        matTextFields[4][2] = textField_32;

        textField_32.setHorizontalAlignment(SwingConstants.CENTER);
        textField_32.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_32.setColumns(10);
        panel_3.add(textField_32);

        textField_33 = new JTextField();

        textField_33.setName("50");
        matTextFields[5][0] = textField_33;

        textField_33.setHorizontalAlignment(SwingConstants.CENTER);
        textField_33.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_33.setColumns(10);
        panel_3.add(textField_33);

        textField_34 = new JTextField();

        textField_34.setName("51");
        matTextFields[5][1] = textField_34;

        textField_34.setHorizontalAlignment(SwingConstants.CENTER);
        textField_34.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_34.setColumns(10);
        panel_3.add(textField_34);

        textField_35 = new JTextField();

        textField_35.setToolTipText("");
        textField_35.setName("52");
        matTextFields[5][2] = textField_35;

        textField_35.setHorizontalAlignment(SwingConstants.CENTER);
        textField_35.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_35.setColumns(10);
        panel_3.add(textField_35);

        panel_4 = new JPanel();
        panel_4.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_4);
        panel_4.setLayout(new GridLayout(3, 3, 1, 1));

        textField_36 = new JTextField();

        textField_36.setName("33");
        matTextFields[3][3] = textField_36;

        textField_36.setHorizontalAlignment(SwingConstants.CENTER);
        textField_36.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_36.setColumns(10);
        panel_4.add(textField_36);

        textField_37 = new JTextField();
        textField_37.setName("34");
        matTextFields[3][4] = textField_37;

        textField_37.setHorizontalAlignment(SwingConstants.CENTER);
        textField_37.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_37.setColumns(10);
        panel_4.add(textField_37);

        textField_38 = new JTextField();
        textField_38.setName("35");
        matTextFields[3][5] = textField_38;

        textField_38.setHorizontalAlignment(SwingConstants.CENTER);
        textField_38.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_38.setColumns(10);
        panel_4.add(textField_38);

        textField_39 = new JTextField();

        textField_39.setName("43");
        matTextFields[4][3] = textField_39;

        textField_39.setHorizontalAlignment(SwingConstants.CENTER);
        textField_39.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_39.setColumns(10);
        panel_4.add(textField_39);

        textField_40 = new JTextField();
        textField_40.setName("44");
        matTextFields[4][4] = textField_40;

        textField_40.setHorizontalAlignment(SwingConstants.CENTER);
        textField_40.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_40.setColumns(10);
        panel_4.add(textField_40);

        textField_41 = new JTextField();

        textField_41.setName("45");
        matTextFields[4][5] = textField_41;

        textField_41.setHorizontalAlignment(SwingConstants.CENTER);
        textField_41.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_41.setColumns(10);
        panel_4.add(textField_41);

        textField_42 = new JTextField();
        textField_42.setName("53");
        matTextFields[5][3] = textField_42;

        textField_42.setHorizontalAlignment(SwingConstants.CENTER);
        textField_42.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_42.setColumns(10);
        panel_4.add(textField_42);

        textField_43 = new JTextField();
        textField_43.setName("54");
        matTextFields[5][4] = textField_43;

        textField_43.setHorizontalAlignment(SwingConstants.CENTER);
        textField_43.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_43.setColumns(10);
        panel_4.add(textField_43);

        textField_44 = new JTextField();

        textField_44.setName("55");
        matTextFields[5][5] = textField_44;

        textField_44.setHorizontalAlignment(SwingConstants.CENTER);
        textField_44.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_44.setColumns(10);
        panel_4.add(textField_44);

        panel_5 = new JPanel();
        panel_5.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_5);
        panel_5.setLayout(new GridLayout(3, 3, 1, 1));

        textField_45 = new JTextField();
        textField_45.setName("36");
        matTextFields[3][6] = textField_45;

        textField_45.setHorizontalAlignment(SwingConstants.CENTER);
        textField_45.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_45.setColumns(10);
        panel_5.add(textField_45);

        textField_46 = new JTextField();

        textField_46.setName("37");
        matTextFields[3][7] = textField_46;

        textField_46.setHorizontalAlignment(SwingConstants.CENTER);
        textField_46.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_46.setColumns(10);
        panel_5.add(textField_46);

        textField_47 = new JTextField();
        textField_47.setName("38");
        matTextFields[3][8] = textField_47;

        textField_47.setHorizontalAlignment(SwingConstants.CENTER);
        textField_47.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_47.setColumns(10);
        panel_5.add(textField_47);

        textField_48 = new JTextField();

        textField_48.setName("46");
        matTextFields[4][6] = textField_48;

        textField_48.setHorizontalAlignment(SwingConstants.CENTER);
        textField_48.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_48.setColumns(10);
        panel_5.add(textField_48);

        textField_49 = new JTextField();
        textField_49.setName("47");
        matTextFields[4][7] = textField_49;

        textField_49.setHorizontalAlignment(SwingConstants.CENTER);
        textField_49.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_49.setColumns(10);
        panel_5.add(textField_49);

        textField_50 = new JTextField();
        textField_50.setName("48");
        matTextFields[4][8] = textField_50;

        textField_50.setHorizontalAlignment(SwingConstants.CENTER);
        textField_50.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_50.setColumns(10);
        panel_5.add(textField_50);

        textField_51 = new JTextField();
        textField_51.setName("56");
        matTextFields[5][6] = textField_51;

        textField_51.setHorizontalAlignment(SwingConstants.CENTER);
        textField_51.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_51.setColumns(10);
        panel_5.add(textField_51);

        textField_52 = new JTextField();

        textField_52.setName("57");
        matTextFields[5][7] = textField_52;

        textField_52.setHorizontalAlignment(SwingConstants.CENTER);
        textField_52.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_52.setColumns(10);
        panel_5.add(textField_52);

        textField_53 = new JTextField();

        textField_53.setToolTipText("");
        textField_53.setName("58");
        matTextFields[5][8] = textField_53;

        textField_53.setHorizontalAlignment(SwingConstants.CENTER);
        textField_53.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_53.setColumns(10);
        panel_5.add(textField_53);

        panel_6 = new JPanel();
        panel_6.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_6);
        panel_6.setLayout(new GridLayout(3, 3, 1, 1));

        textField_54 = new JTextField();

        textField_54.setName("60");
        matTextFields[6][0] = textField_54;

        textField_54.setHorizontalAlignment(SwingConstants.CENTER);
        textField_54.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_54.setColumns(10);
        panel_6.add(textField_54);

        textField_55 = new JTextField();

        textField_55.setName("61");
        matTextFields[6][1] = textField_55;

        textField_55.setHorizontalAlignment(SwingConstants.CENTER);
        textField_55.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_55.setColumns(10);
        panel_6.add(textField_55);

        textField_56 = new JTextField();

        textField_56.setName("62");
        matTextFields[6][2] = textField_56;

        textField_56.setHorizontalAlignment(SwingConstants.CENTER);
        textField_56.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_56.setColumns(10);
        panel_6.add(textField_56);

        textField_57 = new JTextField();

        textField_57.setName("70");
        matTextFields[7][0] = textField_57;

        textField_57.setHorizontalAlignment(SwingConstants.CENTER);
        textField_57.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_57.setColumns(10);
        panel_6.add(textField_57);

        textField_58 = new JTextField();

        textField_58.setName("71");
        matTextFields[7][1] = textField_58;

        textField_58.setHorizontalAlignment(SwingConstants.CENTER);
        textField_58.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_58.setColumns(10);
        panel_6.add(textField_58);

        textField_59 = new JTextField();

        textField_59.setName("72");
        matTextFields[7][2] = textField_59;

        textField_59.setHorizontalAlignment(SwingConstants.CENTER);
        textField_59.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_59.setColumns(10);
        panel_6.add(textField_59);

        textField_60 = new JTextField();

        textField_60.setName("80");
        matTextFields[8][0] = textField_60;

        textField_60.setHorizontalAlignment(SwingConstants.CENTER);
        textField_60.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_60.setColumns(10);
        panel_6.add(textField_60);

        textField_61 = new JTextField();

        textField_61.setName("81");
        matTextFields[8][1] = textField_61;

        textField_61.setHorizontalAlignment(SwingConstants.CENTER);
        textField_61.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_61.setColumns(10);
        panel_6.add(textField_61);

        textField_62 = new JTextField();

        textField_62.setName("82");
        matTextFields[8][2] = textField_62;

        textField_62.setHorizontalAlignment(SwingConstants.CENTER);
        textField_62.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_62.setColumns(10);
        panel_6.add(textField_62);

        panel_7 = new JPanel();
        panel_7.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_7);
        panel_7.setLayout(new GridLayout(3, 3, 1, 1));

        textField_63 = new JTextField();

        textField_63.setName("63");
        matTextFields[6][3] = textField_63;

        textField_63.setHorizontalAlignment(SwingConstants.CENTER);
        textField_63.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_63.setColumns(10);
        panel_7.add(textField_63);

        textField_64 = new JTextField();
        textField_64.setName("64");
        matTextFields[6][4] = textField_64;

        textField_64.setHorizontalAlignment(SwingConstants.CENTER);
        textField_64.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_64.setColumns(10);
        panel_7.add(textField_64);

        textField_65 = new JTextField();
        textField_65.setName("65");
        matTextFields[6][5] = textField_65;

        textField_65.setHorizontalAlignment(SwingConstants.CENTER);
        textField_65.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_65.setColumns(10);
        panel_7.add(textField_65);

        textField_66 = new JTextField();
        textField_66.setName("73");
        matTextFields[7][3] = textField_66;

        textField_66.setHorizontalAlignment(SwingConstants.CENTER);
        textField_66.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_66.setColumns(10);
        panel_7.add(textField_66);

        textField_67 = new JTextField();

        textField_67.setName("74");
        matTextFields[7][4] = textField_67;

        textField_67.setHorizontalAlignment(SwingConstants.CENTER);
        textField_67.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_67.setColumns(10);
        panel_7.add(textField_67);

        textField_68 = new JTextField();
        textField_68.setName("75");
        matTextFields[7][5] = textField_68;

        textField_68.setHorizontalAlignment(SwingConstants.CENTER);
        textField_68.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_68.setColumns(10);
        panel_7.add(textField_68);

        textField_69 = new JTextField();
        textField_69.setName("83");
        matTextFields[8][3] = textField_69;

        textField_69.setHorizontalAlignment(SwingConstants.CENTER);
        textField_69.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_69.setColumns(10);
        panel_7.add(textField_69);

        textField_70 = new JTextField();

        textField_70.setName("84");
        matTextFields[8][4] = textField_70;

        textField_70.setHorizontalAlignment(SwingConstants.CENTER);
        textField_70.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_70.setColumns(10);
        panel_7.add(textField_70);

        textField_71 = new JTextField();

        textField_71.setName("85");
        matTextFields[8][5] = textField_71;

        textField_71.setHorizontalAlignment(SwingConstants.CENTER);
        textField_71.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_71.setColumns(10);
        panel_7.add(textField_71);

        panel_8 = new JPanel();
        panel_8.setFont(new Font("Consolas", Font.PLAIN, 35));
        panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        mainGrid.add(panel_8);
        panel_8.setLayout(new GridLayout(3, 3, 1, 1));

        textField_72 = new JTextField();

        textField_72.setName("66");
        matTextFields[6][6] = textField_72;

        textField_72.setHorizontalAlignment(SwingConstants.CENTER);
        textField_72.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_72.setColumns(10);
        panel_8.add(textField_72);

        textField_73 = new JTextField();

        textField_73.setName("67");
        matTextFields[6][7] = textField_73;

        textField_73.setHorizontalAlignment(SwingConstants.CENTER);
        textField_73.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_73.setColumns(10);
        panel_8.add(textField_73);

        textField_74 = new JTextField();

        textField_74.setName("68");
        matTextFields[6][8] = textField_74;

        textField_74.setHorizontalAlignment(SwingConstants.CENTER);
        textField_74.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_74.setColumns(10);
        panel_8.add(textField_74);

        textField_75 = new JTextField();

        textField_75.setName("76");
        matTextFields[7][6] = textField_75;

        textField_75.setHorizontalAlignment(SwingConstants.CENTER);
        textField_75.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_75.setColumns(10);
        panel_8.add(textField_75);

        textField_76 = new JTextField();

        textField_76.setName("77");
        matTextFields[7][7] = textField_76;

        textField_76.setHorizontalAlignment(SwingConstants.CENTER);
        textField_76.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_76.setColumns(10);
        panel_8.add(textField_76);

        textField_77 = new JTextField();

        textField_77.setName("78");
        matTextFields[7][8] = textField_77;

        textField_77.setHorizontalAlignment(SwingConstants.CENTER);
        textField_77.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_77.setColumns(10);
        panel_8.add(textField_77);

        textField_78 = new JTextField();
        textField_78.setName("86");
        matTextFields[8][6] = textField_78;

        textField_78.setHorizontalAlignment(SwingConstants.CENTER);
        textField_78.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_78.setColumns(10);
        panel_8.add(textField_78);

        textField_79 = new JTextField();
        textField_79.setName("87");
        matTextFields[8][7] = textField_79;

        textField_79.setHorizontalAlignment(SwingConstants.CENTER);
        textField_79.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_79.setColumns(10);
        panel_8.add(textField_79);

        textField_80 = new JTextField();
        textField_80.setName("88");
        matTextFields[8][8] = textField_80;

        textField_80.setHorizontalAlignment(SwingConstants.CENTER);
        textField_80.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField_80.setColumns(10);
        panel_8.add(textField_80);

        southButtons = new JPanel();
        contentPane.add(southButtons, BorderLayout.SOUTH);

        btnReady = new JButton("Ready");
        southButtons.add(btnReady);
        btnReady.setActionCommand("readySudoku");
    }

    public void setActionListener(GridController controller) {
        btnReady.addActionListener(controller);
    }

    public Cell[][] getMatrix() {
        Cell[][] aux = new Cell[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matTextFields[i][j].getText().isEmpty() || matTextFields[i][j].getText().length() > 1)
                    aux[i][j] = new Cell(0, false);
                else try {
                    aux[i][j] = new Cell(Integer.parseInt(matTextFields[i][j].getText()), true);
                } catch (NumberFormatException e) {
                    aux[i][j] = new Cell(0, false);
                }
            }
        }
        return aux;
    }

    public void updateGrid(Cell[][] mat) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matTextFields[i][j].setText(String.valueOf(mat[i][j].getNumber()));


            }
        }/*
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(mat[i][j].getNumber()+ " ");
            }
            System.out.println("");
        }
        System.out.println("----------");*/
    }

    public void cleanGrid() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matTextFields[i][j].getText().equals("0"))
                    matTextFields[i][j].setText("");
            }
        }
    }
}

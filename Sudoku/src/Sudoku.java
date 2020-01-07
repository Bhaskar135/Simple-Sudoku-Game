import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Sudoku implements ActionListener {
    private static int s = 0;
    private JFrame f;
    private Panel p;
    private TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, t32, t33, t34, t35, t36, t37, t38, t39, t40, t41, t42, t43, t44, t45, t46, t47, t48, t49, t50, t51, t52, t53, t54, t55, t56, t57, t58, t59, t60, t61, t62, t63, t64, t65, t66, t67, t68, t69, t70, t71, t72, t73, t74, t75, t76, t77, t78, t79, t80, t81;
    private Button submit;
    private Label l;
    ArrayList<TextField> myList = new ArrayList<TextField>();  //creating arraylist of textfield

    public static void main(String[] args) {
        Sudoku gui = new Sudoku();
        gui.sudokuGame();
    }

    private void sudokuGame() {
        f = new JFrame("SUDOKU GAME");   //creating frame
        p = new Panel();          //creating panel
        t1 = new TextField(2);
        t2 = new TextField(2);
        t3 = new TextField(2);
        t4 = new TextField(2);
        t5 = new TextField(2);
        t6 = new TextField(2);
        t7 = new TextField(2);
        t8 = new TextField(2);
        t9 = new TextField(2);
        t10 = new TextField(2);
        t11 = new TextField(2);
        t12 = new TextField(2);
        t13 = new TextField(2);
        t14 = new TextField(2);
        t15 = new TextField(2);
        t16 = new TextField(2);
        t17 = new TextField(2);
        t18 = new TextField(2);
        t19 = new TextField(2);
        t20 = new TextField(2);
        t21 = new TextField(2);
        t22 = new TextField(2);
        t23 = new TextField(2);
        t24 = new TextField(2);
        t25 = new TextField(2);
        t26 = new TextField(2);
        t27 = new TextField(2);
        t28 = new TextField(2);
        t29 = new TextField(2);
        t30 = new TextField(2);
        t31 = new TextField(2);
        t32 = new TextField(2);
        t33 = new TextField(2);
        t34 = new TextField(2);
        t35 = new TextField(2);
        t36 = new TextField(2);
        t37 = new TextField(2);
        t38 = new TextField(2);
        t39 = new TextField(2);
        t40 = new TextField(2);
        t41 = new TextField(2);
        t42 = new TextField(2);
        t43 = new TextField(2);
        t44 = new TextField(2);
        t45 = new TextField(2);
        t46 = new TextField(2);
        t47 = new TextField(2);
        t48 = new TextField(2);
        t49 = new TextField(2);
        t50 = new TextField(2);
        t51 = new TextField(2);
        t52 = new TextField(2);
        t53 = new TextField(2);
        t54 = new TextField(2);
        t55 = new TextField(2);
        t56 = new TextField(2);
        t57 = new TextField(2);
        t58 = new TextField(2);
        t59 = new TextField(2);
        t60 = new TextField(2);
        t61 = new TextField(2);
        t62 = new TextField(2);
        t63 = new TextField(2);
        t64 = new TextField(2);
        t65 = new TextField(2);
        t66 = new TextField(2);
        t67 = new TextField(2);
        t68 = new TextField(2);
        t69 = new TextField(2);
        t70 = new TextField(2);
        t71 = new TextField(2);
        t72 = new TextField(2);
        t73 = new TextField(2);
        t74 = new TextField(2);
        t75 = new TextField(2);
        t76 = new TextField(2);
        t77 = new TextField(2);
        t78 = new TextField(2);
        t79 = new TextField(2);
        t80 = new TextField(2);
        t81 = new TextField(2);       // creating textfield object
        myList.add(t1);
        myList.add(t2);
        myList.add(t3);
        myList.add(t4);
        myList.add(t5);
        myList.add(t6);
        myList.add(t7);
        myList.add(t8);
        myList.add(t9);
        myList.add(t10);
        myList.add(t11);
        myList.add(t12);
        myList.add(t13);
        myList.add(t14);
        myList.add(t15);
        myList.add(t16);
        myList.add(t17);
        myList.add(t18);
        myList.add(t19);
        myList.add(t20);
        myList.add(t21);
        myList.add(t22);
        myList.add(t23);
        myList.add(t24);
        myList.add(t25);
        myList.add(t26);
        myList.add(t27);
        myList.add(t28);
        myList.add(t29);
        myList.add(t30);
        myList.add(t31);
        myList.add(t32);
        myList.add(t33);
        myList.add(t34);
        myList.add(t35);
        myList.add(t36);
        myList.add(t37);
        myList.add(t38);
        myList.add(t39);
        myList.add(t40);
        myList.add(t41);
        myList.add(t42);
        myList.add(t43);
        myList.add(t44);
        myList.add(t45);
        myList.add(t46);
        myList.add(t47);
        myList.add(t48);
        myList.add(t49);
        myList.add(t50);
        myList.add(t51);
        myList.add(t52);
        myList.add(t53);
        myList.add(t54);
        myList.add(t55);
        myList.add(t56);
        myList.add(t57);
        myList.add(t58);
        myList.add(t59);
        myList.add(t60);
        myList.add(t61);
        myList.add(t62);
        myList.add(t63);
        myList.add(t64);
        myList.add(t65);
        myList.add(t66);
        myList.add(t67);
        myList.add(t68);
        myList.add(t69);
        myList.add(t70);
        myList.add(t71);
        myList.add(t72);
        myList.add(t73);
        myList.add(t74);
        myList.add(t75);
        myList.add(t76);
        myList.add(t77);
        myList.add(t78);
        myList.add(t79);
        myList.add(t80);
        myList.add(t81);           //adding textfield in arraylist
        p.setLayout(null);
        Font bigFont = new Font("serif", Font.BOLD, 22);  //crating object for font size
        int m = 0;
        for (int i = 0; i < 55; i = i + 27) {      //loop for creating textfield position,size,and add them in panel
            for (int j = i; j < i + 19; j = j + 9) {
                int n = 0;
                for (int k = j; k < j + 9; k = k + 3) {
                    for (int q = k; q < k + 3; q++) {
                        TextField a = myList.get(s);
                        a.setBounds(45 + n, 40 + m, 30, 30);
                        a.setFont(bigFont);    //setting font size to textfield
                        p.add(a);
                        n = n + 31;
                        s++;
                    }
                    n = n + 5;
                }
                m = m + 31;
            }
            m = m + 5;
        }
        t1.setText("5");
        t1.setEditable(false);
        t2.setText("3");
        t2.setEditable(false);
        t5.setText("7");
        t5.setEditable(false);
        t10.setText("6");
        t10.setEditable(false);
        t13.setText("1");
        t13.setEditable(false);
        t14.setText("9");
        t14.setEditable(false);
        t15.setText("5");
        t15.setEditable(false);
        t20.setText("9");
        t20.setEditable(false);
        t21.setText("8");
        t21.setEditable(false);
        t26.setText("6");
        t26.setEditable(false);
        t28.setText("8");
        t28.setEditable(false);
        t32.setText("6");
        t32.setEditable(false);
        t36.setText("3");
        t36.setEditable(false);
        t37.setText("4");
        t37.setEditable(false);
        t40.setText("8");
        t40.setEditable(false);
        t42.setText("3");
        t42.setEditable(false);
        t45.setText("1");
        t45.setEditable(false);
        t46.setText("7");
        t46.setEditable(false);
        t50.setText("2");
        t50.setEditable(false);
        t54.setText("6");
        t54.setEditable(false);
        t56.setText("6");
        t56.setEditable(false);
        t61.setText("2");
        t61.setEditable(false);
        t62.setText("8");
        t62.setEditable(false);
        t67.setText("4");
        t67.setEditable(false);
        t68.setText("1");
        t68.setEditable(false);
        t69.setText("9");
        t69.setEditable(false);
        t72.setText("5");
        t72.setEditable(false);
        t77.setText("8");
        t77.setEditable(false);
        t80.setText("7");
        t80.setEditable(false);
        t81.setText("9");
        t81.setEditable(false);
        l = new Label(" ");
        submit = new Button("Submit");     //start submit
        submit.setBounds(140, 400, 100, 30);  //submit button position
        l.setBounds(50, 350, 450, 30);  //submit button position
        submit.addActionListener(this);
        p.add(submit);
        p.add(l);
        f.add(BorderLayout.CENTER, p);      //adding panel in the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 530);    //size of the frame
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev) {
        try {
            int flag = 0;
            Font bigFont1 = new Font("serif", Font.BOLD, 28);
            loop1:
            for (int i = 0; i < 73; i = i + 9) {   //loop for comparing left to right value for each row
                for (int j = i; j < i + 9; j++) {
                    for (int k = j + 1; k < i + 9; k++) {
                        if (Integer.parseInt(myList.get(j).getText()) != Integer.parseInt(myList.get(k).getText())) {
                        } else {
                            flag = 1;
                            l.setText("Try Again");
                            l.setFont(bigFont1);
                            break loop1;
                        }
                    }
                }
            }
            loop2:
            for (int i = 0; i < 9; i++) {     //loop for comparing top to bottom value for each column
                if (flag == 1) {
                    break;
                }
                for (int j = i + 9; j < i + 73; j = j + 9) {
                    if (Integer.parseInt(myList.get(i).getText()) != Integer.parseInt(myList.get(j).getText())) {
                    } else {
                        System.out.println("Equal");
                        flag = 1;
                        l.setText("Try Again");
                        l.setFont(bigFont1);
                        break loop2;
                    }
                }
            }
            loop3:
            for (int i = 0; i < 55; i = i + 27) {    //loop for changing small grid from top to bottom
                if (flag == 1) {
                    break;
                }
                for (int j = i; j < i + 7; j = j + 3) {      //loop for changing small grid from left to right
                    for (int x = j; x < j + 19; x = x + 9) {   //loop for changing row in small grid
                        for (int y = x; y < x + 3; y++) {   //loop for changing column of a row in a small grid
                            TextField a = myList.get(y);
                            int z = x, k = y;
                            while (k < j + 21 && z < j + 19) {     //loop for finding the column of next row in small grid
                                for (int p = k; p < z + 3; p++) {   //loop for comparing main element with next element
                                    TextField b = myList.get(p);
                                    if (myList.indexOf(a) == myList.indexOf(b)) {
                                        continue;
                                    }
                                    if (Integer.parseInt(myList.get(y).getText()) != Integer.parseInt(myList.get(p).getText())) {
                                    } else {
                                        l.setText("Try Again");
                                        l.setFont(bigFont1);
                                        break loop3;
                                    }
                                    if (y == 79 && p == 80) {
                                        l.setText("Congratulation,You win");
                                        l.setFont(bigFont1);
                                        break loop3;
                                    }
                                }
                                if (x + 3 - y == 1 && y == k) {
                                    k = k + 7;
                                    z = z + 9;
                                } else if (x + 3 - y == 2 && y == k) {
                                    k = k + 8;
                                    z = z + 9;
                                } else {
                                    k = k + 9;
                                    z = z + 9;
                                }
                            }
                        }
                    }
                }
            }
        }catch(Exception ex){
            l.setText("Please enter the fields...");
        }
    }
}


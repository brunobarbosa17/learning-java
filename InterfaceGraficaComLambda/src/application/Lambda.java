package application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
  public static void main(String[] args) {

    /*new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("salve!");
      }
    }).run();

    new Thread( () -> System.out.println("salve!")).run();

    JButton jButton = new JButton();
    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("salve!");
      }
    });

    JButton jButton2 = new JButton();
    jButton2.addActionListener(e -> System.out.println("salve!!"));*/

    List<Integer> lista = Arrays.asList(1,2,3,4);

    lista.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));


    System.out.println(lista);

  }
}

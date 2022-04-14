package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900));
    list.add(new Product("Notebook", 1200));
    list.add(new Product("Tablet", 450));

    list.sort(new MyComparator());

    for(Product p : list) {
      System.out.println(p);
    }


  }
}

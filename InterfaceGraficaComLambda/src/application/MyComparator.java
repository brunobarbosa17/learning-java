package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

  @Override
  public int compare(Product p1, Product p2) {
    return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
  }
}

package ss11_map.execise.arraylist.service.impl;

import ss11_map.execise.arraylist.modle.Product;

import java.util.Comparator;

public class PriceAscending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}

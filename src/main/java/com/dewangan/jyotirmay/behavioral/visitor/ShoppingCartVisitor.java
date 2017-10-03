package com.dewangan.jyotirmay.behavioral.visitor;

/**
 * Created by jyotirmay.d on 02/10/17.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
package io.github.SrMazinho.ProjetoBack.Entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.criteria.Order;

@Entity
public class Product {

    @OneToMany(mappedBy = "product")
    private List<Order> orders;


}

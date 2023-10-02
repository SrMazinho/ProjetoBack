package io.github.SrMazinho.ProjetoBack.Entity;

import javax.persistence.OneToMany;
import javax.persistence.criteria.Order;
import java.util.List;

public class User {

    @OneToMany(mappedBy = "user")
    private List<Order> orders;


}
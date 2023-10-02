package io.github.SrMazinho.ProjetoBack.DTO;

import java.math.BigDecimal;

public class ProductDTO {

    private Long id;
    private String name;
    private BigDecimal price;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
    }


}

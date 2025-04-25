package ex01;

import lombok.Data;

@Data
public class ProductDetailDTO {
    private ProductDTO product;
    private int id;
    private String name;
    private int price;
    private int qty;

    public ProductDetailDTO(int id, String name, int price, int qty) {
        this.product.getId();
        this.product.getName();
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;


    }



}








}

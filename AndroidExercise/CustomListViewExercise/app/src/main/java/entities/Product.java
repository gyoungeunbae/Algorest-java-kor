package entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by baegyeong-eun on 2017. 8. 3..
 */

public class Product implements Serializable {

    private String id;
    private String name;
    private int photo;
    private BigDecimal price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product(String id, String name, int photo, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
    }

    public Product() {
    }
}

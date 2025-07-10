package curse.java.springbootworkshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import curse.java.springbootworkshop.entities.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id;

    private double price;
    private int quantity;

    private double subTotal;


    //Constructors
    public OrderItem(Order order, Product product, int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
        this.id = new OrderItemPK(order, product);
        subTotal = quantity * price;
    }

    public OrderItem() {
    }

    //Getters and Setters

    @JsonBackReference
    public Order getOrder() {
        return id.getOrder();
    }

    public Order setOrder(Order order) {
        this.id.setOrder(order);
        return order;
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public Product setProduct(Product product) {
        this.id.setProduct(product);
        return product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //HashCode and Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

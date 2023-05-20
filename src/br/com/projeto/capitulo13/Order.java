package br.com.projeto.capitulo13;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private SimpleDateFormat formatter01 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Integer id;
    private Date moment;

    private OrderStatus orderStatus;

    private Client client;

    private List<OrderItem> orderItemList = new ArrayList<>();
    public Order(){}

    public Order(Date moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Order(Integer id, Date moment, br.com.projeto.capitulo13.OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }


    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void addOrderItem(OrderItem orderItem){
        orderItemList.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : orderItemList) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(formatter01.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItemList) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}

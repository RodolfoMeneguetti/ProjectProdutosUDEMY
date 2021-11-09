package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment; 
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>(); 
	private Client client = new Client(); 
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public Client getClient() {
		return client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item); 
	}
	
	public double total() {
		double sum = 0.00; 
		for (OrderItem it : items) {
			sum += it.subTotal(); 
		}
		return sum; 
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "); 
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: "); 
		sb.append(status + "\n"); 
		sb.append("Client: "); 
		sb.append(client + "\n"); 
		sb.append("Order items: \n");
		
		for(OrderItem it : items ) {
			sb.append(it + "\n"); 
		}
		sb.append("Total price: $"); 
		sb.append(String.format("%.2f", total())); 
		return sb.toString(); // tem que formatar o final para toString
	}
	

}



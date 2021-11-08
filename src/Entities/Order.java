package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private Date moment; 
	private OrderStatus status;
	private List<OrderItem> ordemItens = new ArrayList<>(); 
	
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
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

	public List<OrderItem> getOrdemItem() {
		return ordemItens;
	}

	public void AddItem (OrderItem ordemItem) {
		ordemItens.add(ordemItem); 
	}
	
	public void RemoveItem (OrderItem ordemItem) {
		ordemItens.remove(ordemItem); 
	}
	

}



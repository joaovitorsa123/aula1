package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order2 {
	
	private Date moment;
	private OrderStatus status;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	public Order2 (){
		
	}
	
	public Order2(Date moment, OrderStatus status, Client client) {

		this.moment = moment;
		this.status = status;
		this.client = client;

	}


	/**
	 * @return the moment
	 */
	public Date getMoment() {
		return moment;
	}

	/**
	 * @param moment the moment to set
	 */
	public void setMoment(Date moment) {
		this.moment = moment;
	}

	/**
	 * @return the status
	 */
	public OrderStatus getStatus() {
		return status;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItens() {
		return itens;
	}
	
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	public void removeItem(OrderItem item) {
		itens.add(item);
	}
	public double total() {
		double sum = 0.0;

		for (OrderItem item : itens) {

			sum += item.subTotal();

		}

		return sum;
		
	}

		@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: ");

		sb.append(sdf.format(moment) + "\n");

		sb.append("Order status: ");

		sb.append(status + "\n");

		sb.append("Client: ");

		sb.append(client + "\n");

		sb.append("Order items:\n");

		for (OrderItem item : itens) {

			sb.append(item + "\n");

		}

		sb.append("Total price: $");

		sb.append(String.format("%.2f", total()));

		return sb.toString();

	}

}

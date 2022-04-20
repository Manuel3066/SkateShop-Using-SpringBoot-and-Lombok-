package dmacc.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private long orderId;
	private ArrayList<Item> orderContents = new ArrayList<Item>();
	
}

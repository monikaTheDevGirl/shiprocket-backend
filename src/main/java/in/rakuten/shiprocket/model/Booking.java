package in.rakuten.shiprocket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import in.rakuten.shiprocket.enums.Status;
import lombok.Data;

@Entity
@Data
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer packageId;
	
	private String from;
	private String to;
	
	
	private User sender;
	
	private String receiverName;
	
	private String receiverMobile;
	
	private Integer trackingId;
	
	private Status status;
}

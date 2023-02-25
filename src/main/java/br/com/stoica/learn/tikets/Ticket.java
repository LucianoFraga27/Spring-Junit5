package br.com.stoica.learn.tikets;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Entity Class for Tickets
 * 
 * @author LUCIANO MORAIS DA SILVA
 *
 */

@Entity
@Table(name="TICKET")
@Data
public class Ticket {

	@Id
	@Column(name = "TICKET_ID")
	@SequenceGenerator(name="TICKET_SQ", allocationSize = 1)
	@GeneratedValue(generator = "TICKET_SQ", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "REPORTEE_NAME")
	private String reporteeName;

	@Column(name = "REPORTEE_EMAIL")
	private String reporteeEmail;
	
	@Column(name = "OWNER_NAME")
	private String ownerName;

	@Column(name = "OWNER_EMAIL")
	private String ownerEmail;
	
	@Column(name = "DESCRIPTION")
	private String description; 	

	@Column(name = "INSERT_TIMESTAMP")
	private LocalDateTime insertTimestamp; 	

	public Ticket() {};
	
	public Ticket(
			String title,
			String reporteeName,
			String reporteeEmail,
			String ownerName,
			String ownerEmail,
			String description 	
			) {
		this.title = title;
		this.reporteeName = reporteeName;
		this.reporteeEmail = reporteeEmail;
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.description =description; 	
	}
	
	
}

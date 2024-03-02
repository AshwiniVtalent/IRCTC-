package com.ws.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Irctc
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer userid;
private String password;
private String ticketno;
private String name;
private String arrival;
private String destination;

}

package com.br.cosmosdb.nosql.api.crud.entity;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import lombok.Data;

@Container(containerName = "Usuario")
@Data
public class Usuario {

	@Id
	@GeneratedValue
	private String id;
	
	@PartitionKey
	private String partitionKey;
	
	private String primeiroNome;
	private String sobrenome;
	private String emailId;
	
	private List<Endereco> enderecos;

	public String getPartitionKey() {
		if (partitionKey == null) {
			this.partitionKey = UUID.randomUUID().toString();
		}
		return partitionKey;
	}
	
}

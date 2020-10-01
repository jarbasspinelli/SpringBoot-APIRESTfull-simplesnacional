package com.example.apiSimplesNacional.resource;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiSimplesNacional.entities.Calculo;
import com.example.apiSimplesNacional.services.AnexoIservice;

@RestController
@RequestMapping(value="/anexo1")
public class AnexoIResource {
	
	@Autowired
	private AnexoIservice service;

	@GetMapping
	@RequestMapping(value = "/calculo")
	public ResponseEntity<Calculo> calculoAnexoI(@PathParam(value = "receitaBruta12") Double receitaBruta12, @PathParam(value="receita") Double receita) {
		Calculo resultado = service.calculoAnexoI(receitaBruta12, receita);
		return ResponseEntity.ok().body(resultado);
	}
}

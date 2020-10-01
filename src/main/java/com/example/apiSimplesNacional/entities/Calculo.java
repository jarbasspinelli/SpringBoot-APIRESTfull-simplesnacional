package com.example.apiSimplesNacional.entities;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class Calculo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Double valorImposto;
	private Double valorAliquotaEfetiva;
	private Double irpj;
	private Double csll;
	private Double cofins;
	private Double pis;
	private Double cpp;
	private Double icms;

	public Calculo() {
	}

	public Calculo(Double valorImposto, Double valorAliquotaEfetiva, Double irpj, Double csll, Double cofins,
			Double pis, Double cpp, Double icms) {
		super();
		this.valorImposto = valorImposto;
		this.valorAliquotaEfetiva = valorAliquotaEfetiva;
		this.irpj = irpj;
		this.csll = csll;
		this.cofins = cofins;
		this.pis = pis;
		this.cpp = cpp;
		this.icms = icms;
	}

	public Double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(Double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public Double getValorAliquotaEfetiva() {
		return valorAliquotaEfetiva;
	}

	public void setValorAliquotaEfetiva(Double valorAliquotaEfetiva) {
		this.valorAliquotaEfetiva = valorAliquotaEfetiva;
	}

	public Double getIrpj() {
		return irpj;
	}

	public void setIrpj(Double irpj) {
		this.irpj = irpj;
	}

	public Double getCsll() {
		return csll;
	}

	public void setCsll(Double csll) {
		this.csll = csll;
	}

	public Double getCofins() {
		return cofins;
	}

	public void setCofins(Double cofins) {
		this.cofins = cofins;
	}

	public Double getPis() {
		return pis;
	}

	public void setPis(Double pis) {
		this.pis = pis;
	}

	public Double getCpp() {
		return cpp;
	}

	public void setCpp(Double cpp) {
		this.cpp = cpp;
	}

	public Double getIcms() {
		return icms;
	}

	public void setIcms(Double icms) {
		this.icms = icms;
	}
}

package com.example.apiSimplesNacional.aliquotas;

public class AliquotaFaturamentoAnexoV {
	
	private Double faixa1 = 0.1550;
	private Double faixa2 = 0.18;
	private Double faixa3 = 0.1950;
	private Double faixa4 = 0.2050;
	private Double faixa5 = 0.23;
	private Double faixa6 = 0.3050;
	
	private int deducao_faixa1 = 0;
	private int deducao_faixa2 = 4500;
	private int deducao_faixa3 = 9900;
	private int deducao_faixa4 = 17100;
	private int deducao_faixa5 = 62100;
	private int deducao_faixa6 = 540000;
	
	public AliquotaFaturamentoAnexoV() {
	}

	public AliquotaFaturamentoAnexoV(Double faixa1, Double faixa2, Double faixa3, Double faixa4, Double faixa5,
			Double faixa6, int deducao_faixa1, int deducao_faixa2, int deducao_faixa3, int deducao_faixa4,
			int deducao_faixa5, int deducao_faixa6) {
		super();
		this.faixa1 = faixa1;
		this.faixa2 = faixa2;
		this.faixa3 = faixa3;
		this.faixa4 = faixa4;
		this.faixa5 = faixa5;
		this.faixa6 = faixa6;
		this.deducao_faixa1 = deducao_faixa1;
		this.deducao_faixa2 = deducao_faixa2;
		this.deducao_faixa3 = deducao_faixa3;
		this.deducao_faixa4 = deducao_faixa4;
		this.deducao_faixa5 = deducao_faixa5;
		this.deducao_faixa6 = deducao_faixa6;
	}

	public Double getFaixa1() {
		return faixa1;
	}

	public void setFaixa1(Double faixa1) {
		this.faixa1 = faixa1;
	}

	public Double getFaixa2() {
		return faixa2;
	}

	public void setFaixa2(Double faixa2) {
		this.faixa2 = faixa2;
	}

	public Double getFaixa3() {
		return faixa3;
	}

	public void setFaixa3(Double faixa3) {
		this.faixa3 = faixa3;
	}

	public Double getFaixa4() {
		return faixa4;
	}

	public void setFaixa4(Double faixa4) {
		this.faixa4 = faixa4;
	}

	public Double getFaixa5() {
		return faixa5;
	}

	public void setFaixa5(Double faixa5) {
		this.faixa5 = faixa5;
	}

	public Double getFaixa6() {
		return faixa6;
	}

	public void setFaixa6(Double faixa6) {
		this.faixa6 = faixa6;
	}

	public int getDeducao_faixa1() {
		return deducao_faixa1;
	}

	public void setDeducao_faixa1(int deducao_faixa1) {
		this.deducao_faixa1 = deducao_faixa1;
	}

	public int getDeducao_faixa2() {
		return deducao_faixa2;
	}

	public void setDeducao_faixa2(int deducao_faixa2) {
		this.deducao_faixa2 = deducao_faixa2;
	}

	public int getDeducao_faixa3() {
		return deducao_faixa3;
	}

	public void setDeducao_faixa3(int deducao_faixa3) {
		this.deducao_faixa3 = deducao_faixa3;
	}

	public int getDeducao_faixa4() {
		return deducao_faixa4;
	}

	public void setDeducao_faixa4(int deducao_faixa4) {
		this.deducao_faixa4 = deducao_faixa4;
	}

	public int getDeducao_faixa5() {
		return deducao_faixa5;
	}

	public void setDeducao_faixa5(int deducao_faixa5) {
		this.deducao_faixa5 = deducao_faixa5;
	}

	public int getDeducao_faixa6() {
		return deducao_faixa6;
	}

	public void setDeducao_faixa6(int deducao_faixa6) {
		this.deducao_faixa6 = deducao_faixa6;
	}
}

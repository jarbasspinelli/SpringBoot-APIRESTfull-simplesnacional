package com.example.apiSimplesNacional.faixaFaturamento;

import org.springframework.stereotype.Service;

@Service
public class FaixaFaturamento {
	
	private Double r1 = 0.00;
	private Double r2 = 180000.01;
	private Double r3 = 360000.01;
	private Double r4 = 720000.01;
	private Double r5 = 1800000.01;
	private Double r6 = 3600000.01;
	
	private Double f1 = 180000.00;
	private Double f2 = 360000.00;
	private Double f3 = 720000.00;
	private Double f4 = 1800000.00;
	private Double f5 = 3600000.00;
	private Double f6 = 4800000.00;
	
	public FaixaFaturamento() {
	}

	public FaixaFaturamento(Double r1, Double r2, Double r3, Double r4, Double r5, Double r6, Double f1, Double f2,
			Double f3, Double f4, Double f5, Double f6) {
		super();
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.r4 = r4;
		this.r5 = r5;
		this.r6 = r6;
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
		this.f5 = f5;
		this.f6 = f6;
	}

	public Double getR1() {
		return r1;
	}

	public void setR1(Double r1) {
		this.r1 = r1;
	}

	public Double getR2() {
		return r2;
	}

	public void setR2(Double r2) {
		this.r2 = r2;
	}

	public Double getR3() {
		return r3;
	}

	public void setR3(Double r3) {
		this.r3 = r3;
	}

	public Double getR4() {
		return r4;
	}

	public void setR4(Double r4) {
		this.r4 = r4;
	}

	public Double getR5() {
		return r5;
	}

	public void setR5(Double r5) {
		this.r5 = r5;
	}

	public Double getR6() {
		return r6;
	}

	public void setR6(Double r6) {
		this.r6 = r6;
	}

	public Double getF1() {
		return f1;
	}

	public void setF1(Double f1) {
		this.f1 = f1;
	}

	public Double getF2() {
		return f2;
	}

	public void setF2(Double f2) {
		this.f2 = f2;
	}

	public Double getF3() {
		return f3;
	}

	public void setF3(Double f3) {
		this.f3 = f3;
	}

	public Double getF4() {
		return f4;
	}

	public void setF4(Double f4) {
		this.f4 = f4;
	}

	public Double getF5() {
		return f5;
	}

	public void setF5(Double f5) {
		this.f5 = f5;
	}

	public Double getF6() {
		return f6;
	}

	public void setF6(Double f6) {
		this.f6 = f6;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

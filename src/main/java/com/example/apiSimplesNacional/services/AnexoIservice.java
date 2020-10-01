package com.example.apiSimplesNacional.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiSimplesNacional.aliquotas.AliquotaFaturamentoAnexoI;
import com.example.apiSimplesNacional.entities.Calculo;
import com.example.apiSimplesNacional.faixaFaturamento.FaixaFaturamento;
import com.example.apiSimplesNacional.partilhaImposto.PartilhaImpostoAnexoI;

@Service
public class AnexoIservice {
	
	@Autowired
	private Calculo calculo;
	
	@Autowired
	private FaixaFaturamento faixa;
	
	@Autowired
	private AliquotaFaturamentoAnexoI aliquota;
	
	@Autowired
	private PartilhaImpostoAnexoI partilha;
	
	public Calculo calculoAnexoI(Double receitaBruta12, Double receita) {
		
		if(receita < faixa.getF1()) {
			Double aliquotaEfetiva = ((receitaBruta12 * aliquota.getFaixa1()) - aliquota.getDeducao_faixa1()) / receitaBruta12;
			calculo.setValorImposto(receita * aliquotaEfetiva);
			calculo.setValorAliquotaEfetiva(aliquotaEfetiva);
			calculo.setIrpj(partilha.getIrpj_1faixa() * calculo.getValorImposto());
			calculo.setCsll(partilha.getCsll_1faixa() * calculo.getValorImposto());
			calculo.setCofins(partilha.getCofins_1faixa() * calculo.getValorImposto());
			calculo.setPis(partilha.getPis_1faixa() * calculo.getValorImposto());
			calculo.setCpp(partilha.getCpp_1faixa() * calculo.getValorImposto());
			calculo.setIcms(partilha.getIcms_1faixa() * calculo.getValorImposto());
			return calculo;
		}else if((faixa.getR2() < receita) && (receita < faixa.getF2())) {
			Double aliquotaEfetiva = ((receitaBruta12 * aliquota.getFaixa2()) - aliquota.getDeducao_faixa2()) / receitaBruta12;
			calculo.setValorImposto(receita * aliquotaEfetiva);
			calculo.setValorAliquotaEfetiva(aliquotaEfetiva);
			return calculo;
		}else if((faixa.getR3() < receita) && (receita < faixa.getF3())) {
			Double aliquotaEfetiva = ((receitaBruta12 * aliquota.getFaixa3()) - aliquota.getDeducao_faixa3()) / receitaBruta12;
			calculo.setValorImposto(receita * aliquotaEfetiva);
			calculo.setValorAliquotaEfetiva(aliquotaEfetiva);
			return calculo;
		}else if((faixa.getR4() < receita) && (receita < faixa.getF4())) {
			Double aliquotaEfetiva = ((receitaBruta12 * aliquota.getFaixa4()) - aliquota.getDeducao_faixa4()) / receitaBruta12;
			calculo.setValorImposto(receita * aliquotaEfetiva);
			calculo.setValorAliquotaEfetiva(aliquotaEfetiva);
			return calculo;
		}else if((faixa.getR5() < receita) && (receita < faixa.getF5())) {
			Double aliquotaEfetiva = ((receitaBruta12 * aliquota.getFaixa5()) - aliquota.getDeducao_faixa5()) / receitaBruta12;
			calculo.setValorImposto(receita * aliquotaEfetiva);
			calculo.setValorAliquotaEfetiva(aliquotaEfetiva);
			return calculo;
		}else if((faixa.getR6() < receita) && (receita < faixa.getF6())) {
			Double aliquotaEfetiva = ((receitaBruta12 * aliquota.getFaixa6()) - aliquota.getDeducao_faixa6()) / receitaBruta12;
			calculo.setValorImposto(receita * aliquotaEfetiva);
			calculo.setValorAliquotaEfetiva(aliquotaEfetiva);
			return calculo;
		}else {
			return calculo = null;
		}
	}

}

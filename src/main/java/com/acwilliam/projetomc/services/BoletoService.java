package com.acwilliam.projetomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.acwilliam.projetomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(instanteDoPedido);
		calendario.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(calendario.getTime());
	}
}

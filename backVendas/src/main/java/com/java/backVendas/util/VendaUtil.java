package com.java.backVendas.util;

import com.java.backVendas.models.dto.ItensVendaDTO;

import java.util.List;

public class VendaUtil {

    public static double calcularTotalVenda(List<ItensVendaDTO> itensVenda) {
        return itensVenda.stream()
                .mapToDouble(item -> item.getProduto().getPrecoVenda() * item.getQuantidade())
                .sum();
    }
}

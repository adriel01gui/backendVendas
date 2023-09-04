package com.java.backVendas.services;

import com.java.backVendas.models.dto.ItensVendaDTO;
import com.java.backVendas.repositories.ItensVendaRepository;
import com.java.backVendas.repositories.VendaRepository;
import com.java.backVendas.util.VendaUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    @Autowired
    private ItensVendaRepository itensVendaRepository;

    ModelMapper modelMapper = new ModelMapper();

    public double TotalVendas(List<ItensVendaDTO> itensVenda){
        return VendaUtil.calcularTotalVenda(itensVenda);
    }
}

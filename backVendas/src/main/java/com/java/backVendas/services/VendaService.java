package com.java.backVendas.services;

import com.java.backVendas.repositories.ItensVendaRepository;
import com.java.backVendas.repositories.VendaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    @Autowired
    private ItensVendaRepository itensVendaRepository;

    ModelMapper modelMapper = new ModelMapper();
}

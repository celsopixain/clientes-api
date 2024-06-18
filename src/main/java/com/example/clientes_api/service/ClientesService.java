package com.example.clientes_api.service;

import com.example.clientes_api.model.Clientes;
import com.example.clientes_api.model.dto.ClientesDTO;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.List;

public interface ClientesService {


    Clientes save(Clientes clientes);

    Clientes findById(Long id);

    void delete(Long id);

    List<Clientes> findAll();

    Page<Clientes> findAll(Integer pageNumber, Integer pageSize, String sorteField);

    Page<ClientesDTO> findAll(LocalDate datainicio, LocalDate datafim, String pesquisa, Integer pageNumber, Integer pageSize, String sorteField);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bolsadeideas.spring.boot.backend.apirest.services;

import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Cliente;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author carlo
 */
public interface IClienteService {
    
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public Cliente save(Cliente cliente);
    public void delete(Long Id);
    public Cliente findById(Long Id);
}

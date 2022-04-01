/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolsadeideas.spring.boot.backend.apirest.services;

import com.bolsadeideas.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;
    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente); 
    }

    @Transactional
    @Override
    public void delete(Long Id) {
        clienteDao.deleteById(Id); 
    }

    @Transactional(readOnly=true)
    @Override
    public Cliente findById(Long Id) {
        return clienteDao.findById(Id).orElse(null);
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDao.findAll(pageable);
    }
    
}

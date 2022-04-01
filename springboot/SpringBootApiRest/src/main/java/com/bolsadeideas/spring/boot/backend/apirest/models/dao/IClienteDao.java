/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bolsadeideas.spring.boot.backend.apirest.models.dao;

import com.bolsadeideas.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carlo
 */
public interface IClienteDao extends JpaRepository<Cliente,Long> {
    
}

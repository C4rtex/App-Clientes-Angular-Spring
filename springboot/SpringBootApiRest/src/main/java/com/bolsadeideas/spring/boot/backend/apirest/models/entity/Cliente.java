/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolsadeideas.spring.boot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Data;
/**
 *
 * @author carlo
 */
@Entity
@Data
@Table(name="clientes")
public class Cliente implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    
    @NotEmpty(message="no debe estar vacio")
    @Size(min=4,max=12,message = "El tamaño tiene que ser entre 4 y 12")
    @Column(nullable=false)
    private String nombre;
    @NotEmpty(message="no debe estar vacio")
    private String apellido;
    
    @NotEmpty(message="no debe estar vacio")
    @Email(message = "El formato no es correcto")
    @Column(nullable=false, unique = true)
    private String email;
    
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date CreateAt;
    
    @PrePersist
    public void prePersist(){
        CreateAt =  new Date();
    }
    
}

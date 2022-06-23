package com.generation.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Licencias")
public class Licencia{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer numero;
	@DateTimeFormat(pattern="yyyy-MM-dd")

	private Date fechaVencimiento;
	private String clase;
	private String estado;
	
	//opcionales, sirven para la gestion de la base de datos
	@Column(updatable= false)
	private Date createdAt;
	private Date updatedAt;
	//private Date deletedAt;//fecha de eliminacion logica
	//eliminacion fisica:borramos el registro
	
	//relaciones OneToOne (1a1) un usuario una licencia.
	@OneToOne(fetch=FetchType.LAZY)//
	@JoinColumn(name="usuario_id")//pk de la otra entidad 
	private Usuario usuario; 
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Licencia() {
		super();
	}
	public Licencia(Long id, Integer numero, Date fechaVencimiento, String clase, String estado) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaVencimiento = fechaVencimiento;
		this.clase = clase;
		this.estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//insertara el atributo en la base de datos la fecha antes de insertar
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

}

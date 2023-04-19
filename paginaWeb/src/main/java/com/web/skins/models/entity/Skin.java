package com.web.skins.models.entity;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="skins")
public class Skin {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	@NotEmpty(message="El nombre del arma no puede estar vacio.")
	@Size(min=3, max=25, message="El nombre no puede tener menos de 3 caracteres ni más de 25.")
	private String nombre;
	
	@Column(name="calidad")
	private String calidad;
	
	@Column(name="desgaste")
	@NotEmpty(message="La calidad del arma no puede estar vacio.")
	private String desgaste;
	
	@Column(name="precio")
	@NotEmpty(message="El precio del arma no puede estar vacio.")
	private Float precio;
	
	//El tipo del arma lo podriamos poner como un select de una lista
	@Column(name="tipo_Arma")
	@Size(min=3, max=25, message="El tipo del arma no puede tener menos de 3 caracteres ni más de 25.")
	private String tipoArma;
	
	@Column(name="foto")
	@NotEmpty(message="El icono del arma es requerido.")
	private String foto;
	
	@Column(name="star_Track")
	private boolean starTrack;
	
	@Column(name="sticker")
	private boolean sticker;
	
	//Constructor
	public Skin(Long id, String nombre, String calidad, String desgaste, Float precio, String tipoArma, String foto,
			boolean starTrack, boolean sticker) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calidad = calidad;
		this.desgaste = desgaste;
		this.precio = precio;
		this.tipoArma = tipoArma;
		this.foto = foto;
		this.starTrack = starTrack;
		this.sticker = sticker;
	}
	public Skin() {
		
	}
	
	//Getters&Setter
	/********* Long *********/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	/********* Nombre *********/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/********* Calidad *********/
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	/********* Desgaste *********/
	public String getDesgaste() {
		return desgaste;
	}
	public void setDesgaste(String desgaste) {
		this.desgaste = desgaste;
	}

	/********* Precio *********/
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	/********* Tipo de Arma *********/
	public String getTipoArma() {
		return tipoArma;
	}
	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}

	/********* Foto *********/
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/********* isStarTrack *********/
	public boolean isStarTrack() {
		return starTrack;
	}
	public void setStarTrack(boolean starTrack) {
		this.starTrack = starTrack;
	}

	/*********  isSticker *********/
	public boolean isSticker() {
		return sticker;
	}
	public void setSticker(boolean sticker) {
		this.sticker = sticker;
	}
	
	//tpString
	@Override
	public String toString() {
		return "Skin [id=" + id + ", nombre=" + nombre + ", calidad=" + calidad + ", desgaste=" + desgaste + ", precio="
				+ precio + ", tipoArma=" + tipoArma + ", foto=" + foto + ", starTrack=" + starTrack + ", sticker="
				+ sticker + "]";
	}
}

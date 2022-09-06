package com.app.notificaciones.requests;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Proyectos {

	@Id
	@JsonIgnore
	private String id;

	@NotNull(message = "Name cannot be null")
	@Size(max = 200)
	@Indexed(unique = true)
	private String nombre;

	@Indexed(unique = true)
	private Integer codigoProyecto;

	@NotEmpty(message = "palabras clave cannot be empty")
	private List<String> palabrasClave;

	@NotEmpty(message = "ubicacion cannot be null")
	private List<Double> ubicacion;

	@NotNull(message = "resumen cannot be null")
	private String resumen;

	@NotEmpty(message = "objetivos cannot be null")
	private List<String> objetivos;

	@NotNull(message = "descripcion cannot be null")
	private String descripcion;

	@NotEmpty(message = "hitos cannot be null")
	private List<String> hitos;

	@NotNull(message = "presupuesto itos cannot be null")
	private Long presupuesto;

	@NotEmpty(message = "cronograma cannot be null")
	private List<String> cronograma;

	@NotNull(message = "activo cannot be null")
	private Boolean activo;

	@NotNull(message = "estadoProyecto cannot be null")
	private Integer estadoProyecto;

	@NotEmpty(message = "proyectoDesarrollo cannot be null")
	private List<Integer> proyectoDesarrollo;
	private Integer muro;

	@NotEmpty(message = "creador cannot be empty")
	private List<String> creador;

	@NotNull(message = "fechaLanzamiento cannot be empty")
	private Date fechaLanzamiento;

	@NotNull(message = "gamificacion cannot be null")
	private Boolean gamificacion;

	@NotNull(message = "mensajeParticipacion cannot be null")
	private String mensajeParticipacion;
}
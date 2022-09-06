package com.app.notificaciones.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "app-proyectos")
public interface ProyectosFeignClient {

	@GetMapping("/proyectos/nombre/{codigoProyecto}")
	public String obtenerNombre(@PathVariable("codigoProyecto") Integer codigoProyecto);

	@GetMapping("/proyectos/mensaje/{codigoProyecto}")
	public String obtenerMensajeParticipacion(@PathVariable("codigoProyecto") Integer codigoProyecto);

	@GetMapping("/proyectos/gamificacion/{codigoProyecto}")
	public Boolean obtenerEstadoGamificacion(@PathVariable("codigoProyecto") Integer codigoProyecto);
}

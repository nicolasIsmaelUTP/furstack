package com.veterinaria.ms_mascotas.service;

import java.util.List;

import com.veterinaria.ms_mascotas.entities.Mascota;

public interface IMascotaService {
    Mascota crearMascota(Mascota mascota);
    Mascota obtenerMascotaPorId(Long id);
    List<Mascota> obtenerMascotasPorDuenioId(Long duenioId);
    List<Mascota> obtenerTodasMascotas();
    Mascota actualizarMascota(Long id, Mascota mascota);
    void eliminarMascota(Long id);
}

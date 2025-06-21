package com.veterinaria.ms_mascotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.veterinaria.ms_mascotas.entities.Mascota;
import com.veterinaria.ms_mascotas.persistence.MascotaRepository;

public class MascotaServiceImpl implements IMascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public Mascota crearMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public Mascota obtenerMascotaPorId(Long id) {
        return mascotaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada con id: " + id));
    }

    @Override
    public List<Mascota> obtenerMascotasPorDuenioId(Long duenioId) {
        return mascotaRepository.findByDuenioId(duenioId);
    }

    @Override
    public List<Mascota> obtenerTodasMascotas() {
        return (List<Mascota>) mascotaRepository.findAll();
    }

    @Override
    public Mascota actualizarMascota(Long id, Mascota mascota) {
        Mascota mascotaExistente = obtenerMascotaPorId(id);
        mascotaExistente.setNombre(mascota.getNombre());
        mascotaExistente.setRaza(mascota.getRaza());
        mascotaExistente.setDuenioId(mascota.getDuenioId());
        return mascotaRepository.save(mascotaExistente);
    }

    @Override
    public void eliminarMascota(Long id) {
        if (!mascotaRepository.existsById(id)) {
            throw new RuntimeException("Mascota no encontrada con id: " + id);
        }
        mascotaRepository.deleteById(id);
    }

   
    
}

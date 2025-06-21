package com.veterinaria.ms_mascotas.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.veterinaria.ms_mascotas.entities.Mascota;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota, Long> {
    List<Mascota> findByDuenioId(Long duenioId);
}
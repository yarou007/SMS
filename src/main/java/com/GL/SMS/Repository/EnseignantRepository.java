package com.GL.SMS.Repository;

import com.GL.SMS.models.Enseignant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant,Integer> {
    public Page<Enseignant> findByNomContains(String keyword, Pageable paegPageable);

}

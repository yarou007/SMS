package com.GL.SMS.Repository;

import com.GL.SMS.models.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParentRepository extends JpaRepository<Parent,Integer> {

}

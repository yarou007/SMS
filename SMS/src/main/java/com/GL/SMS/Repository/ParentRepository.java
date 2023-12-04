/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.GL.SMS.Repository;

import com.GL.SMS.models.Parent;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author skndr
 */
public interface ParentRepository extends JpaRepository<Parent,Integer>{
      
        Optional<Parent> findByEmail(String email);

        public Parent findById(int id);

}

        



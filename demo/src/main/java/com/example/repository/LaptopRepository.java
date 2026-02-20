package com.example.repository;

import com.example.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {

    //@Query(value = "select * from laptop l where l.brand=?1", nativeQuery = true)
    //JPQL
    @Query(value = "select l from Laptop l where l.brand=?1")
    public List<Laptop> findByBrand(String brand); //since Interface therefore Abstract class


} //Laptop Repo extends JPA Repo to implement CRUD ops and use it's methods. The Entity is Laptop with Primark Key as ID which is INT TYPE- Hence we use the object equivalent of int: Integer


package com.example.techiteasy2.repositories;

import com.example.techiteasy2.models.Television;

import java.util.List;

public interface TelevisionRepository {

    List<Television> findAllTelevisionsByBrandEqualsIgnoreCase(String brand);

}

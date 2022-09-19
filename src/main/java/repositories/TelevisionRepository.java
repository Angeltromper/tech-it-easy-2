package repositories;

import models.Television;

import java.util.List;

public interface TelevisionRepository {

    List<Television> findAllTelevisionsByBrandEqualsIgnoreCase(String brand);

}

package repositories;

import models.Television;

import java.util.List;

public interface TelevisionRepository extends JpaRepository <Television, Long> {

    List<Television> findAllTelevisionsByBrandEqualsIgnoreCase(String brand);

}

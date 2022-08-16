package medic.repository;

import medic.entity.Medic;

public interface MedicRepository {

    Medic[] findAll();

    void add(Medic medic);

}

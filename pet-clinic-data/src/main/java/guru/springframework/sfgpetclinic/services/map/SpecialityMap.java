package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMap extends AbstractMapService<Speciality, Long> implements SpecialtyService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality Object) {
        return super.save(Object);
    }

    @Override
    public void delete(Speciality Object) {
        super.delete(Object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

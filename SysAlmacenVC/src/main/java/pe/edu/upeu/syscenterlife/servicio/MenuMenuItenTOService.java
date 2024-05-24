package pe.edu.upeu.syscenterlife.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.MenuMenuItenTO;
import pe.edu.upeu.syscenterlife.repositorio.MenuMenuItenTORepository;

@Service
public class MenuMenuItenTOService {
    @Autowired
    MenuMenuItenTORepository repository;
    
    //C
    public MenuMenuItenTO guardarEntidad(MenuMenuItenTO menuMenuItenTO){
        return repository.save(menuMenuItenTO);
    }
    
    //R
    public List<MenuMenuItenTO> listarEntidad(){
        return repository.findAll();
    }
    
    //U
    public MenuMenuItenTO actualizarEntidad(MenuMenuItenTO menuMenuItenTO){
        return repository.save(menuMenuItenTO);
    }
    
    //D
    public void eliminarEntidad(Long id){
        repository.deleteById(id);
    }
    
    //B
    public MenuMenuItenTO buscarEntidad(Long id){
        return repository.findById(id).orElse(null);
    }
}

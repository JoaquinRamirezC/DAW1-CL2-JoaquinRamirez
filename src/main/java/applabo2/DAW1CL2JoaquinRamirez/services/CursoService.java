package pe.edu.cibertec.appcinecibertectarde.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import applabo2.DAW1CL2JoaquinRamirez.model.bd.Curso;
import applabo2.DAW1CL2JoaquinRamirez.repository.CursoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CursoService {

    private CursoRepository CursoRepository;

    public List<Curso> listarCurso() {
        return CursoRepository.findAll();
    }
}
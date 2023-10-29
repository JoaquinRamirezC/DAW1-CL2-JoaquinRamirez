package applabo2.DAW1CL2JoaquinRamirez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import applabo2.DAW1CL2JoaquinRamirez.model.bd.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}

package app.foreseenpoc.repository;

import app.foreseenpoc.domain.CSNet;
import app.foreseenpoc.domain.UserpocSNet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserpocSNetRepository extends JpaRepository<UserpocSNet, Integer> {

    @Query("select usnet.csnet from UserpocSNet usnet where usnet.userpoc.iduserpoc = :idUser")
    public List<CSNet> findByUserId(@Param("idUser") int idX);
}

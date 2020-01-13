package ro.sda.webdata.persistence.music;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MusicRepository extends JpaRepository<MusicEntity, Long> {

}

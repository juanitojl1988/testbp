package ec.test.bp.customerService.infraestructure.outbound.database;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresSQLRepository extends JpaRepository {
}

package br.com.stoica.learn.tikets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TiketRepository extends JpaRepository<Ticket, Long> {

	@Query(
		"""
				select
				  count(1)
				from
				  Ticket t
				where
				  t.ownerEmail = ?1
					
		""")
	Long ownerEmailExists(String email);
	
}

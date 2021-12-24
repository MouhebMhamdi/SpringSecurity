package tn.esprit.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {




    Client getClientByEmailAndPassword(String email,String password);


    Client getClientByEmail(String email);

}

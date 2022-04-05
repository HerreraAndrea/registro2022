/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.serviciorest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.serviciorest.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

 @Query("select c from Cliente c where c.estado='1'")
List<Cliente> findAllCustom();
/*
 @Query("select p from Cliente p where upper(p.nombre) like "
+ "upper(:nombre) and p.estado='1'")
List<Cliente> findByName(@Param("nombre") String nombre);*/
}

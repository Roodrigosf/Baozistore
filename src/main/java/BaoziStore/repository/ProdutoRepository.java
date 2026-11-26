
package BaoziStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import BaoziStore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

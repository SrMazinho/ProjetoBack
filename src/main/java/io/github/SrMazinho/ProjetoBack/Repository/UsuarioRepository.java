package io.github.SrMazinho.ProjetoBack.Repository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByNome(String nome);
}


package co.kotlin.repo

import co.kotlin.entidad.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepo : JpaRepository<Usuario, String> {


}
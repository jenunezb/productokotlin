package co.kotlin.servicios.implementacion
import co.kotlin.dto.UsuarioGetDTO
import co.kotlin.dto.UsuarioDTO
import co.kotlin.entidad.Usuario
import co.kotlin.repo.UsuarioRepo
import co.kotlin.servicios.interfaz.UsuarioServicio
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioServicioImpl(@Autowired
                          private val usuarioRepo: UsuarioRepo) : UsuarioServicio {



    @Override
    fun crearUsuario(c: UsuarioDTO): String? {

        var cliente = Usuario().apply {
            cedula = c.cedula
            nombre = c.nombre
            email = c.email
            direccion = c.direccion
            telefono = c.telefono
            password = c.password

        }

        return usuarioRepo.save(cliente).cedula
    }

    @Override
    fun listarTodos(): List<UsuarioGetDTO> {
        val convertidos = ArrayList<UsuarioGetDTO>()
        for (usuario in usuarioRepo.findAll()) {
            convertidos.add(convertir(usuario))
        }
        return convertidos
    }


    private fun convertir(usuario: Usuario): UsuarioGetDTO {
        return UsuarioGetDTO(
            codigo = usuario.cedula,
            nombre = usuario.nombre,
            email = usuario.email,
            direccion = usuario.direccion,
            telefono = usuario.telefono
        )
    }

}

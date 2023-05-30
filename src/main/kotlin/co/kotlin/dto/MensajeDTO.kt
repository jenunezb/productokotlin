package co.kotlin.dto

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter
import lombok.ToString

@AllArgsConstructor
@Getter
@Setter
@ToString
class UsuarioGetDTO (    val codigo: String? = null,
                         val nombre: String? = null,
                         val email: String? = null,
                         val direccion: String? = null,
                         val telefono: String? = null
)


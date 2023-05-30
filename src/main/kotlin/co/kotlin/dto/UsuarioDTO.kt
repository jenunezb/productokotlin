package co.kotlin.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.Length

class UsuarioDTO(

    @NotNull
    var cedula: String? = null,

    @NotNull
    @NotBlank
    @Length(max = 150, message = "El nombre debe tener máximo 100 caracteres")
    var nombre: String? = null,

    @NotNull
    @NotBlank
    @Length(max = 100, message = "El correo debe tener máximo 100 caracteres")
    @Email
    var email: String? = null,

    @NotNull
    @NotBlank
    @Length(max = 50, message = "La contraseña debe tener máximo 50 caracteres")
    var password: String? = null,

    @NotNull
    @NotBlank
    @Length(max = 100, message = "La dirección debe tener máximo 100 caracteres")
    var direccion: String? = null,

    @NotNull
    @NotBlank
    @Length(max = 12, message = "El teléfono debe tener máximo 12 caracteres")
    var telefono: String? = null
)

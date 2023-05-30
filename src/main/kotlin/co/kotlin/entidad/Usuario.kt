package co.kotlin.entidad

import jakarta.validation.constraints.Email
import java.io.Serializable

import lombok.*
import javax.persistence.*


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
final class Usuario(
        @Id
        var cedula: String? = "",

        @Column(nullable = false, length = 200)
        var direccion: String? = "",

        @Column(nullable = false, length = 50)
        var telefono: String? = "",

        @Column(nullable = false, length = 200)
        var nombre: String? = "",

        @Column
        @Email
        var email: String? = "",

        @Column
        var password: String? = ""

    )

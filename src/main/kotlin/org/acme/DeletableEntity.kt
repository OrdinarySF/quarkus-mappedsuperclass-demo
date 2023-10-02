package org.acme

import io.quarkus.runtime.annotations.RegisterForReflection
import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.acme.BaseEntity
import java.time.LocalDateTime

@MappedSuperclass
@RegisterForReflection
abstract class DeletableEntity : BaseEntity() {
    @Column(nullable = false, insertable = false)
    protected var deleted: Boolean? = null

    @Column(nullable = true, insertable = false)
    protected val deletedTime: LocalDateTime? = null
}
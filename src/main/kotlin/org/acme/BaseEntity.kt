package org.acme

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import io.quarkus.runtime.annotations.RegisterForReflection
import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
@RegisterForReflection
abstract class BaseEntity : PanacheEntityBase {

    @Column(nullable = false, insertable = false, updatable = false)
    lateinit var createdTime: LocalDateTime

    @Column(nullable = true, insertable = false, updatable = false)
    var updatedTime: LocalDateTime? = null
}
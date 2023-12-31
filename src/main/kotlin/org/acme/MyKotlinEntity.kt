package org.acme

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.runtime.annotations.RegisterForReflection
import jakarta.persistence.Entity
import jakarta.persistence.Id


/**
 * Example JPA entity defined as a Kotlin Panache Entity.
 * An ID field of Long type is provided, if you want to define your own ID field extends <code>PanacheEntityBase</code> instead.
 *
 * This uses the active record pattern, you can also use the repository pattern instead:
 * .
 *
 * Usage (more example on the documentation)
 *
 * {@code
 *
 *      fun doSomething() {
 *          val entity1 = MyKotlinEntity();
 *          entity1.field = "field-1"
 *          entity1.persist()
 *
 *         val entities:List<MyKotlinEntity>  = MyKotlinEntity.listAll()
 *     }
 * }
 */
@Entity
@RegisterForReflection
class MyKotlinEntity : DeletableEntity() {
    @Id
    var id: Long? = null
    lateinit var name: String

    companion object : PanacheCompanion<MyKotlinEntity> {
        fun byName(name: String) = list("name", name)
    }

}

package cn.petech.domain.common;

/**
 * 标记领域模型实体
 */
public interface EntityObject<T,ID> {

    /**
     * Entities compare by identity, not by attributes.
     *
     * @param other The other entity.
     * @return true if the identities are the same, regardles of other attributes.
     */
    boolean sameIdentityAs(T other);

    /**
     * Entities have an identity.
     *
     * @return The identity of this entity.
     */
    ID identity();

}
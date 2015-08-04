package cn.petech.domain.common;

/**
 * 标记领域模型实体
 */
public interface EntityObject<T> {

    boolean sameIdentiyAs(T other);
}

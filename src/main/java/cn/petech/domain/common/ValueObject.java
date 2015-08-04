package cn.petech.domain.common;


import java.io.Serializable;

/**
 * 标记值对象
 * @param <T>
 */
public interface ValueObject<T> extends Serializable {

    boolean sameValueAs(T other);
}

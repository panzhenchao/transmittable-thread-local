package com.alibaba.ttl3.spi;

import com.alibaba.ttl3.executor.DisableInheritableForkJoinWorkerThreadFactory;
import com.alibaba.ttl3.executor.DisableInheritableThreadFactory;
import edu.umd.cs.findbugs.annotations.NonNull;

/**
 * Ttl Wrapper interface.
 * <p>
 * Used to mark wrapper types, for example:
 * <ul>
 *     <li>{@link com.alibaba.ttl3.TtlCallable}</li>
 *     <li>{@link com.alibaba.ttl3.executor.TtlExecutors}</li>
 *     <li>{@link DisableInheritableThreadFactory}</li>
 * </ul>
 *
 * @author Jerry Lee (oldratlee at gmail dot com)
 * @see com.alibaba.ttl3.TtlWrappers#unwrap
 * @see com.alibaba.ttl3.TtlCallable
 * @see com.alibaba.ttl3.TtlRunnable
 * @see com.alibaba.ttl3.executor.TtlExecutors
 * @see DisableInheritableThreadFactory
 * @see DisableInheritableForkJoinWorkerThreadFactory
 */
public interface TtlWrapper<T> extends TtlEnhanced {
    /**
     * unwrap {@link TtlWrapper} to the original/underneath one.
     *
     * @see com.alibaba.ttl3.TtlWrappers#unwrap(Object)
     */
    @NonNull
    T unwrap();
}

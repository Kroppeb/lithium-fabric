package me.jellysquid.mods.lithium.common.util.streams;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class EmptyStream<T> implements Stream<T> {
    public static final EmptyStream<?> INSTANCE = new EmptyStream<>();
    private static final Iterator<?> EMPTY_ITERATOR = new Iterator<Object>() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    };

    private EmptyStream(){}

    @Override
    public Stream<T> filter(Predicate<? super T> predicate) {
        return this;
    }

    @Override
    public <R> Stream<R> map(Function<? super T, ? extends R> function) {
        //noinspection unchecked
        return (Stream<R>) INSTANCE;
    }

    @Override
    public IntStream mapToInt(ToIntFunction<? super T> toIntFunction) {
        return EmptyIntStream.INSTANCE;
    }

    @Override
    public LongStream mapToLong(ToLongFunction<? super T> toLongFunction) {
        return EmptyLongStream.INSTANCE;
    }

    @Override
    public DoubleStream mapToDouble(ToDoubleFunction<? super T> toDoubleFunction) {
        return EmptyDoubleStream.INSTANCE;
    }

    @Override
    public <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function) {
        //noinspection unchecked
        return (Stream<R>) INSTANCE;
    }

    @Override
    public IntStream flatMapToInt(Function<? super T, ? extends IntStream> function) {
        return EmptyIntStream.INSTANCE;
    }

    @Override
    public LongStream flatMapToLong(Function<? super T, ? extends LongStream> function) {
        return EmptyLongStream.INSTANCE;
    }

    @Override
    public DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> function) {
        return EmptyDoubleStream.INSTANCE;
    }

    @Override
    public Stream<T> distinct() {
        return this;
    }

    @Override
    public Stream<T> sorted() {
        return this;
    }

    @Override
    public Stream<T> sorted(Comparator<? super T> comparator) {
        return this;
    }

    @Override
    public Stream<T> peek(Consumer<? super T> consumer) {
        return this;
    }

    @Override
    public Stream<T> limit(long l) {
        return this;
    }

    @Override
    public Stream<T> skip(long l) {
        return this;
    }

    @Override
    public void forEach(Consumer<? super T> consumer) { }

    @Override
    public void forEachOrdered(Consumer<? super T> consumer) { }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NotNull
    @Override
    public <A> A[] toArray(IntFunction<A[]> intFunction) {
        return intFunction.apply(0);
    }

    @Override
    public T reduce(T t, BinaryOperator<T> binaryOperator) {
        return t;
    }

    @NotNull
    @Override
    public Optional<T> reduce(BinaryOperator<T> binaryOperator) {
        return Optional.empty();
    }

    @Override
    public <U> U reduce(U u, BiFunction<U, ? super T, U> biFunction, BinaryOperator<U> binaryOperator) {
        return u;
    }

    @Override
    public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> biConsumer, BiConsumer<R, R> biConsumer1) {
        return supplier.get();
    }

    @Override
    public <R, A> R collect(Collector<? super T, A, R> collector) {
        return collector.finisher().apply(collector.supplier().get());
    }

    @NotNull
    @Override
    public Optional<T> min(Comparator<? super T> comparator) {
        return Optional.empty();
    }

    @NotNull
    @Override
    public Optional<T> max(Comparator<? super T> comparator) {
        return Optional.empty();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean anyMatch(Predicate<? super T> predicate) {
        return false;
    }

    @Override
    public boolean allMatch(Predicate<? super T> predicate) {
        return false;
    }

    @Override
    public boolean noneMatch(Predicate<? super T> predicate) {
        return true;
    }

    @NotNull
    @Override
    public Optional<T> findFirst() {
        return Optional.empty();
    }

    @NotNull
    @Override
    public Optional<T> findAny() {
        return Optional.empty();
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        //noinspection unchecked
        return (Iterator<T>) EMPTY_ITERATOR;
    }

    @NotNull
    @Override
    public Spliterator<T> spliterator() {
        return Spliterators.emptySpliterator();
    }

    @Override
    public boolean isParallel() {
        return false;
    }

    @NotNull
    @Override
    public Stream<T> sequential() {
        return this;
    }

    @NotNull
    @Override
    public Stream<T> parallel() {
        return this;
    }

    @NotNull
    @Override
    public Stream<T> unordered() {
        return this;
    }

    @NotNull
    @Override
    public Stream<T> onClose(Runnable runnable) {
        Stream<T> stream = Stream.empty();
        return stream.onClose(runnable);
    }

    @Override
    public void close() {

    }
}

package me.jellysquid.mods.lithium.common.util.streams;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class EmptyLongStream implements LongStream {
    public static final LongStream INSTANCE = new EmptyLongStream();
    private static final PrimitiveIterator.OfLong EMPTY_ITERATOR = new PrimitiveIterator.OfLong() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public long nextLong() {
            throw new NoSuchElementException();
        }
    };

    private EmptyLongStream() {
    }

    @Override
    public LongStream filter(LongPredicate longPredicate) {
        return this;
    }

    @Override
    public LongStream map(LongUnaryOperator longUnaryOperator) {
        return this;
    }

    @Override
    public <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction) {
        //noinspection unchecked
        return (Stream<U>) EmptyStream.INSTANCE;
    }

    @Override
    public IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return EmptyIntStream.INSTANCE;
    }

    @Override
    public DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return EmptyDoubleStream.INSTANCE;
    }

    @Override
    public LongStream flatMap(LongFunction<? extends LongStream> longFunction) {
        return this;
    }

    @Override
    public LongStream distinct() {
        return this;
    }

    @Override
    public LongStream sorted() {
        return this;
    }

    @Override
    public LongStream peek(LongConsumer longConsumer) {
        return this;
    }

    @Override
    public LongStream limit(long l) {
        return this;
    }

    @Override
    public LongStream skip(long l) {
        return this;
    }

    @Override
    public void forEach(LongConsumer longConsumer) {

    }

    @Override
    public void forEachOrdered(LongConsumer longConsumer) {

    }

    @Override
    public long[] toArray() {
        return new long[0];
    }

    @Override
    public long reduce(long i, LongBinaryOperator longBinaryOperator) {
        return i;
    }

    @Override
    public OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return OptionalLong.empty();
    }

    @Override
    public <R> R collect(Supplier<R> supplier, ObjLongConsumer<R> objLongConsumer, BiConsumer<R, R> biConsumer) {
        return supplier.get();
    }

    @Override
    public long sum() {
        return 0;
    }

    @Override
    public OptionalLong min() {
        return OptionalLong.empty();
    }

    @Override
    public OptionalLong max() {
        return OptionalLong.empty();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public OptionalDouble average() {
        return OptionalDouble.empty();
    }

    @Override
    public LongSummaryStatistics summaryStatistics() {
        return new LongSummaryStatistics();
    }

    @Override
    public boolean anyMatch(LongPredicate longPredicate) {
        return false;
    }

    @Override
    public boolean allMatch(LongPredicate longPredicate) {
        return false;
    }

    @Override
    public boolean noneMatch(LongPredicate longPredicate) {
        return true;
    }

    @Override
    public OptionalLong findFirst() {
        return OptionalLong.empty();
    }

    @Override
    public OptionalLong findAny() {
        return OptionalLong.empty();
    }

    @Override
    public DoubleStream asDoubleStream() {
        return EmptyDoubleStream.INSTANCE;
    }

    @Override
    public Stream<Long> boxed() {
        //noinspection unchecked
        return (Stream<Long>) EmptyStream.INSTANCE;
    }

    @Override
    public @NotNull LongStream sequential() {
        return this;
    }

    @Override
    public @NotNull LongStream parallel() {
        return this;
    }

    @NotNull
    @Override
    public LongStream unordered() {
        return this;
    }

    @NotNull
    @Override
    public LongStream onClose(Runnable runnable) {
        return LongStream.empty().onClose(runnable);
    }

    @Override
    public void close() {

    }

    @Override
    public PrimitiveIterator.@NotNull OfLong iterator() {
        return EMPTY_ITERATOR;
    }

    @Override
    public Spliterator.@NotNull OfLong spliterator() {
        return Spliterators.emptyLongSpliterator();
    }

    @Override
    public boolean isParallel() {
        return false;
    }
}

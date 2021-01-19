package me.jellysquid.mods.lithium.common.util.streams;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class EmptyDoubleStream implements DoubleStream {
    public static final DoubleStream INSTANCE = new EmptyDoubleStream();
    private static final PrimitiveIterator.OfDouble EMPTY_ITERATOR = new PrimitiveIterator.OfDouble() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public double nextDouble() {
            throw new NoSuchElementException();
        }
    };

    private EmptyDoubleStream() {
    }

    @Override
    public DoubleStream filter(DoublePredicate doublePredicate) {
        return this;
    }

    @Override
    public DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return this;
    }

    @Override
    public <U> Stream<U> mapToObj(DoubleFunction<? extends U> doubleFunction) {
        //noinspection unchecked
        return (Stream<U>) EmptyStream.INSTANCE;
    }

    @Override
    public IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return EmptyIntStream.INSTANCE;
    }

    @Override
    public LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return EmptyLongStream.INSTANCE;
    }

    @Override
    public DoubleStream flatMap(DoubleFunction<? extends DoubleStream> doubleFunction) {
        return this;
    }

    @Override
    public DoubleStream distinct() {
        return this;
    }

    @Override
    public DoubleStream sorted() {
        return this;
    }

    @Override
    public DoubleStream peek(DoubleConsumer doubleConsumer) {
        return this;
    }

    @Override
    public DoubleStream limit(long l) {
        return this;
    }

    @Override
    public DoubleStream skip(long l) {
        return this;
    }

    @Override
    public void forEach(DoubleConsumer doubleConsumer) {

    }

    @Override
    public void forEachOrdered(DoubleConsumer doubleConsumer) {

    }

    @Override
    public double[] toArray() {
        return new double[0];
    }

    @Override
    public double reduce(double i, DoubleBinaryOperator doubleBinaryOperator) {
        return i;
    }

    @Override
    public OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return OptionalDouble.empty();
    }

    @Override
    public <R> R collect(Supplier<R> supplier, ObjDoubleConsumer<R> objDoubleConsumer, BiConsumer<R, R> biConsumer) {
        return supplier.get();
    }

    @Override
    public double sum() {
        return 0;
    }

    @Override
    public OptionalDouble min() {
        return OptionalDouble.empty();
    }

    @Override
    public OptionalDouble max() {
        return OptionalDouble.empty();
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
    public DoubleSummaryStatistics summaryStatistics() {
        return new DoubleSummaryStatistics();
    }

    @Override
    public boolean anyMatch(DoublePredicate doublePredicate) {
        return false;
    }

    @Override
    public boolean allMatch(DoublePredicate doublePredicate) {
        return false;
    }

    @Override
    public boolean noneMatch(DoublePredicate doublePredicate) {
        return true;
    }

    @Override
    public OptionalDouble findFirst() {
        return OptionalDouble.empty();
    }

    @Override
    public OptionalDouble findAny() {
        return OptionalDouble.empty();
    }

    @Override
    public Stream<Double> boxed() {
        //noinspection unchecked
        return (Stream<Double>) EmptyStream.INSTANCE;
    }

    @Override
    public @NotNull DoubleStream sequential() {
        return this;
    }

    @Override
    public @NotNull DoubleStream parallel() {
        return this;
    }

    @NotNull
    @Override
    public DoubleStream unordered() {
        return this;
    }

    @NotNull
    @Override
    public DoubleStream onClose(Runnable runnable) {
        return DoubleStream.empty().onClose(runnable);
    }

    @Override
    public void close() {

    }

    @Override
    public PrimitiveIterator.@NotNull OfDouble iterator() {
        return EMPTY_ITERATOR;
    }

    @Override
    public Spliterator.@NotNull OfDouble spliterator() {
        return Spliterators.emptyDoubleSpliterator();
    }

    @Override
    public boolean isParallel() {
        return false;
    }
}

package me.jellysquid.mods.lithium.common.util.streams;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class EmptyIntStream implements IntStream {
    public static final IntStream INSTANCE = new EmptyIntStream();

    private EmptyIntStream() {}

    @Override
    public IntStream filter(IntPredicate intPredicate) {
        return this;
    }

    @Override
    public IntStream map(IntUnaryOperator intUnaryOperator) {
        return this;
    }

    @Override
    public <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction) {
        //noinspection unchecked
        return (Stream<U>) EmptyStream.INSTANCE;
    }

    @Override
    public LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return EmptyLongStream.INSTANCE;
    }

    @Override
    public DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return EmptyDoubleStream.INSTANCE;
    }

    @Override
    public IntStream flatMap(IntFunction<? extends IntStream> intFunction) {
        return this;
    }

    @Override
    public IntStream distinct() {
        return this;
    }

    @Override
    public IntStream sorted() {
        return this;
    }

    @Override
    public IntStream peek(IntConsumer intConsumer) {
        return this;
    }

    @Override
    public IntStream limit(long l) {
        return this;
    }

    @Override
    public IntStream skip(long l) {
        return this;
    }

    @Override
    public void forEach(IntConsumer intConsumer) {

    }

    @Override
    public void forEachOrdered(IntConsumer intConsumer) {

    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return i;
    }

    @Override
    public OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return OptionalInt.empty();
    }

    @Override
    public <R> R collect(Supplier<R> supplier, ObjIntConsumer<R> objIntConsumer, BiConsumer<R, R> biConsumer) {
        return supplier.get();
    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public OptionalInt min() {
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt max() {
        return OptionalInt.empty();
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
    public IntSummaryStatistics summaryStatistics() {
        return IntStream.empty().summaryStatistics();
    }

    @Override
    public boolean anyMatch(IntPredicate intPredicate) {
        return false;
    }

    @Override
    public boolean allMatch(IntPredicate intPredicate) {
        return false;
    }

    @Override
    public boolean noneMatch(IntPredicate intPredicate) {
        return true;
    }

    @Override
    public OptionalInt findFirst() {
        return OptionalInt.empty();
    }

    @Override
    public OptionalInt findAny() {
        return OptionalInt.empty();
    }

    @Override
    public LongStream asLongStream() {
        return EmptyLongStream.INSTANCE;
    }

    @Override
    public DoubleStream asDoubleStream() {
        return EmptyDoubleStream.INSTANCE;
    }

    @Override
    public Stream<Integer> boxed() {
        //noinspection unchecked
        return (Stream<Integer>) EmptyStream.INSTANCE;
    }

    @Override
    public @NotNull IntStream sequential() {
        return this;
    }

    @Override
    public @NotNull IntStream parallel() {
        return this;
    }

    @NotNull
    @Override
    public IntStream unordered() {
        return this;
    }

    @NotNull
    @Override
    public IntStream onClose(Runnable runnable) {
        return IntStream.empty().onClose(runnable);
    }

    @Override
    public void close() {

    }

    @Override
    public PrimitiveIterator.@NotNull OfInt iterator() {
        return IntStream.empty().iterator();
    }

    @Override
    public Spliterator.@NotNull OfInt spliterator() {
        return Spliterators.emptyIntSpliterator();
    }

    @Override
    public boolean isParallel() {
        return false;
    }
}

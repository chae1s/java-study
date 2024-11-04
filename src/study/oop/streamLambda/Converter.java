package study.oop.streamLambda;

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);
}

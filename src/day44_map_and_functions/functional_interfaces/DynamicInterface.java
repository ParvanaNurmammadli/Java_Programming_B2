package day44_map_and_functions.functional_interfaces;

@FunctionalInterface // SAM
public interface DynamicInterface <T> {
    void test(T t); // // T is generic type (It can accept any data type), t parameter name


}
package ex.lab021_generics;

class Generics_Class {

}

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}
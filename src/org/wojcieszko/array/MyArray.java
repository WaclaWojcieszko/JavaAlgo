package org.wojcieszko.array;

public class MyArray<T> {

    private int size;
    private int chunk;
    private T[] data;

    //construktor

    public MyArray() {
        this.size = 0;
        this.chunk = 16;
        this.data = (T[])new Object[chunk];
    }


    //resize

    public void resize(int newSize) {

        T[] newData = (T[])new Object[newSize];

        System.arraycopy(data, 0, newData, 0, size);

    }


    //check size

    private void checkSize(){
        if (this.size == data.length){
            resize(size + chunk);
        }
    }

    //append

    public void append(T data){
        checkSize();
        this.data[size] = data;
        ++size;
    }

    //insert (5, T Data

    public void insert(int start, T data){
        checkSize();

        System.arraycopy(this.data, start, this.data, start + 1, size - start);
        this.data[start] = data;

        ++size;

    }

    //delete

    public void delete(int index){
        checkSize();

        System.arraycopy(this.data, index, this.data, index + -1, size - index);

        --size;

    }

    //get

    public T get(int index){
        return this.data[index];
    }


}

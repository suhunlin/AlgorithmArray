package org.example;

public class ArrayImpl3 {
    public Integer[] array;
    private Integer i_end;

    public ArrayImpl3(Integer size){
        array = new Integer[size];
        i_end = -1;//因為index從0開始，如果是-1代表目前是空的
    }

    public void add_by_index(int i_index, int i_value){//i_index使用者想要插入index的位置，i_value使用者想要插入的值
        if(i_end + 1 > array.length) expend_space(); //代表空間滿了，擴展空間
        if(i_index > i_end + 1 || i_index<0) return;//代表他插入的位置不是最後一個元素的下一個，而是下下個
        for(int i=i_end;i>=i_index;i--){
            array[i+1] = array[i];
            array[i] = null;
        }

        array[i_index] = i_value;
        i_end++;
    }

    public  void add_by_value(int value){
        add_by_index(i_end+1, value);
    }

    private void expend_space(){
        System.out.println("Space not enough!!!");
        Integer[] array_new = new Integer[array.length * 2];
        for(int i=0; i<array.length;i++){
            array_new[i] = array[i];
        }
        this.array = array_new;
    }
}

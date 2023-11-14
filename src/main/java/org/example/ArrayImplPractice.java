package org.example;

public class ArrayImplPractice {
    private Integer[] intArray;
    private Integer intArrayEndIndex;

    public ArrayImplPractice(int size){
        this.intArray = new Integer[size];
        this.intArrayEndIndex = -1;
    }

    public void add_by_index(int wantIndex, int value){
        if(intArrayEndIndex + 1 == intArray.length){
            System.out.println("Space not enough!!!extend Array size!!!");
            extend_space();
        }
        if(wantIndex < 0){
            System.out.println("Index < 0!!!!!");
            return;
        }else if(wantIndex >= intArray.length){
            System.out.println("Index too large, array size only "+ intArray.length);
            return;
        }else{//legal index
            for(int i = intArrayEndIndex; i>=wantIndex; i--){
                intArray[i+1] = intArray[i];
                intArray[i] = null;
            }
            intArray[wantIndex] = value;
            intArrayEndIndex++;
            System.out.println("Insert value to " + wantIndex + " success!!!!!");
        }
    }
    private void extend_space() {
        Integer[] newArray = new Integer[intArray.length*2];
        for(int i=0; i<intArray.length; i++){
            newArray[i] = intArray[i];
        }
        intArray = newArray;
    }

    public void add_by_value(int value){
        add_by_index(intArrayEndIndex+1, value);
    }

    public void printArray(){
        int index = 0;
        for(Integer num: intArray){
            System.out.println("intArray["+index+"]=" + num);
            index++;
        }
    }

    public Integer search_by_index(int searchIndex){
        if(searchIndex < 0 || searchIndex > intArrayEndIndex) return null;
        return intArray[searchIndex];
    }

    public void remove_by_index(int delIndex){
        if(delIndex < 0 || delIndex > intArrayEndIndex) return;
        intArray[delIndex] = null;
        for(int i = delIndex; i<=intArrayEndIndex ; i++){
            intArray[i] = intArray[i+1];
            intArray[i+1] = null;
        }
        intArrayEndIndex--;
    }

    public void remove_by_value(int value){
        for(int i=0; i<=intArrayEndIndex; i++){
            if(intArray[i] == value){
                    remove_by_index(i);
                    return;
                }
            }
        }

    public Integer search_by_value(int value){
        for(int i=0; i<=intArrayEndIndex; i++){
            if(intArray[i] == value){
                return i;
            }
        }
        return null;
    }
}

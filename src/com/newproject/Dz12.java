package com.newproject;

import java.util.Arrays;


/*1) Реализовать методы add(int value), get, set, toString
* */
public class Dz12 {
        private int[] arr = new int[0];
        public void add(int value) {
            int[] tmp = new int[arr.length + 1];
            System.arraycopy(arr, 0, tmp, 0, arr.length);
            tmp[tmp.length - 1] = value;
            arr = tmp;
        }

    public int get(int index) {
        return this.arr[index];
    }

    public void set(int index, int value) {
        this.arr[index] = value;
    }


    public String toString() {
        return Arrays.toString(arr);
    }


        }





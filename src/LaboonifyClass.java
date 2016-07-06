/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benjamin
 */
public class LaboonifyClass {
    public int[] Laboonify(int[] x){
        //x=origin array
        if (x.length==0){
            int none[]={0};
            return none;
        }
        int newArray[]=new int[x.length+1];
        int sum=0;
        int newVal=0;
        for (int i=0;i<x.length;i++){
            newVal=x[i];
            newVal=newVal*newVal;
            newArray[i]=newVal;
            sum=sum+newVal;
        }
        newArray[x.length]=sum;
        return newArray;
    }
}

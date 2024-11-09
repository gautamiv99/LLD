package designpatterns.adapterpattern.client;

import designpatterns.adapterpattern.adaptee.WeightMachineForBabies;
import designpatterns.adapterpattern.adapter.WeightMachineAdapter;
import designpatterns.adapterpattern.adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}


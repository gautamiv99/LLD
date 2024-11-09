package designpatterns.adapterpattern.adapter;

import designpatterns.adapterpattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg(){
        return weightMachine.getWeightInPounds()*0.45;
    }
}

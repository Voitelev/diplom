package ru.voitelev.application.neuralnetwork;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Perceptron;

public class Neural {
    public static void main(String[] args) {

        Perceptron nNetwork = new Perceptron(2, 1);

        DataSet trainingSet =
                new DataSet(2, 1);

        trainingSet. addRow (new DataSetRow (new double[]{0, 0},
                new double[]{0}));
        trainingSet. addRow (new DataSetRow (new double[]{0, 1},
                new double[]{0}));
        trainingSet. addRow (new DataSetRow (new double[]{1, 0},
                new double[]{1}));
        trainingSet. addRow (new DataSetRow (new double[]{1, 1},
                new double[]{1}));
        // learn the training set
        nNetwork.learn(trainingSet);
        // save the trained network into file
        nNetwork.save("or_perceptron.nnet");
        System.out.println("end");

        // set network input
        nNetwork.setInput(0, 1);
        // calculate network
        nNetwork.calculate();
        // get network output
        double[] networkOutput = nNetwork.getOutput();

        for (double i : networkOutput)
            System.out.println(i);

    }
}

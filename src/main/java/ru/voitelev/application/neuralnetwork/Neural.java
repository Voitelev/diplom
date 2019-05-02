package ru.voitelev.application.neuralnetwork;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Perceptron;

public class Neural {
    public static void main(String[] args) {

        Perceptron nNetwork = new Perceptron(2, 1);

        DataSet trainingSet =
                new DataSet(2, 1);

        trainingSet. addRow (new DataSetRow (new double[]{0.2529677419354838, 0.42444444444444446},
                new double[]{1}));
        trainingSet. addRow (new DataSetRow (new double[]{0.2884672919354838, 0.42435344444444446},
                new double[]{1}));
        trainingSet. addRow (new DataSetRow (new double[]{0.3884672919354838, 0.52435344444444446},
                new double[]{0}));
        trainingSet. addRow (new DataSetRow (new double[]{0.1884672919354838, 0.22435344444444446},
                new double[]{0}));

        nNetwork.learn(trainingSet);

        nNetwork.save("or_perceptron.nnet");

        nNetwork.setInput(0.526633532934131743, 0.52535344444444446);

        nNetwork.calculate();
        Double a[] = nNetwork.getWeights();
        System.out.println(a.length);

        double[] networkOutput = nNetwork.getOutput();

        for (double i : networkOutput)
            System.out.println(i);

    }
}

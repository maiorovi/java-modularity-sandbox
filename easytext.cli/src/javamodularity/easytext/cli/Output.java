package javamodularity.easytext.cli;

import javamodularity.easytext.analysis.DummyAnalysis;

public class Output {
    public static void main(String[] args) {
        System.out.println(new DummyAnalysis().getMetrics());
    }
}

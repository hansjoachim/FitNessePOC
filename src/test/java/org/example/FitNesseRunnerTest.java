package org.example;

import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("Suite")
@FitNesseRunner.FitnesseDir(".")
@FitNesseRunner.OutputDir("./target/fitnesse")
public class FitNesseRunnerTest {
}

FitNesse PoC

Small Proof of Concept.

It contains two tests inside FitNesseRoot/Suite, one which is enabled and one ignored. (Both are rather inspired by the FitNesse two minute example.)
The tests are intended to be run via JUnit and the FitNesseRunner, look inside `src/test` for details.

Run `mvn test` in order to run the tests.
Out of the box this results in one passing test.

However, there's another test which has been marked as ignored (Prune) which is not mentioned in the output at all.
If you edit `FitNesseRoot/Suite/Enabled/properties.xml` and add `<Prune />` to the list of properties, both tests are ignored.

However, at this point running the tests will result in a failure where it complains that it couldn't find any tests.

In both cases, the counter for ignored tests is always zero. Shouldn't this count the tests marked as ignored (Prune)?

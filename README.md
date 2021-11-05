# Maven Surefire Plugin Test Durations

This repo is solely for experimentation and investigating the test durations
reported by the [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/).

## What I learned

The report generated by Surefire includes the setup time of a JUnit `@Before`
method in the test duration `time`.

See
[AppTest.xml](./target/surefire-reports/TEST-com.github.teleivo.AppTest.xml)
element `testcase` attribute `time`.

The element `testsuite` is the sum of `testcase`s and a little extra spent on
not sure what ;)

The [AppTest](./src/test/java/com/github/teleivo/AppTest.java) uses
`Thread.sleep()` to clearly provoke timings in the report that can be
attributed back to the testcase or suite.

## Related

If you want to convert Surefire XML reports to CSV for further processing head
over to [maven-surefire-reports-to-csv](https://github.com/teleivo/maven-surefire-reports-to-csv).
